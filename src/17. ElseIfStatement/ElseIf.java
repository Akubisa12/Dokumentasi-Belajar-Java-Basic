public class ElseIf {
  public static void main(String[] args){
    var nilaiKelas = 88;
    var targetNilai = 99;
    if(nilaiKelas >= 80 && targetNilai == 99 ){
      System.out.println("Nilai Anda A");
    } else if(nilaiKelas < 80 && targetNilai < 99){
      System.out.println("Nilai Anda B");
    } else if ( nilaiKelas <=70 && targetNilai <= 70){
      System.out.println("Nilai Anda C");
    } else if ( nilaiKelas <= 60 && targetNilai <= 60){
      System.out.println("Nilai Anda D");
    } else{
      System.out.println("Anda Tidak mendapatkan Nilai");
    }
  }
}