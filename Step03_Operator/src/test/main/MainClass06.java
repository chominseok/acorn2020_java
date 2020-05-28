package test.main;
/*
 *  6. 3항 연산자 테스트
 */
public class MainClass06 {
	public static void main(String[] args) {
		boolean isWait=true;
		// true : false
		String result = isWait ? "기다려요" : "기다리지 않아요";
		System.out.println(result);
		//3항 연산자
		String result2=null;
		if(isWait) {
			result2="기다려요";
		}else {
			result2="기다리지 않아요";
		}
		System.out.println(result2);
		
		boolean test = true;
		String test1 = test ? "맞나" : "안맞나";
		System.out.println(test1);
	}
}











