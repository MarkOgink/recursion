public class Sum {
    static int recursive(int number){
        if(number <= 1){
            return number;
        }
        else {
            return number + recursive(number-1);
        }
    }
    static int nonRecursive(int number){
        int sum = 0;
        for (int i = 0; i < number; i++) {
            sum = sum + number - i;
        }
        return sum;
    }
}
