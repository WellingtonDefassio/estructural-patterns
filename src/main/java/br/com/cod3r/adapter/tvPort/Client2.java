package br.com.cod3r.adapter.tvPort;

import br.com.cod3r.adapter.tvPort.adapters.HDMIToOldMonitorAdapter;
import br.com.cod3r.adapter.tvPort.adapters.HDMIToVGAAdapter;
import br.com.cod3r.adapter.tvPort.devices.Computer;
import br.com.cod3r.adapter.tvPort.devices.OldMonitor;
import br.com.cod3r.adapter.tvPort.devices.TV;

public class Client2 {


    public static void main(String[] args) {

        OldMonitor oldMonitor = new OldMonitor();
        TV tv = new TV();
        HDMIToOldMonitorAdapter hdmiToOldMonitorAdapter = new HDMIToOldMonitorAdapter();
        HDMIToVGAAdapter hdmiToVGAAdapter = new HDMIToVGAAdapter(oldMonitor);

        Computer computer = new Computer();

        computer.connectPort(hdmiToVGAAdapter);
        computer.sendImageAndSound("entra imagem", "entra som");




    }



}
