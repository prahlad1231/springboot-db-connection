package com.example.dbconnection.repository;

import com.example.dbconnection.model.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<UserEntity, Long> {

    UserEntity findByUsername(String username);

    UserEntity findByEmail(String email);

    /*
        format for writing these methods:
        ReturnType findBy<FieldName>(<FieldName>)
        ReturnType findAllBy<FieldName>Like(<FieldName>)

        you can explore these methods yourself by seeing the autocomplete feature given by your IDE

        NOTE: if you have Objects in your entity, you can write method in following way:
        ReturnType findByObjectNameFieldName(<FieldName>)
     */
}
