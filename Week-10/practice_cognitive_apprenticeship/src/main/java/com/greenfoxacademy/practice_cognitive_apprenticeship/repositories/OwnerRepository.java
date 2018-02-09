package com.greenfoxacademy.practice_cognitive_apprenticeship.repositories;

import com.greenfoxacademy.practice_cognitive_apprenticeship.models.Owner;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OwnerRepository extends CrudRepository<Owner, Long> {

  Owner findById(Long id);

  List<Owner> findAllByOwnerName(String name);

  Owner findByOwnerName(String name);
}
