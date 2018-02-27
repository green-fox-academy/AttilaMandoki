package com.greenfoxacademy.matchmakingfakebackend.repositories;

import com.greenfoxacademy.matchmakingfakebackend.models.Partner;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PartnerRepo extends CrudRepository<Partner, Integer> {

  Partner findByCompanyName(String companyName);
  Partner findByEmailIsContaining(String email);
}
