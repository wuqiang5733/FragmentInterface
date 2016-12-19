package com.tuchangwei.fragmentinterface;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

/**
 * Created by WuQiang on 2016/12/19.
 */

public class FragmentTest extends Fragment implements View.OnClickListener {

    private Button loginButton;
    FragmentTest.Callbacks callbacks;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_test, container, false);
        loginButton = (Button) view.findViewById(R.id.fragment_login_loginButton);
        loginButton.setOnClickListener(this);
        return view;
    }

    @Override
    public void onClick(View view) {
        callbacks.onCallback("This come from Fragment");

    }
//    @Override
//    public void onAttach(Activity activity) {
//        super.onAttach(activity);
//        callbacks = (Callbacks) activity;
//    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        callbacks = (Callbacks)getActivity();
    }

    @Override
    public void onDetach() {
        super.onDetach();
        callbacks = null;
    }


    public interface Callbacks {
        void onCallback(String str);
    }
}
