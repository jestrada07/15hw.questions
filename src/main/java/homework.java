public class homework {


    // question 1: public static int getLastIndex(String[] names) {
    // return  (names.length - 1);}
// question 2:  public static int getSecondToLastIndex(String[] names) {
//  return (names.length - 2);}
// question 3: public static String getFirstElement(String[] names) {
//  return (names[0]); }
// question 4:  public static String getLastElement(String[] names){
// return (names[3]); }
// question 5: public static String getSecondToLastElement(String[] names) {
// return names[2];}
   /* question 6: public static int getSum(int[]ints) {
    int sum = 0;
    for(int i = 0; i < ints.length; i++) {
        sum += ints[i];
        }
        return sum;
    }*/
  /* question 7: public static int getAverage(int[] ints) {
        int sum = 0;
        for(int i = 0; i < ints.length; i++) {
            sum += ints[i];
    }
        int average = sum / ints.length;
        return average;} */

     /* question 8: public static int extractAllOddNumbers(int[] numbers) {
        int ints = 0;
        int i = 0;
        for (i = 0; i < numbers.length; i++)
            if (numbers[i] % 2 != 0){
            ints++;
        }
        return ints;
    } */

     /* question 9: public static int extractAllEvenNumbers(int[] numbers) {
        int ints = 0;
        int i = 0;
        for (i = 0; i < 7; i++)
            if (numbers[i] % 2 == 0){
                ints++;
            }
        return ints;
    } */

   /* question 10 public static boolean contains(String[]names, String element) {
       int n = 0;
        for (n = 0; n < names.length; n++);
        if (names[0].equals("alfonza")){
        return true;

        }
        return false;
    } */


    /* question 11 public static int getIndexByElement(String[] names, String element) {
        int n = 0;
        for (n = 0; n < names.length; n++) ;
        if (names[0] == element) {

            return n;

        }

        return -1;
    }


   /* question 12 public static void printOddNumbersInRange(int start, int end) {
      int i;

      for (i = 1 ; i <= 7 ; i++);
     if (i % 2 != 0) {

           }


     } /*


   /* question 13 public static String printGivenStringTimesNumberGiven(String str, int n) {
        for (int i = 0; i < n; i++) {

            System.out.println(str);

        }
        return str;
    } */

   /* question 14 public static String repeatFirstThreeLetters(String str, int n) {
        if (str.length() < 3) {

            return str;
        }
        String firstThreeLetters = str.substring(0, 3);
        String repeatedFirstThreeLetters = "";
        for (int i = 0; i < n; i++) {

        repeatedFirstThreeLetters += firstThreeLetters;
        }
            return repeatedFirstThreeLetters + str;

    } */

// Write a java method to count all the words in a string

   /* question 15 public static int WordsInAStringCounter(String str) {
        if ( str == null||str.isEmpty()){
            return 0;


        }
        String[] words = str.split("\\s+");
        return words.length;

    } */



    public static void main(String[] args) {


       // int Numbers [] = {1, 2, 3, 4, 5, 6, 7};



      String[] names = {"sebastian", "alfonza", "angel", "mikaila" };
        // System.out.println(getLastIndex(names));
// System.out.println(getSecondToLastIndex(names));
// System.out.println(getFirstElement(names));
// System.out.println(getLastElement(names));
// System.out.println(getSecondToLastElement(names)
//System.out.println(getSum(Numbers));
// System.out.println(getAverage(Numbers));
//System.out.println(extractAllOddNumbers(Numbers));
// System.out.println(extractAllEvenNumbers(Numbers));
        //System.out.println(contains(names, "sebastian"));
        //System.out.println(getIndexByElement(names, "sebastian"));
       // printOddNumbersInRange(1,7);

          //  printGivenStringTimesNumberGiven("Hello there!" , 3);
        //System.out.println(repeatFirstThreeLetters("Hello", 2));

       // System.out.println(WordsInAStringCounter("Boom"));
    }

    }