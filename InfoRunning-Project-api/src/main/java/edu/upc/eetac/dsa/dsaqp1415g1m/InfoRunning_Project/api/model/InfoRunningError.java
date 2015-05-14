package edu.upc.eetac.dsa.dsaqp1415g1m.InfoRunning_Project.api.model;

public class InfoRunningError {
	
	private int status;
	private String message;
 
	public InfoRunningError() {
		super();
	}
 
	public InfoRunningError(int status, String message) {
		super();
		this.status = status;
		this.message = message;
	}
 
	public int getStatus() {
		return status;
	}
 
	public void setStatus(int status) {
		this.status = status;
	}
 
	public String getMessage() {
		return message;
	}
 
	public void setMessage(String message) {
		this.message = message;
	}
	

}
