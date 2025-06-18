package com.estufa.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.estufa.models.EstufaModel;

@Repository
public interface EstufaRepository extends JpaRepository<EstufaModel, Long> {

  List<EstufaModel> findByTemperaturaEstufaGreaterThan(double d);

}
