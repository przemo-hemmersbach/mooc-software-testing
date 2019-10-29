package tudelft.mirror;

public class Mirror {

    public String mirrorEnds(String string) {
        String mirror = "";

        int begin = 0;
        int end = string.length() - 1;
        for (; end >= 0 && string.charAt(begin) == string.charAt(end); begin++, end--) {
            mirror += String.valueOf(string.charAt(end));
        }

        return begin > end ? string : mirror;
    }
}
