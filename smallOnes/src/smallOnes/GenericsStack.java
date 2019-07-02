package smallOnes;

import java.util.ArrayList;
import java.util.Date;

public class GenericsStack<E> {
	
	private ArrayList<E> list =new ArrayList<>() ;
	
	public int getSize() {
		return list.size();
	}
	
	public E peek() {
		return list.get(getSize()-1);
	}
	public void push(E o) {
		list.add(o);
	}
	
	public E pop() {
		E e = list.get(getSize()-1);
		list.remove(e);
		
		return e;
	}
	public boolean isEmpty() {
		return list.isEmpty();
	}
	
	
	public static void main( String args[]){
		
		GenericsStack<String> list = new GenericsStack<>();
		
		list.push("Ferdis");
		list.push("kaka");
		
		
		System.out.println(list.getSize());
		System.out.println(list.pop());
		
	
		
		
	}

}
