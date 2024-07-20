package ex_20072024;

public class Lab_026 {
    public static void main(String[] args) {
        int a = 10;
        /*switch(a){
            case 1,2,3:
                System.out.println("You are present");
                break;
            case 4,5,6:
                System.out.println("You are absent");
                break;
            default:
                System.out.println("none");
        }*/

        switch (a){
            case 1,2,3 -> System.out.println("You are present");
            case 4,5,6 -> System.out.println("You are absent");
            default -> System.out.println("none");
        }
    }
}
