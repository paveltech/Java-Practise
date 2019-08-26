package multiobject;

public class MultiTest <T , U>{

	T tObject;
	U uObject;
	
	public MultiTest(T tObject , U uObject) {
		this.tObject = tObject;
		this.uObject = uObject;
	}
	
	public void showObject() {
		if (tObject instanceof Integer) {
			System.out.println("This is integer value: "+tObject.toString());
		}else if (tObject instanceof String) {
			System.out.println("This is straing value: "+tObject.toString());
		}
		
		if (tObject instanceof Integer) {
			System.out.println("This is integer value: "+uObject.toString());
		}else if (tObject instanceof String) {
			System.out.println("This is straing value: "+uObject.toString());
		}
	}
}
