package week3.day1.assignment;

public class Students {
	
	
	public void getStudentInfo(int id) {
		System.out.println("this is id alone :"+ id);
	}
	public void getStudentInfo(int id,String name) {
		System.out.println("this is id and name :"+ id + " and "+ name);
	}
	public void getStudentInfo(String email,long phoneno) {
		System.out.println("this is email and phoneno : "+ email + " and "+ phoneno);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Students student =new Students();
		student.getStudentInfo(1001);
		student.getStudentInfo(1001, "Hemanth");
		student.getStudentInfo("hemanthraju.testleaf.com", 9989433633L);
		
		
	}

}
