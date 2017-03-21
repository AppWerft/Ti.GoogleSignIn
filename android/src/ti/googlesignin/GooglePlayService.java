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
		try {
			JSONObject projectInfo = json.getJSONObject("project_info");
		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return true;

	}

}
