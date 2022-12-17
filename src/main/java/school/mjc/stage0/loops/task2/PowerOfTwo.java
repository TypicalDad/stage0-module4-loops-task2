package school.mjc.stage0.loops.task2;

public class PowerOfTwo {
    public void printPower(int power) {
                    int one = 0;
            int result;
            while (one != power){
                one+=1;
                result = one *one;
                if(result<0){
                    System.out.println("too much power");
                    break;
                }
                System.out.println(result);
            }

    }
}
