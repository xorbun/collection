import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main
{
    public static void main(String[] args)
    {
      Scanner input=new Scanner(System.in);
      Scanner input2=new Scanner(System.in);
      int lunghezza=input.nextInt();
      Set<String> words=new HashSet<>();
      ArrayList<String>duplicate=new ArrayList<>();
      for(int i=0;i<lunghezza;i++)
      {
          String parola=input2.nextLine();
         if(!words.add(parola))
         {
             duplicate.add(parola);
         }
      }
      System.out.println(words);
      System.out.println(words.size());
      System.out.println(duplicate);

    }
}