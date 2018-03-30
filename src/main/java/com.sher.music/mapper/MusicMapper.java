package com.sher.music.mapper;


import com.sher.music.entity.Music;

import java.util.List;

public interface MusicMapper {

    List<Music> getNewMusic();
    List<Music> getHotMusic();
    List<Music> getBillBoardMusic();
    List<Music> getPopMusic();

}
