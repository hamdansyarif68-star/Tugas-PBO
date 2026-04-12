//Nama      : Muh. Hamdan Syarif
//NIM       : 13020240240
//Kelas     : A3

import java.util.Scanner;

public class PrintIterasi {
    public static void main(String[] args) {
        int i;
        int N;
        Scanner masukan = new Scanner(System.in);
        
        System.out.print("Nilai N >0 = ");
        N = masukan.nextInt();
        i = 1;
        
        System.out.print("Print i dengan ITERATE : \n");
        for (;;) {
            System.out.println(i);
            if (i == N)
                break;
            else {
                i++;
            }
        }
        
        masukan.close();
    }
}
