package String;

public class Flat extends Building {

	public Flat() {
		// TODO Auto-generated constructor stub
	}

public void getWindow(String flatNo){
		
		System.out.println("Flat has 4 windows");
		
	}

public static void main(String args[]) {
	Flat flat = new Flat();
	flat.getWindow("1");
//	
//	Flat flat1= (Flat) new Building();----Cla
//	flat1.getWindow("2");
	
	Building building = new Building();
	building.getWindow("2");
	
	Building building2 = new Flat();
	building2.getWindow("2");
	
}
}
