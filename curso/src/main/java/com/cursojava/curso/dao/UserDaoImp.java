package com.cursojava.curso.dao;

import com.cursojava.curso.models.User;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Transactional
public class UserDaoImp implements UserDao {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    @Transactional
    public List<User> getUsers() {
        String query = "FROM User";
        return entityManager.createQuery(query).getResultList();
    }

    @Override
    @Transactional
    public void deleteUser(Long id) {
        User dbUser = entityManager.find(User.class, id);
        entityManager.remove(dbUser);
    }
}
