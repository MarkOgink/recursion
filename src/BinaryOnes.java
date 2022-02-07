public class BinaryOnes {
    /*Write a recursive method that returns the number of 1s in the binary
    representation of N. Use the fact that this number equals the number
    of 1s in the representation of N/ 2, plus 1, if N is odd.*/
    public int numberOfOnesInBinaryRepresentation(int n){
        if(n == 0){
            return 0;
        }
        if(n == 1){
            return 1;
        }
        if (n%2 == 0){
            return numberOfOnesInBinaryRepresentation(n/2);
        }
        else return 1 + numberOfOnesInBinaryRepresentation((n-1)/2);
    }
}
