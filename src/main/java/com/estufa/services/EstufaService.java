package com.estufa.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.estufa.dto.EstufaDTO;
import com.estufa.models.EstufaModel;
import com.estufa.repositories.EstufaRepository;

@Service
public class EstufaService {

  @Autowired
  private EstufaRepository estufaRepository;

  public List<EstufaModel> getAllEstufas() {
    return estufaRepository.findAll();
  }

  public List<EstufaModel> getCriticalData() {
    return estufaRepository.findByTemperaturaEstufaGreaterThan(30.0);
  }

  public String transmitPhysicalData(EstufaDTO estufaDTO) {
    String message = String.format("Transmitting data: Temp=%.2f, Sensation=%.2f, Humidity=%.2f",
        estufaDTO.getTemperaturaEstufa(),
        estufaDTO.getSensacaoTermicaEstufa(), estufaDTO.getUmidadeEstufa());

    EstufaModel estufaModel = new EstufaModel();
    estufaModel.setTemperaturaEstufa(estufaDTO.getTemperaturaEstufa());
    estufaModel.setSensacaoTermicaEstufa(estufaDTO.getSensacaoTermicaEstufa());
    estufaModel.setUmidadeEstufa(estufaDTO.getUmidadeEstufa());
    estufaRepository.save(estufaModel);
    return message;
  }
}
