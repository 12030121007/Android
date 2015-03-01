package a.b;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Oopsconcepts extends Activity {
	
	String[] countryArray = {"1) Object",
			"2) Class ",
			"3) Inheritance",
			"4) Polymorphism",
			"5) Abstraction",
			"6) Encapsulation",
			"7) And Some webservice     Exp Json,Xml etc"};

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_oopsconcepts);
		ArrayAdapter adapter = new ArrayAdapter<String>(this, 
			      R.layout.activity_listview, countryArray);
			      
			      ListView listView = (ListView) findViewById(R.id.listView1);
			      listView.setAdapter(adapter);
	}
}
