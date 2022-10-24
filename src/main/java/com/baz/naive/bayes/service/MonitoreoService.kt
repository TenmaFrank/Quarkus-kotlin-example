package com.baz.naive.bayes.service

import com.baz.naive.bayes.dtos.MonitoreoResponseDto
import com.baz.naive.bayes.utils.Constantes
import com.baz.servicios.Uid

import javax.enterprise.context.ApplicationScoped

@ApplicationScoped
class MonitoreoService {

    fun generarUid() : MonitoreoResponseDto {
        return MonitoreoResponseDto.build(Constantes.ESTADO_OK, Uid.generarUid(15,3))
    }
}