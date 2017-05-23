package NetcrackerApp.model.impl;

import NetcrackerApp.model.Device;

import java.util.Date;
import java.util.Scanner;

public abstract class AbstractDevice implements Device {
    protected int in;


    public int getIn() {
        return in;
    }

    public Date getProductionDate() {
        return null;
    }


    public String getManufacturer() {
        return null;
    }


    public String getModel() {
        return null;
    }


    public String getType() {
        return null;
    }


    public void setIn(int in) {
        while (in == 0) {
            System.out.println("Введите новое значение");
            Scanner num = new Scanner(System.in);
            in = num.nextInt();
            if (in <= 0) {
                System.err.println("Введено недопустимое значение");
            }
        }
        this.in = in;
    }


    public void setManufacturer(String manufacturer) {

    }


    public void setModel(String model) {

    }


    public void setProductionDate(Date productionDate) {

    }


    public void setType(String type) {

    }
}
