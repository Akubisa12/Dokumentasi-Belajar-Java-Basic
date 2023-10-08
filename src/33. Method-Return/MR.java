public class MR {
  public static void main(String[] args){
    /*
    Secara default, method itu tidak menghasilkan value apapun, namun jika kita ingin, kita bisa membuat sebuah method mengembalikan nilai
    Agar method bisa menghasilkan value, kita harus mengubah kata kunci void dengan tipe data yang dihasilkan
    Dan di dalam block method, untuk menghasilkan nilai tersebut, kita harus menggunakan kata kunci return, lalu diikuti dengan data yang sesuai dengan tipe data yang sudah kita deklarasikan di method
    Di Java, kita hanya bisa menghasilkan 1 data di sebuah method, tidak bisa lebih dari satu
     */
    var a = 100;
    var b = 200;
    var c = sum(a,b);
    System.out.println(c);
  }
  static int sum(int value1, int value2){
    var total = value1  + value2;
    return total;
  }
}
