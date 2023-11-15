package com.workintech.OOP;

public class Wall {
    double width;
    double height;

    public Wall(double width, double height){
        checkWidth(width);
        checkHeight(height);
        this.width = width;
        this.height = height;
    }

    public void checkWidth(double width){
        if(width<0){
            this.width = 0;
        }
        else{
            this.width = width;
        }
    }

    public void checkHeight(double height){
        if(height<0){
            this.height = 0;
        }
        else{
            this.height = height;
        }
    }

    public void setWidth(double width){
        checkWidth(width);
        this.width = width;
    }

    public void setHeight(double height){
        checkHeight(height);
        this.height = height;
    }

    public double getWidth(){

        checkWidth(this.width);
        return this.width;
    }

    public double getHeight(){
        checkHeight(this.height);
        return this.height;
    }

    public double getArea(){
      return  getHeight() * getWidth();
    }

}
