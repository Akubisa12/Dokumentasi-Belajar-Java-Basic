public class SL {
  public static void main(String[] args) {
    // Mendefinisikan variabel 'nilai' dengan nilai awal "A"
    var nilai = "A";
    // Melakukan switch pada nilai variabel 'nilai'
    switch (nilai) {
      // Jika 'nilai' adalah "A", cetak pesan berikut:
      case "A" -> System.out.println("WOW Anda bisa lulus dengan baik");
      
      // Jika 'nilai' adalah "B" atau "C", cetak pesan berikut:
      case "B", "C" -> System.out.println("Anda lulus");
      
      // Jika 'nilai' adalah "D", cetak pesan berikut:
      case "D" -> System.out.println("Anda Tidak Lulus");
      
      // Jika 'nilai' tidak cocok dengan kasus di atas, maka jalankan blok default:
      default -> {
        System.out.println("Mungkin Anda salah jurusan");
      }
      // Tanda -> merupakan Switch Expression
    }
  }
}
