interface oneinterface 
{
    void message1();
    void message2();
}

class oneclass implements oneinterface 
{
    public void message1()  
    {
        System.out.println("hellooooo");
    }
    public void message2()  
    {
        System.out.println("hiiiiiii");
    }
}

class Interfacewithtwomethods{
    public static void main(String[] args)
    {
        oneclass o = new oneclass();
        o.message1();
                o.message2();
    }
}