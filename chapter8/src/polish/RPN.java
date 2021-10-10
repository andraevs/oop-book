package polish;

import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class RPN {
  public static void main(String[] args) {
    List<String> in=List.of("3","4","5","*","-");
    System.out.println(rpn(in));
  }


  public static double rpn(List<String> tokens){
    Deque<Double> stack = new LinkedList<>();
    for(String s:tokens){
      if(isDouble(s))
        stack.push(Double.parseDouble(s));
      else {
        Double op1 = stack.pop();
        Double op2 = stack.pop();
        switch (s) {
          case "+": stack.push(op1+op2); break;
          case "-": stack.push(op1-op2); break;
          case "/": stack.push(op1/op2); break;
          case "*": stack.push(op1*op2); break;
        }
      }
      }
    return stack.pop();
    }

    public static boolean isDouble(String s){
    try {
      Double.parseDouble(s);
    }
    catch (NumberFormatException e){
      return false;
    }
    return true;
  }
}
