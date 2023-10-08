public class CN {
  public static void main(String[] args){ // Mendeklarasikan metode utama yang akan dieksekusi oleh JVM
    for(int counter = 1;counter<=100;counter++){ // Membuat loop for dari 1 hingga 100
      if(counter % 2 == 0){ // Mengecek apakah counter adalah bilangan genap
        continue; // Jika ya, maka skip iterasi ini dan lanjut ke iterasi berikutnya
      }
      System.out.println("Perulangan Ganjil- "+ counter); // Jika tidak (berarti bilangan ganjil), cetak counter
    }
  }
}