package com.example.PracticaCrud.Dao;

import com.example.PracticaCrud.Entity.Productos;
import org.springframework.data.repository.CrudRepository;

public interface ProductoDao extends CrudRepository <Productos, Long> {

}
