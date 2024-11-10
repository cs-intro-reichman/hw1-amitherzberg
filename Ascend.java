// Generates three integer random numbers in a given range,
// and prints them in increasing order.
public class Ascend {
	public static void main(String[] args) {
		int lim = Integer.parseInt(args[0]);

		int a = (int) (Math.random() * lim);
		int b = (int) (Math.random() * lim);
		int c = (int) (Math.random() * lim);
		
		int minAB = Math.min (a ,b);
		int min = Math.min (minAB , c);
		int maxAB = Math.max(a , b);
		int max = Math.max(maxAB, c);
		int middle = a+b+c-minAB-maxAB;

		System.out.println(a +" "+b+" "+c);
		System.out.println(min +" " +middle +" "+ max);
	}
}
