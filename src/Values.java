public class Values {

    private int a;
    private int b;
    private String command;
    private String result = "empty";

    public Values() {
    }

    public Values(int a, int b, String command) {
        this.a = a;
        this.b = b;
        this.command = command;
    }

    public void calculate(){
        System.out.println("Calculate in thread : " + Thread.currentThread().getName());

        if(command.equals("+")){
            result = String.valueOf(a+b);
        }
        else if(command.equals("-")){
            result = String.valueOf(a-b);
        }
        else if(command.equals("/")){
            result = String.valueOf(a/b);
        }
        else if(command.equals("*")){
            result = String.valueOf(a*b);
        }
        else if(command.equals("%")){
            result = String.valueOf(a%b);
        }
        else if(command.equals("==")){
            result = String.valueOf(a==b);
        }
        else if(command.equals(">")){
            result = String.valueOf(a>b);
        }
        else if(command.equals("<")){
            result = String.valueOf(a<b);
        }
        else {
            result = "Wrong command";
        }
    }

    public String getResult() {
        System.out.println("Thread for result : " + Thread.currentThread().getName());
        return result;
    }

    public String getCommand() {
        return command;
    }

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }
}
