package typetest01;

import javax.naming.spi.DirStateFactory.Result;

public class Test01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 10;
		int b = 3;
		double resuslt;
		
		resuslt = (double)a / b;
		// 정수와 정수의 나눗셈에서 실수연산 결과를 얻으려면 두 정수 중의 하나이상은 반드시 실수여함;
		System.out.println(resuslt);
		
	}

}
