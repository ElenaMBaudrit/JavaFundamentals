import java.util.*;

public class Hashmatique {
    public void hashMapPrintAll (HashMap<String, String> songAndLyrics){
        for (Map.Entry item : songAndLyrics.entrySet()){
            System.out.println("Song: " + item.getKey() + " / Lyrics: " + item.getValue());
        }
    }

    //     String name = trackList.get("The Cat Came Back");
    // }
    // return name;
}

