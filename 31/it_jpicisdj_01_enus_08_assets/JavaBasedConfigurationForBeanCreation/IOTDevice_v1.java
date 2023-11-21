import org.springframework.stereotype.Component;

@Component
public class IOTDevice {

    String device;
    String command;

    public IOTDevice() {
        System.out.println("Object created Successfully!");
    }

    public String getDevice() {
        return device;
    }

    public void setDevice(String device) {
        this.device = device;
    }

    public String getCommand() {
        return command;
    }

    public void setCommand(String command) {
        this.command = command;
    }

    @Override
    public String toString() {
        return "IOTDevice{" +
                "device = '" + device + "!\'" +
                ", command = '" + command + "\'" + '}';
    }
}