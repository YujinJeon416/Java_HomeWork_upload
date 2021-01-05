package com.collection.list.music.view.compare;
import java.util.Comparator;

import com.collection.list.music.model.vo.Music;

public class MusicBySingerDecending implements Comparator<Music>{
	
	//가수 내림차순
	@Override
	public int compare(Music m1, Music m2) {
		return m2.getSinger().compareTo(m1.getSinger());
		
	}
	

}