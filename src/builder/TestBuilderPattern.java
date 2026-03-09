package builder;

public class TestBuilderPattern {
    Computer computer = new Computer.ComputerBuilder(
            "500GB",
            "16GB"
    ).setBluetoothEnabled(true).setGraphicsCardEnabled(true).build();
}
