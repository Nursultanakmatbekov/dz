package com.example.dz3;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.google.android.material.button.MaterialButton;

public class FirstFragment extends Fragment {
    private EditText edPassword;
    private MaterialButton buttomInput;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_first, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        initialize(view);
        onClick();
    }

    private void initialize(View view) {
        edPassword = view.findViewById(R.id.ed_password);
        buttomInput = view.findViewById(R.id.button_input);
    }
    private void onClick() {
        buttomInput.setOnClickListener(view -> {
            String password = edPassword.getText().toString().trim();
            if (!password.equals("admin")) {
               edPassword.setError("error");
            } else {
                getParentFragmentManager().beginTransaction()
                        .setCustomAnimations(R.anim.enter_right_to_left,R.anim.enter_left_to_right)
                        .replace(R.id.fragment_container,new RecyclerFragment())
                        .addToBackStack("FirstFragment")
                        .commit();
            }
        });
    }
}



