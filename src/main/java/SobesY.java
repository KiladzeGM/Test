public class SobesY {

    public static char[] aVoid(char[] input, int length) {
        int count = 0;
        char[] output = new char[length];
        for (int i = 0; i < input.length; i++) {
            if (input[i] == ' ') {
                if (i + count < length) output[i + count] = '%';
                if (i + count + 1 < length) output[i + count + 1] = '2';
                if (i + count + 2 < length) output[i + count + 2] = '0';
                count += 2;
                continue;
            }
            if (i + count < length) output[i + count] = input[i];
        }
        return output;
    }

    public static void main(String[] args) {
//        char[] input = {'я', ' ', '\0', 'м', 'е', 'н', ' '};
        char[] input = {' ', ' ', ' ', ' ', ' ', ' ', ' '};

        System.out.println(aVoid(input, 10));

    }
}
