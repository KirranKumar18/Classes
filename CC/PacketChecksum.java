import java.util.Scanner;

public class PacketChecksum {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int xorResult = 0;

        for (int i = 0; i < n; i++) {
            int packet = sc.nextInt();
            xorResult ^= packet;  
        }
        int checksum = sc.nextInt();
        if (xorResult == checksum) {
            System.out.println("OK");
        } else {
            System.out.println("Corrupt");
        }

        
    }
}
