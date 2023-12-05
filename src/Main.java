import java.util.*;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main
{
    public static void main(String[] args)
    {

        //ESERCIZIO 1
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
      System.out.println("parole distinte"+words);
      System.out.println("totale parole distinte"+words.size());
      System.out.println("totale parole duplici"+duplicate);
            //ESERCIZIO 2
       int valore=input.nextInt();
       ArrayList<Integer>risultato=new ArrayList<>();
       ArrayList<Integer>reversearray=new ArrayList<>();
       risultato=randomnum(valore);
       System.out.println(risultato);
        reversearray=reverseoption(risultato);
        System.out.println(reversearray);

    }
    public static ArrayList randomnum(int n)
    {
        Random rndm=new Random();
        ArrayList <Integer> numeri=new ArrayList<>();
        for(int i=0;i<n;i++)
        {
            numeri.add(rndm.nextInt(1,100));
        }
        return numeri;
    }
    public static ArrayList reverseoption(ArrayList vect)
    {
        Collections.reverse(vect);
        return vect;
    }


}