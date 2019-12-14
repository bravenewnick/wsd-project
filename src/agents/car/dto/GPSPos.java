package agents.car.dto;

import java.io.Serializable;
import java.util.Random;

public class GPSPos implements Serializable {

    private int xCordOfCar;
    private int yCordOfCar;

    public GPSPos(int minCordX, int maxCordY, boolean random) {
        if(random){
            Random randomCord = new Random();
            this.xCordOfCar = minCordX + randomCord.nextInt(maxCordY);
            this.yCordOfCar = minCordX + randomCord.nextInt(maxCordY);
        }else{
            this.xCordOfCar = minCordX;
            this.yCordOfCar = maxCordY;
        }
    }


    public int getxCordOfCar() {
        return xCordOfCar;
    }

    public void setxCordOfCar(int xCordOfCar) {
        this.xCordOfCar = xCordOfCar;
    }

    public int getyCordOfCar() {
        return yCordOfCar;
    }

    public void setyCordOfCar(int yCordOfCar) {
        this.yCordOfCar = yCordOfCar;
    }
}