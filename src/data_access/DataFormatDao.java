/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package data_access;

import common.Validation;

/**
 *
 * @author GoldCandy
 */
public class DataFormatDao {

    private static DataFormatDao instance = null;
    private Validation valid = new Validation();

    public static DataFormatDao Instance() {
        if (instance == null) {
            synchronized (DataFormatDao.class) {
                if (instance == null) {
                    instance = new DataFormatDao();
                }
            }
        }
        return instance;
    }

    public void checkPhone() {
        valid.inputPhone("Phone number");
        System.out.println("Successful");
    }

    public void checkDate() {
        valid.inputDate("Date");
        System.out.println("Successful");
    }

    public void checkEmail() {
        valid.inputStringMatch("Email", "^[a-zA-Z0-9]+\\@[a-zA-Z0-9]+\\.\\D+$");
        System.out.println("Successful");
    }
}
