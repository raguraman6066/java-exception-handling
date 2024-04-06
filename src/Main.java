public class Main {
    public static void main(String[] args) {
        int a=10,b=0;
        try{
            System.out.println("start");  System.out.println("result "+a/b);
        }
           catch (Exception e){
            System.out.println("exception occurred "+e);//exception occurred java.lang.ArithmeticException: / by zero
        }
        //if exception happened program will stop above not execute following code
        System.out.println("welcome!");
    }
}

/*
* exceptions are run time errors
* syntax(grammar error) and logical(not giving crt result) error - face by programmer,
* runtime error - face by users (invalid input and resource not found , internet connection)
* program will start in runtime while exception, should be handled by programmer to show the message
* to handle run time error - this is exception handling
* */

/*
* checked exception - we must handle - compiler forced us to handle
* unchecked exception - optional
* */