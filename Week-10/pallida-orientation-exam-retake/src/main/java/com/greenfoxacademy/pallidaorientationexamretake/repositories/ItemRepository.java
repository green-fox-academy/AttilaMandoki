package com.greenfoxacademy.pallidaorientationexamretake.repositories;

import com.greenfoxacademy.pallidaorientationexamretake.models.Item;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ItemRepository extends CrudRepository<Item, Long> {

  @Query(value = "SELECT p FROM Item p GROUP BY p.item")
  List<Item> findAllDistinctName();

  @Query(value = "SELECT p FROM Item p GROUP BY p.size")
  List<Item> findAllDistinctSize();

  Item findByItemAndSize(String item, String size);

  List<Item> findByPriceGreaterThan(long price);

  List<Item> findByPriceLessThan(long price);

  List<Item> findByPriceEquals(long price);
}
