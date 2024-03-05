import java.util.ArrayList;
import java.util.List;

public class SobesTwo {
    public static void main(String[] args) {
        String input = "ЯЯЯЯяя теееебббббяяяяя лллЛЛюююЮЮЮББББББллЮЮЮЮ";

        String output = parsing(input);
        System.out.println(output);

    }

    public static String parsing(String input) {
        String lowerCase = input.toLowerCase();
        char[] massageInput = lowerCase.toCharArray();
        List<Integer> list = new ArrayList<>();
        list.add(0);

        for (int i = 1; i < massageInput.length; i++) {
            if (massageInput[i] != massageInput[list.get(list.size() - 1)]) {
                list.add(i);
            }
        }

        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < list.size(); i++) {
            stringBuilder.append(massageInput[list.get(i)]);
        }

        return String.valueOf(stringBuilder);


    }

}
