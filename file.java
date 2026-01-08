import java.util.Scanner;
import java.io.File;

class file{
    public static void main(String[] arg){
       try{
         File f=new File("text.txt");
        Scanner s=new Scanner(f);
        while(s.hasNextLine()){
            System.out.println(s.nextLine());
        }
       }
        catch(Exception e){
            System.out.println(e);
        }
       
    }
}
