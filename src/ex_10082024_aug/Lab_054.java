package ex_10082024_aug;

public class Lab_054 {
    //Requirement- u can get username but not password, u can set userame and password if u are admin
    public static void main(String[] args) {
        facebookLogin f= new facebookLogin("praju","1234");
        System.out.println(f.getUsername1());
        //f.setUsername1("Praju",true);
        //System.out.println(f.getUsername1());
        f.setPasswords("12345",true);
        System.out.println(f.setPasswords());
    }
}

    class facebookLogin
    {
        private String username1;
        private String passwords;

        public String getUsername1() {
                return username1;
        }

        public void setUsername1(String username1,boolean isAdmin) {
            if (isAdmin) {
                this.username1 = "praju@facebook.com";
            }else
            {
                System.out.println("not allowed");
            }
        }
        // removed get password bcoz of requirement that we cant get username.

        public void setPasswords(String passwords,boolean isAdmin1) {
            if (isAdmin1) {
                this.passwords = "456789";
            }else
            {
                System.out.println("not allowed");
            }
        }

        facebookLogin(String username1, String passwords)
        {
            this.username1= username1;
            this.passwords = passwords;

        }
    }

