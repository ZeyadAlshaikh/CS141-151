 

public class Person  {
    //instance variables
    protected String name;
    protected int age;
   
    public Person(){
        
        this("NA", 0);

        System.out.println("No Argument constructure");
    }

    public Person(String name){
        this(name, 0);
        System.out.println("Name Argument constructure");
    }

    public Person(int age){
        this("NA",age);
        System.out.println("Age Argument constructure");
    }

    public Person( String name , int age){
        //System.out.println("ALL Argument constructure");

        this.name = name; 
        this.age = age; 
    }
   
    
    //methods 
    public String toString(){
        //return "Name: "+ name +" Age: "+ age;
        return String.format("Name: %s, Age:%d", name,age) ;
    }


    public void setName(String name){
        this.name = name; 
    }

    public String getName(){
        return name; 
    }

    public void setAge(int age){
        if( age > 0)
            this.age = age; 
        else 
         System.out.println("Age must be > 0 Please update");
    }

    public int getAge(){
        return age; 
    }

 
   
}
