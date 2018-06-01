package com.loopme.api.administration.controller.exception;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.support.ResourceBundleMessageSource;
import org.springframework.http.*;
import org.springframework.web.HttpMediaTypeException;
import org.springframework.web.HttpRequestMethodNotSupportedException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.NoHandlerFoundException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.nio.charset.StandardCharsets;
import java.util.Locale;

@Slf4j
@ControllerAdvice
public class ExceptionAdvice {

    private static final String METHOD_NOT_ALLOWED_ERROR = "METHOD_NOT_ALLOWED_ERROR";
    private static final String UNSUPPORTED_MEDIA_TYPE_ERROR = "UNSUPPORTED_MEDIA_TYPE_ERROR";
    private static final String INTERNAL_SERVER_ERROR = "INTERNAL_SERVER_ERROR";

    @ExceptionHandler(NoHandlerFoundException.class)
    @ResponseBody
    public ModelAndView handle(HttpServletRequest request,
                               NoHandlerFoundException ex)
            throws NoHandlerFoundException {
        if (HttpMethod.GET.matches(request.getMethod())) {
            return new ModelAndView("index");
        }
        throw ex;
    }

    @ExceptionHandler(HttpRequestMethodNotSupportedException.class)
    @ResponseBody
    public ResponseEntity<Object> handleMethodNotAllowed(HttpServletRequest request,
                                                         HttpServletResponse response,
                                                         HttpRequestMethodNotSupportedException ex) {
        logger.error("", ex);
        return new ResponseEntity<>(getErrorMessage(METHOD_NOT_ALLOWED_ERROR),
                createResponseHeaders(), HttpStatus.METHOD_NOT_ALLOWED);
    }

    @ExceptionHandler(HttpMediaTypeException.class)
    @ResponseBody
    public ResponseEntity<Object> handleUnsupportedMediaType(HttpServletResponse response,
                                                             HttpMediaTypeException ex) {
        logger.error("", ex);
        return new ResponseEntity<>(getErrorMessage(UNSUPPORTED_MEDIA_TYPE_ERROR),
                createResponseHeaders(), HttpStatus.UNSUPPORTED_MEDIA_TYPE);
    }

    @ExceptionHandler(Exception.class)
    @ResponseBody
    public ResponseEntity<Object> handleInternalServerError(HttpServletRequest request,
                                                            HttpServletResponse response,
                                                            Exception ex) {
        logger.error("", ex);
        return new ResponseEntity<>(getErrorMessage(INTERNAL_SERVER_ERROR),
                createResponseHeaders(), HttpStatus.INTERNAL_SERVER_ERROR);
    }

    private HttpHeaders createResponseHeaders() {
        HttpHeaders headers = new HttpHeaders();
        headers.add(HttpHeaders.CONTENT_TYPE, new MediaType(MediaType.TEXT_PLAIN, StandardCharsets.UTF_8).toString());
        return headers;
    }
}
