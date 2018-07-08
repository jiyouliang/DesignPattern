package dbuild;

/**
 * 电脑
 */
public class Computer {
    private String RAM; //内存
    private String HDD; //硬盘
    //可选参数
    private boolean isCameraEnable;//摄像头是否开启

    private Computer(ComputerBuilder builder) {
        this.RAM = builder.RAM;
        this.HDD = builder.HDD;
        this.isCameraEnable = builder.isCameraEnable;
    }

    public String getRAM() {
        return RAM;
    }

    public String getHDD() {
        return HDD;
    }

    public boolean isCameraEnable() {
        return isCameraEnable;
    }

    //建造者
    public static class ComputerBuilder {
        private String RAM;
        private String HDD;
        private boolean isCameraEnable;

        public ComputerBuilder(String RAM, String HDD) {
            this.RAM = RAM;
            this.HDD = HDD;
        }

        public ComputerBuilder setCameraEnable(boolean cameraEnable) {
            isCameraEnable = cameraEnable;
            return this;
        }

        public Computer build(){
            return new Computer(this);
        }
    }

}
