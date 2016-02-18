package SecurityCheck;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import org.apache.http.client.ClientProtocolException;
import org.testng.annotations.Test;


public class APITest {
  @Test
  public void API() throws ClientProtocolException, IOException {
 
 
	  URL url = new URL("https://restcountries.eu/rest/v1/callingcode/7");
	  HttpURLConnection conn = (HttpURLConnection) url.openConnection();
	  conn.setRequestMethod("GET");
      //conn.setUseCaches(true);
	  conn.setRequestProperty("Accept", "application/json");
	  
	    
	    
	  //System.out.println(conn.getResponseCode()); 
	    
	  if (conn.getResponseCode()==200){System.out.println("Passed");}
	  else{System.out.println("Failed");}
  }
}
