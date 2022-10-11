package com.frankeey;

public class PartTime extends students{
    boolean partTime;
    @Override
    public void print()
    {
       super.print();
       if(partTime){
           System.out.println("He is Part Time Student ");
       }else{
           System.out.println("He is not a Part Time Student ");
       }
    }
}
