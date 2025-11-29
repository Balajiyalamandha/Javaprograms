package javaexamples;
public class Palindrome {
public static void main(String[] args){

String s = "madam";
String str =new StringBuilder(s).reverse().toString();
System.out.println(s.equals(str));
}

}
