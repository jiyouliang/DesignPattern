package dbuild;

/**
 *
 */
public class ComputerBuilderDirector {

    public Computer getBasicComputer() {
        return new Computer.ComputerBuilder("8G", "128G").build();
    }

    public Computer getCameraEnableComputer() {
        return new Computer.ComputerBuilder("8G", "128G")
                .setCameraEnable(true)
                .build();
    }
}
