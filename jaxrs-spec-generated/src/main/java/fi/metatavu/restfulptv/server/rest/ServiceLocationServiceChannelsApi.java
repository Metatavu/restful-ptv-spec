package fi.metatavu.restfulptv.server.rest;

import fi.metatavu.restfulptv.server.rest.model.BadRequest;
import fi.metatavu.restfulptv.server.rest.model.ServiceLocationServiceChannel;
import fi.metatavu.restfulptv.server.rest.model.Forbidden;
import fi.metatavu.restfulptv.server.rest.model.InternalServerError;
import fi.metatavu.restfulptv.server.rest.model.NotFound;

import javax.ws.rs.*;
import javax.ws.rs.core.Response;

import io.swagger.annotations.*;

import java.util.List;

@Path("/serviceLocationServiceChannels")

@Api(description = "the serviceLocationServiceChannels API")
@Consumes({ "application/json;charset=utf-8" })
@Produces({ "application/json;charset=utf-8" })
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2017-04-10T20:11:10.652+03:00")

public abstract class ServiceLocationServiceChannelsApi extends AbstractApi {

    @GET
    @Path("/{serviceLocationServiceChannelId}")
    @Consumes({ "application/json;charset=utf-8" })
    @Produces({ "application/json;charset=utf-8" })
    @ApiOperation(value = "Finds a service location service channel by id", notes = "Finds a service location service channel by id", response = ServiceLocationServiceChannel.class, tags={ "ServiceLocationServiceChannels", "ServiceChannels",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Returns a service location service channel by id", response = ServiceLocationServiceChannel.class),
        @ApiResponse(code = 400, message = "Invalid request was sent to the server", response = ServiceLocationServiceChannel.class),
        @ApiResponse(code = 403, message = "Attempted to make a call with unauthorized client", response = ServiceLocationServiceChannel.class),
        @ApiResponse(code = 404, message = "Resource was not found from the server", response = ServiceLocationServiceChannel.class),
        @ApiResponse(code = 500, message = "Internal server error", response = ServiceLocationServiceChannel.class) })
    public abstract Response findServiceLocationServiceChannel(@PathParam("serviceLocationServiceChannelId") String serviceLocationServiceChannelId);

    @GET
    
    @Consumes({ "application/json;charset=utf-8" })
    @Produces({ "application/json;charset=utf-8" })
    @ApiOperation(value = "Lists service location service channels", notes = "Lists service location service channels", response = ServiceLocationServiceChannel.class, responseContainer = "List", tags={ "ServiceLocationServiceChannels", "ServiceChannels" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Returns array of service location service channels", response = ServiceLocationServiceChannel.class, responseContainer = "List"),
        @ApiResponse(code = 400, message = "Invalid request was sent to the server", response = ServiceLocationServiceChannel.class, responseContainer = "List"),
        @ApiResponse(code = 403, message = "Attempted to make a call with unauthorized client", response = ServiceLocationServiceChannel.class, responseContainer = "List"),
        @ApiResponse(code = 404, message = "Resource was not found from the server", response = ServiceLocationServiceChannel.class, responseContainer = "List"),
        @ApiResponse(code = 500, message = "Internal server error", response = ServiceLocationServiceChannel.class, responseContainer = "List") })
    public abstract Response listServiceLocationServiceChannels(@QueryParam("firstResult") Long firstResult,@QueryParam("maxResults") Long maxResults);

}

