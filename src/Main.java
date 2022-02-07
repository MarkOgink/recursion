public class Main {
    public static void main(String[] args) {
        BinaryOnes binaryOnes = new BinaryOnes();
        StringReverse stringReverse = new StringReverse();
        int number = 3;
        System.out.println(Factorial.nonRecursive(number));
        System.out.println(Factorial.recursive(number));
        System.out.println(Sum.nonRecursive(number));
        System.out.println(Sum.recursive(number));
        System.out.println(binaryOnes.numberOfOnesInBinaryRepresentation(3));
        System.out.println(stringReverse.reverse("parterretrap"));
    }
}
