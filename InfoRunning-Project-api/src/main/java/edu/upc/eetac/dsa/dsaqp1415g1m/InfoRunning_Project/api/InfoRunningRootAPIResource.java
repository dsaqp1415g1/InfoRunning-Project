package edu.upc.eetac.dsa.dsaqp1415g1m.InfoRunning_Project.api;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

import edu.upc.eetac.dsa.dsaqp1415g1m.InfoRunning_Project.api.model.InfoRunningRootAPI; 

@Path("/")
public class InfoRunningRootAPIResource {
	
	@GET
	public InfoRunningRootAPI getRootAPI() {
		InfoRunningRootAPI api = new InfoRunningRootAPI();
		return api;
	}

}
