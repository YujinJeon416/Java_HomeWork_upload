package com.collection.list.music.controller;
/**
 * 4. 컨트롤러 클래스 MusicManager
패키지 com.collection.list.music.controller
~sc:Scanner
-mList:ArrayList<Music> => 초기화블럭을 사용하여 5곡을 미리 만들어두기
구현할 메소드는 다음과 같다.
--------------------------------------------------------------------
1. 음악리스트 리턴
+ selectList():List<Music>
2. 마지막에 음악추가 : 사용자로부터 곡명과 가수를 입력받아 리스트에 저장하는 메소드. 
+ addList(Music) : void
3. 맨처음에 음악추가 : 리스트 최상위(0번지)에 음악을 추가하는 메소드
+ addAtZero(Music) : void
4. 특정곡을 삭제하는 메소드(제목을 전달받아 검색후, 최초로 검색된 음악을 삭제)
    삭제여부를 리턴
+ removeMusic(String) : boolean
5. 특정곡을 바꾸는 메소드(이전 음악객체, 새 음악객체를 전달해서 교체)
    교체 성공여부를 리턴
+ boolean replaceMusic(Music oldMusic, Music newMusic) : boolean
6. 특정곡이 있는지 검사하는 메소드 : 복수개의 결과가 나올수 있음. 
(곡명일부로 검색해서 해당곡이 있다면, 곡정보(제목/가수)를 출력하고, 없다면, "검색결과가 없습니다"출력)
+ searchMusicByTitle(String title) : List<Music>
7. 가수명으로 검색 메소드 : 복수개의 결과가 나올수 있음.
+ searchMusicBySinger(String singer) : List<Music>
8. 서브메뉴 - 각 정렬 메소드 : Comparable/Comparator 인터페이스를 적절히 활용할 것
+ orderBy(Comparator<Music> c) : List<Musice>
 */
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

import com.collection.list.music.model.vo.Music;

public class MusicManager {
	Scanner sc = new Scanner(System.in);
	
	private List<Music> mList = new ArrayList<>();    //-mList:ArrayList<Music> => 
	                                                   //초기화블럭을 사용하여 5곡을 미리 만들어두기
	{
		mList.add(new Music("Girl", "Alexander 23"));
		mList.add(new Music("우린자정을넘어", "월콕스"));
		mList.add(new Music("Lightenup", "Parcels"));
		mList.add(new Music("Papercut", "우효"));
		mList.add(new Music("Micdrop", "방탄소년단"));
	}
	
	//	1. 음악리스트 리턴
//	+ selectList():List<Music>
	public List<Music> selectList() {
		
		return mList;
	}
	
	
	
//	2. 마지막에 음악추가 : 사용자로부터 곡명과 가수를 입력받아 리스트에 저장하는 메소드. 
//	+ addList(Music) : void
	public void addList(Music m) {
		
		System.out.println("마지막 줄에 새로운 곡을 추가합니다.");
		
		mList.add(m);
		
		System.out.println(mList.get(mList.size()-1) + " 추가되었습니다.");
	}
	
	
	
//	3. 맨처음에 음악추가 : 리스트 최상위(0번지)에 음악을 추가하는 메소드
//	+ addAtZero(Music) : void
	public void addAtZero(Music m) {
		System.out.println("1번에 새로운 곡을 추가합니다.");
		
		mList.add(0, m);
		
		System.out.println(mList.get(0) + " 추가되었습니다.");
	}
	
	
	
//	4. 특정곡을 삭제하는 메소드(제목을 전달받아 검색후, 최초로 검색된 음악을 삭제)
//	    삭제여부를 리턴
//	+ removeMusic(String) : boolean
	public boolean removeMusic(String str) {
		
		boolean flag = false;
		for(int i=0; i<mList.size(); i++) {
			if(mList.get(i).getTitle().equals(str)) {
				mList.remove(i);
				flag = true;
				break;
			}
		}
		return flag;
	}
	
	
	
//	5. 특정곡을 바꾸는 메소드(이전 음악객체, 새 음악객체를 전달해서 교체)
//	    교체 성공여부를 리턴
//	+ boolean replaceMusic(Music oldMusic, Music newMusic) : boolean
	public boolean replaceMusic(Music oldMusic, Music newMusic) {
		
		boolean flag = false;
		for(int i=0; i<mList.size(); i++) {
			if(mList.get(i).equals(oldMusic)) {
				mList.set(i, newMusic);
				flag = true;
				break;
			}
		}
		return flag;
	}
	
	
	
//	6. 특정곡이 있는지 검사하는 메소드 : 복수개의 결과가 나올수 있음. 
//	(곡명일부로 검색해서 해당곡이 있다면, 곡정보(제목/가수)를 출력하고, 없다면, "검색결과가 없습니다"출력)
//	+ searchMusicByTitle(String title) : List<Music>
	public List<Music> searchMusicByTitle(String title) {
		
    List<Music> list = new ArrayList<>();
		
		for(int i=0; i<mList.size(); i++) {
		
			String oldTitle = mList.get(i).getTitle();
			
			outer :
			for(int j=0; j<=(oldTitle.length()-title.length()); j++) {
				
				if(title.charAt(0) == oldTitle.charAt(j)) {
					int count=0;
					for(int x=0; x<title.length(); x++) {
						if(title.charAt(x) == oldTitle.charAt(j+x)) {
							count++;
							if(count == title.length()) {
								list.add(mList.get(i));
								break outer;
							}
						}
					}	
				}
			}	
		
	}	
		
		if(list.size() == 0) System.out.println("검색 결과가 없습니다.");
		return list;
		
	}
	
	
	
//	7. 가수명으로 검색 메소드 : 복수개의 결과가 나올수 있음.
//	+ searchMusicBySinger(String singer) : List<Music>
	public List<Music> searchMusicBySinger(String singer) {
		
		List<Music> list = new ArrayList<>();

		int num=0;
		for(int i=num; i<mList.size(); i++) {
			
			if(mList.get(i).getSinger().equals(singer)) {
				list.add(mList.get(i));
				num = i+1;
			}
		}
		if(list.size() == 0) System.out.println("검색 결과가 없습니다.");
		return list;
		
	}
	
//	8. 서브메뉴 - 각 정렬 메소드 : Comparable/Comparator 인터페이스를 적절히 활용할 것
//	+ orderBy(Comparator<Music> c) : List<Musice>
	public List<Music> orderBy(Comparator<Music> c) {
		
		Collections.sort(mList, c);
		
		return mList;
		
		//1. 이름오름차순
//		Comparator<Student> comp = new StudentNameAscending();
//		Collections.sort(list, comp);
		
	}
	
}
	
