public class Unit02 {
  public static void main(String[] args) {

    int sum=0;

    for (int i = 2; i <= 100; i++) {
      if (i % 2 == 0) {
        sum += i;
      }
    }

    System.out.println("2から100までの偶数の合計は" + sum);
  }

}