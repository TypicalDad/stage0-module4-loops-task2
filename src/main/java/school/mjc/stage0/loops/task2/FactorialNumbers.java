package school.mjc.stage0.loops.task2;

public class FactorialNumbers {
    public void printFactorialRow(int printToInclusive) {
            long one = 1;
            int i = 1;
            System.out.println(i);
            if(printToInclusive==0){}
            else {
                while (i != printToInclusive) {
                    i += 1;
                    one *= i;
                    System.out.println(one);
                }
            }
    }
}

