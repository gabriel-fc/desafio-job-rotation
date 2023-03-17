import java.util.Arrays;

public class Exercises {

    public static int question1(int index){
        int sum = 0, k = 0;

        while(k < index){
            k++;
            sum += k;
        }
        System.out.println(sum);
        return sum;
    }

    public static int fibonacci(int number, int[] sequence){
        if(number < 2){
            sequence[number] = number;
            return number;
        }
        sequence[number-1] = sequence[number-1] != -1 ? sequence[number-1] : fibonacci(number-1, sequence);
        sequence[number-2] = sequence[number-2] != -1 ? sequence[number-2] : fibonacci(number-2, sequence);
        sequence[number] = sequence[number-1] + sequence[number-2];
        return sequence[number];
    }

    public static String question2(int number){
        String output = "O número %d %s aparece na sequência!";
        int[] sequence = new int[number+1];
        Arrays.fill(sequence, -1);
        fibonacci(number, sequence);
        for (int value:
             sequence) {
            if(value == number) return String.format(output, number, "");
        }
        return String.format(output, number, "não");
    }

    public static String question5(String str){
        StringBuffer buffer = new StringBuffer(str);
        int length = str.length();
        int lastIndex = length-1;
        for(int i = 0; i < length/2; i++){
            char aux = buffer.charAt(i);
            buffer.setCharAt(i, buffer.charAt(lastIndex-i));
            buffer.setCharAt(lastIndex-i, aux);
        }
        return buffer.toString();
    }




}
