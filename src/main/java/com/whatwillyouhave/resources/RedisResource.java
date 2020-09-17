package com.whatwillyouhave.resources;

import com.codahale.metrics.annotation.Timed;
import com.whatwillyouhave.api.MyKeyValue;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.tags.Tag;
import io.swagger.v3.oas.annotations.tags.Tags;

import javax.validation.Valid;
import javax.ws.rs.*;

@Path("/redis")
@Timed()
@Produces({"application/json", "application/xml"})
@Tag(name="Redis endpoint", description = "Endpoint to get/set redis values")
public class RedisResource {

    @GET
    @Path("/{key}")
    @Operation(description="Get key/value from Redis")
    public MyKeyValue getValue(@Parameter(name="key",description="Object key",required = true) @PathParam("key") String key) {
        // TODO: implement
        return null;
    }

    @POST
    @Consumes("application/json")
    @Operation(description="Set key/value pair for Redis")
    public void setValue(@Valid MyKeyValue keyValue) {
        // TODO: implement
    }
}
