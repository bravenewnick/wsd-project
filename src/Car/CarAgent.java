package Car;
import jade.core.Agent;



public class CarAgent extends Agent{
    protected void setup() {
        System.out.println("Agent auto "+getAID().getName()+" zaczal dzialanie.");
    }

    protected void takeDown() {
        //myGui.dispose();
        System.out.println("Agent auto "+getAID().getName()+" zakonczyl.");
    }


}