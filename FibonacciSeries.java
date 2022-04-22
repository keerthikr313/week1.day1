package week1.day1;

public class FibonacciSeries {
	public static void main(String[] args) {
		int range=8;
		int firstNum=0;
		int secNum=1;
		int sum=0;
		System.out.println("The First Number is"+ firstNum);
		for(int i=1;i<range;i++) {
			sum=firstNum+secNum;
			secNum=firstNum;
			sum=secNum;
			System.out.println(i);
		}
	}

}
