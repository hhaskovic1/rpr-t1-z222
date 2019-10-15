import java.util.Scanner;

public class Main {

    public static int sumaCifara(int n) {
        int suma = 0;
        while(n!=0) {
            suma += n % 10;
            n /= 10;
        }
        return suma;

    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Unesite broj");
        int n = scanner.nextInt();

        for(int i=2; i<n; i++) {
            if(i% sumaCifara(i) == (0)) System.out.println(i);
        }

    }

}