public class Encryptor {
    public String encrypt(String numbers)
    {
        StringBuilder addSeven = new StringBuilder();
        int holder;
        for(int i=0; i<numbers.length(); i++)
        {
            holder = ((Integer.parseInt(numbers.charAt(i)+""))+7) % 10;
            addSeven.append(holder);
        }
        String encryptedNumber;
        encryptedNumber = addSeven.charAt(2)+"" + addSeven.charAt(3)+"" + addSeven.charAt(0)+""+ addSeven.charAt(1)+"";
        return encryptedNumber;
    }
}

