package com.oenriquez.videogameservice.entity;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(value = "video-game")
@Getter
@Setter
public class VideoGame {
    @Id
    private String id;
    private String videoGameName;
    private String videoGameGender;
    private String platform;


}
