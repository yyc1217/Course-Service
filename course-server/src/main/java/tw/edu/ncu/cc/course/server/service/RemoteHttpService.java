package tw.edu.ncu.cc.course.server.service;

import org.springframework.web.client.RestClientException;

public interface RemoteHttpService {

    public <T> T getObject( Class<T> responseType, String url, Object... urlVariables ) throws RestClientException;

}
