package ex_27072024;

public class Lab_041 {
    public static void main(String[] args) {
        //strings- It's a collection of homogeneous data type
        // Syntax: dataType[] arrayName;
        int[] my_Marks = {70,85,90,55,35};
        System.out.println(my_Marks.length);

        String[] studentName = {"Praju","Nilesh","Pratik"};
        System.out.println(studentName[0]);

        boolean[] food_categories = {true, false};
        System.out.println(food_categories.length);

        char[] letters = {'a','e','i','o','u'};
        System.out.println(letters[4]);

        //other type to declare an array: datatype[] array_name = new datatype[index_value_of_array];
        // default value of any index is 0
        int[] numbers1 = new int[3];
        System.out.println(numbers1[0]);
        numbers1[2] = 10;
        System.out.println(numbers1[1]);
        System.out.println(numbers1[2]);


    }
}
