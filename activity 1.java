class Parent
{
    int age,id;
    String name;
    void naming(String name)
    {
        System.out.println("Name: "+name);
    }
}

class Child extends Parent
{
    void age(int age)
    {
        System.out.println("Age: "+age);
    }
}
class Main
{
    public static void main(String [] er )
    {
        Child c=new Child();
        c.naming("John");
        c.age(20);
    }
   
}