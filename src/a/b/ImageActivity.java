package a.b;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class ImageActivity extends Activity {

	
	Button Image;
	ImageView image;
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_image);
		Image=(Button)findViewById(R.id.btnimage);
		image=(ImageView)findViewById(R.id.imageView1);
		Image.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				image.setImageResource(R.drawable.nature);
				
				
			}
		});
	}

	

}
