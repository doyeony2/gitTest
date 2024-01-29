package ch05;

public class Ex5_3_tmp {
	public static void main(String[] args) {
		int sum = 0;			//총합을 지정하기 위한 함수
		float average = 0f;		//평균을 지정하기 위한 함수
		
		int[] score = {100, 88, 100, 100, 90};
		
		for(int i = 0; i<score.length;i++) {
			sum += score[i];
		}
		average = (float)sum / score.length;	//계산결과를 float 타입으로 얻으려 행변환
		
		System.out.println(sum);
		System.out.println(average);
	}

}
