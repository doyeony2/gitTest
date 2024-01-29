package ch05;

import java.util.Arrays;

public class Ex5_2_tmp {
	
	public static void main(String[] args) {
		//배열의 각 요소에 처음으로 값을 저장하는 것
		
		int[] score1 = {50,60,70,80,90}; //길이가 5인 int 배열
		
		for(int i = 0;i<score1.length; i++) {
			System.out.println(score1[i]);
			
		}
		System.out.println(Arrays.toString(score1));
	}

}
