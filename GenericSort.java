
public class GenericSort {

	public static <S> void print(S a[]) {
		for (int i = 0; i < a.length; i++)
			System.out.println(a[i]);
	}

	public static <S extends Comparable<S>> void Sort(S[] a) {
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length; j++) {
				if (a[i].compareTo(a[j]) <= 0) {
					S temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
	}

	public static void main(String args[]) throws InterruptedException {

		Integer a[] = { 1, 5, 8, 3 };
		Sort(a);
		print(a);

		System.out.println();

		Character b[] = { 'a', 'c', 'b', 'b' };
		Sort(b);
		print(b);

		System.out.println();

		String c[] = { "Its", "time", "to", "code" };
		Sort(c);
		print(c);

		System.out.println();

		Float d[] = { 1.0f, 6.3f, 3.6f, 5.0f };
		Sort(d);
		print(d);

		System.out.println();

		Double e[] = { 123.45d, 33.567d, 60.6242d, 12.9065d };
		Sort(e);
		print(e);

		System.out.println();

	}

}
