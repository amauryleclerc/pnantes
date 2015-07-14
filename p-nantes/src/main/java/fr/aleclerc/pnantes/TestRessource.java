package fr.aleclerc.pnantes;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 * Servlet implementation class ParkingRessource
 */
@Path("test")
public class TestRessource  {
	
	
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String getParking(){
		
		return  "test";	
	}
}
