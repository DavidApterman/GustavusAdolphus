/* Team Cuddly Pancake
 * APCS2 period 03
 * HW29 -- Stress is the Best
 * 2017-04-04
 */

public class DequeTester2 {
	// replace with Deque implementation to be tested
	private static final DequeFace<String> d = new Deque<>();

	public static void main(String[] args) {
		for ( int i = 0; i < 100; i++ ) {
			d.addLast(Integer.toString(i));
		}

		// this should cause problems
		d.addFirst(null);

		// may cause issues depending on if it checks for null or size
		while ( ! d.isEmpty() ) {
			d.removeLast();
		}
	}
}

