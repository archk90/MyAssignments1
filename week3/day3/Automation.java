package week3.day3;

public class Automation extends MultipleLanguage {

	public void selenium() {
		System.out.println("Selenium");	
	}

	@Override
	public void java() {
		System.out.println("Java");	
		
	}

	@Override
	public void ruby() {
		System.out.println("Ruby");	
		
	}
public static void main(String[] args) {
	Automation obj = new Automation();
	obj.java();
	obj.selenium();
	obj.ruby();
	obj.python();
	
	Language obj1 = new Automation();
	obj1.java();  //restrictions
	
}
	
	
	
}
