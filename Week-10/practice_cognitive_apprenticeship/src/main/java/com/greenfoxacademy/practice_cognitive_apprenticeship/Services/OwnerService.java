package com.greenfoxacademy.practice_cognitive_apprenticeship.Services;

import com.greenfoxacademy.practice_cognitive_apprenticeship.models.Owner;
import org.springframework.stereotype.Service;


import java.util.List;

@Service
public interface OwnerService {

  List<Owner> findAll();

  List<Owner> findAllByOwnerName(Owner owner);

  Owner findById(long id);

  Owner findByOwnerName(Owner owner);

  void saveNewOwner(Owner owner);
}
