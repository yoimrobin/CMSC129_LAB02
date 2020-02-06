/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab2GUI;
import java.util.ArrayList;
/**
 *
 * @author USER
 */
//check if input string is VALID
public class StrCheck {
    //move to check other state according to the input string
    public static char move(char s,char[] states,char ch,char[] inpA,char[] inpB){
    int index=0;
        //get the index of the state 
        for (int i = 0; i < states.length; i++){
		if (s==states[i]){
                    index=i;  
                    System.out.println("STATE "+s+" index "+index); 
                }
        }
        
     System.out.println("INP"+ch);   
    if(ch=='0'){
        //inpA 
        System.out.println(inpA[index]);
        return(inpA[index]);
    }
    if(ch=='1'){
        //inpB
        System.out.println(inpB[index]);
        return(inpB[index]);
    }
    return 'N';
    }
    
   public static void main(String[] args){
        //input 
        String inputStr="1001";
                    /* 0    1   2 */
        char StEndstate[]={'-','0','+'};
        char states[]={'A','B','C'};
        char inpA[]={'B', 'B', 'B'};
        char inpB[]={'A', 'C', 'A'};

  int i=0;
  char ch=inputStr.charAt(i);
  char s=states[0];
  
  for (i = 0; i <= inputStr.length(); ++i){
      s=move(s,states,ch,inpA,inpB);
      if(i == inputStr.length()){
      break;
      }
      else{
      ch = inputStr.charAt(i);  
      }
  }
  //check if valid
  int finalStateindex=0;
  //Get index of the final state
  for ( i = 0; i < StEndstate.length; i++){
		if ('+'==StEndstate[i]){
                    finalStateindex=i;  
                }
        }
  if(s==states[finalStateindex]){
    System.out.println("Valid");
  }
  else{
     System.out.println("Invalid"); 
  }
    }//main 
}//class
