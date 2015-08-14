package com.demo.springboot;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by boysbee on 8/15/2015 AD.
 */
public interface ItemRepository extends JpaRepository<Item,Integer> {
}
