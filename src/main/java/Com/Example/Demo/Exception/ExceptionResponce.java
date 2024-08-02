package Com.Example.Demo.Exception;



public class ExceptionResponce {
	
	
	
	private String geturi;
	
	private String errormsg;
	
	
	

	public String getGeturi() {
		return geturi;
	}

	public void setGeturi(String geturi) {
		this.geturi = geturi;
	}

	public String getErrormsg() {
		return errormsg;
	}

	public void setErrormsg(String errormsg) {
		this.errormsg = errormsg;
	}

	
	
	@Override
	public String toString() {
		return "ExceptionResponce [geturi=" + geturi + ", errormsg=" + errormsg + "]";
	}
	
	
	
	
	
	

}
