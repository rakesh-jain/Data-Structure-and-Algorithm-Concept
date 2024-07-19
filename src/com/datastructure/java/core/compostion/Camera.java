package com.datastructure.java.core.compostion;

public class Camera{
    private String frontcam;
    private String RearCam;
    public Camera(String frontcam, String rearCam) {
        this.frontcam = frontcam;
        RearCam = rearCam;
    }
    public String getFrontcam() {
        return frontcam;
    }

    public void setFrontcam(String frontcam) {
        this.frontcam = frontcam;
    }

    public String getRearCam() {
        return RearCam;
    }

    public void setRearCam(String rearCam) {
        RearCam = rearCam;
    }
    @Override
    public String toString() {
        return "Camera{" +
                "frontCam='" + frontcam + '\'' +
                ", RearCam='" + RearCam + '\'' +
                '}';
    }
}
