package ti.googlesignin;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener;

import com.google.android.gms.drive.*;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;

public class GoogleSignInActivity extends FragmentActivity implements
		OnConnectionFailedListener {
	private GoogleApiClient googleApiClient;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		// Create a GoogleApiClient instance
		googleApiClient = new GoogleApiClient.Builder(this)
				.enableAutoManage(this /* FragmentActivity */, this /* OnConnectionFailedListener */)
				.addApi(Drive.API).addScope(Drive.SCOPE_FILE).build();

		// ...
	}

	@Override
	public void onConnectionFailed(ConnectionResult result) {
		// An unresolvable error has occurred and a connection to Google APIs
		// could not be established. Display an error message, or handle
		// the failure silently

		// ...
	}

}