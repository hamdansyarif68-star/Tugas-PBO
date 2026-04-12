//Nama      : Muh. Hamdan Syarif
//NIM       : 13020240240
//Kelas     : A3

import java.util.Scanner;

public class PriFor {
    public static void main(String[] args) {
        int N;
        Scanner masukan = new Scanner(System.in);
        
        System.out.print("Nilai N > 0 = ");
        N = masukan.nextInt();
        
        for (int i = 1; i <= N; i++) {
            System.out.println(i);
        }
        
        masukan.close();
    }
}
