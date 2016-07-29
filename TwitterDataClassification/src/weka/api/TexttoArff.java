package weka.api;
import java.io.*;
public class TexttoArff {
	 public static void main(String [] args) {

	        // The name of the file to open.
	        String rfile = "Result.txt",wfile="probility",line=null;;
	        String heavystudy[]={"hour"," homework"," exam"," day"," Class"," work","negtoken"," problem"," study"," week"," toomuch"," all","lab"," still"," out"," time"," page"," library"," spend"," today","long","school"," due","engineer"," already"};
	        String lacksocial[]={"negtoken"," Friday"," homework"," out"," study","work"," weekend"," lite"," class"," engineer"," exam","drink"," break"," Saturday"," people"," social"," lab","spend"," tonight"," watch"," game"," miss"," party","	sunny"," beautitul"
};
	        String negative[]={"hate"," ****"," shit"," exam"," negtoken"," week"," class","hell"," engineer"," suck"," study"," hour"," homework","time"," equate"," FML"," lab"," sad"," bad"," day"," teel"," tired","damn"," death"," hard"};
	        String sleep[]={"sleep"," hour"," night"," negtoken"," bed"," allnight","exam"," homework"," nap"," cottee"," time"," study","more"," work"," class"," dream"," ladyengineer"," late","week"," day"," long"," morning"," wake"," awake"," no-sleep"};
	        String diversity[]={"girl"," class"," only"," negtoken"," guy"," engineer"," Asia","professor"," speak"," English"," female"," hot"," kid","more"," toomuch"," walk"," people"," teach"," understand"," Chick"," China"," foreign"," out"," white"," bIack"};
	        try 
	        {
	            // Assume default encoding.
	            FileWriter fileWriter =
	                new FileWriter(wfile);

	            // Always wrap FileWriter in BufferedWriter.
	            BufferedWriter bufferedWriter =
	                new BufferedWriter(fileWriter);

	            // Note that write() does not automatically
	            // append a newline character.
	            bufferedWriter.write("%1.Title Arff File");
	            bufferedWriter.newLine();
	            bufferedWriter.write("%2. Author Rakesh Ray");
	            bufferedWriter.newLine();
	            bufferedWriter.write("@ATTRIBUTE tweets STRING");
	            bufferedWriter.newLine();
	            bufferedWriter.write("@ATTRIBUTE class {heavy study load,lack of social engagement,negative emotions,sleep problems,diversity issues,others}");
	           
	            // Always close files.
	            bufferedWriter.close();
	        }
	        catch(IOException ex)
	        {
	            System.out.println(
	                "Error writing to file '"
	                + wfile + "'");
	            // Or we could just do this:
	            // ex.printStackTrace();
	        }
	        
	    
	 try 
	 {
         // FileReader reads text files in the default encoding.
         FileReader fileReader = new FileReader(rfile);

         // Always wrap FileReader in BufferedReader.
         BufferedReader bufferedReader = new BufferedReader(fileReader);

         while((line = bufferedReader.readLine()) != null)
         {
        	 int d=0;
        	 for(int i=0;i<heavystudy.length;i++)
        	 {
        		 if(line.contains(heavystudy[i]))
        			 d=1;break;
        	 }
        	 for(int i=0;i<lacksocial.length;i++)
        	 {
        		 if(line.contains(lacksocial[i]))
        			 d=2;break;
        	 }
        	 for(int i=0;i<negative.length;i++)
        	 {
        		 if(line.contains(negative[i]))
        			 d=3;break;
        	 }
        	 for(int i=0;i<sleep.length;i++)
        	 {
        		 if(line.contains(sleep[i]))
        			 d=4;break;
        	 }
        	 for(int i=0;i<diversity.length;i++)
        	 {
        		 if(line.contains(diversity[i]))
        			 d=5;break;
        	 }
        	 
        	 	try 
        	 	{
        	 		// Assume default encoding.
        	 		FileWriter fileWriter =  new FileWriter(wfile);

 	            // Always wrap FileWriter in BufferedWriter.
        	 		BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
 	            
 	            // Note that write() does not automatically
 	            // append a newline character.
        	 		switch(d)
        	 		{
        	 		case 0:
        	 			bufferedWriter.write(line+",others");
        	 			bufferedWriter.newLine();
        	 			break;
        	 		case 1:
        	 			bufferedWriter.write(line+",heavy study load");
        	 			bufferedWriter.newLine();
        	 			break;
        	 		case 2:
        	 			bufferedWriter.write(line+",lack Of social engagement");
        	 			bufferedWriter.newLine();
        	 			break;
        	 		case 3:
        	 			bufferedWriter.write(line+",negative emotion");
        	 			bufferedWriter.newLine();
        	 			break;
        	 		case 4:
        	 			bufferedWriter.write(line+",sleep problems");
        	 			bufferedWriter.newLine();
        	 			break;
        	 		case 5:
        	 			bufferedWriter.write(line+",diversity issues");
        	 			bufferedWriter.newLine();
        	 			break;
        	 		}
 	             // Always close files.
        	 		bufferedWriter.close();
        	 	}
        	 	catch(IOException ex)
        	 	{
     	            System.out.println("Error writing to file '"
     	                + wfile + "'");
     	            // Or we could just do this:
     	            // ex.printStackTrace();
     	        }
         }           

         // Always close files.
         bufferedReader.close();         
     }
     catch(FileNotFoundException ex) {
         System.out.println(
             "Unable to open file '" + 
             rfile+ "'");                
     }
     catch(IOException ex) {
         System.out.println(
             "Error reading file '" 
             + rfile+ "'");                  
         // Or we could just do this: 
         // ex.printStackTrace();
     }

}
}