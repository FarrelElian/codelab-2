import java.util.Scanner;

class Mahasiswa {
    String nama;
    String nim;
    String jurusan;
    int angkatan;

    public Mahasiswa(String nama, String nim, String jurusan, int angkatan) {
        this.nama = nama;
        this.nim = nim;
        this.jurusan = jurusan;
        this.angkatan = angkatan;
    }

    public void tampilDataMahasiswa() {
        System.out.println("Nama: " + nama);
        System.out.println("NIM: " + nim);
        System.out.println("Jurusan: " + jurusan);
        System.out.println("Angkatan: " + angkatan);
    }

    public static void tampilUniversitas() {
        System.out.println("Selamat datang di Universitas ABC");
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Masukkan jumlah mahasiswa: ");
        int jumlahMahasiswa = input.nextInt();
        input.nextLine(); // Consume newline

        Mahasiswa[] daftarMahasiswa = new Mahasiswa[jumlahMahasiswa];

        for (int i = 0; i < jumlahMahasiswa; i++) {
            System.out.println("Masukkan data mahasiswa ke-" + (i + 1) + ": ");
            System.out.print("Nama: ");
            String nama = input.nextLine();
            System.out.print("NIM: ");
            String nim = input.nextLine();
            // Cek panjang NIM
            while (nim.length() != 15) {
                System.out.println("Panjang NIM harus 15 karakter. Masukkan kembali NIM: ");
                nim = input.nextLine();
            }
            System.out.print("Jurusan: ");
            String jurusan = input.nextLine();
            System.out.print("Angkatan: ");
            int angkatan = input.nextInt();
            input.nextLine(); // Consume newline

            daftarMahasiswa[i] = new Mahasiswa(nama, nim, jurusan, angkatan);
        }

        // Menampilkan data universitas
        Mahasiswa.tampilUniversitas();

        // Menampilkan data mahasiswa
        for (int i = 0; i < jumlahMahasiswa; i++) {
            System.out.println("\nData Mahasiswa ke-" + (i + 1) + ": ");
            daftarMahasiswa[i].tampilDataMahasiswa();
        }

        input.close();
    }
}
