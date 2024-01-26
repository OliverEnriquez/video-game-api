package com.oenriquez.videogameservice.service;

import com.oenriquez.videogameservice.entity.VideoGame;
import com.oenriquez.videogameservice.repository.VideoGameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VideoGameServiceImpl implements VideoGameService{

    @Autowired
    VideoGameRepository videoGameRepository;
    @Override
    public List<VideoGame> getAllVideoGames() {
        return videoGameRepository.findAll();
    }

    @Override
    public void addVideoGame(VideoGame videoGame) {
        videoGameRepository.save(videoGame);
    }
}
