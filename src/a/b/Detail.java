package a.b;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class Detail extends Activity {

	TextView tv;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.soft_req);
		// tv = (TextView) findViewById(R.id.textView1);
		Intent i = getIntent();
		int gposition = i.getExtras().getInt("gid");
		int cposition = i.getExtras().getInt("cid");
		Log.i("group", "" + gposition);
		Log.i("child", "" + cposition);

		switch (gposition) {
		case 0:
			if (cposition == 0) {
				// tv.setText("Text View");
				String[] countryArray = {
						"Text View",
						"Displays text to the user and optionally allows them to edit it. A TextView is a complete text editor, however the basic class is"
								+ " configured to not allow editing; see EditText for a subclass that configures the text view for editing." };
				ArrayAdapter adapter = new ArrayAdapter<String>(this,R.layout.activity_listview, countryArray);

				ListView listView = (ListView) findViewById(R.id.country_list);
				listView.setAdapter(adapter);

			}
			if (cposition == 1) {
				String[] countryArray = {
						"Button",
						"Represents a push-button widget."
								+ " Push-buttons can be pressed, or clicked, by the user to perform an action." };
				ArrayAdapter adapter = new ArrayAdapter<String>(this,
						R.layout.activity_listview, countryArray);

				ListView listView = (ListView) findViewById(R.id.country_list);
				listView.setAdapter(adapter);

			}
			if (cposition == 2) {
				String[] countryArray = {
						"Radio Button",
						"Radio buttons allow the user to select one option from a set."
								+ " You should use radio buttons for optional sets that are mutually exclusive if you think that the user needs to see all available options side-by-side."
								+ " If it's not necessary to show all options side-by-side, use a spinner instead." };
				ArrayAdapter adapter = new ArrayAdapter<String>(this,
						R.layout.activity_listview, countryArray);

				ListView listView = (ListView) findViewById(R.id.country_list);
				listView.setAdapter(adapter);

			}
			if (cposition == 3) {
				String[] countryArray = {
						"ProgressBar",
						"Visual indicator of progress in some operation. Displays a bar to the user representing how far the operation has progressed;"
								+ " the application can change the amount of progress (modifying the length of the bar) as it moves forward." };
				ArrayAdapter adapter = new ArrayAdapter<String>(this,
						R.layout.activity_listview, countryArray);

				ListView listView = (ListView) findViewById(R.id.country_list);
				listView.setAdapter(adapter);

			}
			break;
		case 1:
			if (cposition == 0) {
				String[] countryArray = {
						"Edit Text (Plain)",
						"A text field allows the user to type text into your app. It can be either single line or multi-line. Touching a text field places the cursor and automatically displays the keyboard. In addition to typing, text fields allow for a variety of other activities,"
								+ " such as text selection (cut, copy, paste) and data look-up via auto-completion." };
				ArrayAdapter adapter = new ArrayAdapter<String>(this,
						R.layout.activity_listview, countryArray);

				ListView listView = (ListView) findViewById(R.id.country_list);
				listView.setAdapter(adapter);

			}
			if (cposition == 1) {
				String[] countryArray = {
						"Edit Text (Email)",
						"This type of edit text takes email as input. Input other than"
								+ "valid emails is not valid in this type. " };
				ArrayAdapter adapter = new ArrayAdapter<String>(this,
						R.layout.activity_listview, countryArray);

				ListView listView = (ListView) findViewById(R.id.country_list);
				listView.setAdapter(adapter);

			}
			if (cposition == 2) {
				String[] countryArray = {
						"Edit Text (Password)",
						"This type of edit text takes password as input. Input can be combinations of numerics, alphabets and symbols" };
				ArrayAdapter adapter = new ArrayAdapter<String>(this,
						R.layout.activity_listview, countryArray);

				ListView listView = (ListView) findViewById(R.id.country_list);
				listView.setAdapter(adapter);

			}
			if (cposition == 3) {
				String[] countryArray = { "Edit Text (Phone Number)",
						"This type of edit text takes phone number as input. Input should be numeric" };
				ArrayAdapter adapter = new ArrayAdapter<String>(this,
						R.layout.activity_listview, countryArray);

				ListView listView = (ListView) findViewById(R.id.country_list);
				listView.setAdapter(adapter);
			}

			break;
		case 2:
			if (cposition == 0) {
				String[] countryArray = {
						"Grid Layout",
						"A layout that places its children in a rectangular grid.",
						"The grid is composed of a set of infinitely thin lines that separate the viewing area into cells." };
				ArrayAdapter adapter = new ArrayAdapter<String>(this,
						R.layout.activity_listview, countryArray);

				ListView listView = (ListView) findViewById(R.id.country_list);
				listView.setAdapter(adapter);
			}
			if (cposition == 1) {
				String[] countryArray = {
						"Linear Layout(Vertical)",
						"LinearLayout (Vertical) is a view group that aligns all children in a single direction vertically.",
						"You can specify the layout direction with the android:orientation attribute.",
						"All children of a LinearLayout are stacked one after the other, so a vertical list will"
								+ " only have one child per row, no matter how wide they are." };
				ArrayAdapter adapter = new ArrayAdapter<String>(this,
						R.layout.activity_listview, countryArray);

				ListView listView = (ListView) findViewById(R.id.country_list);
				listView.setAdapter(adapter);
			}
			if (cposition == 2) {
				String[] countryArray = {
						"Linear Layout(Horizontal)",
						"LinearLayout (Horizontal) is a view group that aligns all children in a single direction vertically.",
						"You can specify the layout direction with the android:orientation attribute.",
						"All children of a LinearLayout are stacked one after the other"
								+ "and a horizontal list will only be one row high (the height of the tallest child, plus padding)." };
				ArrayAdapter adapter = new ArrayAdapter<String>(this,
						R.layout.activity_listview, countryArray);

				ListView listView = (ListView) findViewById(R.id.country_list);
				listView.setAdapter(adapter);
			}
			if (cposition == 3) {
				String[] countryArray = {
						"Relative Layout",
						"RelativeLayout is a view group that displays child views in relative positions. ",
						"The position of each view can be specified as relative to sibling elements (such as to the left-of or below another view) or in positions relative to the parent"
								+ " RelativeLayout area (such as aligned to the bottom, left or center)." };
				ArrayAdapter adapter = new ArrayAdapter<String>(this,
						R.layout.activity_listview, countryArray);

				ListView listView = (ListView) findViewById(R.id.country_list);
				listView.setAdapter(adapter);
			}
			break;
		case 3:
			if (cposition == 0) {
				String[] countryArray = {
						"Image View",
						"Displays an arbitrary image, such as an icon. ",
						"The ImageView class can load images from various sources (such as resources or content providers), takes care of computing its measurement from the image so that it can be used in any layout manager,"
								+ " and provides various display options such as scaling and tinting." };
				ArrayAdapter adapter = new ArrayAdapter<String>(this,
						R.layout.activity_listview, countryArray);

				ListView listView = (ListView) findViewById(R.id.country_list);
				listView.setAdapter(adapter);
			}
			if (cposition == 1) {
				String[] countryArray = {
						"Image Button",
						"Displays a button with an image (instead of text) that can be pressed or clicked by the user. ",
						"By default, an ImageButton looks like a regular Button, with the standard button background that changes color during different button states. ",
						" The image on the surface of the button is defined either by the android:src attribute in the  XML element or by the setImageResource(int) method." };
				ArrayAdapter adapter = new ArrayAdapter<String>(this,
						R.layout.activity_listview, countryArray);

				ListView listView = (ListView) findViewById(R.id.country_list);
				listView.setAdapter(adapter);
			}
			if (cposition == 2) {
				String[] countryArray = {
						"Video View",
						"Displays a video file. ",
						"The VideoView class can load images from various sources (such as resources or content providers), takes care of computing its measurement from the video so that it can be used in any layout manager,"
								+ " and provides various display options such as scaling and tinting." };
				ArrayAdapter adapter = new ArrayAdapter<String>(this,
						R.layout.activity_listview, countryArray);

				ListView listView = (ListView) findViewById(R.id.country_list);
				listView.setAdapter(adapter);

			}
			break;
		case 4:
			if (cposition == 0) {
				String[] countryArray = {
						"Time Picker",
						"A view for selecting the time of day, in either 24 hour or AM/PM mode. ",
						"The hour, each minute digit, and AM/PM (if applicable) can be conrolled by vertical spinners. The hour can be entered by keyboard "
								+ "input. Entering in two digit hours can be accomplished by hitting two "
								+ "digits within a timeout of about a second (e.g. '1' then '2' to select 12). " };
				ArrayAdapter adapter = new ArrayAdapter<String>(this,
						R.layout.activity_listview, countryArray);

				ListView listView = (ListView) findViewById(R.id.country_list);
				listView.setAdapter(adapter);
			}
			if (cposition == 1) {
				String[] countryArray = {
						"Date Picker",
						"This class is a widget for selecting a date.",
						" The date can be selected by a year, month, and day spinners or a CalendarView. The set of spinners and the calendar view are automatically synchronized. " };
				ArrayAdapter adapter = new ArrayAdapter<String>(this,
						R.layout.activity_listview, countryArray);

				ListView listView = (ListView) findViewById(R.id.country_list);
				listView.setAdapter(adapter);

			}
			if (cposition == 2) {
				String[] countryArray = {
						"Chronometer",
						"Class that implements a simple timer.",
						"You can give it a start time in the elapsedRealtime() timebase, and it counts up from that, or if you don't give it a base time,"
								+ " it will use the time at which you call start()." };
				ArrayAdapter adapter = new ArrayAdapter<String>(this,
						R.layout.activity_listview, countryArray);

				ListView listView = (ListView) findViewById(R.id.country_list);
				listView.setAdapter(adapter);
			}
			break;
		case 5:
			if (cposition == 0) {
				String[] countryArray = {
						"Expandable List",
						"A view that shows items in a vertically scrolling two-level list.",
						"This differs from the ListView by allowing two levels: groups which can individually be expanded to show its children." +
						" The items come from the ExpandableListAdapter associated with this view." };
				ArrayAdapter adapter = new ArrayAdapter<String>(this,
						R.layout.activity_listview, countryArray);

				ListView listView = (ListView) findViewById(R.id.country_list);
				listView.setAdapter(adapter);
			}
			if (cposition == 1) {
				String[] countryArray = {
						"List View",
						"ListView is a view group that displays a list of scrollable items.",
						"The list items are automatically inserted to the list using an Adapter that pulls content from a source such as an array or database query and converts each item" +
						" result into a view that's placed into the list."};
				ArrayAdapter adapter = new ArrayAdapter<String>(this,
						R.layout.activity_listview, countryArray);

				ListView listView = (ListView) findViewById(R.id.country_list);
				listView.setAdapter(adapter);
			}
			if (cposition == 2) {
				String[] countryArray = {
						"Scroll View",
						"Layout container for a view hierarchy that can be scrolled by the user, allowing it to be larger than the physical display. ",
						"A ScrollView is a FrameLayout, meaning you should place one child in it containing the entire contents to scroll; this child may itself be a" +
						" layout manager with a complex hierarchy of objects."};
				ArrayAdapter adapter = new ArrayAdapter<String>(this,
						R.layout.activity_listview, countryArray);

				ListView listView = (ListView) findViewById(R.id.country_list);
				listView.setAdapter(adapter);
			}
			break;
		default:

			break;
		}

	}
}