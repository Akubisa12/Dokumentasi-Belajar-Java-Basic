public class TipeData {
  public static void main(String[] args){
    byte iniByte = 100;
    short iniShort = 1000;
    int iniInt = 2000000;
    long iniLong = 3000000;
    long iniLong2 = 1000000L;
    // Floating point

    // 1. Float
    // min = 3.4e-038
    // max = 3.4e+038
    // size = 4 bytes
    // Default = 0.0
    float iniFloat = 10.12F; 

    // Double 
    // min = 1.7e-308
    // max = 1.7+308
    // size = 8 bytes
    // default = 0.0
    double iniDouble = 12.2424;

    // Literal 
    int decimalInt = 25; // 25
    int hexInt = 0xA132B; // 660267
    int binInt = 0b01010101; // 85

    // Underscore
    long balance = 1_000_000_000_000L;
    int sum = 60_000_000;

    // Konversi Tipe Data Number ke Tipe Data Lain
    // 2 cara :
    //  a. Otomatis / Widening Casting 
    //  b. Manual / Narrow Casting

    // Mendefinisikan variabel byte dan menginisialisasinya dengan nilai 10.
    byte iniByte1 = 10;

    // Mengonversi byte ke short, tidak perlu pengecoran eksplisit karena short lebih besar daripada byte.
    short iniShort2 = iniByte1;

    // Mengonversi short ke int, tidak perlu pengecoran eksplisit karena int lebih besar daripada short.
    int iniInt2 = iniShort2; 

    // Mengonversi int ke long, tidak perlu pengecoran eksplisit karena long lebih besar daripada int.      
    long iniLong3 = iniInt2;    

    // Mengonversi long ke float, tidak perlu pengecoran eksplisit karena float lebih besar daripada long.
    float iniFloat2 = iniLong3; 

    // Mengonversi float ke double, tidak perlu pengecoran eksplisit karena double lebih besar daripada float.     
    double iniDouble2 = iniFloat2;

    // Mengonversi double ke float dengan pengecoran eksplisit.
    float iniFloat3 = (float) iniDouble2; 
    
    // Mengonversi float ke long dengan pengecoran eksplisit.
    long iniLong4 = (long) iniFloat3;   
    
     // Mengonversi long ke int dengan pengecoran eksplisit.
    int iniInt3 = (int) iniLong4;   
    
    // Mengonversi int ke short dengan pengecoran eksplisit.
    short iniShort3 = (short) iniInt3;     


    // PROSES PENCETAKAN / OUTPUT
    System.out.println(iniByte);
    System.out.println(iniShort);
    System.out.println(iniInt);
    System.out.println(iniLong);
    System.out.println(iniLong2);
    // Floating Point
    System.out.println(iniFloat);
    System.out.println(iniDouble);
    // Literal
    System.out.println(decimalInt);
    System.out.println(hexInt);
    System.out.println(binInt);
    // UnderScore
    System.out.println(balance); //1000000000000
    System.out.println(sum); //60000000
    // Konversi Tipe Data Number ke Tipe Data lain
    System.out.println("KONVERSI TIPE DATA INT KE TIPE DATA LAIN");
    System.out.println(iniByte1); // 10
    System.out.println(iniShort2); // 10
    System.out.println(iniInt2); // 10
    System.out.println(iniLong3); // 10
    System.out.println(iniFloat2); // 10.0
    System.out.println(iniDouble2); // 10.0
    System.out.println(iniFloat3); // 10.0
    System.out.println(iniLong4); // 10
    System.out.println(iniInt3); // 10
    System.out.println(iniShort3); // 10
  }
}
