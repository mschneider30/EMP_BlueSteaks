public class SearchDriver {
	public static void populate(int[] b) {
		for(int a = 0; a < b.length; a++) {
			b[a]=a;
		}
	}
	public static String toString(int[] b) {
		int end = b.length;
		String output = "[";
		for (int i = 0; i < end - 1; i++) {
			output += b[i];
			output+= ", ";
		}
		output += b[end - 1];
		output += "]";
		return output;
	}
	public static void main(String[] args) {
		int[] uno = new int[1];

		int[] diez = new int[10];

		int[] cien = new int[100];

		int[] mil = new int[1000];

		int[] diez_mil = new int[10_000];

		int[] cien_mil = new int[100_000];

		populate(uno);
		populate(diez);
		populate(cien);
		populate(mil);
		populate(diez_mil);
		populate(cien_mil);

		System.out.println(toString(uno));
		System.out.println(toString(diez));
		System.out.println(toString(cien));
		System.out.println(toString(mil));
		System.out.println(toString(diez_mil));
		System.out.println(toString(cien_mil));

		int tst = 99_999;


		System.out.println(BinSearch.binSearch( uno, tst));
		System.out.println(LinSearch.linSearch(cien_mil, tst));

	}
}
