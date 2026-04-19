package mahasiswa;
import java.util.Scanner;

public class Mahasiswa {
    private String nama, nim;
    private int[] nilai;

    public Mahasiswa(String nama, String nim, int jumlahMK) {
        this.nama = nama;
        this.nim = nim;
        if (jumlahMK <= 0) {
            throw new IllegalArgumentException("Jumlah mata kuliah harus > 0");
        }
        nilai = new int[jumlahMK];
    }

    public void inputNilai(Scanner sc) {
        for (int i = 0; i < nilai.length; i++) {
            System.out.print("Nilai MK-" + (i+1) + ": ");
            int input = sc.nextInt();
            while (input < 0 || input > 100) {
                System.out.print("Nilai harus 0-100. Masukkan ulang: ");
                input = sc.nextInt();
            }
            nilai[i] = input;
        }
    }

    public double rata() {
        int total = 0;
        for (int n : nilai) total += n;
        return (double) total / nilai.length;
    }

    public char grade() {
        double r = rata();
        if (r >= 85) return 'A';
        else if (r >= 75) return 'B';
        else if (r >= 60) return 'C';
        else return 'D';
    }

    public void tampil() {
        System.out.println("\n=== RAPOR ===");
        System.out.println("Nama: " + nama);
        System.out.println("NIM: " + nim);

        for (int i = 0; i < nilai.length; i++) {
            System.out.println("MK-" + (i+1) + ": " + nilai[i]);
        }

        System.out.printf("Rata: %.2f\n", rata());
        System.out.println("Grade: " + grade());
        System.out.println("Lulus: " + (rata() >= 60));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nama: ");
        String nama = sc.nextLine();
        System.out.print("NIM: ");
        String nim = sc.nextLine();
        System.out.print("Jumlah Mata Kuliah: ");
        int jml = sc.nextInt();

        Mahasiswa mhs = new Mahasiswa(nama, nim, jml);
        mhs.inputNilai(sc);
        mhs.tampil();

        sc.close();
    }
}
