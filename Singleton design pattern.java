class A{
    static A obj = new A();
     String str="Successful";
    private A(){
        
    }
    public static A getObj(){
        return obj;
    }
}
class Singleton{
    public static void main(String[] args){
        A obj1=A.getObj();
        System.out.println(obj1.str);
        
    }
}