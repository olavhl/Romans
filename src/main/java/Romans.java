public class Romans {
    public String toRomans(int i) {
        String result = "";

        if ( i < 9 ){
            result += addNumberTens(i);
        } else if (i == 9) {
            result += addNumberTens(i) ;
        } else if (i == 10) {
            result = "X";
        } else if ( i < 19) {
             result = "X";
             result += addNumberTens(i);
        } else if ( i == 19) {
             result = "X";
             result += addNumberTens(i);
        } else if (i == 20) {
             result = "XX";
        } else if ( i < 29) {
             result = "XX";
             result += addNumberTens(i);
        } else if ( i == 29) {
             result = "XXIX";
        } else if (i < 39) {
             result = "XXX";
             result += addNumberTens(i);
        } else if( i < 49){
             result = "XL";
             result += addNumberTens(i);
        } else if( i < 59) {
             result = "L";
             result += addNumberTens(i);
        } else if (i < 69) {
            result = "LX";
            result += addNumberTens(i);
        } else if (i < 79) {
            result = "LXX";
            result += addNumberTens(i);
        } else if ( i < 89) {
            result = "LXXX";
            result += addNumberTens(i);
        } else if (i == 90) {
            result = "XC";
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
        } else if (remainder < 9) {
            result = "V";
            result += addRomanOnes(remainder, 5);
        } else if ( remainder == 9) {
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
