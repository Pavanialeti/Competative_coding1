//Constructor 
 class Student
  {
    int id;
    String name;
    Student(int i, String n) 
     {
        id = i;
        name = n;
       }
    void display() 
    {
     System.out.println(id + " " + name);
      }
    }

 public class Constructor
   {
    public static void main(String[] args) 
    {
      Student s1 = new Student(002, "Pavani");
      Student s2 = new Student(44, "Swathi");
      s1.display();
      s2.display();
      }
    }
