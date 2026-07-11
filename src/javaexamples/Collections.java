package javaexamples;

import java.util.ArrayList;
import java.util.List;

public class Collections {

	

	    public static void main(String[] args) {

	        List<String> users = new ArrayList();

	        users.add("Admin");
	        users.add("Customer");

	        for(String user : users)
	            System.out.println(user);
	    }
	}

