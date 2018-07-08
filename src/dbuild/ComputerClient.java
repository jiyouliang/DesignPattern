package dbuild;

/**
 *
 */
public class ComputerClient {
    public static void main(String[] args) {
      /*  Computer computer = new Computer.ComputerBuilder("8G", "256G").build();

        Computer computer2 = new Computer.ComputerBuilder("4G", "128G")
                .setCameraEnable(true)
                .build();

        System.out.println(computer.getRAM());
        System.out.println(computer2.getRAM());*/

        Computer basicComputer = new ComputerBuilderDirector().getBasicComputer();
        System.out.println(basicComputer.isCameraEnable());

        Computer cameraEnableComputer = new ComputerBuilderDirector().getCameraEnableComputer();
        System.out.println(cameraEnableComputer.isCameraEnable());

    }


}
