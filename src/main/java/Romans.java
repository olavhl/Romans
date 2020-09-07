public class Romans {
    public String toRomans(int i) {
        String result = "";

        if ( i < 10 ){
            result = addNumberTens(i);
        } else if ( i < 20) {
             result = "X";
             result += addNumberTens(i);
        }  else if ( i < 30) {
             result = "XX";
             result += addNumberTens(i);
        } else if (i < 40) {
             result = "XXX";
             result += addNumberTens(i);
        } else if (i < 50) {
             result = "XL";
             result += addNumberTens(i);
        } else if (i == 50) {
             result = "L";
        }

        return result;
    }

    public String addNumberTens(int i) {
        int remainder = i % 10;
        String result = "";

        if(remainder < 4){
            result = addRomanOnes(remainder, 0);
        } else if (remainder == 4) {
            result = "IV";
        } else if ( remainder < 9){
            result = "V";
            result += addRomanOnes(remainder, 5);
        } else {
            result = "IX";
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
