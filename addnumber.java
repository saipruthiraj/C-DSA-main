class add{
    int addition(int num1,int num2){
        int r= num1+num2;
        return r;
    }
}
class addnumber{
    public static void main(String args[]){
        add a=new add();
        System.out.println(a.addition(1,2));
    }
}