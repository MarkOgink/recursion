public class Factorial {

    static int recursive(int number) {
        if(number <= 1){
            return number;
        }
        else {
            return number * recursive(number - 1);
        }
    }

    static int nonRecursive(int number) {
        int sum = number;
        for (int i = 1; i< number; i++){
            sum = sum * (number - i);
        }
        return sum;
    }
}
