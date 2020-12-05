package company.com;
public class Main {
    public static void main(String[] args) {
        A a=new A();
        B b=new B();
        A c=new C();

        try {
            b.arunca2();
        }
        catch (Exceptie3 e)
        {
            System.out.println(e.getMessage());
        }
        catch (Exceptie2 e)
        {
            System.out.println(e.getMessage());
        }
        catch (Exceptie1 e)
        {
            System.out.println(e.getMessage());
        }

    }
}
