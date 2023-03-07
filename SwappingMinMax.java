import java.util.Arrays;

public class SwappingMinMax {


    public static void main(String[] args) {

        int[] firstList = {8,7,9,6,5,6,6,5,6,4,6,7,8,5,4,3,2,1,4,5,6,7,8,7,8};
        int[] secondList = {2,4,5,6,7,6,7,8,9,8,7,6,7,6,5,4,3,2,3,4,5,5,5,4,5};

        System.out.println(minMax(firstList, secondList));

    }

    private static int minMax(int[] firstList, int[] secondList) {

        int maxOfFirstList = firstList[0];
        int maxOfSecondList = secondList[0];

        if (firstList[0] >= secondList[0]) {

            for (int i = 1; i < firstList.length; i++) {
                // swap all greater elements to firstList
                if (firstList[i] < secondList[i]) {
                    //swap
                    int temp = firstList[i] ;
                    firstList[i]= secondList[i] ;
                    secondList[i] = temp ;
                }

                //storing max element of each array
                if (maxOfFirstList < firstList[i]) {
                    maxOfFirstList = firstList[i];
                }
                if (maxOfSecondList < secondList[i]) {
                    maxOfSecondList = secondList[i];
                }
            }
        }
        else {

            for (int i = 1; i < secondList.length; i++) {
                // swap all greater elements to second
                if (secondList[i] < firstList[i]) {
                    //swap
                    int temp = firstList[i] ;
                    firstList[i]= secondList[i] ;
                    secondList[i] = temp ;
                }

                //storing max element of each array
                if (maxOfFirstList < firstList[i]) {
                    maxOfFirstList = firstList[i];
                }
                if (maxOfSecondList < secondList[i]) {
                    maxOfSecondList = secondList[i];
                }
            }
        }
        return maxOfFirstList*maxOfSecondList ;
    }

}
