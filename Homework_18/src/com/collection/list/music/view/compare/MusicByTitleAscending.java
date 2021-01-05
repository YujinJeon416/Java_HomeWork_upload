package com.collection.list.music.view.compare;
import java.util.Comparator;

import com.collection.list.music.model.vo.Music;

public class MusicByTitleAscending implements Comparator<Music>{
	
	//곡명올림차순
	@Override
	public int compare(Music m1, Music m2) {
		return m1.getTitle().compareTo(m2.getTitle());
	}

}
