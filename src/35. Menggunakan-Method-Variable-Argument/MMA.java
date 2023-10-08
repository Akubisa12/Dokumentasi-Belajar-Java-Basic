public class MMA {
  public static void main(String[] args) {
    // Memanggil metode sayCongrats dengan nama "Jessen" dan tiga nilai integer
    sayCongrats("Jessen", 90, 90, 90);
  }
  
  static void sayCongrats(String name, int... values) {
    // Menghitung total dari semua nilai yang dikirim sebagai argumen variable
    int total = 0;
    for (var value : values) {
      total += value;
    }
    // Menghitung rata-rata nilai dengan membagi total oleh jumlah nilai
    int finalValue = total / values.length;
    
    // Memeriksa apakah nilai rata-rata lebih besar atau sama dengan 75
    if (finalValue >= 75) {
      // Menampilkan pesan lulus jika nilai rata-rata memenuhi kondisi
      System.out.println("Selamat " + name + ", Anda Lulus");
    } else {
      // Menampilkan pesan tidak lulus jika nilai rata-rata tidak memenuhi kondisi
      System.out.println("Selamat " + name + ", Anda Tidak Lulus");
    }
  }
}
