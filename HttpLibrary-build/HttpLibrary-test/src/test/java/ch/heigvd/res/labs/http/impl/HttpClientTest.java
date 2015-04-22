package ch.heigvd.res.labs.http.impl;

import ch.heigvd.res.labs.http.interfaces.IHttpClient;
import ch.heigvd.res.labs.http.interfaces.IHttpResponse;
import java.io.IOException;
import static junit.framework.Assert.assertEquals;
import org.junit.Test;


/**
 *
 * @author Olivier Liechti
 */
public class HttpClientTest {
    @Test
    public void itShouldBePossibleToSendAGETRequest() throws IOException{
        IHttpClient client = new HttpClient();
        HttpRequest request = new HttpRequest();
        request.setMethod("GET");
        request.setProtocolVersion("HTTP/1.1");
        request.setURI("http://www.heig-vd.ch/presentation");
        IHttpResponse response = client.sendRequest(request);
        assertEquals(200,response.getStatusCode());
    }
    
    /**
     *
     * @throws IOException
     */
    @Test
    public void itShouldBePossibleToSendAGETRequest2() throws IOException{
        IHttpClient client = new HttpClient();
        HttpRequest request = new HttpRequest();
        request.setMethod("GET");
        request.setProtocolVersion("HTTP/1.1");
        request.setURI("http://www.google.com/");
        IHttpResponse response = client.sendRequest(request);
        assertEquals(302,response.getStatusCode());
    }
}
