package seleniumPackage;

public class Banking_Domain_Class implements Banking_Domain_Interface,Banking_Domain_Interface_2 {
    public static void main(String[] args) {
        Banking_Domain_Class bd = new Banking_Domain_Class();
        Banking_Domain_Interface bi = new Banking_Domain_Class();
        Banking_Domain_Interface_2 bi2 = new Banking_Domain_Class();

        bd.Method2();
        bi2.Method1();
        bi.login_user();
    }


    @Override
    public void crate_user_method() {
        System.out.println("crate_user_method is created");
    }

    @Override
    public void login_user() {
        System.out.println("login_user is created");
    }

    @Override
    public void Health_Check() {
        System.out.println("Health_Check is created");
    }

    public void Restart(){
        System.out.println("Restart is created");
    }

    @Override
    public void Method1() {
        System.out.println("Method1 is created");
    }

    @Override
    public void Method2() {
        System.out.println("Method2 is created");
    }

    public void Banking_Domain_Class_method(){
        System.out.println("Banking_Domain_Class_method is created");
    }
}
