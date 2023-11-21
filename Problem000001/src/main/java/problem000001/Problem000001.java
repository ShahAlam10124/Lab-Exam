/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package problem000001;

public class Problem000001 {
     public static int findMax(int arr[]){
        int max=0;
        for (int i=1;i<arr.length;i++){
        if(max<arr[i])
            max=arr[i];
        }
        return max;
    }
}
