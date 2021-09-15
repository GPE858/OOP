package array;

public class WorkWithArray {
    public void evenOrOdd(int[] array) {

        int count = 0;
        int count1 = 0;
        for (int i = 0; i < array.length; i++)
            if (array[i] % 2 == 0) {
                count++;
            } else {
                count1++;
            }
        if (count > count1) {
            System.out.println("Even");
        } else if (count < count1) {
            System.out.println("Odd");
        } else {
            System.out.println("Equal");
        }
    }

    public void fizzBazz(int[] array) {
        int count1 = 0;
        int count2 = 0;
        int count3 = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 3 == 0) {
                System.out.println("Fizz");
            }
            if (array[i] % 5 == 0) {
                System.out.println("Bazz");
            }
            if (array[i] % 15 == 0) {
                System.out.println("FizzBazz");
            } else {
                System.out.println(array[i]);
            }
        }
    }

    public void findMinimum(int[] array) {
        int minimum = array[0];
        for (int i = 0; i < array.length; i = i + 1) {
            if (array[i] < minimum) {
                minimum = array[i];
            }
        }
        System.out.println(minimum);

    }

    public void sortArray(int[] array) {

        int storage = 0;

        for (int i = 0; i < array.length - 1; i++) {

            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[i]) {
                    storage = array[i];
                    array[i] = array[j];
                    array[j] = storage;
                }
            }
        }
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }


    public void bubbleSort(int[] array) {

        boolean isSort = false;
        int count = 0;
        int storage = 0;
        while (!isSort) {

            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] > array[i + 1]) {
                    storage = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = storage;
                    count++;
                }
            }
            if (count == 0) {
                isSort = true;
            } else {
                count = 0;
            }
        }
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }

    public void reversString(String text) {

        char count = 0;
        char[] array = text.toCharArray();

        for (int i = 0; i < array.length / 2; i++) {
            count = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = count;



        }
        String text1 = new String(array);
        System.out.println(text1);
    }

    public  void polyndrome(String text){
        char [] array = text.toCharArray();
    boolean x1=false;
    boolean x2=false;

            for (int i = 0; i<array.length/2;i++){

                if (array[i]==array[array.length-1-i]){
                    x1= true;
                }else { x1=false;}
            }
        if(x1==true){
               System.out.println("poly");
            } else {
            System.out.println("not poly");
    }}}



    



