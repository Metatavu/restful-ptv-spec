package fi.metatavu.restfulptv.server.rest;

import fi.metatavu.restfulptv.server.rest.model.BadRequest;
import fi.metatavu.restfulptv.server.rest.model.PhoneServiceChannel;
import fi.metatavu.restfulptv.server.rest.model.Forbidden;
import fi.metatavu.restfulptv.server.rest.model.InternalServerError;
import fi.metatavu.restfulptv.server.rest.model.NotFound;

import javax.ws.rs.*;
import javax.ws.rs.core.Response;

import io.swagger.annotations.*;

import java.util.List;

@Path("/phoneServiceChannels")

@Api(description = "the phoneServiceChannels API")
@Consumes({ "application/json;charset=utf-8" })
@Produces({ "application/json;charset=utf-8" })
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2017-04-11T07:24:52.286+03:00")

public abstract class PhoneServiceChannelsApi extends AbstractApi {

    @GET
    @Path("/{phoneServiceChannelId}")
    @Consumes({ "application/json;charset=utf-8" })
    @Produces({ "application/json;charset=utf-8" })
    @ApiOperation(value = "finds a phone service channel by id", notes = "finds a phone service channel by id", response = PhoneServiceChannel.class, tags={ "PhoneServiceChannels", "ServiceChannels",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Returns a phone service channel", response = PhoneServiceChannel.class),
        @ApiResponse(code = 400, message = "Invalid request was sent to the server", response = PhoneServiceChannel.class),
        @ApiResponse(code = 403, message = "Attempted to make a call with unauthorized client", response = PhoneServiceChannel.class),
        @ApiResponse(code = 404, message = "Resource was not found from the server", response = PhoneServiceChannel.class),
        @ApiResponse(code = 500, message = "Internal server error", response = PhoneServiceChannel.class) })
    public abstract Response findPhoneServiceChannel(@PathParam("phoneServiceChannelId") String phoneServiceChannelId);

    @GET
    
    @Consumes({ "application/json;charset=utf-8" })
    @Produces({ "application/json;charset=utf-8" })
    @ApiOperation(value = "Lists phone service channels", notes = "Lists phone service channels", response = PhoneServiceChannel.class, responseContainer = "List", tags={ "PhoneServiceChannels", "ServiceChannels" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Returns array of phone service channels", response = PhoneServiceChannel.class, responseContainer = "List"),
        @ApiResponse(code = 400, message = "Invalid request was sent to the server", response = PhoneServiceChannel.class, responseContainer = "List"),
        @ApiResponse(code = 403, message = "Attempted to make a call with unauthorized client", response = PhoneServiceChannel.class, responseContainer = "List"),
        @ApiResponse(code = 404, message = "Resource was not found from the server", response = PhoneServiceChannel.class, responseContainer = "List"),
        @ApiResponse(code = 500, message = "Internal server error", response = PhoneServiceChannel.class, responseContainer = "List") })
    public abstract Response listPhoneServiceChannels(@QueryParam("firstResult") Long firstResult,@QueryParam("maxResults") Long maxResults);

}

