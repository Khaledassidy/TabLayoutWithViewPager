package com.example.tablayoutviewpager;

import android.content.Context;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link CategoryFragment#newInstance} factory method to
 * create an instance of this fragment.
 */

//hala2 hay l fragemnt le mawjoude bel viewpager hal tkoun most2ble 2aw morsele l2no l fragemnt heye ya btkoun morsle ya morsle :
//bas b7aletna hay ne7na badna ned8at 3ala tab yrou7 yersel esm tab 2aw l id lal fragemnt 3ashen l fragemnt te3reda bel viewpager fa ma byelzmne joz2eyet  lisner byelzmne bas jez2eyet l btest2bel le heye l argument w be2e l eshya
//tyeb l data le bade est2bela mn l fragemnt hye 3ebara 3an esm l category  fa b5ale nafs esm l argument Arg_Parms bas b8ayer tasmyetoun Arg_id,arg_name
public class CategoryFragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_ID = "id";
    private static final String ARG_NAME= "name";


    // TODO: Rename and change types of parameters
    private int id;
    private String name;

    public CategoryFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param id Parameter 1.
     * @param name Parameter 2.
     * @return A new instance of fragment CategoryFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static CategoryFragment newInstance(int id, String name) {
        CategoryFragment fragment = new CategoryFragment();
        Bundle args = new Bundle();
        args.putInt(ARG_ID, id);
        args.putString(ARG_NAME, name);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
        Log.d("khaled","onattach");
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            id = getArguments().getInt(ARG_ID);
            name = getArguments().getString(ARG_NAME);
        }
        Log.d("khaled","onacreate");

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        Log.d("khaled","onacreateview");

        return inflater.inflate(R.layout.fragment_category, container, false);

    }

    //bas tare2a l a7san la na3mel inflate lal view w ba3den n3abe fe data bel onviewcreated l2no l view le bta3mla return l oncreate 7a tosl ka parameter lal onviewcreated ka parameter w heye a7san l2no bhay l method btet2akad eno l view tam enshe2a 100 bel 100
    //ba3d ma ytem enshe2a enta bt3abe l 3anser w bt3del 3lyhoun laken l oncreate abl ma ytem enshe2a l far2 da2e2 jedan bas 3al jehten btemshe bas bhay tare2a a7san

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        TextView textView=view.findViewById(R.id.text_fragment);
        textView.setText(name);
        Log.d("khaled","onaviewcreated");


    }

    @Override
    public void onPause() {
        super.onPause();
        Log.d("khaled","onpause");

    }

    @Override
    public void onStop() {
        super.onStop();
        Log.d("khaled","onpause");

    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        Log.d("khaled","ondestroyview");

    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.d("khaled","ondestriy");

    }

    @Override
    public void onDetach() {
        super.onDetach();
        Log.d("khaled","ondetach");

    }
}