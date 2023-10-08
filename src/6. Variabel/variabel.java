public class variabel {
  public static void main(String[] args){
    // cara pertama dengan keyword String
    String nama;
    nama = "Allouisius Jessen";
    int umur = 16;

    // cara kedua dengan keyword var
    var kota = "Purwokerto";
    var kabupaten = "Banyumas";
    var hobi = "Ngoding";

    // cara ketiga dengan keyword final
    // keyword final tidak bisa kita assign ulang / diubah isi variabelnya
    // final ini sama saja seperti keyword const yang ada di JavaScript atau bahasa permrograman lain
    // final TypeData namaVariabel = value
    
    final int age = 16;
    
    // cara pertama dengan keyword String
    String alamat = "Indonesia";
    System.out.println(nama);
    System.out.println(umur);
    System.out.println(alamat);
    // cara kedua dengan keyword var
    System.out.println(kota);
    System.out.println(kabupaten);
    System.out.println(hobi);
    // cara ketiga dengan keyword final
    System.out.println(age);
  }  
}
