import java.util.List;

public class MergeSort {
    List<int> mergeSort(List<int> unsorted) {
        var n = unsorted.size();
        if (n < 2){
            return unsorted;
        }

        var firstHalf = unsorted.subList(0, n / 2);
        var lastHalf = unsorted.subList(n / 2, n);

        var sortedFirstHalf = mergeSort(firstHalf);
        var sortedLastHalf = mergeSort(lastHalf);

        return merge(sortedFirstHalf, sortedLastHalf);
    }

    List<int> merge(List<int> x, List<int> y) {
        var px = 0;
        var py = 0;

        var sorted = List.<int>of();

        while(px < x.size() || py < y.size()){

        }
    }
}
