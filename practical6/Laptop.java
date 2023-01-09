package practical6;


public class Laptop {
    private final String processor;
    private final String memoryDrives;
    private final String modelSeries;
    private final String operatingSystem;
    private final String operativeMemory;
    private final String diagonal;
    private final String screenResolution;
    private final String color;


    public Laptop(String modelSeries, String processor, String memoryDrives, String operatingSystem,
                  String operativeMemory, String diagonal, String screenResolution, String color) {
        this.modelSeries = modelSeries;
        this.processor = processor;
        this.memoryDrives = memoryDrives;
                this.operatingSystem = operatingSystem;
        this.operativeMemory = operativeMemory;
        this.diagonal = diagonal;
        this.screenResolution = screenResolution;
        this.color = color;
    }

    @Override
    public String toString() {
        return "Laptop -" +
                " modelSeries = " + modelSeries +
                ", processor = " + processor +
                ", memoryDrives = " + memoryDrives +
                ", operatingSystem = " + operatingSystem +
                ", operativeMemory = " + operativeMemory +
                ", diagonal = " + diagonal +
                ", screenResolution = " + screenResolution +
                ", color = " + color;
    }
}

