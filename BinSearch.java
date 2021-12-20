/**
   class BinSearch
   Binary search on array of Comparables
**/

public class BinSearch
{

  /**
     int binSearch(Comparable[],Comparable) -- searches an array of
     Comparables for target Comparable
     pre:  input array is sorted in ascending order
     post: returns index of target, or returns -1 if target not found
  **/
  public static int binSearch ( int[] a, int target )
  {
    //uncomment exactly 1 of the 2 stmts below:

    //return binSearchIter( a, target, 0, a.length-1 );
    return binSearchRec( a, target, 0, a.length-1 );
  }


  public static int binSearchRec( int[] a,
                                  int target,
                                  int lo, int hi )
  {
    if (lo <= hi) {
    int tPos = -1; //init return var to flag value -1

    int m = (lo + hi) / 2; //init mid pos var

    int  guess = a[m];

    if (guess == target) {
      tPos = m;
    }
    else if (guess > target){
      return binSearchRec(a, target, lo , m - 1);
    }
    else {
      return binSearchRec(a,target, m + 1, hi);
    }

    return tPos;
    }

    else {
      return -1;
  }
  }//end binSearchRec


  public static int binSearchIter( int[] a,
                                   int target,
                                   int lo, int hi )
  {
    int tPos = -1; //init return var to flag value -1
    int m = (lo + hi) / 2; //init mid pos var

    while( lo <= hi ) { // run until lo & hi cross

      m = (lo + hi) / 2;

      if (a[m] == target) {
        return m;
      }

      else if (a[m] < target){
        lo = m + 1;
      }

      else {
        hi = m -1;
      }

      // value at mid index lower than target

    }
    return tPos;

  }//end binSearchIter



}//end class BinSearch2
