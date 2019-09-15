package invokeSort;

public class HelloWorld {

    static {
        System.out.println("static");
    }
    private String message;
    public void setMessage(String message){
        this.message  = message;
    }
    private void getMessage(){
        System.out.println("Your Message : " + message);
    }
}