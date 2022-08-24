package javaprograms;

public class Reversenumbers {

	public static void main(String[] args) {
		int t,a=10, b=20;
		System.out.println("before swaping values are...."+a+"..."+b);
		//logic using 3rd variable
		/*t=a;
		a=b;
		b=t;
		System.out.println("after swaping of two numbers..."+a+"..."+b);*/
		//logic -2 without using 3rd variable
		/*a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("after swaping of two numbers..."+a+"..."+b);*/
		//iogic
		/*a=a*b;
		b=a/b;
		a=a/b;
		System.out.println("after swaping of two numbers..."+a+"..."+b);*/
		//single statement
		b=a+b-(a=b);
		System.out.println("after swaping of two numbers..."+a+"..."+b);
		
	}

}
