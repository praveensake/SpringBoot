package com.example.hellowebapp;

import com.perm.model.Record;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

@Path("/hello-world")
public class HelloResource {
    @GET
    @Produces("text/plain")
    public String hello() {
        return "Hello, World!";
    }

    @GET
    @Path("perm")
    @Produces("text/plain")
    public String hello1() {
        return "Perm Approved :)";
    }

    // POST http://localhost:8080/HelloWebApp_war_exploded/api/hello-world/sake
    @POST
    @Path("/{name}")
    @Produces("text/plain")
    public String customWelcome(@PathParam("name") String name) {
        return "Welcome " + name + "!";
    }

    private static final Map<String, Record> recordMap = new HashMap<>();

    // GET http://localhost:8080/HelloWebApp_war_exploded/api/hello-world/A123
    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Record getPerson(@PathParam("id") String id) {

        Record record = new Record("A123", "approved", new Date(), new Date());
        recordMap.put("A123", record);

        return recordMap.get(id);
    }
}