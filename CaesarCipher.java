public class CaesarCipher {
    // Метод для шифрования текста
    public static String encrypt(String text, int shift) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (Character.isLetter(ch)) {
                char base = Character.isLowerCase(ch) ? 'a' : 'A';
                ch = (char) ((ch - base + shift) % 26 + base);
            }
            result.append(ch);
        }
        return result.toString();
    }

    // Метод для дешифрования текста
    public static String decrypt(String text, int shift) {
        return encrypt(text, 26 - shift);
    }

    public static void main(String[] args) {
        String text = "Разработка мобильных приложений";
        int shift = 3;

        String encrypted = encrypt(text, shift);
        System.out.println("Зашифрованное " + encrypted);

        String decrypted = decrypt(encrypted, shift);
        System.out.println("Расшифрованное " + decrypted);
    }
}
