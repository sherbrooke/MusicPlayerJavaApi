package com.sher.music.controller;

import com.sher.music.entity.Music;
import com.sher.music.service.MusicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class MusicController {

    @Autowired
    private MusicService musicService;

    @RequestMapping(value = "/music/test")
    public @ResponseBody
    List<List<Music>> getMusic(){
        return musicService.getMusic();
    }

}
