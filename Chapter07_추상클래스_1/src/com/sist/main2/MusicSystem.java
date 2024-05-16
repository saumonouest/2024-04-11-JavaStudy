package com.sist.main2;

public abstract class MusicSystem {
	public static Music [] musics=new Music[50];
	public abstract void init(); // 데이터 초기화
	public abstract void find(String title);
	public abstract void list();
	public abstract void detail(int mno);
}
