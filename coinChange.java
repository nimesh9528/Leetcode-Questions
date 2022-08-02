
import java.util.Arrays;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Lenovo
 */
public class coinChange {
    public static void main (String[] sc) {
        int[] coins={1,2,5};
        int amount=11;
        int [][] dp=new int[amount+1][coins.length];
        for(int[] a:dp){
            Arrays.fill(a, -1);
        }
        System.out.print(coin(coins,amount,0,dp));
    }
    public static int coin(int[] coin,int amt,int i,int[][] dp){
        if(amt==0) return 1;
        if(i==coin.length)return 0;
        if(dp[amt][i]!=-1)return dp[amt][i];
        int inc=0;
        int exc=0;
        if(coin[i]<=amt){
            inc = coin(coin,amt-coin[i],i,dp);
        }
        exc = coin(coin,amt,i+1,dp);
        return dp[amt][i]= inc+exc;
    }
}
