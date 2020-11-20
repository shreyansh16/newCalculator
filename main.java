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
    char delim=',';
    int s=0;
    
    if(nums.charAt(0)=='/' && nums.charAt(1)=='/')
    {
        delim=nums.charAt(2);
    }
    
    String test[] = nums.split(String.valueOf(delim));
    
      for(int i=0;i<nums.length();i++)
      {   
       
        if(nums.charAt(i)=='\n' || nums.charAt(i)==delim)
            continue;
          
        else if(Character.isDigit(nums.charAt(i)))
        { 
          for(int j=2;j<test.length;j++)
          {
              if(Integer.parseInt(test[j])<0)
              {
                  try
                  {
                     s=j;
                     throw new Exception("negatives not allowed\n");
                  }
                  catch(Exception e)
                 {
                       System.out.print(e);
                       for(int k=s;k<test.length;k++)
                      {
                         if(Integer.parseInt(test[k])<0)
                         System.out.println(Integer.parseInt(test[k]));
                      }
                      return 0;
                  }
              }
              else
              {
                  if(Integer.parseInt(test[j])<=1000)
                      sum+=Integer.parseInt(test[j]);
              }
          }
         break;
        }
      }
      
      return sum;
   }
}
