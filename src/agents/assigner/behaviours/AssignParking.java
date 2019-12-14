package agents.assigner.behaviours;

import agents.assigner.dto.DBConnector;

import agents.car.dto.GPSPos;
import jade.core.AID;
import jade.core.behaviours.CyclicBehaviour;
import jade.lang.acl.ACLMessage;
import jade.lang.acl.UnreadableException;

import java.io.IOException;


public class AssignParking extends CyclicBehaviour {
    private int step = 0;
    private AID carAgent;
    private GPSPos gpsPos;

    public void action() {

        switch (step) {
            case 0:
                // receive GPSPosition from car
                ACLMessage message = myAgent.receive();
                if (message != null) {
                    try {
                        gpsPos = (GPSPos) message.getContentObject();
                        carAgent = message.getSender();
                        step = 1;

                        System.out.println("message from car: " + carAgent.getName() + "\nx: " + gpsPos.getxCordOfCar() + "\ny: " + gpsPos.getyCordOfCar());

                    } catch (UnreadableException e) {
                        e.printStackTrace();
                    }
                } else
                    block();

                break;

            case 1:
                // TODO reply with candidate pos


                break;
        }
    }

}