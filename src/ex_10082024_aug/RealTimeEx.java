package ex_10082024_aug;

public class RealTimeEx {
    public static void main(String[] args) {
        BaseClass b= new TestCase();  //Dynamic Dispatch(class loaded of father(BaseClass) and object will be created for son/
                                     //sub-class(TestCase)
        b.OpenBrowser();
        b.setBrowserName("Opera", true);
        System.out.println(b.getBrowserName());
        b.CloseBrowser();

        //TestCase t= new TestCase();

    }

}

class TestCase extends BaseClass{
    public String browserName="Edge";

    TestCase()
    {
       super();
        System.out.println("This is child class browser name: " + this.browserName);
    }

    @Override
    void OpenBrowser()
    {
        System.out.println("Opening the Default Browser: ");
        super.CloseBrowser();
    }

}

class BaseClass{
    private String browserName= "Chrome";

    public String getBrowserName() {
        return browserName;
    }

     public void setBrowserName(String browserName, boolean isAdmin) {
        if(isAdmin) {
            this.browserName = browserName;
        }else
        {
            System.out.println("Not Allowed");
        }
    }

    void OpenBrowser()
  {
     System.out.println("Opening the Default Browser: " + browserName);
  }

  void OpenBrowser(String browserName)
  {
      System.out.println("Open the browser: " + browserName);
  }

  void CloseBrowser()
  {
      System.out.println("Closing the Browser");
  }

  BaseClass()
  {
      System.out.println("DC");
  }

  BaseClass(String broswerName)
  {
      System.out.println("PC");
  }
}
