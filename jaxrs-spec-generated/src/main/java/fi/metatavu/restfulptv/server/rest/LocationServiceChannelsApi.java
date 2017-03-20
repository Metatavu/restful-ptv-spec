package fi.metatavu.restfulptv.server.rest;

import fi.metatavu.restfulptv.server.rest.model.BadRequest;
import fi.metatavu.restfulptv.server.rest.model.Forbidden;
import fi.metatavu.restfulptv.server.rest.model.LocationServiceChannel;
import fi.metatavu.restfulptv.server.rest.model.InternalServerError;
import fi.metatavu.restfulptv.server.rest.model.NotFound;

import javax.ws.rs.*;
import javax.ws.rs.core.Response;

import io.swagger.annotations.*;

import java.util.List;

@Path("/locationServiceChannels")

@Api(description = "the locationServiceChannels API")
@Consumes({ "application/json;charset=utf-8" })
@Produces({ "application/json;charset=utf-8" })
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2017-03-20T11:12:41.186+02:00")

public abstract class LocationServiceChannelsApi extends AbstractApi {

    @GET
    @Path("/{locationServiceChannelId}")
    @Consumes({ "application/json;charset=utf-8" })
    @Produces({ "application/json;charset=utf-8" })
    @ApiOperation(value = "Finds a location service channel by id", notes = "Finds a location service channel by id", response = LocationServiceChannel.class, tags={ "LocationServiceChannels", "ServiceChannels",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Returns a location service channel by id", response = LocationServiceChannel.class),
        @ApiResponse(code = 400, message = "Invalid request was sent to the server", response = LocationServiceChannel.class),
        @ApiResponse(code = 403, message = "Attempted to make a call with unauthorized client", response = LocationServiceChannel.class),
        @ApiResponse(code = 404, message = "Resource was not found from the server", response = LocationServiceChannel.class),
        @ApiResponse(code = 500, message = "Internal server error", response = LocationServiceChannel.class) })
    public abstract Response findLocationServiceChannel(@PathParam("locationServiceChannelId") String locationServiceChannelId);

    @GET
    
    @Consumes({ "application/json;charset=utf-8" })
    @Produces({ "application/json;charset=utf-8" })
    @ApiOperation(value = "Lists location service channels", notes = "Lists location service channels", response = LocationServiceChannel.class, responseContainer = "List", tags={ "LocationServiceChannels", "ServiceChannels" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Returns array of location service channels", response = LocationServiceChannel.class, responseContainer = "List"),
        @ApiResponse(code = 400, message = "Invalid request was sent to the server", response = LocationServiceChannel.class, responseContainer = "List"),
        @ApiResponse(code = 403, message = "Attempted to make a call with unauthorized client", response = LocationServiceChannel.class, responseContainer = "List"),
        @ApiResponse(code = 404, message = "Resource was not found from the server", response = LocationServiceChannel.class, responseContainer = "List"),
        @ApiResponse(code = 500, message = "Internal server error", response = LocationServiceChannel.class, responseContainer = "List") })
    public abstract Response listLocationServiceChannels(@QueryParam("firstResult") Long firstResult,@QueryParam("maxResults") Long maxResults);

}

