package esercizio1;

import java.util.HashMap;
import java.util.Map;

public class Contattitelefonici
{

    String nomecontatto;


    public  Contattitelefonici(String nomecontatto)
    {

        this.nomecontatto=nomecontatto;
    }


    @Override
    public String toString() {
        return "Contattitelefonici{" +
                "nomecontatto='" + nomecontatto + '\'' +
                '}';
    }
}
