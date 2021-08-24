package com.bl.birdsanctury;

import java.util.ArrayList;
import java.util.List;

	public class BirdSanctuaryRepository {
	
	List<Object> birdList = new ArrayList<>();

	public void add (Bird bird){
		birdList.add(bird);
		}
	public void print(){
	for (Object items :birdList){
			System.out.println(items);
			
			
	}
		
	}
	}

