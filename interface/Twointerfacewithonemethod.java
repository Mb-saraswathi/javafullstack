interface oneinterface 
{
    void message1();
    
}
interface twointerface 
{
    void message2();
    
}

class thirdinterface implements oneinterface,twointerface
{
    public void message1()  
    {
        System.out.println("call interface1");
    }
    public void message2()  
    {
        System.out.println("call interface2");
    }

}

class Twointerfacewithonemethod{
    public static void main(String[] args)
    {
        thirdinterface O= new thirdinterface();
        O.message1();
        O.message2();
    }
}