package com.frankeey;

public class Main {
    public static void main(String[] args) {
        students Dinesh=new students();
        Dinesh.Rno=1002;
        Dinesh.name="DineshVenkat";
        Dinesh.age=19;

        Dinesh.print();
        students Siva=new students();
        Siva.Rno=1003;
        Siva.name="Shiva";
        Siva.age=25;

        Siva.print();
        PartTime Dahanush=new PartTime();
        Dahanush.name="Dhanush Kumar";
        Dahanush.age=25;
        Dahanush.Rno=1025;
        Dahanush.ParentName="Ramesh";
        Dahanush.partTime= false;

        Dahanush.print();
    }
}