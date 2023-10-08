public class YS{
    public static void main(String[] args) {
      // yield digunakan untuk mengembalikan nilai
      // yield hanya bisa digunakan di java versi 14 atau diatasnya
      // yield akan sangat membantu ketika kita bth membuat data berdasarkan kondisi switch statement
        var nilai = "A";
        String ucapan = switch (nilai) {
          case "A" :
            yield "Wow Anda lulus Dengan baik";
          case "B","C":
            yield "Anda lulus";
          case "D":
            yield "Anda tidak lulus";
          default :
            yield "Mungkin Anda salah jurusan";
        };
        System.out.println(ucapan);
    }
}
