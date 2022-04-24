package junit1;


public class myMath {
    int sum(int[] numbers){
        int sum = 0;
        for (int i:numbers){
            sum +=i;
        }
        return sum;
    }
}
