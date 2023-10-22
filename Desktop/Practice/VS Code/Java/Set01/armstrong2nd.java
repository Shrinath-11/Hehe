package Set01;

public class armstrong2nd {
    public static void main(String[] args) {

        int num = 163;
        int store = 0;
        int temp = num;

        // Calculate the number of digits without Math.log10
        int numDigits = 0;
        int numCopy = num;
        while (numCopy != 0) {
            numCopy /= 10;
            numDigits++;
        }

        numCopy = num; // Reset numCopy

        while (numCopy != 0) {
            int remainder = numCopy % 10;
            store += Math.pow(remainder, numDigits);
            numCopy /= 10;
        }

        if (temp == store) {
            System.out.println("Armstrong number");
        } else {
            System.out.println("Not an Armstrong number");
        }
    }
}
