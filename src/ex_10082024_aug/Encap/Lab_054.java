package ex_10082024_aug.Encap;

public class Lab_054 {
    //Requirement- u can get username but not password, u can set userame and password if u are admin
    public static void main(String[] args) {
        facebookLogin f= new facebookLogin("praju","1234");
        System.out.println(f.getUsername1());
        f.setUsername1("",true);
        System.out.println(f.getUsername1());
        System.out.println(f.getPasswords());
        f.setPasswords("Praju1",true);
        System.out.println(f.getPasswords());

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

        public String getPasswords() {
            return passwords;
        }

        public void setPasswords(String passwords,boolean isAuth) {
            if(isAuth) {
                this.passwords = passwords;
                System.out.println("Allowed");
            }else {
                System.out.println("Not Allowed!");
            }
        }

        facebookLogin(String username1, String passwords)
        {
            this.username1= username1;
            this.passwords = passwords;

        }
    }

