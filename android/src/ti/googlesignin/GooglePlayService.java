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

	public static String importJSON(JSONObject json) {
		String clientId = null;
		try {
			clientId = json.getJSONObject("project_info")
					.getJSONArray("client").getJSONObject(0)
					.getJSONArray("oauth_client").getJSONObject(0)
					.getString("client_id");

		} catch (JSONException e) {
			e.printStackTrace();
		}
		return clientId;
	}
}
