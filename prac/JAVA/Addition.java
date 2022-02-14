public class Addition{

	public int add(int a, int b){
	System.out.println("Two integer based parameter");
	return a+ b;

	}

	public int add(int a, int b, int c){
	System.out.println("Three integers based Parameters");
	return a+b+c;

	}

	public double add(double a, int b){
	System.out.println("One Double and one Int based Parameter");
	return a + b;

	}

	public double add(double a, double b){
	System.out.println("Two double based Parameter");
	return a+b;
	}

	public double add(int a, double b){
	System.out.println("First int and double based Parameter");
	return a+b;

	}

	public String add(String a , String b){
	System.out.println("Two String based Parameter");
	return a+b;
	}


	public static void main(String[] args){
	Addition addObj = new Addition();
	System.out.println("Addition Results: " + addObj.add(101,220));
	System.out.println("Addition Results: " + addObj.add(101,202,141));
	System.out.println("Addition Results: " + addObj.add(10.21,161));
	System.out.println("Addition Results: " + addObj.add(132.10,184.25));
	System.out.println("Addition Results: " + addObj.add(174,142.36));
	System.out.println("Addition Results: " + addObj.add("Azad","Shruti"));	
	
	}


}
