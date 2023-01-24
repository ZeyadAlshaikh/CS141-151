

public class Person {
    
    // attribute
   protected String name; //composition 
   private int age; 
   private DateOfBirth dob; 
   private final String id ; 

   private static int counter = 0; 

   // methods 
   
        //constructor
        public Person(){
            this("No name", 0,"0000000000", new DateOfBirth(1, 1, 1970)); 

           // System.out.println("No argument Constructor ");
        }
        public Person(String name){
            this(name, 0,"0000000000", new DateOfBirth(1, 1, 1970));
           // System.out.println("Constructor with name");
            
        }

        public Person(String name, int age, String id, DateOfBirth dob){
            //System.out.println("Constructor with name, age");
            this.name = name; 
            this.age = age; 
            this.id = id; 
            this.dob = dob; 
            counter++; 

        }

        public Person(Person p1){
            this(p1.name, p1.age, p1.id, p1.dob);
        }

   //- set & get 

   public void setName(String name ){
       this.name = name; 
   }

   public String getName(){
       return name; 
   }

public int getAge() {
    return age;
}

public void setAge(int age) {
    this.age = age;
}

public String getId() {
    
    return id;
}

public static int getCount(){
     
    return counter; 
}
@Override
public String toString() {
    return "Person [name=" + name + ", age=" + age + ", dob=" + dob + ", id=" + id + "]";
}


public void doSomthing(){
    System.out.println("[Person ] Doing somthing");
}
public DateOfBirth getDob() {
    return dob;
}
public static int getCounter() {
    return counter;
}
    



   

    
        
        // util methods 
}
