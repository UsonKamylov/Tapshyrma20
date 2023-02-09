import java.util.EmptyStackException;

public class Main {
    public static void main(String[] args) throws Exception {

       try (Car car=new Car()){
           driver();
       }catch (RuntimeException ignore){

       }


    }

    private static void driver() {
        System.out.println("машина журуп жатат");
    }
}