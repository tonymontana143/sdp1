package FactoryPattern;

import FactoryPattern.Computer;

public class ComputerFactory {
    public static Computer getComputer(String type, String ram, String
            hdd, String cpu){
        if("FactoryPattern.PC".equalsIgnoreCase(type)) return new PC(ram, hdd, cpu);
        else if("FactoryPattern.Server".equalsIgnoreCase(type)) return new Server(ram,
                hdd, cpu);
        return null;
    }
}