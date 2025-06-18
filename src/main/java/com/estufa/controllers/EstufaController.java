package com.estufa.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.estufa.dto.EstufaDTO;
import com.estufa.services.EstufaService;

@RestController
@RequestMapping("/estufa")
public class EstufaController {

  @Autowired
  private EstufaService estufaService;

  @GetMapping
  public String getAllEstufas() {
    return estufaService.getAllEstufas().toString();
  }

  @GetMapping("/critical")
  public String getCriticalData() {
    return estufaService.getCriticalData().toString();
  }

  @PostMapping("/transmit")
  public String transmitPhysicalData(@RequestBody EstufaDTO estufaDTO) {
    return estufaService.transmitPhysicalData(estufaDTO);
  }
}
