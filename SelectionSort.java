public class SelectionSort {

         /* Selection Sort function */

    public int[] sort( int arr[] ){

        int N = arr.length;

        int i, j, pos, temp;

        for (i = 0; i < N; i++)

        {

            pos = i;

            for (j = i+1; j < N; j++)

            {

                if (arr[j] < arr[pos])

                {

                    pos = j;

                }

            }

            /* Swap arr[i] and arr[pos] */

            temp = arr[i];

            arr[i] = arr[pos];

            arr[pos]= temp;

        }

        return arr;
    }

}
