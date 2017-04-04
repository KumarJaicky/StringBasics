package String;

import java.io.ObjectInputStream.GetField;

public abstract class Car {
	
	private int tyre;
	private int window;
	private int mileage;
	
	
	public int getTyre() {
		return tyre;
	}


	public void setTyre(int tyre) {
		this.tyre = tyre;
	}


	public int getWindow() {
		return window;
	}


	public void setWindow(int window) {
		this.window = window;
	}


	public int getMileage() {
		return mileage;
	}


	public void setMileage(int mileage) {
		this.mileage = mileage;
	}


/*	public static void main(String[] args){
	
		getMilege("bmw");
		
		
	}
	*/
	
	private int getMilege(String car){
		
		
		return 1;
	}

}
