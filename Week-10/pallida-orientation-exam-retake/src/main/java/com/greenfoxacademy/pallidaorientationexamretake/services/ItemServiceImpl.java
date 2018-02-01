package com.greenfoxacademy.pallidaorientationexamretake.services;

import com.greenfoxacademy.pallidaorientationexamretake.models.Item;
import com.greenfoxacademy.pallidaorientationexamretake.repositories.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ItemServiceImpl implements ItemService {

  @Autowired
  ItemRepository itemRepository;

  @Override
  public List<Item> findAllDistinctName() {
    return itemRepository.findAllDistinctName();
  }

  @Override
  public List<Item> findAllDistinctSize() {
    return itemRepository.findAllDistinctSize();
  }

  @Override
  public List<Item> findAll() {
    return (List<Item>)itemRepository.findAll();
  }

  @Override
  public Item findByItemAndSize(String item, String size) {
    return itemRepository.findByItemAndSize(item, size);
  }

  @Override
  public List<Item> findByPriceGreaterThan(long price) {
    return itemRepository.findByPriceGreaterThan(price);
  }

  @Override
  public List<Item> findByPriceLowerThan(long price) {
    return itemRepository.findByPriceLessThan(price);
  }

  @Override
  public List<Item> findByPriceEquals(long price) {
    return itemRepository.findByPriceEquals(price);
  }
}
