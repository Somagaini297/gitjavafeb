class Bird{
	
	public void sing() {
		System.out.println("tweet tweet tweet");
	}
}

class Robin extends Bird{
	
	public void sing(){
		
		System.out.println("kue kue kue");
		
	}
	
}


public class Polymorphism {

	public static void main(String[] args) {
		
		Robin s = new Robin();
		s.sing();
		
	}

}