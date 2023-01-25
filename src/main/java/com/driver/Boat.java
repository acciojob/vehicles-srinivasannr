package com.driver;

public class Boat implements WaterVehicle{
    String name;
    int capacity;
    Boat(String Name,int Capacity){
        this.name=Name;
        this.Capacity=capacity;
    }
    public String getVehicleName(){
        return name;
    }
    public int getVehicleCapacity(){
        return capacity;
    }

}
