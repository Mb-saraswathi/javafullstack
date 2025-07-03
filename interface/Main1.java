interface oneinterface 
{
    void message();
}
class oneclass implements oneinterface 
{
    public void message()  
    {
        System.out.println("hellooooo");
    }
}
class Main1 {
    public static void main(String[] args)
    {
        oneclass o = new oneclass();
        o.message();
    }
}