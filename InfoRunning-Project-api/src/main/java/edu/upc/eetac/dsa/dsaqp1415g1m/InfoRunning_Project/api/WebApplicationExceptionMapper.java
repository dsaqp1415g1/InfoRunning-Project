package edu.upc.eetac.dsa.dsaqp1415g1m.InfoRunning_Project.api;

import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.Response;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;

import edu.upc.eetac.dsa.dsaqp1415g1m.InfoRunning_Project.api.model.InfoRunningError;


@Provider
public class WebApplicationExceptionMapper implements
		ExceptionMapper<WebApplicationException> {
	@Override
	public Response toResponse(WebApplicationException exception) {
		InfoRunningError error = new InfoRunningError(
				exception.getResponse().getStatus(), exception.getMessage());
		return Response.status(error.getStatus()).entity(error)
				.type(MediaType.INFORUNNING_API_ERROR).build();
	}
 
}