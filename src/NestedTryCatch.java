public class NestedTryCatch {
    public static void main(String[] args) {
        int a=10;
        int b=0;
        int arr[]={1,2,3};
        try{

            try{
                System.out.println(a/2);
            }catch (Exception e){
                System.out.println("divide by zero exception");
            }
            System.out.println(arr[3]);
        }catch (ArithmeticException e){//this should be sub class
            System.out.println("Division by zero");
        }catch (ArrayIndexOutOfBoundsException e){//this should be super class
            System.out.println("Array index out of bound");
        }
        System.out.println("welcome");
    }
}
