public class Sw {
  public static void main(String[] args){
    var nilai = "B";
    switch (nilai){
      case "A" : {
        System.out.println("Selamat Anda Lulus");
        break;
      }
      case "B":
      case "C":
        System.out.println("Prestasi Anda kurang");
        break;
      case "D":
        System.out.println("Tingkatkan Lagii ya ....");
        break;
      default :
        System.out.println("Tidak lulus");
        break;
    }
  }
}
