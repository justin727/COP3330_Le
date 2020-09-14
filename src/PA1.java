import java.util.Scanner;

public class PA1 {
    public static void main(String[] args) {
        // Taking in a 4 digit number//
        System.out.println("Enter a four digit number to be encrypted: ");
        Scanner scan = new Scanner(System.in);
        String numbers = scan.nextLine();

        //Calling Encryptor class and printing encrypted value
        Encryptor Encrypting = new Encryptor();
        String Encrypted = Encrypting.encrypt(numbers);
        System.out.println("Your Encrypted Number is: " +Encrypted);

        //Calling Decryptor class and printing decrypted value
        Decryptor Decrypting = new Decryptor();
        String Decrypted = Decrypting.decrypt(Encrypted);
        System.out.println("Your Decrypted Number is: " +Decrypted);
    }
}
