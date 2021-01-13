package com.example.checkapartment;

import android.os.Bundle;
import android.renderscript.ScriptGroup;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;
import androidx.navigation.fragment.NavHostFragment;
import androidx.recyclerview.widget.LinearLayoutManager;

import com.example.checkapartment.databinding.FragmentFirstBinding;

public class FirstFragment extends Fragment implements IAdapter {
    private FragmentFirstBinding binding;
    private ApartmentData apartmentData = new ApartmentData();

    @Override
    public View onCreateView(
            LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState
    ) {
        binding = FragmentFirstBinding.inflate(inflater, container, false);
        AdapterList adapterList = new AdapterList(apartmentData.apartmentList(),this);
        binding.rv.setAdapter(adapterList);
        binding.rv.setLayoutManager(new LinearLayoutManager(getContext()));
        return binding.getRoot();
    }

    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

    }

    @Override
    public void passApartment(Apartment passApartment) {
        Bundle bundle = new Bundle();
        bundle.putString("Nombre Edificio", passApartment.getBuildingName());
        bundle.putString("Departamento", passApartment.getUnitId());
        bundle.putString("Direccion", passApartment.getAddress());
        bundle.putString("image", passApartment.getUrlImageBuilding());
        Navigation.findNavController(binding.getRoot())
                .navigate(R.id.action_FirstFragment_to_SecondFragment, bundle);
    }
}