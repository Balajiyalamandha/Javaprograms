package javaexamples;

public class Reverse_eachword {
	public static void main(String[] args) {
		String s=  "java interview programs";
	
		StringBuilder  result =new StringBuilder();
		for(String w :s.split(""))
		{
			
			for (int i=w.length()-1;i>=0;i--)
			{
				result.append(w.charAt(i));
			}
			result.append("");
			
		}
		
		System.out.println(result.toString().trim());
		
	}

}
