public class Main {

  // Напишите рекурсивный метод public static String reverse(int x),
  // который будет возвращать строку,
  // содержащую десятичные цифры числа в обратном порядке (развернёт число).

  public static void main(String[] args) {
    int number = 12345;
    String reversed = reverse(number);
    System.out.println(reversed);
  }

  private static String reverse(int x) {
    if (x == 0) {
      return "";
    } else {
      int lastDigit = x % 10;
      String remainingReversed = reverse(x / 10);
      return lastDigit + remainingReversed;
    }
  }
}

