package com.glsia.tp1.repository;

import com.glsia.tp1.models.Approvisionnement;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;


@Repository
public interface ApprovisionnementRepository extends JpaRepository<Approvisionnement, Integer> {

    /*@Modifying
    @Transactional
    @Query(value = "update approvisionnement a set a.quantite = :quantite where a.id = :id")
    void updateApprovisionnement(@Param("id") Integer id, @Param("quantite") int quantite);

    @Modifying
    @Transactional
    @Query(value = "update produits p set p.qte_Stok = p.qte_Stok - :quantite where p.id = :id")
    void updateQuantityApprovisionnement(@Param("id") Integer id, @Param("quantite") int quantite);*/
}
