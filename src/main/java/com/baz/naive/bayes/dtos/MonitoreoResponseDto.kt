package com.baz.naive.bayes.dtos

import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonRootName
import io.quarkus.runtime.annotations.RegisterForReflection
import org.eclipse.microprofile.openapi.annotations.media.Schema

@JsonRootName("user")
@RegisterForReflection
data class MonitoreoResponseDto(
  @JsonProperty("mensaje")
  @Schema(example = "OK", required = false,
    description = "Mensaje que representa el estado del microservicio.")
  var mensaje : String,
  @JsonProperty("folio")
  @Schema(example = "UID201910011922", required = false,
    description = "Identificador único de la solicitud.")
  var status : String
){
  companion object {
    @JvmStatic
    fun build(mensaje: String, status: String): MonitoreoResponseDto = MonitoreoResponseDto(
      mensaje = mensaje,
      status = status
    )
  }
}
