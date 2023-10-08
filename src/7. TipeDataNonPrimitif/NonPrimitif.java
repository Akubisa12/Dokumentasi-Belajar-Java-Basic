public class NonPrimitif {
  public static void main(String[] args){
    //Tipe data primitif adalah tipe bawaan di dalam bahasa pemrograman. Tipe data primitif tidak bisa diubah lagi
    // Tipe data number, char, boolean adalah tipe data primitif. Tipe data primitif selalu memiliki default value
    // Tipe data String bukan tipe data primitif, tipe data bukan primitif tidak memiliki default value, dan bisa bernilai null
    // Tipe data bukan primitif bisa memiliki method/function (yang akan dibahas nanti)
    // Di Java, semua tipe data primitif memiliki representasi tipe data bukan primitif nya
    Integer iniInteger = 10;
    Long iniLong = 10L;
    Boolean iniBoolean = true;
    Short iniShort; // NULL
    iniShort = 100;

    System.out.println(iniInteger);
    System.out.println(iniLong);
    System.out.println(iniBoolean);
    System.out.println(iniShort);
  } 
}
