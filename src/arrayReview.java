public class arrayReview {
    public static void main(String[] args) {
        double doubleArray[];
        doubleArray = new double[10];
       printArray(doubleArray);
    }
    public static void printArray(double[] anyArray) {
        for (int i = 0; i < anyArray.length; i++) {
            anyArray[i] = i;
        }

        for (int i = 0; i < anyArray.length; i++) {
            System.out.println("Value of doubleArray[" + i +"] is: " + anyArray[i]);

        }
    }

}