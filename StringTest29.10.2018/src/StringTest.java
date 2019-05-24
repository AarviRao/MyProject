public class StringTest {

	public static void main(String[] args) {
		String s = new String("VENKAT Ginnarapu Aarvi Rao");
		
		String rev = "";
		
		for (int i=s.length()-1; i>=0; i--){
			rev = rev + s.charAt(i);
		}
		System.out.println(rev);
		//this is GIt

	}

	public static void main1(String[] args) {

		String s = new String("VENKAT Ginnarapu Aarvi Rao");

		String[] values = s.split(" ");

		for (int i = values.length - 1; i >= 0; i--) {
			System.out.print(values[i] + " ");
		}
	}

}
