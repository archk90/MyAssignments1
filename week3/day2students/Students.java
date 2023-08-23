package week3.day2students;
//method overloading 
public class Students {   
	
	public void getStudentInfo(int id) {	
		System.out.println("Student id :"+id);
	}
	public void getStudentInfo(int id , String name) {
		id=7284;
		name="Archana";
		System.out.println("Student id :"+id+" & name  " + name);	
		
	} 
	public void getStudentInfo(String email, String phoneNum) {
		email="archanak290@gmail.com";
		phoneNum= "8838273410";
		System.out.println("Student email: " +email+" & PhoneNum:"+phoneNum);		
     }

	public static void main(String[] args) {
		
		Students obj = new Students();
		
		obj.getStudentInfo(5);
		obj.getStudentInfo(0, null);
		obj.getStudentInfo(null, null);	
		
	  }

}
