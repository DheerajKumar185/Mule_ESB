package com.tech.doks.mule.svc;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

@Path("/hello")
public class HelloServices {
	@GET @Path("/{name}")
	public Response getName(@PathParam ("name") String name) {
		String result = "Hello : " + name;
		return Response.status(200).entity(result).build();
	}
	
}
