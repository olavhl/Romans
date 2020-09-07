public class Romans {
    public String toRomans(int i) {
        String result;

        if (i < 1000) {
            result = addRomanThousand(i);
        } else if ( i < 4000) {
            result = addThousands(i);
        } else {
            result = "Your number is just too high dude..";
        }

        return result;
    }

    //Method to go from 1000 to 3999
    public String addThousands(int i){
        String result = "";

        int thousands = i / 1000;

        for (int j = 0; j < thousands; j++) {
            result += "M";
        }

        thousands *= 1000;

        result += addRomanThousand(i - thousands);

        return result;
    }

    // Method to return thousands
    public String addRomanThousand(int i) {
        String result = "";

        if (i < 400) {
            result = addRomanHundreds(i, 0);
        } else if (i < 500) {
            result = "CD";
            result += fromOneToHundred(i - 400);
        } else if (i < 900) {
            result = "D";
            result += addRomanHundreds(i, 5);
        } else if (i < 1000) {
            result = "CM";
            result += fromOneToHundred(i - 900);
        }



        return result;
    }


    // Method to return from 100 -> 399 and 600 -> 899
    public String addRomanHundreds(int i, int divider){
        String result = "";

        int hundreds = (i / 100) % 10;

        for (int j = 0; j < hundreds - divider; j++){
            result += "C";
        }

        // Uncool way to get the hundreds
        int underHundred = (i / 100);
        underHundred *= 100;


        result += fromOneToHundred(i - underHundred);


        return result;
    }

    // Method to read from 1 -> 100
    public String fromOneToHundred(int i){
        String result = "";

        if ( i < 10 ){
            result = addNumberTens(i);
        } else if (i < 40){
            result = addRomansThirty(i, 0);
        } else if (i < 50) {
            result = "XL";
            result += addNumberTens(i);
        } else if (i < 90){
            result = "L";
            result += addRomansThirty(i, 5);
        } else if (i < 100) {
            result = "XC";
            result += addNumberTens(i);
        }

        return result;
    }

    // Adding method to return from 20 -> 39 and 70 -> 89
    public String addRomansThirty(int i, int divider) {
        String result = "";
        int tens = i / 10;

        for (int j = 0; j < tens - divider; j++) {
            result += "X";
        }

        result += addNumberTens(i);


        return result;
    }

    public String addNumberTens(int i) {
        int remainder = i % 10;
        String result;

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
