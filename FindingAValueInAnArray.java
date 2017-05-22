/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package findingavalueinanarray;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
/**
 *
 * @author kendrabooker
 */
public class FindingAValueInAnArray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Random r = new Random();
        int input;
        int arr[] = new int[10];
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Array: ");
        
       
        for(int i=0; i<10; i++){
        
            int num = 1 + r.nextInt(10);
            
            arr[i] = num;
            if(i >= 0){
            
                System.out.print(arr[i] + " ");
            }
        }
         System.out.println();
         System.out.print("value to find: ");
         input = keyboard.nextInt();
         
         /*could have used a switch, but honestly I would've perfered to use some 
         **kinda of array method for comparing values. I found a few but none actually work
         */
         if(arr[0] == input){
         
             System.out.println(input + " is in the array");
         }else if(arr[1] == input){
         
             System.out.println(input + " is in the array");
         }else if(arr[2] == input){
         
             System.out.println(input + " is in the array");
         }else if(arr[3] == input){
         
             System.out.println(input + " is in the array");
         }else if(arr[4] == input){
         
             System.out.println(input + " is in the array");
         }else if(arr[5] == input){
         
             System.out.println(input + " is in the array");
         }else if(arr[6] == input){
         
             System.out.println(input + " is in the array");
         }else if(arr[7] == input){
         
             System.out.println(input + " is in the array");
         }else if(arr[8] == input){
         
             System.out.println(input + " is in the array");
         }else if(arr[9] == input){
         
             System.out.println(input + " is in the array");
         }else{
         
             System.out.println("that value isn't in the array");
         }
         
             
         
    }
    
}
