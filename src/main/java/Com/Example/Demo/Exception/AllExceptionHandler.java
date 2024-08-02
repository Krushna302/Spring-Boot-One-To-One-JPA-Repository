package Com.Example.Demo.Exception;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

@ControllerAdvice
public class AllExceptionHandler {
	
	
	
	
	@ExceptionHandler(StudentNotFound.class)
	public @ResponseBody ExceptionResponce handleException(HttpServletRequest request ,
			StudentNotFound exception) {
		
		
		
		ExceptionResponce response = new ExceptionResponce();
		
		response.setGeturi(request.getRequestURI());
		
		response.setErrormsg(exception.getMessage());
		
		return response;
		
		
	}

}
