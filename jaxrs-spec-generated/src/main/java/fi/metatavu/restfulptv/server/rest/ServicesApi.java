package fi.metatavu.restfulptv.server.rest;

import fi.metatavu.restfulptv.server.rest.model.BadRequest;
import fi.metatavu.restfulptv.server.rest.model.Service;
import fi.metatavu.restfulptv.server.rest.model.Forbidden;
import fi.metatavu.restfulptv.server.rest.model.InternalServerError;
import fi.metatavu.restfulptv.server.rest.model.NotFound;

import javax.ws.rs.*;
import javax.ws.rs.core.Response;

import io.swagger.annotations.*;

import java.util.List;

@Path("/services")

@Api(description = "the services API")
@Consumes({ "application/json;charset=utf-8" })
@Produces({ "application/json;charset=utf-8" })
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2017-04-10T22:04:43.461+03:00")

public abstract class ServicesApi extends AbstractApi {

    @POST
    
    @Consumes({ "application/json;charset=utf-8" })
    @Produces({ "application/json;charset=utf-8" })
    @ApiOperation(value = "Create service", notes = "Creates new service", response = Service.class, tags={ "Services",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Created service", response = Service.class),
        @ApiResponse(code = 400, message = "Invalid request was sent to the server", response = Service.class),
        @ApiResponse(code = 403, message = "Attempted to make a call with unauthorized client", response = Service.class),
        @ApiResponse(code = 500, message = "Internal server error", response = Service.class) })
    public abstract Response createService(Service body);

    @GET
    @Path("/{serviceId}")
    @Consumes({ "application/json;charset=utf-8" })
    @Produces({ "application/json;charset=utf-8" })
    @ApiOperation(value = "Finds a service by id", notes = "Finds service", response = Service.class, tags={ "Services",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Returns a service", response = Service.class),
        @ApiResponse(code = 400, message = "Invalid request was sent to the server", response = Service.class),
        @ApiResponse(code = 403, message = "Attempted to make a call with unauthorized client", response = Service.class),
        @ApiResponse(code = 404, message = "Resource was not found from the server", response = Service.class),
        @ApiResponse(code = 500, message = "Internal server error", response = Service.class) })
    public abstract Response findService(@PathParam("serviceId") String serviceId);

    @GET
    
    @Consumes({ "application/json;charset=utf-8" })
    @Produces({ "application/json;charset=utf-8" })
    @ApiOperation(value = "Service list", notes = "Lists services", response = Service.class, responseContainer = "List", tags={ "Services",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "An array of services", response = Service.class, responseContainer = "List"),
        @ApiResponse(code = 400, message = "Invalid request was sent to the server", response = Service.class, responseContainer = "List"),
        @ApiResponse(code = 403, message = "Attempted to make a call with unauthorized client", response = Service.class, responseContainer = "List"),
        @ApiResponse(code = 404, message = "Resource was not found from the server", response = Service.class, responseContainer = "List"),
        @ApiResponse(code = 500, message = "Internal server error", response = Service.class, responseContainer = "List") })
    public abstract Response listServices(@QueryParam("organizationId") String organizationId,@QueryParam("firstResult") Long firstResult,@QueryParam("maxResults") Long maxResults);

    @PUT
    @Path("/{serviceId}")
    @Consumes({ "application/json;charset=utf-8" })
    @Produces({ "application/json;charset=utf-8" })
    @ApiOperation(value = "Updates service", notes = "Updates service", response = Service.class, tags={ "Services" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Returns an updated service", response = Service.class),
        @ApiResponse(code = 400, message = "Invalid request was sent to the server", response = Service.class),
        @ApiResponse(code = 403, message = "Attempted to make a call with unauthorized client", response = Service.class),
        @ApiResponse(code = 404, message = "Resource was not found from the server", response = Service.class),
        @ApiResponse(code = 500, message = "Internal server error", response = Service.class) })
    public abstract Response updateService(@PathParam("serviceId") String serviceId,Service body);

}

