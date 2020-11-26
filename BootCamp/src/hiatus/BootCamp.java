package hiatus;


@FunctionalInterface
interface Camp{
    String codeCamp(String academy, String selfTaught);
}


public class BootCamp {


    public static void main(String[] args) {
        Camp camp = (academy, selfTaught) ->{
            System.out.println("I have no bootcamp experience but i have tried signing up at " + academy + " but i am also a " + selfTaught + " software developer" );
            return "self taught developer";

        };

        String campDuration = camp.codeCamp("Life Long Learning","Yes, With 2 years of experience");
        System.out.println("Your status as a junior developer is classified : " + campDuration );




    }



}
