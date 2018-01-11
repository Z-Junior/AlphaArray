import java.util.Arrays;
import java.util.stream.Collectors;

public class AlphaArray
{
    public static void main(String[] args)
    {
        alphabet();
        unicode();
    }

    static void alphabet()
    {
        String[] sChars = new String[26];

        int iIter = 0;

        for (char c = 'a'; c <= 'z'; c++)
        {
            sChars[iIter] = "" + c;
            iIter++;
        }

        System.out.println(Arrays.stream(sChars).collect(Collectors.joining(", ")));
    }

    static void unicode()
    {
        String[] sChars = new String[26];

        int iIter = 0;

        for (int i = 65; i <= 90; i++)
        {
            sChars[iIter] = "" + (char) i;
            iIter++;
        }

        System.out.println(Arrays.stream(sChars).collect(Collectors.joining(", ")));
    }
}
