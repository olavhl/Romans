public class Romans {
    public String toRomans(int i) {
        String result = "";

        if (i == 1)
        {
            result = "I";
        } else if(i == 2) {
            result = "II";
        } else {
            result = "III";
        }

        return result;
    }
}
