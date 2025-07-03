interface oneinterface 
{
    void message1();
    
}

class oneclass implements oneinterface 
{
    public void message1()  
    {
        System.out.println("hellooooo");
    }

}

class Interfacewithonemethod{
    public static void main(String[] args)
    {
        oneclass o = new oneclass();
        o.message1();
            

    }
}