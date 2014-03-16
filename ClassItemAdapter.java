package com.android.nest;

import java.util.ArrayList;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

public class ClassItemAdapter extends ArrayAdapter<ClassItem> {

	private ArrayList<ClassItem> classItem;

	// Override ArrayAdapter Constructor
	public ClassItemAdapter(Context context, int textViewResourceId,ArrayList<ClassItem> classItem)
	{
		super(context, textViewResourceId, classItem);
		this.classItem = classItem;
	}

	// Override getView method- defines how each listItem will look
	public View getView(int position, View convertView, ViewGroup parent) {
		// Assign view converting to local variable
		View v = convertView;

		// If view is null, inflate it
		if (v == null) {
			LayoutInflater inflater = (LayoutInflater) getContext()
					.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
			v = inflater.inflate(R.layout.custom_row_view, null);
		}
		ClassItem i = classItem.get(position);
		if (i != null) {
			// Obtain a reference to the TextViews
			// TextViews are created in XML files we define
			TextView cn = (TextView) v.findViewById(R.id.classNameTV);
			TextView ct = (TextView) v.findViewById(R.id.classTimeTV);
			TextView bn = (TextView) v.findViewById(R.id.buildingNameTV);
			TextView rn = (TextView) v.findViewById(R.id.roomNumTV);
			TextView dayTv = (TextView) v.findViewById(R.id.dayTV);
			// Check if each text view is null, if not assign text
			if (cn != null) {
				cn.setText(i.getClassName());
			}
			if (ct != null) {
				ct.setText(i.getHours());
			}
			if (bn != null) {
				bn.setText(i.getBuildingName());
			}
			if (rn != null) {
				rn.setText(i.getRoomNum());
			}
			if(dayTv != null)
			{
				dayTv.setText(i.getDay());
			}
		}
		// Return the view to activity
		return v;
	}
}
