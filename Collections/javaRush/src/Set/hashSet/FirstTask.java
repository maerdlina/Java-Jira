package Set.hashSet;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FirstTask {
    public static void main(String[] args) {
        Set<String> hashSet = new HashSet<String>(
                List.of("арбуз", "банан", "вишня", "груша", "дыня",
                        "ежевика", "жень-шень", "земляника", "ирис",
                        "картофель"));
        for(String s: hashSet) System.out.println(s);
    }
}
