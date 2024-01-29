package ch05;

import java.util.Arrays;

public class Ex5_6_tmp {
	public static void main(String[] args) {
		
		int[] ball = new int[45];
		
		for(int i=0; i<ball.length;i++) {
			ball[i] = i+1;	//ball[0]에 1이 저장
		}
		
		int tmp = 0;	//두 값을 바꾸는 데 사용할 임시 변수
		int j = 0;		// 임의의 값을 얻어서 저장할 변수
		
		for(int i=0; i < 6; i++) {
			j = (int)(Math.random()* 45);
			tmp	= ball[i];
			ball[i] = ball[j];
			ball[j] = tmp;
			System.out.println(Arrays.toString(ball));
		}
		
		
	}

}
