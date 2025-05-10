
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Sri Andayani
 */
public class main {
    static Task[] tasks = new Task[100]; // array penyimpanan
    static int count = 0;
    static int nextId = 1;
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int pilihan;

        do {
            System.out.println("\n=== Waroeng Sederhana 1950 ===");
            System.out.println("1. Tambah Pesanan");
            System.out.println("2. Tampilkan Pesanan");
            System.out.println("3. Ubah Pesanan");
            System.out.println("4. Hapus Pesanan");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = scanner.nextInt();
            scanner.nextLine(); 

            switch (pilihan) {
                case 1 -> tambahPesanan();
                case 2 -> tampilkanPesanan();
                case 3 -> ubahPesanan();
                case 4 -> hapusPesanan();
                case 0 -> System.out.println("Terima kasih telah mencoba!");
                default -> System.out.println("Pilihan tidak valid. Coba Lagi!");
            }
        } while (pilihan != 0);
    }
//    Menambahkan catatan baru
    static void tambahPesanan() {
        System.out.print("\n====== Tuliskan Pesanan Pelanggan ======");
        System.out.print("\nNama Pelanggan: ");
        String title = scanner.nextLine();
        System.out.print("\n====== List Pesanan ======");
        System.out.print("\n  ");
        String desc = scanner.nextLine();
        tasks[count] = new Task(nextId++, title, desc);
        count++;
        System.out.print("===============================================");
        System.out.println("\nPesanan berhasil di tambahkan\n");
        System.out.print("===============================================");
    }
// Menampikan Catatan sesuai nomor urut yang diminta
    static void tampilkanPesanan() {
        if (count == 0) {
            System.out.println("Belum ada pesanan.");
            return;
        }

        for (int i = 0; i < count; i++) {
            System.out.println(tasks[i]);
        }
    }
//Mengedit catatan dengan id catatan 
    static void ubahPesanan() {
        System.out.print("\n==========================================");
        System.out.print("\nMasukkan Nomor Pesanan yang ingin diubah: ");
        int id = scanner.nextInt();
        scanner.nextLine();

        boolean found = false;

        for (int i = 0; i < count; i++) {
            if (tasks[i].getId() == id) {
                System.out.print("\n====== Tulis Pesanan yang ingin di ubah ======");
                System.out.print("\nNama Pelanggan: ");
                String newTitle = scanner.nextLine();
                System.out.print("\n====== Pesanan Baru ======");
                System.out.print("\n  ");
                String newDesc = scanner.nextLine();
                tasks[i].setTitle(newTitle);
                tasks[i].setDescription(newDesc);
                System.out.print("=============================================");
                System.out.println("\nPesanan berhasil di ubah!\n");
                System.out.print("=============================================");
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Nomor yang anda masukkan tidak ada di catatan pemesanan");
        }
    }

    static void hapusPesanan() {
        System.out.print("\n============ Hapus Pesanan ============");
        System.out.print("\nMasukkan Nomor Pesanan : ");
        int id = scanner.nextInt();
        scanner.nextLine();

        boolean found = false;

        for (int i = 0; i < count; i++) {
            if (tasks[i].getId() == id) {
                for (int j = i; j < count - 1; j++) {
                    tasks[j] = tasks[j + 1]; // geser elemen ke kiri
                }
                tasks[count - 1] = null;
                count--;
                System.out.print("=========================================");
                System.out.println("\nPesanan berhasil di hapus\n");
                System.out.print("=========================================");
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Tidak ada Pesanan dengan nomor yang kamu inputkan");
        }
    }
}
