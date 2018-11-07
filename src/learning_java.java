import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;


// notes for maggie:
// Java is object oriented
// Java is a static you have to declare what each variable will hold
// Java has a garbage collector so it will take care of dereferenced objects

public class learning_java {

    public static void main(String [] args){

     // the string args takes arguments from the command line for the function
            // void - the main function doesnt return anything
            // static - means you only have one of them , you cannot have multiple mains therefore it is static
            // public - other function can access it outside of this java file
        //

         //test();
         //System.out.println("Substring of nutmeg: " + making_strings());
        //list_examples();
        //array_examples();
        loop_examples();
    }

    private static void test() { // private means it can only be accessed within the class that it was created in
        //this case only main can see test
        System.out.println("hi");
    }


    public static String making_strings(){//String is the return type for the function can be public
        String long_dog = new String("nutmeg");
        String short_dog = "chance";
        String test_dog = long_dog;
        String imposter = new String("chance");
        //testing equality of strings
        System.out.println("Name of long dog: " + long_dog);
        System.out.println("Name of short dog: " + short_dog);
        System.out.println("Name of test dog: " + test_dog);
        System.out.println("Name of imposter dog: " + imposter);
        if (short_dog == imposter){
            System.out.println("This will never print");
        }
        else if (test_dog == short_dog)
        {
            System.out.println("This will work because == with strings refers to pointers");
        }
        else if (short_dog.equals(imposter))
        {
            System.out.println("Java checks string equality with .equals");
        }
        //concatination
        String merge_dog = long_dog + short_dog;
        System.out.println("Concatenation of strings: " + merge_dog);
        //substrings
        String substring = long_dog.substring(0,3); // doesnt do the last one so this does 0,1,2
        return substring;
        //strings are immutiable everytime you do something to a string it returns a new one
        //thats why you do not have to declare memory for them
    }


    public static void list_examples(){
        List array = new ArrayList();
        List array2 = new ArrayList();
        array.add("hello");
        array.add(1, "goodbye");
        System.out.println("Array list" + array);
        array2.addAll(array);
        System.out.println("Array 2 list" + array2);
        int index = array2.indexOf("goodbye");
        System.out.println("Index of goodbye in array: " + index);
    }


    private static void array_examples(){
        int intArray[]; // must allocate memory for the array
        intArray = new int[10];
        String strArray[] = new String[2];
        char charArray[] = new char[]{'a', 'b', 'c', 'd', 'e'};
        for (int i = 0; i < charArray.length; i++){
            System.out.println("Element at index " + i + " : " + charArray[i]);
        }
    }


    private static void loop_examples(){
        // while loop
        Boolean done = false;
        int x = 0;
        while(!done){
            if (x > 4){
                done = true;
            }
            else{
                x++;
                System.out.println(x);
            }
        }
        System.out.println();
        //for loop
        for(int y = 0; y < 10; y++){
            System.out.println(y);
        }

        String Array[] = new String[]{"hello", "this", "is", "an", "enhanced", "for loop"};
        //for each loop
        for (String m : Array)
        {
            System.out.println(m);
        }
        //do while loop
        int y = 4;
        do {
            y--;
            System.out.println(y);
        }
        while (y > 0);
    }


}
