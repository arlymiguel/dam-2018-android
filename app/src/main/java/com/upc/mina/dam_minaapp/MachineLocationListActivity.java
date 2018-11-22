package com.upc.mina.dam_minaapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.upc.mina.dam_minaapp.adapter.MachineAdapter;
import com.upc.mina.dam_minaapp.model.Machine;

import java.util.ArrayList;
import java.util.List;

public class MachineLocationListActivity extends AppCompatActivity {

    ListView lvMachineList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_machine_location_list);

        lvMachineList = findViewById(R.id.machineList);

        List<Machine> machineList = new ArrayList<Machine>();

        Machine machine=new Machine();
        machine.setPiloto("Piloto: Arly Fernandez");
        machine.setPlaca("Placa: ASD-234");
        machineList.add(machine);

        machine=new Machine();
        machine.setPiloto("Piloto: Terry Salazar");
        machine.setPlaca("Placa: RTG-123");
        machineList.add(machine);

        machine=new Machine();
        machine.setPiloto("Piloto: Alejandro Pardo");
        machine.setPlaca("Placa: TYU-444");
        machineList.add(machine);

        MachineAdapter machineAdapter=new MachineAdapter(this,machineList);

        //ArrayAdapter<Machine> arrayAdapter = new ArrayAdapter<Machine>(this, R.layout.item_machine, machineList );

        lvMachineList.setAdapter(machineAdapter);

    }
}
