package org.mr;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

//-- added some comments --

@Path("/hello")
public class mr5service {
    @GET
    @Produces("text/plain")
    public String whatsoever(){
        return "Alles Klar";
    }
}
