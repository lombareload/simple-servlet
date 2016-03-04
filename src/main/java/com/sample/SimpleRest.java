package com.sample;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/simple")
public class SimpleRest {

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Simple getSimple() {
        return new Simple("simple name");
    }

    public static class Simple{
        private String name;

        public Simple(String name){
            this.name = name;
        }

        public String getName() {
            return name;
        }
    }
}
