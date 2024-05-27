class Demo{
    Demo(){
        System.out.println("The Constructor shown");
    }
    void show(){
        System.out.println("The show method called");
    }
}
class annomyousObject{
    public static void main(String args[]){
        new Demo().show(); //The object have no name show we can't reuse it.
    }
}