package lesson11;


import lesson11.exceptions.*;

public class CheckpointControl {
    private static final int SPEEDLIMIT = 80;
    private static final int OVERSPEEDLIMIT = 100;
    private static final int OVERMASS = 8000;
    private static final int OVERHEIGHT = 4000;
    private static final int OVERWIDTH = 250;

    public static void checkPointSpeedControl(Auto auto) {

        if (auto.getSpeed() >= SPEEDLIMIT & auto.getSpeed() < OVERSPEEDLIMIT) {
            throw new SpeedLimitException();
        }
        if (auto.getSpeed() >= OVERSPEEDLIMIT) {
            throw new OverSpeedLimitException();
        }
        if (auto.getWeight() >= OVERMASS) {
            throw new OverMassException();
        }
        if (auto.getHeight() >= OVERHEIGHT) {
            throw new OverHeightException();
        }
        if (auto.getWidth() >= OVERWIDTH) {
            throw new OverWidthException();
        }
    }
}
