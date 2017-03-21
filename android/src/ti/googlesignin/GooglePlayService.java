package ti.googlesignin;

import java.io.IOException;
import java.io.InputStream;

import org.appcelerator.kroll.common.Log;
import org.appcelerator.titanium.TiApplication;
import org.appcelerator.titanium.io.TiFileFactory;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class GooglePlayService {
	public String LCAT = GooglesigninModule.LCAT;

	public GooglePlayService() {
	}

	public static boolean importJSON(JSONObject json) {

		JSONObject json = new JSONObject(loadJSONFromAsset());
		JSONObject projectInfo = json.getJSONObject("project_info");
		storageBucket = projectInfo.getString("storage_bucket");
		databaseUrl = projectInfo.getString("firebase_url");
		gcmSenderId = projectInfo.getString("project_number");
		JSONArray clients = json.getJSONArray("client");
		Log.d(LCAT, "I found " + clients.length() + " clients.");
		for (int i = 0; i < clients.length(); i++) {
			JSONObject client = clients.getJSONObject(i);
			JSONObject clientInfo = client.getJSONObject("client_info");
			String pName = clientInfo.getJSONObject("android_client_info")
					.getString("package_name");
			Log.d(LCAT, "packageName in clients of json = " + pName);
			if (pName.equals(packageName)) {
				Log.d(LCAT, "packageName found in json ");
				Log.d(LCAT, clients.getJSONObject(i).toString());
				applicationId = client.getJSONObject("client_info").getString(
						"mobilesdk_app_id");
				apiKey = client.getJSONArray("api_key").getJSONObject(0)
						.getString("current_key");
			}
		}
		if (apiKey == null)
			Log.e(LCAT, packageName + " is not part of google-services.json");

		return true;

	}

}
