package NetcrackerApp.model.impl;

import NetcrackerApp.model.Device;
import NetcrackerApp.model.Rack;

public class RackArrayImpl implements Rack{

    @Override
    public int getSize() {
        return 0;
    }

    @Override
    public int getFreeSize() {
        return 0;
    }

    @Override
    public Device getDevAtSlot(int index) {
        return null;
    }

    @Override
    public boolean insertDevToSlot(Device device, int index) {
        return false;
    }

    @Override
    public Device removeDevFromSlot(int index) {
        return null;
    }

    @Override
    public Device getDevByIN(int in) {
        return null;
    }
}
