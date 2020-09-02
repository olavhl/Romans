public class Romans {
    public String toRomans(int i) {
        String result = "";

        if(i < 4){

            for (int number = 0; number < i; number++) {
                result += "I";
            }
        }
        else{
            result = "IV";
        }

        return result;
    }
}
