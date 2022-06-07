
public class SwitchUse {

	public static void main(String[] args) {
		/*
		 * 짝수 홀수 판별
		 */
		int number = 23;
		switch (number % 2) {
		case 0:
			System.out.println("짝수");
			break;
		case 1:
			System.out.println("홀수");
			break;
		}
		/*
		 * 문자 비교
		 * 	A : left
		 * 	D : rigth
		 *  W : up
		 *  S : down
		 *  Z : rotate
		 */

		char direction = 'D';

		switch (direction) {
		case 'A':
			System.out.println("move left~");
			break;
		case 'D':
			System.out.println("move right~");
			break;
		case 'W':
			System.out.println("move up~");
			break;
		case 'S':
			System.out.println("move down~");
			break;
		case 'Z':
			System.out.println("move rotate~");
			break;
		default :
			System.out.println("don't move");
			break;
		}

	}
}