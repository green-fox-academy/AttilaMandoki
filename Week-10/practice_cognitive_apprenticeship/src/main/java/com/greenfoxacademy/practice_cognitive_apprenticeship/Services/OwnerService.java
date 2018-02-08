package com.greenfoxacademy.practice_cognitive_apprenticeship.Services;

import com.greenfoxacademy.practice_cognitive_apprenticeship.models.Owner;
import org.springframework.stereotype.Service;


import java.util.List;

@Service
public interface OwnerService {

  List<Owner> findAll();

  Owner findById(long id);

  Owner findByName(String name);

  void saveNewOwner(Owner owner);
}
