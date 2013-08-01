package com.ibm.idoo.test;

public class Foo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Foo foo = new Foo();
		if (args.length>0)
			foo.sayHello(args[0]);
		else 
			foo.doNothing();
	}
	
	public Foo () {
		
	}

	public void doNothing () {
		
	}
	
	public void sayHello(String words){
		if (words!=null && words.length()>0)
			words = "world";
		System.out.print("hello, "+words);
	}
	
}
