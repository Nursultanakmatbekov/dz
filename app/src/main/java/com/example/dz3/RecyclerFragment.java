package com.example.dz3;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

public class RecyclerFragment extends Fragment {

    private ListOfLanguagesAdapter adapter = new ListOfLanguagesAdapter();
    private final List<String> listFromLanguages = new ArrayList<>();
    private RecyclerView rvListOfLanguages;
    
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_recycler, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        rvListOfLanguages = view.findViewById(R.id.rv_list_of_languages);
        listFromLanguages.add("Русский");
        listFromLanguages.add("Английский");
        listFromLanguages.add("Грузинский");
        listFromLanguages.add("Казахский");
        listFromLanguages.add("Японский");
        listFromLanguages.add("Китайский");
        listFromLanguages.add("Ирландский");
        listFromLanguages.add("Индонейский");
        listFromLanguages.add("Чевшский");
        listFromLanguages.add("Немецкий");
        listFromLanguages.add("Греческий");
        listFromLanguages.add("Украинский");
        listFromLanguages.add("Узбекский");
        listFromLanguages.add("Уйгурский");
        listFromLanguages.add("Туркменский");
        listFromLanguages.add("Турецкий");
        listFromLanguages.add("Татарский");
        listFromLanguages.add("Македонский");
        listFromLanguages.add("Гавайский");
        initialize();
        adapter.setData(listFromLanguages);
    }

    private void initialize() {
        rvListOfLanguages.setLayoutManager(new LinearLayoutManager(getContext(),LinearLayoutManager.VERTICAL,false));
        rvListOfLanguages.setAdapter(adapter);
    }
}
