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

		int[] millon = new int[1_000_000];

		int[] diez_millon = new int[10_000_000];

		int[] cien_millon = new int[100_000_000];

		int[][] testcases = {uno, diez, cien, mil, diez_mil, cien_mil, millon, diez_millon, cien_millon};

		for (int [] r : testcases){
			populate(r);
			System.out.println("\n===========================");
			System.out.println("Starting to test array with length: " + r.length);
			long start0 = System.currentTimeMillis();
			int x = 0;
			int d=100_000_000;
			while (x < d) {
				BinSearch.binSearch(r, r.length - 2);
				x++;
			}
			long end0 = System.currentTimeMillis();
			System.out.println("Time taken to binary search " + d + " times: " + (end0 - start0));

			long start1 = System.currentTimeMillis();
			int y = 99_990_000;
			while (y < d) {
				LinSearch.linSearch(r, r.length - 2);
				y++;
			}
			long end1 = System.currentTimeMillis();
			System.out.println("Time taken to linear search " + d + " times: " + (end1 - start1));

			System.out.println("Binary Search was " + ((end1-start1) - (end0 - start0 )) + " ms faster!");
		}



	}
}
