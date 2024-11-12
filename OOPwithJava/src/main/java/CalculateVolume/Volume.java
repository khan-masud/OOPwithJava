package CalculateVolume;

public class Volume {
    double height, width, depth;
    
    Volume(double height, double width, double depth) {
        this.height = height;
        this.width = width;
        this.depth = depth;
        // this keyword is for indicating the instance variable
        
        double volume = height * width * depth;
        System.out.println("Volume : " + volume);
    }
}


