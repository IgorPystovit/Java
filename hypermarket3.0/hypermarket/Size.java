package com.epam.hypermarket;

public class Size {
    private Double height;
    private Double length;
    private Double width;
    private Float radius;

    public Size(){}

    public Size(Double height,Double length,Double width){
        this.height = height;
        this.length = length;
        this.width = width;
    }

    public Size(Double height,Double length,Float radius){
        this.height = height;
        this.length = length;
        this.radius = radius;
    }

    public Size(Double length,Double width){
        this.length = length;
        this.width = width;
    }

    public Double getHeight() {
        return height;
    }

    public Double getLength() {
        return length;
    }

    public Double getWidth() {
        return width;
    }

    public Float getRadius() {
        return radius;
    }

    public boolean isSizeInRange(Double customHeight, Double customWidth, Double customLength){
        boolean isInRange = false;
        if ((customHeight != 0.0) && (customWidth != 0.0) && (customLength != 0.0)){
            if ((customHeight >= this.height) && (customWidth >= this.width) && (customLength >= this.length)){
                isInRange = true;
            }else{
                isInRange = false;
            }
        }else if (customHeight == 0){
            if ((customWidth >= this.width) && (customLength >= this.length)){
                isInRange = true;
            }else{
                isInRange = false;
            }
        }else if (customWidth == 0){
            if ((customHeight >= this.height) && (customLength >= this.length)){
                isInRange = true;
            }else{
                isInRange = false;
            }
        }else{
            if ((customHeight >= this.height) && (customWidth >= this.width)){
                isInRange = true;
            }else{
                isInRange = false;
            }
        }
        return isInRange;
    }
}
