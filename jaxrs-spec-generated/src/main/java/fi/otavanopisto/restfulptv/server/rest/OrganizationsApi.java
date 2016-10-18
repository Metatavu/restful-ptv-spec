package fi.otavanopisto.restfulptv.server.rest;

import fi.otavanopisto.restfulptv.server.rest.model.BadRequest;
import fi.otavanopisto.restfulptv.server.rest.model.Organization;
import fi.otavanopisto.restfulptv.server.rest.model.Forbidden;
import fi.otavanopisto.restfulptv.server.rest.model.InternalServerError;
import fi.otavanopisto.restfulptv.server.rest.model.OrganizationService;
import fi.otavanopisto.restfulptv.server.rest.model.NotFound;

import javax.ws.rs.*;
import javax.ws.rs.core.Response;

import io.swagger.annotations.*;

import java.util.List;

@Path("/organizations")

@Api(description = "the organizations API")
@Consumes({ "application/json;charset=utf-8" })
@Produces({ "application/json;charset=utf-8" })
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2016-10-18T13:05:31.268+03:00")

public abstract class OrganizationsApi extends AbstractApi {

    @POST
    
    @Consumes({ "application/json;charset=utf-8" })
    @Produces({ "application/json;charset=utf-8" })
    @ApiOperation(value = "Create organization", notes = "Create organization", response = Organization.class, tags={ "Organizations",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Created organization", response = Organization.class),
        @ApiResponse(code = 400, message = "Invalid request was sent to the server", response = Organization.class),
        @ApiResponse(code = 403, message = "Attempted to make a call with unauthorized client", response = Organization.class),
        @ApiResponse(code = 500, message = "Internal server error", response = Organization.class) })
    public abstract Response createOrganization(Organization body);

    @POST
    @Path("/{organizationId}/organizationServices")
    @Consumes({ "application/json;charset=utf-8" })
    @Produces({ "application/json;charset=utf-8" })
    @ApiOperation(value = "Create organization service", notes = "Create organization service", response = Organization.class, tags={ "Organizations", "OrganizationServices",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Created organization service", response = Organization.class),
        @ApiResponse(code = 400, message = "Invalid request was sent to the server", response = Organization.class),
        @ApiResponse(code = 403, message = "Attempted to make a call with unauthorized client", response = Organization.class),
        @ApiResponse(code = 500, message = "Internal server error", response = Organization.class) })
    public abstract Response createOrganizationService(@PathParam("organizationId") String organizationId,OrganizationService body);

