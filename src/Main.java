import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int a;
        int b;
        String userCommand;
        Scanner scanner = new Scanner(System.in);
        //Function function = new Function();

        System.out.println("Enter value for A : ");
        a = scanner.nextByte();

        System.out.println("Enter value for B : ");
        b = scanner.nextByte();

        System.out.println("Enter one of next commands: '+', '-', '*', '/', '%', '==', '<', '>' ");
        userCommand = scanner.next();

        Values values = new Values(a, b, userCommand);

        System.out.println("A = " + values.getA());
        System.out.println("B = " + values.getB());
        System.out.println("Command : " + values.getCommand());

        FunctionThread functionThread = new FunctionThread(values);
        functionThread.start();
        try {
            functionThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Result = " + functionThread.returnVal().getResult());

    }
}
