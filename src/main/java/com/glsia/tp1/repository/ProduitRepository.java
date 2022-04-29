package com.glsia.tp1.repository;

import com.glsia.tp1.models.Produit;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface ProduitRepository extends JpaRepository<Produit, Integer > {

    @Modifying
    @Query(value = "UPDATE produits set qteStock = qteStock + quantite where id = id ", nativeQuery = true)
    void updateQuantityProduct(int id, int quantite);
    //void updateQuantityProduct(@Param("id") Integer id, @Param("quantite") int quantite);
}
