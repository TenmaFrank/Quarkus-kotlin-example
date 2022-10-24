package com.baz.naive.bayes.controllers

import com.baz.naive.bayes.service.MonitoreoService
import org.eclipse.microprofile.openapi.annotations.Operation
import org.eclipse.microprofile.openapi.annotations.tags.Tag
import javax.annotation.security.PermitAll

import javax.transaction.Transactional
import javax.ws.rs.GET
import javax.ws.rs.Path
import javax.ws.rs.Produces
import javax.ws.rs.core.MediaType
import javax.ws.rs.core.Response
import javax.ws.rs.core.Response.ok


@Path("/remesas")
@Tag(name = "Monitoreo del Microservicio")
class MonitoreoController (
  private val monitoreoService: MonitoreoService
  ) {

    @GET
    @Path("/monitoreo/operaciones/status")
    @Transactional
    @Produces(MediaType.APPLICATION_JSON)
    @PermitAll
    @Operation(operationId = "2", summary = "Se realiza el test de disponibilidad al microservicio.")
    fun hello() : Response{
        return ok().entity(monitoreoService.generarUid()).build()
    }
}