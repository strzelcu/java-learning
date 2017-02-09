/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rozdzial8;

import static util.Print.print;

/**
 *
 * @author Strzelcu
 */

class AlertStatus {
    public void makeAlert() {
        print("AlertStatus.showAlert()");
    }
}

class RedAlertStatus extends AlertStatus {
    @Override
    public void makeAlert() {
        print("RedAlertStatus.showAlert()");
    }
}

class BlueAlertStatus extends AlertStatus {
    @Override
    public void makeAlert() {
        print("BlueAlertStatus.showAlert()");
    }
}

class GreenAlertStatus extends AlertStatus {
    @Override
    public void makeAlert() {
        print("GreenAlertStatus.showAlert()");
    }
}

class Starship {
    private AlertStatus alert = new GreenAlertStatus();
    
    public void changeToRedAlert() {
        alert = new RedAlertStatus();
    }
    
    public void changeToBlueAlert() {
        alert = new BlueAlertStatus();
    }
    
    public void changeToGreenAlert() {
        alert = new GreenAlertStatus();
    }
    
    public void showAlert() {
        alert.makeAlert();
    }
}

public class Test16 {
    public static void main(String[] args) {
        Starship starship = new Starship();
        starship.showAlert();
        starship.changeToBlueAlert();
        starship.showAlert();
        starship.changeToRedAlert();
        starship.showAlert();
        starship.changeToGreenAlert();
        starship.showAlert();
    }
}
