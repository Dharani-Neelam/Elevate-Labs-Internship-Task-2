import java.util.*;

class Student{
  private int id;
  private String name;
  private int marks;
  public Student(int id,String name,int marks){
    this.id=id;
    this.name=name;
    this.marks=marks;
  }
  public int getId(){
    return id;
  }
  public void setId(int id){
    this.id=id;
  }
  public String getName(){
    return name;
  }
  public void setName(String name){
    this.name=name;
  }
  public int getMarks(){
    return marks;
  }
  public void setMarks(int marks){
    this.marks=marks;
  }
  @Override
  public String toString(){
    return "Student[id="+id+", name="+name+" ,marks="+marks+"]";
  }
}


public class SRMS {
  public static void main(String[] args) {
    ArrayList<Student> students=new ArrayList<>();
    Scanner sc = new Scanner(System.in);
    while (true) {
      System.out.println("1. Add");
      System.out.println("2. View");
      System.out.println("3. Update");
      System.out.println("4. Delete");
      System.out.println("5. Exit");
      System.out.println("Choose an option");

      int opt=sc.nextInt();

      switch (opt) {
        case 1:// Adding students 
          System.out.println("Enter id:");
          int id=sc.nextInt();
          sc.nextLine();
          System.out.println("Enter name:");
          String name=sc.nextLine();
          System.out.println("Enter marks:");
          int marks=sc.nextInt();

          students.add(new Student(id, name, marks));
          System.out.println("Student added");

          break;



        case 2:
          if (students.isEmpty()) {
            System.out.println("No fields found");
          }
          else{
            Iterator<Student> io=students.iterator();
            while (io.hasNext()) {
              Student ele=io.next();
              System.out.println(ele);
            }
          }
          break;
        

        case 3:
          //Updating 
          System.out.println(" Enter  Id to Update:");
          int iD=sc.nextInt();
          boolean found=false;
          
          for(Student s : students){
            if(s.getId()==iD){
              sc.nextLine();
              System.out.println("Enter new Name:");
              s.setName(sc.nextLine());
              System.out.println("Enter new marks:");
              s.setMarks(sc.nextInt());
              System.out.println("Student Updated");
              found=true;
              
            }

          }
          if(!found){
            System.out.println("Student not found");
          }
          break;

        case 4:
          //Delete

          System.out.println("Enter Id to delete:");
          int Id=sc.nextInt();
          Iterator<Student> ob=students.iterator();
          boolean removed=false;
          while (ob.hasNext()) {
            Student s=ob.next();
            if(s.getId()==Id){
              ob.remove();
              removed=true;
            
            }
            
          }
          if(removed){
            System.out.println("Student deleted");
          }
          else{
            System.out.println("Student not found");
          } 
          break;
        
        case 5:
          System.out.println("Completed,you can happily exit...hahaha ...GoodBye SweetHeart!!!");
          return;

        default :
          System.out.println("You have choosen Invalid choice..Sorry SweetHeart!!!");
          break;
      }  
    }
  }
}