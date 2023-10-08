public class Arr {
  public static void main(String[] args){
    // Deklarasi Array
    String[] arrayString;
    // membuat object & pembatasan jumlah/index elemen array
    arrayString = new String[3];
    // mengisi array dengan komponen
    arrayString[0] = "Budi";
    arrayString[1] = "Kinan";
    arrayString[2] = "Radar";
    // Initialsisasi Array 
    int[] arrayInt = new int[]{
      10,20,30,40
    };
    // Operasi Array
    long[] arrayLong = {
      10,20,30,40
    };
    //Array didalam Array
    String[][] members = {
      {"Pizza","Cocacola","Jagung"},
      {"Roti","Fanta"},
      {"Susu","Nasi"}
    };
    // ganti isi elemen indeks ke 0 dengan 100
    arrayLong[0] = 100;
    //mencetak array tanpa isi
    System.out.println(arrayString);
    // Initialsisasi Array 
    System.out.println(arrayInt[0]);
    System.out.println(arrayInt[1]);
    // Operasi Array
    // Mengambil Data Array
    System.out.println(arrayLong[0]);
    System.out.println(arrayLong[1]);
    // Mengambil panjang dari Array
    System.out.println(arrayLong.length);
    // Array didalam Array

    // Mendefinisikan array `member1` dan menginisialisasinya dengan elemen-elemen dari array `members` pada indeks 0.
    String[] member1 = members[0];    
    // Mencetak elemen pertama dari array `member1` ke layar.
    System.out.println(member1[0]);  // pizza
    // Mencetak elemen pertama dari array `members` pada indeks 1 ke layar. 
    System.out.println(members[1][0]); // roti
    // Mencetak elemen pertama dari array `members` pada indeks 2 ke layar.
    System.out.println(members[2][0]); // susu

  }
}
