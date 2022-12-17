package school.mjc.stage0.loops.task2;

public class Multiplication {
    public void printMultiplied(int multiplyByAndToInclusive) {
                int zero = 0;
        System.out.println(0);
        if(multiplyByAndToInclusive<0){
            while (zero!=-multiplyByAndToInclusive * multiplyByAndToInclusive){
                zero += multiplyByAndToInclusive;
                System.out.println(zero);
            }
        }
        else {
            while (zero != multiplyByAndToInclusive * multiplyByAndToInclusive) {
                zero += multiplyByAndToInclusive;
                System.out.println(zero);
            }

        }
    }
}
