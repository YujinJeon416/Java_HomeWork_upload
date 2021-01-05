package com.collection.list.music.view.compare;
import java.util.Comparator;

import com.collection.list.music.model.vo.Music;

public class MusicByTitleDecending implements Comparator<Music>{
	
	//곡명 내림차순
	@Override
	public int compare(Music m1, Music m2) {
		return m2.getTitle().compareTo(m1.getTitle());
	}

}