package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.os.Bundle;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class ActivityBluetooth extends AppCompatActivity {
    BluetoothAdapter bluetoothAdapter = BluetoothAdapter.getDefaultAdapter();
    List<String> dispositivosPareados = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bluetooth);
        Toast.makeText(ActivityBluetooth.this, "Listagem de bluetooth", Toast.LENGTH_SHORT).show();

        Set<BluetoothDevice> pairedDevices = bluetoothAdapter.getBondedDevices();

        if (pairedDevices.size() > 0){
            for(BluetoothDevice device : pairedDevices){
                String deviceName = device.getName();
                dispositivosPareados.add(deviceName);
                String deviceHardwareAddress =device.getAddress();
            }
        }
        Toast.makeText(ActivityBluetooth.this, "Listagem de bluetooth", Toast.LENGTH_SHORT).show();
    }

}