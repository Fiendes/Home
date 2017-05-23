package NetcrackerApp.model.impl;

import NetcrackerApp.model.Device;

import java.util.Date;

public class WifiRouter extends Router implements Device{
    protected String securityProtocol;

    public int getIn() {
        return 0;
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
