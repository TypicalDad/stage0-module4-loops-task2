package school.mjc.stage0.loops.task2;

public class EvenNumbersPrinter {
    public void printEvenNumbers(int printTillInclusive) {
        int zero = -2;
        while (zero!=printTillInclusive){
            zero += 2;
            System.out.println(zero);
    }
}
