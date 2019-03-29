package org.test;

public class Emp {

	public void studentId(String name){
		System.out.println(name);
	}
	public void studentId(String email,long phno){
		System.out.println(email+"\t"+ phno);
	}
	public void studentId(int regNo){
		System.out.println("int method"+ "\t"+regNo);
	}
	public static void main(String[] args) {
		Emp r=new Emp();
		r.studentId("jaffar");
	r.studentId("ghjfggh@gmail", 4245677767678l);
	r.studentId(1111111);
	
	
	}

}
