package com.example.journalApp.repository;

import com.example.journalApp.Entity.JournalEntry;
import com.example.journalApp.Entity.User;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends MongoRepository<User, ObjectId> {
    User findByUserName(String username);

    void deleteByUserName(String userName);
}
