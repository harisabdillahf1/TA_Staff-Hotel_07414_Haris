package controller;

import entity.StaffEntity;
import model.StaffModel;
import view.*;
import view.staff.login;

public class StaffController {
    public void forView(){
        login lojin = new login();
        lojin.staffLogin();
    }

    public boolean loginCheck(int id, String password){
        StaffEntity entityStaff = StaffModel.adminUser(id);
        if (entityStaff != null){
            if (entityStaff.getPassword().equals(password)){
                return true;
            }
        }
        return false;
    }
}
