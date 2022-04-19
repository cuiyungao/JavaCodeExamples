package src11.Generic;

public class GenericMethod {
    public <T> void sampleMethod(T[] array) {
        for(int i=0; i<array.length; i++) {
            System.out.println(array[i]);
        }
    }
    public static void main(String args[]) {
        GenericMethod obj = new GenericMethod();
        Integer intArray[] = {1, 2, 3, 4};
        obj.sampleMethod(intArray);
        String stringArray[] = {"Harry", "Ron", "Hermione"};
        obj.sampleMethod(stringArray);
    }
}