/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Shreyansh
 */
public class main {
    
    public int add(String nums)
    {
        int sum=0;
        for(int i=0;i<nums.length();i++)
        {
            if(nums.charAt(i)==',' && nums.charAt(i+1)=='\n' )
            {
              System.out.println("Error!");
              return 0;
            }
       
           else if(nums.charAt(i)=='\n' || nums.charAt(i)==',')
            continue;
        
         else if(Character.isDigit(nums.charAt(i)))
                sum+=(nums.charAt(i)-'0');
        }
        return sum;
    }
}
