package a.b;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ExpandableListView;
import android.widget.ExpandableListView.OnChildClickListener;
import android.widget.ExpandableListView.OnGroupClickListener;
import android.widget.ExpandableListView.OnGroupCollapseListener;
import android.widget.ExpandableListView.OnGroupExpandListener;
import android.widget.Toast;

public class MainActivity extends Activity {

	ExpandableListAdapter listAdapter;
	ExpandableListView expListView;
	List<String> listDataHeader;
	HashMap<String, List<String>> listDataChild;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

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
			public boolean onGroupClick(ExpandableListView parent, View v,int groupPosition, long id) {
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
				Log.i("GPOSITION", "" + groupPosition);
				Log.i("CPOSITION", "" + childPosition);
				//log.i("AndroidPracticle""+)
				if (groupPosition == 0) {
					switch (childPosition) {
					case 0:
						Intent i1 = new Intent(getApplicationContext(),Oopsconcepts.class);

						startActivity(i1);

						break;
					/*
					 * case 1:
					 * 
					 * break;
					 */
					default:
						break;
					}
				} else if (groupPosition == 1) {
					switch (childPosition) {
					case 0:
						Intent i1 = new Intent(getApplicationContext(),SoftwareRequirements.class);

						startActivity(i1);
						break;
					case 1:
						Intent i2 = new Intent(getApplicationContext(),AboutEclipse.class);

						startActivity(i2);
						
				    /*case 2: Intent i3 = new
						  Intent(getApplicationContext(), Oopsconcepts.class);
					       startActivity(i3);
						 
						break;*/

					default:
						break;
					}
				}else if (groupPosition == 2) {
					switch (childPosition) {
					case 0:
						Intent i1 = new Intent(getApplicationContext(),ImageActivity.class);

						startActivity(i1);
						break;
					case 1:
						Intent i2 = new Intent(getApplicationContext(),Video.class);

						startActivity(i2);
						
				   /* case 2: Intent i3 = new
						  Intent(getApplicationContext(), Oopsconcepts.class);
					       startActivity(i3);
						 
						break;*/

					default:
						break;
					}
				}
				

				Toast.makeText(
						getApplicationContext(),listDataHeader.get(groupPosition)+ " : "+ listDataChild.get(listDataHeader.get(groupPosition)).get(childPosition), Toast.LENGTH_SHORT).show();
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
		listDataHeader.add("JAVA");
		listDataHeader.add("ANDROID");
		listDataHeader.add("Android Practicle Session");
		// listDataHeader.add("Coming Soon..");

		// Adding child data
		List<String> top250 = new ArrayList<String>();
		top250.add("Core JAVA");

		List<String> nowShowing = new ArrayList<String>();
		nowShowing.add("Software Requirements For App Development");
		nowShowing.add("About Android SDK");
		
		List<String> androidPracticle = new ArrayList<String>();
		androidPracticle.add(" ImageView");
		androidPracticle.add(" VideoView");
		/*androidPracticle.add(" ImageView");
		androidPracticle.add(" VideoView");
*/


		/*
		 * List<String> comingSoon = new ArrayList<String>();
		 * comingSoon.add("2 Guns"); comingSoon.add("The Smurfs 2");
		 * comingSoon.add("The Spectacular Now"); comingSoon.add("The Canyons");
		 * comingSoon.add("Europa Report");
		 */

		listDataChild.put(listDataHeader.get(0), top250); // Header, Child data
		listDataChild.put(listDataHeader.get(1), nowShowing);
		listDataChild.put(listDataHeader.get(2), androidPracticle);
		
		// listDataChild.put(listDataHeader.get(2), comingSoon);
	}
}