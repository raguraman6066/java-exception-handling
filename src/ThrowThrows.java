public class ThrowThrows {
    public static void main(String[] args) {
        method1();
    }

    public static void method1(){
        int a = 0;
        try {
            a = area(10,-1);
        } catch (Exception e) {
            System.out.println(e.toString());
        }
        System.out.println(a);
    }
    public static int area(int l,int b) throws Exception{
        if(l<0||b<0){
            throw new Exception("Can't calculate, enter valid l and b");
        }
        int area=l*b;
        return  area;
    }
}
