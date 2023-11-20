// Membuat aplikasi sederhana untuk membantu dokter mendiri mencatat data pasien
// dan memproses hasil pemeriksaan. Aplikasi in harus mampu melakukan:
// 1. Menyimpan data paien (nama. usia, jenis kelamin)
// 2. Memasukkan hasil pemeriksaan (tekanan darah, suhu tubuh, dan tinggi badan)
// 3. Menghitung rata-tata tekanan darah, suhu tubuh, dan tinggi badan dari semua pasien
// Pastijan mengunakan variabel, konstanta, perulangan, percabangan, array serta methods

import java.util.Scanner;

public class App {
  public static void main(String[] args) throws Exception {
    Scanner input = new Scanner(System.in);
    while (true) {
      System.out.println("Menu:");
      System.out.println("1. Input Data Pasien");
      System.out.println("2. Hitung Rata-rata Hasil Pemeriksaan Seluruh Pasien");

      System.out.print("Masukkan Pilihan anda: ");
      int pilihan = input.nextInt();

      String dataPasien[][] = new String[1][1];
      int hasilPemeriksaan[][] = new int[1][1];

      switch (pilihan) {
        case 1:
          // mengambil data pasien 
          String[] data = inputData(input);
          dataPasien = appendDataString(dataPasien, data);
        
          break;

        case 2:
          // mengambil hasil pemeriksaan pasien
          int[] hasil = inputHasilPemeriksaan(input);
          hasilPemeriksaan = appendDataInt(hasilPemeriksaan, hasil);
          break;

        case 3:

          break;

        default:
          break;
      }
      System.out.printf("%-13s:", "Nama ");
      String name = input.nextLine();
    }
  }

  public static String[] inputData(Scanner input) {
    String[] dataPasien = new String[3];

    System.out.print("Masukkan nama pasien: ");
    String nama = input.nextLine();
    dataPasien[0] = nama;

    System.out.println("Masukkan usia pasien: ");
    String usia = input.nextLine();
    dataPasien[1] = usia;

    System.out.println("Masukkan jenis kelamin pasien: ");
    String gender = input.nextLine();
    dataPasien[2] = gender;

    return dataPasien;
  }

  public static int[] inputHasilPemeriksaan(Scanner input) {
    int[] hasilPemeriksaan = new int[3];

    System.out.println("Masukkan tekanan darah pasien: ");
    hasilPemeriksaan[0] = input.nextInt();

    System.out.println("Masukkan suhu tubuh pasien: ");
    hasilPemeriksaan[1] = input.nextInt();

    System.out.println("Masukkan tinggi badan pasien: ");
    hasilPemeriksaan[2] = input.nextInt();

    return hasilPemeriksaan;
  }

  public static String[][] appendDataString(String[][] oldArray, String[] newData) {
    /**
     * Method untuk menambah elemen (array String) pada sebuah array String
     */
    String[][] newArray = new String[oldArray.length + 1][2];
    for (int i = 0; i < oldArray.length; i++) {
      newArray[i][0] = oldArray[i][0];
    }
    newArray[oldArray.length] = newData;
    return newArray;
  }

  public static int[][] appendDataInt(int[][] oldArray, int[] newData) {
    /**
     * Method untuk menambah elemen (array String) pada sebuah array String
     */
    int[][] newArray = new int[oldArray.length + 1][2];
    for (int i = 0; i < oldArray.length; i++) {
      newArray[i][0] = oldArray[i][0];
    }
    newArray[oldArray.length] = newData;
    return newArray;
  }
}
