package com.example.PracticaCrud.service;

import com.example.PracticaCrud.Dao.ProductoDao;
import com.example.PracticaCrud.Entity.Productos;

import java.util.List;

public interface ProductoService {
    public List<Productos> findAll();
    public Productos findById(Long id);
    public void createProducto(Productos productos);
    public void modifyProducto(Long id, Productos productos);
    public void deleteProducto(Long id);



}
