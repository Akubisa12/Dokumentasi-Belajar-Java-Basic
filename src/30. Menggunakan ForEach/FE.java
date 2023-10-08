public class FE { // Mendefinisikan kelas dengan nama FE
  public static void main(String[] args){ // Metode utama yang akan dieksekusi oleh JVM
    String[] array = { // Mendefinisikan array string dengan nama variabel 'array'
      "Jessen","Dono","Doni","Dika", // Menambahkan elemen ke dalam array
      "Asep","Budi" // Menambahkan elemen ke dalam array
    };
    for(var value : array){ // Loop for-each untuk setiap elemen dalam array
      System.out.println(value); // Mencetak nilai dari setiap elemen array ke konsol
    }
  }
}