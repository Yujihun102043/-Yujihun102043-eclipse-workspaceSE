
public class whileNested {

	public static void main(String[] args) {

		/*
		 ★★★★★\n
		 ★★★★★\n
		 ★★★★★\n
		 ★★★★★\n
		 ★★★★★\n
		*/
		int i = 0;

		while (i < 5) {
			int j = 0;
			while (j < 5) {
				System.out.printf("%s[%d,%d]", "★", i, j);
				j++;
			} // inner while
			System.out.print("\n");
			i++;
		} // out while
		System.out.println("2.===========================");
		/*
		 ☆★★★★
		 ★☆★★★
		 ★★☆★★
		 ★★★☆★
		 ★★★★☆
		*/
		i = 0;
		while (i < 5) {
			int j = 0;
			while (j < 5) {
				if (i == j) {
					System.out.print("☆");
				} else {
					System.out.print("★");
				}
				j++;
			}
			System.out.print("\n");
			i++;
		}
		System.out.println("3.---------------------------------");
		/*
		☆☆☆☆☆
		★☆☆☆☆
		★★☆☆☆
		★★★☆☆
		★★★★☆
		*/
		i = 0;
		while (i < 5) {
			int j = 0;
			while (j < 5) {
				if (i <= j) {
					System.out.print("☆");
				} else {
					System.out.print("★");
				}
				j++;
			}
			System.out.print("\n");
			i++;
		}
		System.out.println("4.---------------------------------");
		/*
		★
		★★
		★★★
		★★★★
		★★★★★
		*/
		i = 0;
		while (i < 5) {
			int j = 0;
			while (j < 5) {
				if (i < j) {
					System.out.print(" ");
				} else {
					System.out.print("★");
				}
				j++;
			}
			System.out.print("\n");
			i++;
		}
		System.out.println("5.---------------------------------");
		/*
		★★★★★ i=0 5개
		★★★★ i=1 4개
		★★★ i=2 3개
		★★ i=3 2개
		★ i=4 1개
		*/
		i = 0;
		while (i < 5) {
			int j = 0;
			while (j < 5) {
				if (j < 5) {
					System.out.print("★");
				}
				j++;
			}
		}
		i++;
		System.out.println();
	}
}