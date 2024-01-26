package com.oenriquez.videogameservice.repository;

import com.oenriquez.videogameservice.entity.VideoGame;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface VideoGameRepository extends MongoRepository<VideoGame, String> {
}
