package hackathon.bbh;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.NameValuePair;
import org.apache.http.client.HttpClient;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.message.BasicNameValuePair;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;

public class ListActivity extends Activity {
	
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		try {
			httpPost();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		super.onCreate(savedInstanceState);
		
	}
	
	public void httpPost() throws Exception {
		
		
		
//		HttpClient httpclient = new DefaultHttpClient();
//		HttpPost httppost = new HttpPost("http://ec2-23-22-78-145.compute-1.amazonaws.com/users");
//		// Request parameters and other properties.
//		List<NameValuePair> params = new ArrayList<NameValuePair>(2);
//		params.add(new BasicNameValuePair("user[name]", "name"));
//		params.add(new BasicNameValuePair("user[surname]", "Hello!"));
//		httppost.setEntity(new UrlEncodedFormEntity(params, "UTF-8"));
//		
//		//Execute and get the response.
//		HttpResponse response = httpclient.execute(httppost);
//		Log.i("BBH", "lol2");
//		HttpEntity entity = response.getEntity();
//
//		if (entity != null) {
//			InputStream instream = entity.getContent();
//			try {
//				// do something useful
//			} finally {
//				instream.close();
//			}
//		}
	}
}
