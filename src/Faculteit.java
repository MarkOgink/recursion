public class Faculteit {
    public static void main(String[] args) {
        int number = 2;
        System.out.println(nonRecursive(number));
        System.out.println(recursive(number));
    }

    private static int recursive(int number) {
        if(number == 1){
            return number;
        }
        else {
            return number * recursive(number - 1);
        }
    }

    private static int nonRecursive(int number) {
        int sum = number;
        for (int i = 1; i< number; i++){
            sum = sum * (number - i);
        }
        return sum;
    }
}
