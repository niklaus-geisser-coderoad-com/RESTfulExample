package com.mkyong.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

@Path("/hola")
public class HolaRestService {
    @GET
    public Response printMessage() {
        Persona tu = new Persona();
        String result = "Hola Mundo";
        return Response.status(200).entity(tu.getName()).build();

    }
}
