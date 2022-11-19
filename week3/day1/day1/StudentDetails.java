package week3.day1;

public class StudentDetails {

	public void getStudentInfo(String name) {
		System.out.println(name);
	}
	
	public void getStudentInfo(int stuId) {
		System.out.println(stuId);
	}
	
	public void getStudentInfo(int stuId, String name) {
		System.out.println(stuId+name);
	}
	
	public void getStudentInfo(String name, int phNo) {
		
	}
	
	public void getStudentInfo(int stuId, int phNo) {
		
	}
	
	public static void main(String[] args) {
		StudentDetails details = new StudentDetails();
		details.getStudentInfo("Haja");
		details.getStudentInfo(1001);
	}
}
