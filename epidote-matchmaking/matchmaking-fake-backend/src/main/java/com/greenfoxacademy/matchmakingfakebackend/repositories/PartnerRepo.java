package com.greenfoxacademy.matchmakingfakebackend.repositories;

import com.greenfoxacademy.matchmakingfakebackend.models.Partner;
import org.springframework.data.repository.CrudRepository;

public interface PartnerRepo extends CrudRepository<Partner, Integer> {

}
