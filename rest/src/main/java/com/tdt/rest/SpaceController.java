package com.tdt.rest;

import com.tdt.entity.Spaces;
import com.tdt.entity.UserInfo;

import javax.annotation.security.RolesAllowed;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import java.util.List;

/**
 * Rest Space controller!
 */
@Path("/spaces")
@Produces("application/json")
public class SpaceController {

    @GET
    @Path("/")
    @RolesAllowed({"administrators"})
    public List<Spaces> spaces() {
        return null;
    }
}
