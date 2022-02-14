package com.niit.averageofintegers;
import java.lang.NumberFormatException;
public class AverageAge
{
    String error;
    //This function calculates the average age, takes as input the raw data array
    // handle the exception appropriately
    public String averageAgeCalculator(String[] ageRawData)
    {
        double averageAge=0.0;
        String result;
        for(int i=0;i<ageRawData.length;i++)
        {
            averageAge=averageAge+(Double.parseDouble(ageRawData[i]))/ageRawData.length;
        }
        String averageofintegers=String.valueOf(averageAge);
        return averageofintegers;
    }
}