package lab12;

public class Vowel extends Thread {
    protected char str[];

    Vowel(char str[]) {
        this.str = str;
    }

    public void printVowel() {
        for (int i = 0; i < str.length; i++) {
            if (str[i] == 'a' || str[i] == 'e' || str[i] == 'i' || str[i] == 'o' ||
                str[i] == 'u' ||
                str[i] == 'A' || str[i] == 'E' || str[i] == 'I' ||
                str[i] == 'O' || str[i] == 'U') {

                System.out.print(str[i]);
            }
        }
        System.out.println("");
    }

    public void run() {
        System.out.println("Vowels");
        this.printVowel();
    }
}
