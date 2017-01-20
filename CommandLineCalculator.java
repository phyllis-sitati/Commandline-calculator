public class CommandLineCalculator{
  public static void main(String[]args){
	  int result =0;
  //Implementing add functionality
      if(args[0].equalsIgnoreCase("add")){
      for(int i=1; i<args.length; i++){
        result =result+Integer.parseInt(args[i]);}
      System.out.println(result);
      }
      else if(args[0].equalsIgnoreCase("sub")){
        result = Integer.parseInt(args[1]);
        for(int i=2; i<args.length; i++){
        result =result- Integer.parseInt(args[i]);
         }
        System.out.println(result);
      }
    
  }
}