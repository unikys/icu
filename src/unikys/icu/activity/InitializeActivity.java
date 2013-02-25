package unikys.icu.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

public class InitializeActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		switchToMainActivity();
	}
	
	private void switchToMainActivity() {
		Intent intent = new Intent(this, ICUMainActivity.class);
		startActivity(intent);
		this.finish();
	}
}
