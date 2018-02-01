package com.greenfoxacademy.pallidaorientationexamretake.services;

import com.greenfoxacademy.pallidaorientationexamretake.models.Item;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ItemService {

  public List<Item> findAllDistinctName();

  public List<Item> findAllDistinctSize();

  public List<Item> findAll();

  public Item findByItemAndSize(String item, String size);

  public List<Item> findByPriceGreaterThan(long price);

  public List<Item> findByPriceLowerThan(long price);

  public List<Item> findByPriceEquals(long price);
}
