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
            if(Character.isDigit(nums.charAt(i)))
                sum+=(nums.charAt(i)-'0');
        }
        return sum;
    }
}
