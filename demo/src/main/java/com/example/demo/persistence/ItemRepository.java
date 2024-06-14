package com.example.demo.persistence;

import com.example.demo.model.Item;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ItemRepository extends JpaRepository<Item, Long> {


//    @Query("select i from Item i where i.itemDetail like %:itemDetail% order by i.price desc")
//    List<Item> findByItemDetail(@Param("itemDetail") String itemDetail);

}
