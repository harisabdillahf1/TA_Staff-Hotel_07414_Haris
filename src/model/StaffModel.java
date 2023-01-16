package model;

import entity.StaffEntity;

import java.util.ArrayList;

public class StaffModel {
    private static ArrayList<StaffEntity> adminData = new ArrayList<>();

    public static void staffData(){
        StaffEntity staff = new StaffEntity("Haris Abdillah Firmansyah", 7414, "asdfg");
        adminData.add(staff);
    }

    public static StaffEntity adminUser(int id){
        for (StaffEntity entityStaff : adminData){
            if (entityStaff.getId() == id){
                return entityStaff;
            }
        }
        return null;
    }
}