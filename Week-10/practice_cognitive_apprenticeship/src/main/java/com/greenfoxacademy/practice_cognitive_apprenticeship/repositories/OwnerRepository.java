package com.greenfoxacademy.practice_cognitive_apprenticeship.repositories;

import com.greenfoxacademy.practice_cognitive_apprenticeship.models.Owner;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OwnerRepository extends CrudRepository<Owner, Long> {
}
