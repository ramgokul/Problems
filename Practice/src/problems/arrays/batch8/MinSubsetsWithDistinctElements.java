package problems.arrays.batch8;

public class MinSubsetsWithDistinctElements {

    /*
        You are given an array of n-element. You have to make subsets from the array such that no subset contain duplicate elements. Find out minimum number of subset possible.

        Examples :

        Input : arr[] = {1, 2, 3, 4}
        Output :1
        Explanation : A single subset can contains all
        values and all values are distinct

        Input : arr[] = {1, 2, 3, 3}
        Output : 2
        Explanation : We need to create two subsets
        {1, 2, 3} and {3} [or {1, 3} and {2, 3}] such
        that both subsets have distinct elements.

        An efficient solution is to use hashing. We count frequencies of all elements in a hash table. Finally we return the key with maximum value in hash table.
     */
}
