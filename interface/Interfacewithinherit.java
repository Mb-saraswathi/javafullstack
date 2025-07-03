interface parent
{
   void parent();
}
interface child extends parent
{
   void child();
}

class grandparent implements child
{
    public void  parent()
    {
        System.out.println("parent method");
    }
     public  void child()
    {
        System.out.println("child method");
    }
}

class Interfacewithinherit{
    public static void main(String[] args)
    {
        grandparent O= new grandparent();
        O.parent();
        O.child();
    }
}