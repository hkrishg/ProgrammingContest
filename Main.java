import java.util.*;

class Main {
  // A programming organization is planning a contest for several programmers,
  // each of which has a
  // certain rating. (The higher the rating, the better the programmer.) Each
  // programmer is paired with
  // .another programmer, and the difference between their ratings is referred to
  // as the "bias
  // amount". Given the ratings of all the programmers in the contest, what is the
  // minimum total bias
  // amount that can be achieved by optimally planning the programmer pairs?
  // Example
  // n=4
  // ratings = [4, 2, 5, 1]
  // The optimal solution is:
  // Pair the second programmer (2) with the fourth (1) for a difference of 1.
  // Pair the first programmer (4) with the third (5) for a difference of 1.
  // This results in a total bias amount of 1 + 1 = 2.
  // Function Description
  // Complete the function minimizeBias in the editor below.
  // minimizeBias has the following parameter:
  // int ratings[n]: the ratings of each of the programmers
  // Returns:
  // int: the minimum total bias amount that can be achieved in the contest
  // Constraints
  // 1sns 105
  // • 1 s ratings[i] = 10°
  // n is even. in c program
  private static int programmingContest(int[] arr) {
    int total = 0;
    Arrays.sort(arr);
    for (int i = 0; i < arr.length - 1; i = i + 2) {
      total = total + (arr[i + 1] - arr[i]);
    }
    return total;
  }

  // reverse a string
  // List<Integer> lista = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,4));

  // for (int i = 0; i < lista.size(); i++) {
  // lista.add(i, lista.remove(lista.size() - 1));
  // }

  // System.out.println(lista);

  public static void main(String[] args) {
    int result = Main.programmingContest(new int[] { 4, 2, 5, 1 });
    System.out.println(result);
    int result2 = Main.programmingContest(new int[] { 9, 8, 6, 7, 5, 4 });
    System.out.println(result2);
  }

}