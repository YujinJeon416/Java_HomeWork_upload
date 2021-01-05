package com.collection.list.music.view.compare;

import java.util.Comparator;

import com.collection.list.music.model.vo.Music;

public class MusicBySingerAscending implements Comparator<Music>{
	
	//가수 오름차순
	@Override
	public int compare(Music m1, Music m2) {
		return m1.getSinger().compareTo(m2.getSinger()); 
	}

}