package a.b;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ExpandableListView;
import android.widget.Toast;
import android.widget.ExpandableListView.OnChildClickListener;
import android.widget.ExpandableListView.OnGroupClickListener;
import android.widget.ExpandableListView.OnGroupCollapseListener;
import android.widget.ExpandableListView.OnGroupExpandListener;

public class AboutEclipse extends Activity {

	ExpandableListAdapter listAdapter;
	ExpandableListView expListView;
	List<String> listDataHeader;
	HashMap<String, List<String>> listDataChild;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.about_eclipse);

		// get the listview
		expListView = (ExpandableListView) findViewById(R.id.lvExp);

		// preparing list data
		prepareListData();

		listAdapter = new ExpandableListAdapter(this, listDataHeader,
				listDataChild);

		// setting list adapter
		expListView.setAdapter(listAdapter);

		// Listview Group click listener
		expListView.setOnGroupClickListener(new OnGroupClickListener() {

			@Override
			public boolean onGroupClick(ExpandableListView parent, View v,
					int groupPosition, long id) {
				// Toast.makeText(getApplicationContext(),
				// "Group Clicked " + listDataHeader.get(groupPosition),
				// Toast.LENGTH_SHORT).show();
				return false;
			}
		});

		// Listview Group expanded listener
		expListView.setOnGroupExpandListener(new OnGroupExpandListener() {

			@Override
			public void onGroupExpand(int groupPosition) {
				Toast.makeText(getApplicationContext(),
						listDataHeader.get(groupPosition) + " Expanded",
						Toast.LENGTH_SHORT).show();
			}
		});

		// Listview Group collasped listener
		expListView.setOnGroupCollapseListener(new OnGroupCollapseListener() {

			@Override
			public void onGroupCollapse(int groupPosition) {
				Toast.makeText(getApplicationContext(),
						listDataHeader.get(groupPosition) + " Collapsed",
						Toast.LENGTH_SHORT).show();

			}
		});

		// Listview on child click listener
		expListView.setOnChildClickListener(new OnChildClickListener() {

			@Override
			public boolean onChildClick(ExpandableListView parent, View v,
					int groupPosition, int childPosition, long id) {
				// TODO Auto-generated method stub

				Intent i1 = new Intent(getApplicationContext(),Detail.class);
				i1.putExtra("gid", groupPosition);
				i1.putExtra("cid", childPosition);
				startActivity(i1);

				Toast.makeText(
						getApplicationContext(),
						listDataHeader.get(groupPosition)
								+ " : "
								+ listDataChild.get(
										listDataHeader.get(groupPosition)).get(
										childPosition), Toast.LENGTH_SHORT)
						.show();
				return false;
			}
		});
	}

	/*
	 * Preparing the list data
	 */
	private void prepareListData() {
		listDataHeader = new ArrayList<String>();
		listDataChild = new HashMap<String, List<String>>();

		// Adding child data
		listDataHeader.add("Form Widgets");
		listDataHeader.add("Text Fields");
		listDataHeader.add("Layouts");
		listDataHeader.add("Images & Media");
		listDataHeader.add("Time & Date");
		listDataHeader.add("Composite");

		// Adding child data
		List<String> top250 = new ArrayList<String>();
		top250.add("TextView");
		top250.add("Button");
		top250.add("Radio Button");
		top250.add("Progress Bar");

		List<String> nowShowing = new ArrayList<String>();
		nowShowing.add("EditText (Plain)");
		nowShowing.add("EditText (Email)");
		nowShowing.add("EditText (Password)");
		nowShowing.add("EditText (Phone Number)");

		List<String> comingSoon = new ArrayList<String>();
		comingSoon.add("Grid Layout");
		comingSoon.add("Linear Layout (Vertical)");
		comingSoon.add("Linear Layout (Horizontal)");
		comingSoon.add("Relative Layout");

		List<String> img = new ArrayList<String>();
		img.add("Image View");
		img.add("Image Button");
		img.add("Video View");

		List<String> td = new ArrayList<String>();
		td.add("Time Picker");
		td.add("Date Picker");
		td.add("Chronometer");

		List<String> cm = new ArrayList<String>();
		cm.add("Expandable List");
		cm.add("List View");
		cm.add("Scroll View");

		listDataChild.put(listDataHeader.get(0), top250); // Header, Child data
		listDataChild.put(listDataHeader.get(1), nowShowing);
		listDataChild.put(listDataHeader.get(2), comingSoon);
		listDataChild.put(listDataHeader.get(3), img);
		listDataChild.put(listDataHeader.get(4), td);
		listDataChild.put(listDataHeader.get(5), cm);

	}
}
