public class S {
  public static void main(String[] args) {
    sayHello("Jessen");
  }
  static void sayHello(String name){
    String hello = "Hello " + name;
    if(!name.isBlank()){
      String hi  = "Hi " + name;
      System.out.println(hi);
    }
    System.out.println(hello); // -> ga error karena dia masih masuk ke scope fungsi
    // System.out.println(hi); -> error karena bukan masuk ke scope fungsi lagi
  }
}
