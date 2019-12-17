package id.ac.polinema.settingsexample.fragments;

import android.os.Bundle;

import androidx.preference.PreferenceFragmentCompat;

import id.ac.polinema.settingsexample.R;

public class SettingsFragment extends PreferenceFragmentCompat {
    @Override
    public void onCreatePreferences(Bundle savedInstanceState, String rootKey) {
        //kode untuk mengatur layout preferences yang diinginkan
        setPreferencesFromResource(R.xml.preferences, rootKey);
    }
}
