package NetcrackerApp.model.impl;

import NetcrackerApp.model.Device;
import NetcrackerApp.model.Rack;

public class RackArrayImpl implements Rack{
    private int size;
    private int freesize;

    public RackArrayImpl(int size) {
        this.size = size;
    }

    public int getSize() {
        return size;
    }

    public int getFreeSize() {
        return freesize;
    }

    public Device getDevAtSlot(int index) {
        return null;
    }

    public boolean insertDevToSlot(Device device, int index) {
        return false;
    }

    public Device removeDevFromSlot(int index) {
        return null;
    }

    public Device getDevByIN(int in) {
        return null;
    }
}
