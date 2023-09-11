package DAO;

import jpa.*;
import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;
import java.util.List;

public class ClientDAO {
    private EntityManager entityManager;

    public ClientDAO(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    public void createClient(Client client) {
        entityManager.getTransaction().begin();
        entityManager.persist(client);
        entityManager.getTransaction().commit();
    }

    public void updateClient(Client client) {
        entityManager.getTransaction().begin();
        entityManager.merge(client);
        entityManager.getTransaction().commit();
    }

    public void deleteClient(Client client) {
        entityManager.getTransaction().begin();
        entityManager.remove(client);
        entityManager.getTransaction().commit();
    }

    public Client getClientById(Long clientId) {
        return entityManager.find(Client.class, clientId);
    }

    public List<Client> getAllClients() {
        Query query = entityManager.createQuery("SELECT c FROM Client c", Client.class);
        return query.getResultList();
    }
}