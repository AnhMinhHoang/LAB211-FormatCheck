/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repository;

import data_access.DataFormatDao;

/**
 *
 * @author GoldCandy
 */
public class DataFormatRepository implements IDataFormatRepository {

    @Override
    public void checkPhone() {
        DataFormatDao.Instance().checkPhone();
    }

    @Override
    public void checkDate() {
        DataFormatDao.Instance().checkDate();
    }

    @Override
    public void checkEmail() {
        DataFormatDao.Instance().checkEmail();
    }
}
