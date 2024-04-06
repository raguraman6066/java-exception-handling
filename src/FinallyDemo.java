public class FinallyDemo {
    public static void main(String[] args) {
        /*
        * file reader using throw we can throw exception
        * f.close not executing so we use finally while using throw and throws
        *
        * we can use try and finally without catch..bez we are throwing exception, not handling here
        * */

        try{

        }finally {
            System.out.println();
        }
        System.out.println();
    }

    /*
    * without finally to close the file . we can use try with resources
    * try(FileReader f=new FileReader("my.txt"){
    * //try will take responsibility resource closing without handling , we just throw the exception
    * }
    * */
}
