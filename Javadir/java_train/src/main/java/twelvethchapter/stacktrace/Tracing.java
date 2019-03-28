package twelvethchapter.stacktrace;

import java.util.LinkedList;

public class Tracing {
    private static Tracing trace = new Tracing();
    private static LinkedList<Integer> stack = new LinkedList<>();

    public void push(Integer i){
        stack.addFirst(i);
    }

    public Integer peek(){
        return stack.element();
    }

    public Integer pop(){
        return stack.removeFirst();
    }

    public void myMethod(){
        try{
            throw new Exception();
        }catch (Exception e){
            for (StackTraceElement temp : e.getStackTrace()){
                System.out.println(temp.getClassName()+"."+temp.getMethodName());
            }
        }
    }

    public void callingMyMethod(){
        trace.myMethod();
    }


    public static void main(String[] args) {
        trace.callingMyMethod();

        for (int i = 0; i < 4; i++){
            trace.push(i);
        }


        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());


    }
}
