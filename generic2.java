
public class generic2 {
	public static <S> void print(S a[]) {

		for (int i = 0; i < a.length; i++)
			System.out.println(a[i]);
	}

	public static void main(String args[]) throws InterruptedException {

		Integer a[] = { 1, 5, 8, 3 };
		print(a);

		System.out.println();

		Character b[] = { 'a', 'c', 'b', 'b' };
		print(b);

		System.out.println();

		String c[] = { "Its", "time", "to", "code" };
		print(c);

		System.out.println();

		Float d[] = { 1.0f, 6.3f, 3.6f, 5.0f };
		print(d);

		System.out.println();

		Double e[] = { 123.45d, 33.567d, 60.6242d, 12.9065d };
		print(e);

		System.out.println();

	}

}
