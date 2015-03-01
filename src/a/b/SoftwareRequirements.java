package a.b;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class SoftwareRequirements extends Activity {
	
	String[] countryArray = {"1) Download and install latest jdk version for your windows. ",
			"http://www.oracle.com/technetwork/java/javase/downloads/index.html ", "2) Download and install android-sdk for windows.",
					"http://developer.android.com/sdk/index.html", "3) Download and install eclipse-java-indigo-SR1-win32-x86_64",
							"https://dl-ssl.google.com/android/eclipse/", "4) Configure ADT (Advanced Development Toolkit) Plugin",
									"5)Start Eclipse, and then Select Help à Install New Software....",
									"6)Click Add, in the top-right corner.",
									"7)In the Add Repository dialog that appears, enter 'ADT Plugin' for the Name and the following URL for the Location:",
									"8)https://dl-ssl.google.com/android/eclipse/",
									"9)For more information please visit https://developer.android.com/training/index.html"};

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.soft_req);
		ArrayAdapter adapter = new ArrayAdapter<String>(this, 
			      R.layout.activity_listview, countryArray);
			      
			      ListView listView = (ListView) findViewById(R.id.country_list);
			      listView.setAdapter(adapter);
	}
}
