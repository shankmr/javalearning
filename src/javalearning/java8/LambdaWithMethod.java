package javalearning.java8;

public class LambdaWithMethod {
    public static void main(String[] args) {
        messageWithoutLambda();
        messageWithLambda();
    }

    public static void messageWithoutLambda(){
        MessageService messageService = new MessageService() {
            @Override
            public void printMessage(String message) {
                System.out.println("Message : " + message + " received");
            }
        };
        messageService.printMessage("Without lambda");
    }

    public static void messageWithLambda() {
        MessageService lambdaMessageService = message-> System.out.println("Message : "+message + " received");
        lambdaMessageService.printMessage("With lambda");
    }
}


interface MessageService {
    void printMessage(String message);
}