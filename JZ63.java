package Package;

public class JZ63 {
    public static int maxProfit(int[] prices){
        int min=prices[0];
        int lastIndex=prices.length-1;
        int max=prices[lastIndex];
        int res=0;
        for (int i=1;i<lastIndex;i++){
            if (min>prices[i])  min = prices[i];
            for (int j=lastIndex;j>i;j--){
                if (max<prices[j]) max=prices[j];
            }
            res=max-min;
        }
        return res>0?res:0;
    }
}
