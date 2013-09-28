package hackathon.bbh;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.view.Menu;

public class MainActivity extends FragmentActivity {
	
	private MainLoginFragment mainLoginFragment;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		if (savedInstanceState == null) {
	        // Add the fragment on initial activity setup
	        mainLoginFragment = new MainLoginFragment();
	        getSupportFragmentManager()
	        .beginTransaction()
	        .add(android.R.id.content, mainLoginFragment)
	        .commit();
	    } else {
	        // Or set the fragment from restored state info
	        mainLoginFragment = (MainLoginFragment) getSupportFragmentManager()
	        .findFragmentById(android.R.id.content);
	    }
		//setContentView(R.layout.activity_main);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
