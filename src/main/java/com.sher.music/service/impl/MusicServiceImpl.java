package com.sher.music.service.impl;

import com.sher.music.entity.Music;
import com.sher.music.mapper.MusicMapper;
import com.sher.music.service.MusicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

@Transactional
@Service
public class MusicServiceImpl implements MusicService{

    @Resource
    private MusicMapper musicMapper;

    public List<List<Music>> getMusic(){
        List<Music> newMusicList = musicMapper.getNewMusic();
        List<Music> hotMusicList = musicMapper.getHotMusic();
        List<Music> billboardMusicList = musicMapper.getBillBoardMusic();
        List<Music> popMusicList = musicMapper.getPopMusic();

        List<List<Music>> musicList = new ArrayList<List<Music>>();
        musicList.add(newMusicList);
        musicList.add(hotMusicList);
        musicList.add(billboardMusicList);
        musicList.add(popMusicList);
        return musicList;
    }
}
