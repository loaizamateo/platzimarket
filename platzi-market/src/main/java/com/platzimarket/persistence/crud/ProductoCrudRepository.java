package com.platzimarket.persistence.crud;

import com.platzimarket.persistence.entities.Producto;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface ProductoCrudRepository extends CrudRepository<Producto, Integer> {

//    @Query(value = "SELECT * FROM productos WHERE id_Categoria = ?", nativeQuery = true)
    List<Producto> findByIdCategoriaOrderByNombreAsc(int idCategoria);

    Optional<Producto>findByCantidadStockLessThanAndEstado(int cantidadStock, boolean estado);

}
