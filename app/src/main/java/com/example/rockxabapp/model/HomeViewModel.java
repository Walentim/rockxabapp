package com.example.rockxabapp.model;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;

import com.example.rockxabapp.R;

public class HomeViewModel extends AndroidViewModel {

    int navigationOpSelected = R.id.opHome;

    public HomeViewModel(@NonNull Application application) {
        super(application);
    }

    public int getNavigationOpSelected() {
        return navigationOpSelected;
    }

    public void setNavigationOpSelected(int navigationOpSelected) {
        this.navigationOpSelected = navigationOpSelected;
    }
}
