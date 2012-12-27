package cc.hdas.try_mvn_war_jar;

import javax.ws.rs.DefaultValue;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;

@Path("/")
public class HelloWS {

	@GET
	@Path("/")
	public String hello(@QueryParam("name") @DefaultValue("world") String name
			) {
		return "Hello " + name + "!";
	}
}