    @GET
    @Path("/{organizationId}")
    @Consumes({ "application/json;charset=utf-8" })
    @Produces({ "application/json;charset=utf-8" })
    @ApiOperation(value = "Finds an organization", notes = "Finds an organization by id", response = Organization.class, tags={ "Organizations",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "An organization", response = Organization.class),
        @ApiResponse(code = 400, message = "Invalid request was sent to the server", response = Organization.class),
        @ApiResponse(code = 403, message = "Attempted to make a call with unauthorized client", response = Organization.class),
        @ApiResponse(code = 404, message = "Resource was not found from the server", response = Organization.class),
        @ApiResponse(code = 500, message = "Internal server error", response = Organization.class) })
    public abstract Response findOrganization(@PathParam("organizationId") String organizationId);

    @GET
    @Path("/{organizationId}/organizationServices/{organizationServiceId}")
    @Consumes({ "application/json;charset=utf-8" })
    @Produces({ "application/json;charset=utf-8" })
    @ApiOperation(value = "Finds a organization service by id", notes = "Find an organization service", response = OrganizationService.class, tags={ "Organizations", "OrganizationServices",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "An organization service", response = OrganizationService.class),
        @ApiResponse(code = 400, message = "Invalid request was sent to the server", response = OrganizationService.class),
        @ApiResponse(code = 403, message = "Attempted to make a call with unauthorized client", response = OrganizationService.class),
        @ApiResponse(code = 404, message = "Resource was not found from the server", response = OrganizationService.class),
        @ApiResponse(code = 500, message = "Internal server error", response = OrganizationService.class) })
    public abstract Response findOrganizationService(@PathParam("organizationId") String organizationId,@PathParam("organizationServiceId") String organizationServiceId);

    @GET
    @Path("/{organizationId}/organizationServices")
    @Consumes({ "application/json;charset=utf-8" })
    @Produces({ "application/json;charset=utf-8" })
    @ApiOperation(value = "Organization organization service list", notes = "Lists organization's organization services", response = OrganizationService.class, responseContainer = "List", tags={ "Organizations", "OrganizationServices",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "An array of organization services", response = OrganizationService.class, responseContainer = "List"),
        @ApiResponse(code = 400, message = "Invalid request was sent to the server", response = OrganizationService.class, responseContainer = "List"),
        @ApiResponse(code = 403, message = "Attempted to make a call with unauthorized client", response = OrganizationService.class, responseContainer = "List"),
        @ApiResponse(code = 404, message = "Resource was not found from the server", response = OrganizationService.class, responseContainer = "List"),
        @ApiResponse(code = 500, message = "Internal server error", response = OrganizationService.class, responseContainer = "List") })
    public abstract Response listOrganizationOrganizationServices(@PathParam("organizationId") String organizationId,@QueryParam("firstResult") Long firstResult,@QueryParam("maxResults") Long maxResults);

    @GET
    
    @Consumes({ "application/json;charset=utf-8" })
    @Produces({ "application/json;charset=utf-8" })
    @ApiOperation(value = "List organizations", notes = "List organizations", response = Organization.class, responseContainer = "List", tags={ "Organizations",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "An array of organizations", response = Organization.class, responseContainer = "List"),
        @ApiResponse(code = 400, message = "Invalid request was sent to the server", response = Organization.class, responseContainer = "List"),
        @ApiResponse(code = 403, message = "Attempted to make a call with unauthorized client", response = Organization.class, responseContainer = "List"),
        @ApiResponse(code = 500, message = "Internal server error", response = Organization.class, responseContainer = "List") })
    public abstract Response listOrganizations(@QueryParam("firstResult") Long firstResult,@QueryParam("maxResults") Long maxResults);

    @PUT
    @Path("/{organizationId}")
    @Consumes({ "application/json;charset=utf-8" })
    @Produces({ "application/json;charset=utf-8" })
    @ApiOperation(value = "Updates an organization", notes = "Updates organization data", response = Organization.class, tags={ "Organizations",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "An organization", response = Organization.class),
        @ApiResponse(code = 400, message = "Invalid request was sent to the server", response = Organization.class),
        @ApiResponse(code = 403, message = "Attempted to make a call with unauthorized client", response = Organization.class),
        @ApiResponse(code = 404, message = "Resource was not found from the server", response = Organization.class),
        @ApiResponse(code = 500, message = "Internal server error", response = Organization.class) })
    public abstract Response updateOrganization(@PathParam("organizationId") String organizationId,Organization body);

    @PUT
    @Path("/{organizationId}/organizationServices/{organizationServiceId}")
    @Consumes({ "application/json;charset=utf-8" })
    @Produces({ "application/json;charset=utf-8" })
    @ApiOperation(value = "Updates an organization service", notes = "Updates organization service", response = OrganizationService.class, tags={ "Organizations", "OrganizationServices" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "An updated organization service", response = OrganizationService.class),
        @ApiResponse(code = 400, message = "Invalid request was sent to the server", response = OrganizationService.class),
        @ApiResponse(code = 403, message = "Attempted to make a call with unauthorized client", response = OrganizationService.class),
        @ApiResponse(code = 404, message = "Resource was not found from the server", response = OrganizationService.class),
        @ApiResponse(code = 500, message = "Internal server error", response = OrganizationService.class) })
    public abstract Response updateOrganizationService(@PathParam("organizationId") String organizationId,@PathParam("organizationServiceId") String organizationServiceId,OrganizationService body);

}

