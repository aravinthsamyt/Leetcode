class Solution {
    public int earliestFinishTime(int[] landStartTime, int[] landDuration, int[] waterStartTime, int[] waterDuration) {
        int earliestTime=Integer.MAX_VALUE,landStart=0,waterStart=0,waterFinish,landFinish;
        for(int i=0;i<landStartTime.length;i++){
            for(int j=0;j<waterStartTime.length;j++){
                landStart=landStartTime[i]+landDuration[i];
                waterStart=Math.max(landStart,waterStartTime[j]);
                waterFinish=waterStart+waterDuration[j];

                waterStart=waterStartTime[j]+waterDuration[j];
                landStart=Math.max(waterStart,landStartTime[i]);
                landFinish=landStart+landDuration[i];

                earliestTime=Math.min(earliestTime,Math.min(landFinish,waterFinish));
            }
        }
        return earliestTime;
    }
}