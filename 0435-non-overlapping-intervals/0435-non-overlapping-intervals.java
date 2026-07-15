class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[1], b[1]));
        int count = 0;
        int lastEnd = intervals[0][1];

        for (int i = 1; i < intervals.length; i++) {
            if (intervals[i][0] >= lastEnd) {
                lastEnd = intervals[i][1];
            } else
                count++;
        }

        return count;
    }
}
// int nonOverlaping = 0;
// int lastEnd = intervals[0][1];
// for(int i=0;i<intervals.length;i++){
//     for(int j=i;j<intervals[i][j];i++){

//         if(intervals[i][lastEnd] < intervals[i][j]){
//             nonOverlaping++;
//             lastEnd = intervals[i][j];
//         }
//         return nonOverlaping;
// return 0;