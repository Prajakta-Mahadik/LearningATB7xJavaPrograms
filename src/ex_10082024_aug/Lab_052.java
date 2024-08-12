package ex_10082024_aug;

public class Lab_052 {

    public static void main(String[] args) {
        VWOLogin vwoLogin = new VWOLogin("Prajakta", "praju123");
        System.out.println(vwoLogin.userName);
        System.out.println(vwoLogin.password);
    }

}

      class VWOLogin{
        public String userName;
        public String password;

        public VWOLogin(String userName, String password)
        {
            this.userName=userName;
            this.password=password;
        }

    }

