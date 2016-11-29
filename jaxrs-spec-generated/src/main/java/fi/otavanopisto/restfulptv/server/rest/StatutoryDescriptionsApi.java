package fi.otavanopisto.restfulptv.server.rest;

import fi.otavanopisto.restfulptv.server.rest.model.BadRequest;
import fi.otavanopisto.restfulptv.server.rest.model.StatutoryDescription;
import fi.otavanopisto.restfulptv.server.rest.model.Forbidden;
import fi.otavanopisto.restfulptv.server.rest.model.InternalServerError;
import fi.otavanopisto.restfulptv.server.rest.model.NotFound;

import javax.ws.rs.*;
import javax.ws.rs.core.Response;

import io.swagger.annotations.*;

import java.util.List;

@Path("/statutoryDescriptions")

@Api(description = "the statutoryDescriptions API")
@Consumes({ "application/json;charset=utf-8" })
@Produces({ "application/json;charset=utf-8" })
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2016-11-29T08:42:53.332+02:00")

public abstract class StatutoryDescriptionsApi extends AbstractApi {

    @GET
    @Path("/{statutoryDescriptionId}")
    @Consumes({ "application/json;charset=utf-8" })
    @Produces({ "application/json;charset=utf-8" })
    @ApiOperation(value = "Finds a statutory description", notes = "Finds a statutory description by id", response = StatutoryDescription.class, tags={ "Statutory descriptions",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "An statutory description", response = StatutoryDescription.class),
        @ApiResponse(code = 400, message = "Invalid request was sent to the server", response = StatutoryDescription.class),
        @ApiResponse(code = 403, message = "Attempted to make a call with unauthorized client", response = StatutoryDescription.class),
        @ApiResponse(code = 404, message = "Resource was not found from the server", response = StatutoryDescription.class),
        @ApiResponse(code = 500, message = "Internal server error", response = StatutoryDescription.class) })
    public abstract Response findStatutoryDescription(@PathParam("statutoryDescriptionId") String statutoryDescriptionId);

    @GET
    
    @Consumes({ "application/json;charset=utf-8" })
    @Produces({ "application/json;charset=utf-8" })
    @ApiOperation(value = "List statutory descriptions", notes = "List statutory descriptions", response = StatutoryDescription.class, responseContainer = "List", tags={ "Statutory descriptions" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "An array of statutory descriptions", response = StatutoryDescription.class, responseContainer = "List"),
        @ApiResponse(code = 400, message = "Invalid request was sent to the server", response = StatutoryDescription.class, responseContainer = "List"),
        @ApiResponse(code = 403, message = "Attempted to make a call with unauthorized client", response = StatutoryDescription.class, responseContainer = "List"),
        @ApiResponse(code = 500, message = "Internal server error", response = StatutoryDescription.class, responseContainer = "List") })
    public abstract Response listStatutoryDescriptions(@QueryParam("firstResult") Long firstResult,@QueryParam("maxResults") Long maxResults);

}

