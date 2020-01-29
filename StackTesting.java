import java.util.Stack;
/*check balance parenthesis problem*/
public class StackTesting {
	
	 static String isBalanced(String s) {
	        Stack<Character> balanceCheck =new Stack();
           
	        for(int i=0;i<s.length();i++){
	        	if(balanceCheck.isEmpty()) {
	              balanceCheck.push(s.charAt(i));
	              ++i;
	        	}
	            switch(s.charAt(i)){
	                case '{':
	                 if(balanceCheck.peek()=='}')
	                     balanceCheck.pop();
	                 else{
	                     balanceCheck.push('{');
	                 } 
	                 break;
	                 case '(':
	                 if(balanceCheck.peek()==')')
	                     balanceCheck.pop();
	                 else{
	                     balanceCheck.push('(');
	                 } 
	                 break; 
	                 case '[':
	                 if(balanceCheck.peek()==']')
	                     balanceCheck.pop();
	                 else{
	                     balanceCheck.push('[');
	                 } 
	                 break;

	                 case ')':
	                 if(balanceCheck.peek()=='(')
	                     balanceCheck.pop();
	                 else{
	                     return "NO";
	                 } 
	                break;
	                case '}':
	                 if(balanceCheck.peek()=='{')
	                     balanceCheck.pop();
	                 else{
	                     return "NO";
	                 } 
	                 break; 
	                case ']':
	                 if(balanceCheck.peek()=='[')
	                     balanceCheck.pop();
	                 else{
	                     return "NO";
	                 } 
	                 break;   
	            }
	        }
              

	         if( balanceCheck.isEmpty()){
	             return "YES";

	         }
	         return "NO";


	    }

	public static void main(String[] args) {
		 
 
		System.out.println(StackTesting.isBalanced("{(([])[])[]}[]"));
		 
	}

}
