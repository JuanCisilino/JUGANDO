package com.example.cumpledenicolas;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebSettings;
import android.webkit.WebView;


/**
 * A simple {@link Fragment} subclass.
 */
public class FragmentWasabiPlaylist extends Fragment {

    private WebView web;


    public FragmentWasabiPlaylist() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View mainView = inflater.inflate(R.layout.fragment_fragment_wasabi_playlist, container, false);
        WebView web = mainView.findViewById(R.id.webViewPlaylist);
        WebSettings webSettings = web.getSettings();
        webSettings.setJavaScriptEnabled(true);
        web.loadUrl("https://www.youtube.com/playlist?list=PLl7bBuL37E_8tKEaVhMhq-16KOnO5fZvB");
        // Inflate the layout for this fragment
        return mainView;


    }



}
