package functionalInterface;

public class Rectangle {
	
	
	
	public static void main(String[] args) {
		
	
		
		Polygone p = (int x, int y)->y*x;
		
		double area = p.calculateArea(5, 8);
		
		System.out.println("area is: "+area +" sqm");
	}

}
