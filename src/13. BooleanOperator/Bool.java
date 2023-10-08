public class Bool {
  public static void main(String[] args){
    var daftar_hadir = 70;
    var kesimpulan_nilai = 80;

    var daftarHadirTuntas = daftar_hadir >= 75;
    var nilaiRaport = kesimpulan_nilai <= 75;

    // Operator AND 
    var kelulusan = daftarHadirTuntas && nilaiRaport; //keduanya harus bernilai 1
                        //false       &&  false       // hasilnya false
    System.out.println(kelulusan);

  }
}
