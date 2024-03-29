package com.example.hp.materialtabs;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.hp.materialtabs.R;

import java.util.ArrayList;
import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 */
public class LiftTakenFragment extends Fragment {

    private RecyclerView recycleView;
    private JAdapter adapter;
    public LiftTakenFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View layout= inflater.inflate(R.layout.fragment_lift_taken, container, false);
        recycleView=(RecyclerView)layout.findViewById(R.id.recyclerView);
        adapter=new JAdapter(getActivity(),getData());

        recycleView.setLayoutManager(new LinearLayoutManager(getActivity()));

        recycleView.setAdapter(adapter);

        return layout;
    }

    public static List<MyInfo> getData() {
        List<MyInfo> data = new ArrayList<MyInfo>();
        int nodeIc = R.drawable.node_to_node_green;
        int convoIc = R.drawable.convo_ic;

        String[][] info = {{"Johar, Karachi", "Iqra University Defence, Karachi"}
                , {"Iqra University Defence, Karachi", "Johar, Karachi"}, {"Askari VI", "Iqra University Defence, Karachi"}, {"Iqra University Defence, Karachi", "Askari VI"}};
        for (int i = 0; i < 4; i++) {
            MyInfo fo = new MyInfo();
            fo.info1 = info[i][0];
            fo.info2 = info[i][1];
            fo.convoIc = convoIc;
            fo.nodeIc = nodeIc;
            data.add(fo);
        }
        return data;
    }
}
