package com.devsuperior.mongoDB.repositories;

import com.devsuperior.mongoDB.models.entities.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends MongoRepository <User, String> {
}
