class calculator{
    int add(int n1,int n2){
        return n1+n2;
    }
        
    int add(int n1,int n2,int n3){
        return n1+n2+n3;
    }
        
}
class calculation{
    public static void main(String args[]){
        calculator c= new calculator();
        System.out.println(c.add(1,2,3));
        System.out.println(c.add(1,2));
    }
}