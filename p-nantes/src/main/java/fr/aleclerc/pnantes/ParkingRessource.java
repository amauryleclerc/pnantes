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
@Path("parking")
public class ParkingRessource  {
	
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public String getParking(){
		final Client client = ClientBuilder.newClient();
		final WebTarget target = client.target("http://data.nantes.fr/api/getDisponibiliteParkingsPublics/1.0/S2UDKTSUBGHMASB?output=json");
		String data =target.request().get(String.class);
		System.out.println(data);
		return  data;	
	}
}
