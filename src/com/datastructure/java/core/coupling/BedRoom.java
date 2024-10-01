package com.datastructure.java.core.coupling;

public class BedRoom {
    String paintcolour;
    String style;
    String comment;

    public BedRoom(String paintcolour, String style, String comment) {
        this.paintcolour = paintcolour;
        this.style = style;
        this.comment = comment;
    }

    public String getPaintcolour() {
        return paintcolour;
    }

    public void setPaintcolour(String paintcolour) {
        this.paintcolour = paintcolour;
    }

    public String getStyle() {
        return style;
    }

    public void setStyle(String style) {
        this.style = style;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    @Override
    public String toString() {
        return "BedRoom{" +
                "paintcolour='" + paintcolour + '\'' +
                ", style='" + style + '\'' +
                ", comment='" + comment + '\'' +
                '}';
    }
}
