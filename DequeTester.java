/*
Terry Guan
APCS2 pd3
hw#29:Deque tester
2017-04-05
*/
public class DequeTester {

  private static Deque _stressor = new DLNDeque<String>();

//consistent adding and removing of a deque done recursively
  public static void test(int times) {
      if (times <= 0)
        return;
      else {
        _stressor.addFirst(times);
        _stressor.addLast(times%10);
        test(times - 1);
      }
      _stressor.removeFirst();
      _stressor.removeLast();
  }

  public static void main(String[] args) {
    test(100);
    System.out.println(_stressor);
  }

}
