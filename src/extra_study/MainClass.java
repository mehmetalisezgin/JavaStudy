package extra_study;

class A
{
   
    {
        System.out.println("THIRD");
    }
}
 
class B extends A
{
   
    {
        System.out.println("SECOND");
    }
}
 
class C extends B
{
    static
    {
        System.out.println("FIRST");
    }
}
 
public class MainClass
{
    public static void main(String[] args)
    {
        B c = new C();
    }
}





