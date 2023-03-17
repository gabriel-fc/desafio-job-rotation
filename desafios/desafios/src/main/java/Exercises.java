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
}
