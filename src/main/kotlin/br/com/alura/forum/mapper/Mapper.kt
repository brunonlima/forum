package br.com.alura.forum.mapper

import br.com.alura.forum.dto.RespostaView
import br.com.alura.forum.model.Resposta

interface Mapper<T, U> {
    fun map(t: T): U

}
