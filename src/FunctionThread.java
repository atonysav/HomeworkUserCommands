public class FunctionThread extends Thread {

    private Values values;

    FunctionThread( Values val) {
        super("Functional Thread");
        this.values = val;
    }

    public void run(){
        values.calculate();
        //System.out.println(values.getResult());
    }

    public Values returnVal(){
        return values;
    }
}
