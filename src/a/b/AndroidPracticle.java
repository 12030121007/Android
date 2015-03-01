package a.b;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class AndroidPracticle extends Activity {
	private EditText emailEditText;
	private EditText passEditText;
	Button sing;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.android_practicle);

		emailEditText = (EditText) findViewById(R.id.editText_email);
		passEditText = (EditText) findViewById(R.id.editText_password);
//		sing=(Button)findViewById(R.id.btn_signup);

		findViewById(R.id.btn_signup).setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View arg0) {

				final String email = emailEditText.getText().toString();
				final String pass = passEditText.getText().toString();
				if ((email.equals("Admin")) &&  (pass.equals("Admin"))) {
					
					Intent mainActivity= new Intent(getApplicationContext(), MainActivity.class);
					startActivity(mainActivity);
					/*emailEditText.setError("Invalid Email");*/
				} else {
					Toast.makeText(getApplicationContext(), "Login Failed", Toast.LENGTH_SHORT).show();
				}

				
				/*if (!isValidPassword(pass)) {
					passEditText.setError("Invalid Password");

					
				}*/
				

			}
		});
	}

	// validating email id
	private boolean isValidEmail(String email) {
		String EMAIL_PATTERN = "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
				+ "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";

		Pattern pattern = Pattern.compile(EMAIL_PATTERN);
		Matcher matcher = pattern.matcher(email);
		return matcher.matches();
	}

	// validating password with retype password
	private boolean isValidPassword(String pass) {
		if (pass != null && pass.length() > 6) {
			return true;
		}
		return false;
	}
}