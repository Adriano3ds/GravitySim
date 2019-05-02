package br.me.adriano.gravitysim;

import br.me.adriano.gravitysim.Utils.Physics.SimTime;

import javax.swing.*;

public class TimeSpeedControlGUI extends JFrame {

    boolean pauseStatus = false;
    JPanel panel;
    JLabel speedLabel;
    JButton speedUp, speedDown, pause, normal;
    SimTime simTime;

    public TimeSpeedControlGUI(SimTime simTime){
        this.simTime = simTime;
        setTitle("Time Speed Control");
        setSize(350, 80);
        initializeComponents();
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    private void initializeComponents(){
        panel = new JPanel();
        pause = new JButton("Pause");
        pause.addActionListener(e -> {
            if(!pauseStatus) {
                simTime.pause();
                pause.setText("Play");
            }else{
                simTime.unpause();
                pause.setText("Pause");
            }
            pauseStatus = !pauseStatus;
        });
        panel.add(pause);
        normal = new JButton("1x");
        normal.addActionListener(e -> {
            simTime.multiplyIntervalBy(1);
            speedLabel.setText("1x");
        });
        panel.add(normal);
        speedUp = new JButton("Speed+");
        speedUp.addActionListener(e -> speedLabel.setText(1.0/simTime.speedUp() + "x"));
        panel.add(speedUp);
        speedDown = new JButton("Speed-");
        speedDown.addActionListener(e -> speedLabel.setText(1.0/simTime.speedDown() + "x"));
        panel.add(speedDown);
        JSeparator separator = new JSeparator(JSeparator.HORIZONTAL);
        separator.setSize(10, 1);
        panel.add(separator);
        speedLabel = new JLabel();
        speedLabel.setText("1x");
        panel.add(speedLabel);
        add(panel);
    }

}

