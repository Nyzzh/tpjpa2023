package DAO;

import jpa.*;
import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;
import java.util.List;

public class ProDAO {
    private EntityManager entityManager;

    public ProDAO(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    public void createPro(Pro pro) {
        entityManager.getTransaction().begin();
        entityManager.persist(pro);
        entityManager.getTransaction().commit();
    }

    public void updatePro(Pro pro) {
        entityManager.getTransaction().begin();
        entityManager.merge(pro);
        entityManager.getTransaction().commit();
    }

    public void deletePro(Pro pro) {
        entityManager.getTransaction().begin();
        entityManager.remove(pro);
        entityManager.getTransaction().commit();
    }

    public Pro getProById(Long proId) {
        return entityManager.find(Pro.class, proId);
    }

    public List<Pro> getAllPros() {
        Query query = entityManager.createQuery("SELECT p FROM Pro p", Pro.class);
        return query.getResultList();
    }
}