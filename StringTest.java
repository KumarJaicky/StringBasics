package String;

public class StringTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*String a= new String("ABC");
		String b= new String("DEF");
		String c="HIJ";
		System.out.println(a+c);*/
		
		StringBuffer x= new StringBuffer("ABC");
		StringBuffer y= new StringBuffer("EFG");
		String z = x.append(y).toString();
		System.out.println(z);
	}

}
