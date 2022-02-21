package org.system;

public class Students {
	 public void getStudentInfo(int id) { 
		 System.out.println("id is "+id+".");	 
	 }
	 public void getStudentInfo(int id,String name) { 
		 System.out.println("id is "+id+",name is "+name);	 
	 }
	 public void getStudentInfo(String email,long phone) { 
		 System.out.println("email is "+email+",Phone is "+phone);	 
	 }

	public static void main(String[] args) {
	
  Students stu1 = new Students();
  stu1.getStudentInfo(55555);
  stu1.getStudentInfo(55555,"anup");
  stu1.getStudentInfo("anup@11gamil.com",9632587416L);
  
  
	}

}
