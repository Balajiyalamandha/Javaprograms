package dsa;

public class LargestNumber {
	public static void main(String[] args) {

        int a = 20, b = 40, c = 10;

        if (a >= b && a >= c)
            System.out.println(a + " is largest");
        else if (b >= a && b >= c)
            System.out.println(b + " is largest");
        else
            System.out.println(c + " is largest");
    }
}
