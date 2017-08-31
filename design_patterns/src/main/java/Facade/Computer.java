package Facade;

/**
 * Created by Wuxiang on 2017/3/19.
 * Computer类就是一个facade类
 */
public class Computer {
    private CPU cpu;
    private Disk disk;
    private Memory memory;

    public Computer() {
        cpu = new CPU();
        disk = new Disk();
        memory = new Memory();
    }

    public void startUp() {
        System.out.println("start the computer!");
        cpu.startUp();
        disk.startUp();
        memory.startUp();
        System.out.println("start computer finished!");
    }

    public void shutDown() {
        System.out.println("begin to close the computer!");
        cpu.shutdown();
        disk.shutdown();
        memory.shutdown();
        System.out.println("computer closed!");
    }
}
