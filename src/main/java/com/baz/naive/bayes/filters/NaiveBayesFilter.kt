package com.baz.naive.bayes.filters

import java.io.IOException
import javax.ws.rs.container.ContainerRequestContext
import javax.ws.rs.container.ContainerRequestFilter
import javax.ws.rs.container.PreMatching
import javax.ws.rs.ext.Provider

@Provider
@PreMatching
class NaiveBayesFilter : ContainerRequestFilter {
    /**
     * **filter**
     * @descripcion: Método para validar el token enviado en el header de la solicitud.
     * @autor: Angel Eduardo Hernández Aguilar.
     * @param req request http recibida.
     * @param res response http a regresar.
     * @param chain pauta para seguir el flujo de la petición.
     * @ultimaModificacion: 25/02/2022
     */
    @Throws(IOException::class)
    override fun filter(requestContext: ContainerRequestContext) {
        println("ENTRA AL FILTER")
        val nombreClaseMetodo = "ConsultaBarriFilter-filter"
        val valorToken = requestContext.getHeaderString("token")
        val valorUid = requestContext.getHeaderString("uid")
        if ("/remesas/barri/consultarMtcn" != requestContext.uriInfo.path) {
            println("no es el link")
            return
        }
    }
}