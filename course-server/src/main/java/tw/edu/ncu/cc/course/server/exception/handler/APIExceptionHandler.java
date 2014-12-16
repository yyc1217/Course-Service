package tw.edu.ncu.cc.course.server.exception.handler;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.AccessDeniedException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.HttpStatusCodeException;

import javax.servlet.http.HttpServletRequest;

@RestController
public class APIExceptionHandler {

    private Logger logger = LoggerFactory.getLogger( this.getClass() );

    @ExceptionHandler( { AccessDeniedException.class } )
    public ResponseEntity accessDenied( HttpServletRequest request ) {
        logger.warn( "ACCESS DENIED FROM {} FOR {} ", request.getRemoteAddr(), request.getRequestURI() );
        return new ResponseEntity<>(
                HttpStatus.FORBIDDEN
        );
    }

    @ExceptionHandler( { HttpStatusCodeException.class } )
    public ResponseEntity invalidRequestBody( HttpStatusCodeException e ) {
        return new ResponseEntity<>(
            e.getMessage(), e.getStatusCode()
        );
    }

    @ExceptionHandler
    public ResponseEntity exceptionHandler( Exception exception ) {
        logger.error( "SEVERE INTERNAL ERROR", exception );
        return new ResponseEntity<>(
                exception.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR
        );
    }

}
