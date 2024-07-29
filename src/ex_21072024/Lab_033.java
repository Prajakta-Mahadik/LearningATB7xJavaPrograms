package ex_21072024;

public class Lab_033 {
    public static void main(String[] args) {
        for (int praj=5 ; praj>=0 ; praj--)
        {
            System.out.println(praj);
        }


        for(int _123=0; _123<=3; _123++)
        {
            if(_123 <= 3)
            {
                System.out.println(_123);
                continue;
            }
        }

        for(int _123=0; _123<=3; _123++)
        {
            if(_123 > 3)
            {
                System.out.println(_123);
                continue;
            }
        }

        for(int _fig=0; _fig<=3; _fig++)
        {
            if(_fig >= 1)
            {
                System.out.println(_fig);
                break;
            }
        }
    }
}
