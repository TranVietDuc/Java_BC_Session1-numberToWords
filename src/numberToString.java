import java.util.Scanner;

    public class numberToString {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);



            System.out.println("Enter a number");
            int number =  scanner.nextInt();
            int ones,tens,hundreds;
            String outString, onesString, tensString, hundredsString;



            if(number<10 && number >=0){
                ones = number;
                outString = onesToString(ones);
            }
            else if (number>=10 && number <20){
                ones = number % 10;
                outString = XteenToSting(ones);
            }
            else if ( number>=20 && number < 100){
                tens = number / 10;
                ones = number % 10;
                tensString = XtyToString(tens);
                onesString = onesToString(ones);
                if (ones == 0){
                    onesString = "";
                }
                outString = tensString + "\t" + onesString;
            }
            else if (number>=100 && number <= 999 ){
                hundreds = number / 100;
                tens = (number - hundreds*100)/10;
                ones = number - hundreds*100 - tens*10;

                String hundredString;
                String tensOrOnesString;

                if (hundreds == 1) hundredString = "hundred";
                else hundredString = "hundreds";

                if (tens == 0 && ones == 0) tensOrOnesString = "";
                else tensOrOnesString = "and";

                hundredsString = onesToString(hundreds);
                tensString = XtyToString(tens);
                onesString = onesToString(ones);
                if (ones == 0){
                    onesString = "";
                }
                if (tens ==0) {
                    tensString = "";
                }
                if (tens ==1) {
                    tensString = XteenToSting(ones);
                    onesString = "";
                }
                outString = hundredsString + "\t"  + hundredString + "\t" + tensOrOnesString + "\t" + tensString + "\t" + onesString;
            }
            else {
                outString = "Out of Spec";
            }
            System.out.println("Number by words: ");
            System.out.println(outString);
        }
        //
        public static String onesToString(int ones){
            String string = "";
            switch (ones){
                case 0:
                    string ="zero";
                    break;
                case 1:
                    string = "one";
                    break;
                case 2:
                    string = "two";
                    break;
                case 3:
                    string = "three";
                    break;
                case 4:
                    string = "four";
                    break;
                case 5:
                    string = "five";
                    break;
                case 6:
                    string = "six";
                    break;
                case 7:
                    string = "seven";
                    break;
                case 8:
                    string = "eight";
                    break;
                case 9:
                    string = "nine";
                    break;
            }
            return string;
        }

        //
        public static String XteenToSting (int ones){
            String string ="";
            switch (ones){
                case 0:
                    string = "ten";
                    break;
                case 1:
                    string = "eleven";
                    break;
                case 2:
                    string = "twelve";
                    break;
                case 3:
                    string = "thirteen";
                    break;
                case 4:
                    string = "fourteen";
                    break;
                case 5:
                    string = "fifteen";
                    break;
                case 6 :
                    string = "sixteen";
                    break;
                case 7 :
                    string = "seventeen";
                    break;
                case 8:
                    string = "eighteen";
                    break;
                case 9:
                    string = "nineteen";
                    break;
            }
            return string;
        }

        //
        public static String XtyToString (int tens) {
            String string = "";
            switch (tens) {
                case 2:
                    string = "twenty";
                    break;
                case 3:
                    string = "thirty";
                    break;
                case 4:
                    string = "forty";
                    break;
                case 5:
                    string = "fifty";
                    break;
                case 6:
                    string = "sixty";
                    break;
                case 7:
                    string = "seventy";
                    break;
                case 8:
                    string = "eighty";
                    break;
                case 9:
                    string = "ninety";
                    break;
            }
            return string;
        }


    }

