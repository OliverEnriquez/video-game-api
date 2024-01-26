package com.oenriquez.videogameservice.controller;

import com.oenriquez.videogameservice.entity.VideoGame;
import com.oenriquez.videogameservice.service.VideoGameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/videogame")
public class VideoGameController {

    @Autowired
    VideoGameService videoGameService;

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<VideoGame> getAllVideoGames() {
        return videoGameService.getAllVideoGames();
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void addVideoGame(@RequestBody VideoGame videoGame) {
        videoGameService.addVideoGame(videoGame);
    }
}
