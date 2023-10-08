public class TFE { // Mendeklarasikan kelas dengan nama TFE
  public static void main(String[] args){ // Mendeklarasikan metode main yang akan dieksekusi pertama kali saat program dijalankan
    String[] array = { // Mendeklarasikan dan menginisialisasi array string dengan nama variabel 'array'
      "Jessen","Dono","Doni","Dika", // Menambahkan elemen ke dalam array
      "Asep","Budi" // Menambahkan elemen ke dalam array
    };
    for(int i = 0; i < array.length; i++){ // Loop for untuk mengulangi setiap elemen dalam array
      System.out.println(array[i]); // Mencetak elemen array ke konsol
    }
  }
}