package lab12;

public class Consonant extends Thread {
    protected char str[];

    Consonant(char str[]) {
        this.str = str;
    }

    public void printConsonant() {
        for (int i = 0; i < str.length; i++) {
            if (str[i] != 'a' && str[i] != 'e' && str[i] != 'i' &&
                str[i] != 'o' && str[i] != 'u' &&
                str[i] != 'A' && str[i] != 'E' && str[i] != 'I' &&
                str[i] != 'O' && str[i] != 'U') {

                System.out.print(str[i]);
            }
        }
    }

    public void run() {
        System.out.println("Consonant");
        this.printConsonant();
    }
}
