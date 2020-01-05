public class Function {
    public String func(int a, int b, String command){
        if(command.equals("+")){
            return String.valueOf(a+b);
        }
        if(command.equals("-")){
            return String.valueOf(a-b);
        }
        if(command.equals("/")){
            return String.valueOf(a/b);
        }
        if(command.equals("*")){
            return String.valueOf(a*b);
        }
        if(command.equals("%")){
            return String.valueOf(a%b);
        }
        if(command.equals("==")){
            return String.valueOf(a==b);
        }
        if(command.equals(">")){
            return String.valueOf(a>b);
        }
        if(command.equals("<")){
            return String.valueOf(a<b);
        }
        else {
            return "Wrong command";
        }
    }
}
