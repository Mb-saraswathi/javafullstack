interface A
{
    void message();
    
}
interface B
{
    void message();
    
}

class C implements A,B
{
    public void message()  
    {
        System.out.println("SAME METHOD OF A AND B");
    }

}

class Twointerfacewithsamemethod{
    public static void main(String[] args)
    {
        C O= new C();
        O.message();
        O.message();
    }
}