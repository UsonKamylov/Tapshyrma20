import java.util.EmptyStackException;

public class Main {
    public static void main(String[] args) throws Exception {

       try (Car car=new Car()){
           car.driver();
       }catch (RuntimeException ignore){

       }


    }


}