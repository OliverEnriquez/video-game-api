package com.oenriquez.videogameservice.service;

import com.oenriquez.videogameservice.entity.VideoGame;

import java.util.List;

public interface VideoGameService {

    List<VideoGame> getAllVideoGames();
    void addVideoGame(VideoGame videoGame);
}
