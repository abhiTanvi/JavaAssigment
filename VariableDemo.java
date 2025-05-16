public class VariableDemo {

    static String staticMessage = "I am a static variable.";

   
    String instanceMessage = "I am an instance variable.";

    
    void printMessages() {
        System.out.println("Instance Message: " + instanceMessage);
        System.out.println("Static Message: " + staticMessage);
    }


    public static void main(String[] args) {
        VariableDemo demo = new VariableDemo();

        demo.printMessages();
    }
}
