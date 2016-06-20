package com.mkyong.rest;

import javax.ws.rs.FormParam;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

/**
 * Created by user-pc on 6/16/2016.
 */
@Path("/user")
public class UserService {
    @POST
    @Path("/add")
    public Response addUser(@FormParam("name")String name, @FormParam("age") int age){
        Persona clau = new Persona(name,age);
        return Response.status(200)
                .entity("El usuario se llama:"+clau.getName()+" y tiene:"+clau.getEdad()+" anios de edad")
                .build();
    }

}
