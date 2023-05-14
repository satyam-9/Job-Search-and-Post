package com.satyam.joblisting.repository;

import com.satyam.joblisting.model.Post;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface PostRepository extends MongoRepository<Post,String> {
    //the mongo repository which is extended above will be responsible for all the crud operations.
}
