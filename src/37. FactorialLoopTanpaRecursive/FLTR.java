public class FLTR {
  public static void main(String[] args) {
    int result = factorial(8);
    System.out.println("Faktorial dari 8 adalah: " + result);
  }

  static int factorial(int value){
    var result  = 1;
    for(int i = 1; i <= value; i++){
      result *= i;
    }
    return result;
  }
}
