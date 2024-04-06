

public class OwnException {
    public static void main(String[] args) {
        fun();
    }
    static void fun() {
        try {
            throw new MainBalanceException();
        } catch (MainBalanceException e) {
            System.out.println("min balance exception");
        }
    }
}
class MainBalanceException extends  Exception{
    public  String toString(){
        return "Min balance should be above";
    }
}