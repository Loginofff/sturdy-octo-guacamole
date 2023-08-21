public class Main {

  //Напишите рекурсивный метод public static String reverse(int x),
  // который будет возвращать строку,
  // содержащую десятичные цифры числа в обратном порядке (развернёт число).

  public static void main(String[] args) {
    reverse(1000);
  }

  private static void reverse(int n) {
    if (n == 0)
      return;
    System.out.println(n);

    reverse(n - 1);
  }
}