//Nama                  : Muh. Hamdan Syarif
//NIM                   : 13020240240
//Hari,Tanggal, Waktu   : Jum'at/ 2 April 2026/ 08.00
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class Bacakar {
    public static void main(String[] args) throws IOException {
        char cc;
        int bil;
        
        // BufferedReader
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader dataIn = new BufferedReader(isr);
        
        System.out.print("hello\n");
        System.out.print("baca 1 karakter : ");
        cc = dataIn.readLine().charAt(0);
        System.out.print("baca 1 bilangan : ");
        bil = Integer.parseInt(dataIn.readLine());
        
        System.out.print(cc + "\n" + bil + "\n");
        System.out.print("bye \n");
        
        // Menggunakan Scanner
        Scanner scanner = new Scanner(System.in);
        System.out.print("(Scanner) baca 1 bilangan : ");
        int bilScanner = scanner.nextInt();
        System.out.println("Nilai dari Scanner: " + bilScanner);
        
        // Menggunakan JOptionPane
        String kar = JOptionPane.showInputDialog("Karakter 1 : ");
        System.out.println("Karakter dari JOptionPane: " + kar);
        JOptionPane.showMessageDialog(null, "hello");
        
        scanner.close();
    }
}
