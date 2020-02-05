import java.util.Arrays;

public class Diamond {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] a = new int[26];
		int[] b = new int[26];

		String str1 = new String("ThysonKroup");
		String str2 = new String("MumbaiCapgemini");

		int i, j, limit = 10;

		str1 = str1.toLowerCase();
		str2 = str2.toLowerCase();

		for (i = 0; i < str1.length()-1; i++) {
			a[((int)str1.charAt(i)) - 97] += 1;
		}
	
		for (i = 0; i < str2.length()-1; i++) {
			b[((int)str2.charAt(i)) - 97] += 1;
		}
		System.out.println("A: "+Arrays.toString(a));
		System.out.println("B: "+Arrays.toString(b));

		for (i = 0; i < 26; i++) {
			if (a[i] > b[i]) {
				limit = limit - (a[i] - b[i]);
			}
			if (limit <= 0) {
				System.out.println("Not possible");
				System.out.println("i: "+i+"  limit: "+limit);
				System.exit(0);
			}
		}
		if (i == 26 && limit > 0) {
			System.out.println("Possible");
		}
		System.out.println("i: "+i+"  limit: "+limit);

	}

}