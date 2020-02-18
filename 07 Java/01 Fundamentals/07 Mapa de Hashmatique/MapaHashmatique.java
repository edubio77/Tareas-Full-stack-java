import java.util.HashMap;
import java.util.Set;
import java.util.Scanner;

public class MapaHashmatique{
    public void listaCanciones(){  
        HashMap<String, String> trackList = new HashMap<String, String>();
        trackList.put("CancionA","LyricsA");
        trackList.put("CancionB","LyricsB");
        trackList.put("CancionC","LyricsC");
        trackList.put("CancionD","LyricsD");
        
        Scanner sc = new Scanner(System.in);
    	System.out.print("Elige alguna de las siguientes canciones: CancionA, CancionB, CancionC o CancionD: ");
    	String a = sc.nextLine();
        String lyric = trackList.get(a);
        System.out.println("La letra de la cancion es: "+lyric);

        
        Set<String> keys = trackList.keySet();
        for(String key : keys){
            System.out.println(key);
            System.out.println(trackList.get(key));
        }
    }
}
//javac MapaHashmatique.java