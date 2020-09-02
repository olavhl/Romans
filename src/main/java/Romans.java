public class Romans {
    public String toRomans(int i) {
        String result = "";

        if(i < 4){
            result = addRomanOnes(i, 0);
        } else if (i == 4) {
            result = "IV";
        } else if (i == 5) {
            result = "V";
        } else if ( i < 9){
            result = "V";
            result += addRomanOnes(i, 5);
        } else if (i == 9) {
            result = "IX";
        } else if (i > 9 && i < 14){
            result = "X";
            result += addRomanOnes(i, 10);
        } else if (i == 14) {
            result = "X";
            result += "IV";
        }

        return result;
    }

    public String addRomanOnes(int i, int divider){
        String str = "";

        for (int number = 0; number < i - divider; number++) {
            str += "I";
        }

        return str;
    }
}
