public class FDR {
  public static void main(String[] args) {
    /*
    Recursive method adalah kemampuan method memanggil method dirinya sendiri
    Kadang memang ada banyak problem, yang lebih mudah diselesaikan menggunakan recursive method, seperti contohnya kasus factorial
     */
    System.out.println(factorialRecursive(9));
  }
  static int factorialRecursive(int value){
    if(value == 1){
      return 1;
    }else{
      return value * factorialRecursive(value - 1 ); // ini recursive
    }
  }
}
