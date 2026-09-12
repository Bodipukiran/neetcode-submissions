/**
 * Definition of Interval:
 * public class Interval {
 *     public int start, end;
 *     public Interval(int start, int end) {
 *         this.start = start;
 *         this.end = end;
 *     }
 * }
 */

class Solution {
    public boolean canAttendMeetings(List<Interval> intervals) {



        if(intervals.size() < 2 ) return true;

         intervals.sort((a, b)-> a.start - b.start);

        Interval hi = intervals.get(0);
        for(int i=1; i <  intervals.size() ; i++){

            if(hi.end > intervals.get(i).start) return false;
            hi = intervals.get(i);

        }

        return true;

    }
}
