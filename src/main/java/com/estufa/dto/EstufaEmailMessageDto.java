package com.estufa.dto;

public record EstufaEmailMessageDto(Double temperaturaEstufa,
    Double sensacaoTermicaEstufa,
    Double umidadeEstufa, String emailTo) {
}
