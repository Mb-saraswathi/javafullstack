interface A
{
  default  void message()
  {
      System.out.println("default method");
  }
    
}


class B implements A
{
    
}

class Interfacewithdefault{
    public static void main(String[] args)
    {
        B O= new B();
        O.message();
    }
}