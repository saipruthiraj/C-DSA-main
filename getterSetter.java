import java.util.Scanner;
class Human{
   private  int age=12;
     String name="SAI";
    public int getAge(int password){
        if(password==678){
            return age;
      }
      else{
        System.out.println("Wrong password");
        return 0;
      }
    }
}

class getterSetter{
    public static void main(String args[]){
        Human ob=new Human();
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter password: ");
        int pass=sc.nextInt();
        System.out.println(ob.getAge(pass));

    }
}