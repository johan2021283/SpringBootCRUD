package com.example.PracticaCrud.Controllers;

import com.example.PracticaCrud.Entity.Productos;
import com.example.PracticaCrud.service.ProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/productos")
public class ProductoControllers {

    //inyectar el servicio de productos
    @Autowired
    ProductoService productoService;

    @GetMapping
    public List<Productos> listarProductos(){
        //invocar el metodo findAll del servicio
        return productoService.findAll();
    }
    @GetMapping(value = "/{id}")
    public Productos obtenerProducto(@PathVariable Long id){
        //invocar el metodo findById del producto
        return productoService.findById(id);
    }
    @PostMapping
    public void crearProducto(@RequestBody Productos productos){
        productoService.createProducto(productos);
    }
    @PutMapping(value = "/{id}")
    public void modificarProducto(@PathVariable Long id,@RequestBody Productos productos){
        productoService.modifyProducto(id, productos);
    }
    @DeleteMapping(value = "/{id}")
        public void modificarProducto(@PathVariable Long id){
        productoService.deleteProducto(id);
    }
}
