package lengthOfLastWord;


public class LengthOfLastWord {
    public static void main(String[] args) {

        String s = "   fly me   to   the        ";


        int length = 0;
        int i = s.length() - 1;

        // oxiridagi bo‘sh joylarni tashlaymiz
        while (i >= 0 && s.charAt(i) == ' ') {
            i--;
        }

        // oxirgi so‘zni sanaymiz
        while (i >= 0 && s.charAt(i) != ' ') {
            length++;
            i--;
        }

        System.out.println(length);

    }

}
