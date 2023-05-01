package com.example.PracticaCrud.service;

import com.example.PracticaCrud.Dao.ProductoDao;
import com.example.PracticaCrud.Entity.Productos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class productoServiceImp implements ProductoService {
    // inyectamos el dato
    @Autowired
    private ProductoDao productoDao;

    // implementacion del metodo para listar
    @Override
    public List<Productos> findAll() {
        return (List<Productos>) productoDao.findAll();
    }

    // implementacion del metodod para obtener producto especifico
    @Override
    public Productos findById(Long id) {
        // se invoca al metodo del dao
        // el dao retorna un optional para proteger de valores nulos
        return productoDao.findById(id).orElse(null);
    }

    @Override
    public void createProducto(Productos productos) {
        productoDao.save(productos);

    }

    @Override
    public void modifyProducto(Long id, Productos productos) {
        if (productoDao.existsById(id)){
            productos.setId(id);
            productoDao.save(productos);
        }
    }

    @Override
    public void deleteProducto(Long id) {
        if (productoDao.existsById(id)){
            productoDao.deleteById(id);
        }
    }
}
