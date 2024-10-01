package com.datastructure.java.core.compostion;

public class Storage{
    private String RAM;
    private String ROM;

    public Storage(String RAM, String ROM) {
        this.RAM = RAM;
        this.ROM = ROM;
    }

    public String getRAM() {
        return RAM;
    }

    public void setRAM(String RAM) {
        this.RAM = RAM;
    }

    public String getROM() {
        return ROM;
    }

    public void setROM(String ROM) {
        this.ROM = ROM;
    }

    @Override
    public String toString() {
        return "Storage{" +
                "RAM='" + RAM + '\'' +
                ", ROM='" + ROM + '\'' +
                '}';
    }
}
