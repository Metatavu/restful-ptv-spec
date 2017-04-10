package fi.metatavu.restfulptv.server.rest;

import fi.metatavu.restfulptv.server.rest.model.BadRequest;
import fi.metatavu.restfulptv.server.rest.model.Forbidden;
import fi.metatavu.restfulptv.server.rest.model.ElectronicServiceChannel;
import fi.metatavu.restfulptv.server.rest.model.InternalServerError;
import fi.metatavu.restfulptv.server.rest.model.NotFound;

import javax.ws.rs.*;
import javax.ws.rs.core.Response;

import io.swagger.annotations.*;

import java.util.List;

@Path("/electronicServiceChannels")

@Api(description = "the electronicServiceChannels API")
@Consumes({ "application/json;charset=utf-8" })
@Produces({ "application/json;charset=utf-8" })
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2017-04-10T20:11:10.652+03:00")

public abstract class ElectronicServiceChannelsApi extends AbstractApi {

    @GET
    @Path("/{electronicServiceChannelId}")
    @Consumes({ "application/json;charset=utf-8" })
    @Produces({ "application/json;charset=utf-8" })
    @ApiOperation(value = "finds an electronic service channel by id", notes = "finds an electronic service channel by id", response = ElectronicServiceChannel.class, tags={ "ElectronicServiceChannels", "ServiceChannels",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Returns an electronic service channel", response = ElectronicServiceChannel.class),
        @ApiResponse(code = 400, message = "Invalid request was sent to the server", response = ElectronicServiceChannel.class),
        @ApiResponse(code = 403, message = "Attempted to make a call with unauthorized client", response = ElectronicServiceChannel.class),
        @ApiResponse(code = 404, message = "Resource was not found from the server", response = ElectronicServiceChannel.class),
        @ApiResponse(code = 500, message = "Internal server error", response = ElectronicServiceChannel.class) })
    public abstract Response findElectronicServiceChannel(@PathParam("electronicServiceChannelId") String electronicServiceChannelId);

    @GET
    
    @Consumes({ "application/json;charset=utf-8" })
    @Produces({ "application/json;charset=utf-8" })
    @ApiOperation(value = "Lists electronic service channels", notes = "Lists electronic service channels", response = ElectronicServiceChannel.class, responseContainer = "List", tags={ "ElectronicServiceChannels", "ServiceChannels" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Returns array of electronic service channels", response = ElectronicServiceChannel.class, responseContainer = "List"),
        @ApiResponse(code = 400, message = "Invalid request was sent to the server", response = ElectronicServiceChannel.class, responseContainer = "List"),
        @ApiResponse(code = 403, message = "Attempted to make a call with unauthorized client", response = ElectronicServiceChannel.class, responseContainer = "List"),
        @ApiResponse(code = 404, message = "Resource was not found from the server", response = ElectronicServiceChannel.class, responseContainer = "List"),
        @ApiResponse(code = 500, message = "Internal server error", response = ElectronicServiceChannel.class, responseContainer = "List") })
    public abstract Response listElectronicServiceChannels(@QueryParam("firstResult") Long firstResult,@QueryParam("maxResults") Long maxResults);

}

