
public class TeaParty {

       public String welcome(String name, boolean isWoman, boolean isKnighted) {
      String output = "Hello";
      if(isKnighted) {
    	  output += " Sir " + name;
    	  return output;
      }
      if(isWoman == true) {
    	  output += " Ms. " + name;
    	  return output;
      }
      if(isWoman == false) {
    	  output += " Mr. " + name;
    	  return output;
      }
      return output;

       }

}
