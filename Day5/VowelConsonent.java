package Day5;

public class VowelConsonent {
    public static void main(String[] args) {
        check('b');
    }

    static void check(char ch) {
        switch (ch) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
            case 'A':
            case 'E':
            case 'I':
            case 'O':
            case 'U':
                System.out.println(ch + ": It is a Vowel.");
                break;
            default:
                System.out.println(ch + ": It is a Consonant.");
        }
    }
}