// Membuat aplikasi sederhana untuk membantu dokter mendiri mencatat data pasien
// dan memproses hasil pemeriksaan. Aplikasi in harus mampu melakukan:
// 1. Menyimpan data paien (nama. usia, jenis kelamin)
// 2. Memasukkan hasil pemeriksaan (tekanan darah, suhu tubuh, dan tinggi badan)
// 3. Menghitung rata-tata tekanan darah, suhu tubuh, dan tinggi badan dari semua pasien
// Pastijan mengunakan variabel, konstanta, perulangan, percabangan, array serta methods

import java.util.Scanner;

import javax.management.Query;

public class App {
  public static void main(String[] args) throws Exception {
    Scanner input = new Scanner(System.in);
    while (true) {
      System.out.println("Menu:");
      System.out.println("1. Input Data Pasien");
      System.out.println("2. Input Hasil Pemeriksaan");
      System.out.println("3. Hitung Rata-rata Hasil Pemeriksaan Seluruh Pasien");

      System.out.print("Masukkan Pilihan anda: ");
      int pilihan = input.nextInt();

      String data[] = new String[0];

      switch (pilihan) {
        case 1:
          System.out.println("Masukkan Nama Pasien: ");
          break;

        default:
          break;
      }

      System.out.printf("%-13s:", "Nama ");
      String name = input.nextLine();

    }
  }

  public static void inputData() {
    System.out.print("Masukkan Data Pasien: ");

  }

  public static String[] appendData(String[] oldArray, String newData) {
    String[] newArray = new String[oldArray.length + 1];
    for (int i = 0; i < oldArray.length; i++) {
      newArray[i] = oldArray[i];
    }
    newArray[oldArray.length] = newData;
    return newArray;
  }
}
