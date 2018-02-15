package com.greenfoxacademy.practice_cognitive_apprenticeship.Services;

import com.greenfoxacademy.practice_cognitive_apprenticeship.models.Cat;
import org.springframework.stereotype.Service;

import javax.persistence.Id;
import java.util.List;

@Service
public interface CatService {

  List<Cat> findAll();

  Cat findOneById(long id);

  List<Cat> findByNameContaining(String search);

  void saveNewCat(Cat cat);

  List<Cat> catsByBreed(String search);

  void deleteCat(Long id);
}
