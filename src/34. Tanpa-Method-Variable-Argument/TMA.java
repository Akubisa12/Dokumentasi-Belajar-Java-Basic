public class TMA {
  public static void main(String[] args){
    /*
    Kadang kita butuh mengirim data ke method sejumlah data yang tidak pasti
    Biasanya, agar bisa seperti ini, kita akan menggunakan Array sebagai parameter di method tersebut
    Namun di Java, kita bisa menggunakan variable argument, untuk mengirim data yang berisi jumlah tak tentu, bisa nol atau lebih
    Parameter dengan tipe variable argument, hanya bisa ditempatkan di posisi akhir parameter
     */
    // ERROR !!
    // sayCongrats("Jessen", 90,90,90);
  }
  // static void sayCongrats(String name, int[] values){
  //   int total = 0;
  //   for(var value : values){
  //     total += value;
  //   }
  //   int finalValue = total / values.length;

  //   if(finalValue >= 75){
  //     System.out.println("Selamat "+name + "Anda Lulus");
  //   }else{
  //     System.out.println("Selamat "+ name + "Anda Tidak Lulus");
  //   }
  // }
}
