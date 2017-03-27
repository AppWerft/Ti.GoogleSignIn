package ti.googlesignin;

import org.json.JSONException;
import org.json.JSONObject;

public class GoogleServices {

	public static String getClientId(JSONObject json) {
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
