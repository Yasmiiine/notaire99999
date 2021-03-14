package com.example.tp.dao;

import com.example.tp.bean.Contrat;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
//code etatcontrat:liste contrat
import java.util.List;

@Repository
public interface ContratDao extends JpaRepository<Contrat,Long> {
    Contrat findByReference(String reference);
    int deleteByReference(String reference);
    List<Contrat> findByReferenceLikeAndMontantGreaterThan(String reference, double montant);

}