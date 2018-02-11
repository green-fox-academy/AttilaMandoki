package com.greenfoxacademy.practice_cognitive_apprenticeship.Services;

import com.greenfoxacademy.practice_cognitive_apprenticeship.models.Cat;
import com.greenfoxacademy.practice_cognitive_apprenticeship.repositories.CatRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CatServiceImpl implements CatService {

  @Autowired
  CatRepository catRepository;

  @Override
  public List<Cat> findAll() {
    return (List<Cat>) catRepository.findAll();
  }

  @Override
  public Cat findOneById(long id) {
    return catRepository.findOne(id);
  }

  @Override
  public List<Cat> findByNameContaining(String search) {
    return (List<Cat>) catRepository.findByNameContaining(search);
  }

  @Override
  public void saveNewCat(Cat cat) {
    catRepository.save(cat);
  }

  @Override
  public List<Cat> catsByBreed(String search) {
    return (List<Cat>) catRepository.findAllByBreedContaining(search);
  }
}
