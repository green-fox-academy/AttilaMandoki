package com.greenfoxacademy.demoproject.Repositories;

import com.greenfoxacademy.demoproject.models.ForecastData;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ForecastRepo extends CrudRepository {
}
