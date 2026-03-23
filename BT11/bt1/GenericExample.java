public class GenericExample {
    
    public static <E> void printArray(E[] array) {
        for (E element : array) {
            System.out.print(element + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Integer[] intArray = {1, 2, 3, 4};
        String[] strArray = {"Java", "Python", "C++"};

        System.out.print("Integer array: ");
        printArray(intArray);

        System.out.print("String array: ");
        printArray(strArray);
    }
}