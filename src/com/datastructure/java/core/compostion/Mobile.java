package com.datastructure.java.core.compostion;

import java.util.ArrayList;
import java.util.List;

public class Mobile {
    private String name;
    private int modelnumber;
    private String processor;
    private String battery;

    private Camera camera;
    private Storage storage;


    public Mobile(String name,int modelnumber, String processor, String battery, Camera camera, Storage storage) {
        this.name=name;
        this.modelnumber = modelnumber;
        this.processor = processor;
        this.battery = battery;
        this.camera = camera;
        this.storage = storage;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getModelnumber() {
        return modelnumber;
    }

    public void setModelnumber(int modelnumber) {
        this.modelnumber = modelnumber;
    }

    public String getProcessor() {
        return processor;
    }

    public void setProcessor(String processor) {
        this.processor = processor;
    }


    public String getBattery() {
        return battery;
    }

    public void setBattery(String battery) {
        this.battery = battery;
    }


    public Camera getCamera() {
        return camera;
    }

    public void setCamera(Camera camera) {
        this.camera = camera;
    }

    public Storage getStorage() {
        return storage;
    }

    public void setStorage(Storage storage) {
        this.storage = storage;
    }
    @Override
    public String toString() {
        return "{Name= "+name+'\n'+
                " modelnumber=" + modelnumber +'\n'+
                " processor='" + processor + '\n' +
                " battery='" + battery + '\n' +
                " camera=" + camera.toString() +'\n' +
                " storage=" + storage.toString() +'\n' +
                '}';
    }
    public static void main(String[] args) {
        Camera camera1=new Camera("32MP","50MP+13MP");
        Storage storage1=new Storage("12 GB RAM","256 GB ROM");
        Camera camera2=new Camera("15MP","64MP + 15MP");
        Storage storage2=new Storage("8 GB RAM","256 GB ROM");
        Mobile  mobile =new Mobile("Moto",7030,"Dimensity 7030 | octa Core| 2.5 GHz","5000 mAh",camera1,storage1);
       // System.out.println(mobile.toString());
        Mobile mobile1=new Mobile("Moto neo",7031,"Dimensity 7030 | octa Core| 2.5 GHz","5000 mAh",camera2,storage2);
        List<Mobile>list=new ArrayList<>();
        list.add(mobile);
        list.add(mobile1);
        System.out.println(list);
    }
}
