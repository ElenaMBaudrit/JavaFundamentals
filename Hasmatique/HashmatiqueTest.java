import java.util.*;

public class HashmatiqueTest {

    public static void main(String[] args) {
        HashMap<String, String> trackList = new HashMap<>();
        Hashmatique printIt = new Hashmatique();
        trackList.put ("The Cat Came Back", "Now, old Miss Johnson lived all alone, had an ol' yeller cat that wouldn't leave home.  Tried ev'rything she knew to make the cat go away, but the cat came back, the very next day;  thought he was a gonner, but the cat came back,  thought he was a gonner, but the cat came back, cause he wouldnt stay away");
        trackList.put ("The Flu Pandemic", "It was the Flu pandemic  And it swept the whole world wide  It caught soldiers and civilians  And they died, died, died!  Whether they’re lying in the trenches  Or lying in their beds  Twenty million of them got it  And they’re dead, dead, dead!");
        trackList.put ("Pico de Gallo", "Pico de gallo, you oughta give it a try-o Even if you're from Ohio, it'll get you by-o Don't get it in your eye-o unless you want to cry-o So come on, don't be shy-o, eat some pico de gallo!");
        trackList.put ("Dentist!", "You'll be a dentist  (Be a dentist)  You have a talent for causing things pain  (Pain)  Son, be a dentist  (Son, be a dentist)  People will pay you to be inhumane (Inhumane)");
        printIt.hashMapPrintAll(trackList);
    }
}
