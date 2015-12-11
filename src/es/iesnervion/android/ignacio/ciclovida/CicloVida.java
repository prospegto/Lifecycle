package es.iesnervion.android.ignacio.ciclovida;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.widget.Toast;

public class CicloVida extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_ciclo_vida);
		Toast.makeText(this, "onCreate", Toast.LENGTH_SHORT).show();
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.ciclo_vida, menu);
		return true;
	}


	@Override

	public void onStart(){
		super.onStart();
		Toast.makeText(this, "onStart", Toast.LENGTH_SHORT).show();
	}

	@Override

	public void onResume(){
		super.onResume();
		Toast.makeText(this, "onResume", Toast.LENGTH_SHORT).show();
	}

	@Override

	public void onRestart(){
		super.onRestart();
		Toast.makeText(this, "onRestart", Toast.LENGTH_SHORT).show();
	}

	@Override

	public void onPause(){
		Toast.makeText(this, "onPause", Toast.LENGTH_SHORT).show();
		super.onPause();
	}

	@Override

	public void onStop(){
		Toast.makeText(this, "onStop", Toast.LENGTH_SHORT).show();
		super.onStop();

	}

	@Override

	public void onDestroy(){
		Toast.makeText(this, "onDestroy", Toast.LENGTH_SHORT).show();
		super.onDestroy();
	}

}



