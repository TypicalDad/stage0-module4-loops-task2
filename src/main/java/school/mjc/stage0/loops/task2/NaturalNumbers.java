package school.mjc.stage0.loops.task2;

public class NaturalNumbers {
    public void naturalNumbersPrinter(int lastPrinted) {
        int zero = -1;
        while (zero!=lastPrinted){
            zero += 1;
            System.out.println(zero);
        }
    }
}
