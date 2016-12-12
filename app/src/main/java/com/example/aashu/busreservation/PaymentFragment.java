package com.example.aashu.busreservation;


import android.app.Fragment;
import android.app.FragmentManager;
import android.os.Bundle;
import android.support.design.widget.CoordinatorLayout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class PaymentFragment extends Fragment {

    private CoordinatorLayout coordinatorLayout;
    private Button card_payment_button,netBanking_button;

    public View onCreateView(LayoutInflater inflater, final ViewGroup container,
                             final Bundle savedInstanceState) {
        final View rootView = inflater.inflate(R.layout.fragment_payment, container, false);

        coordinatorLayout = (CoordinatorLayout) rootView.findViewById(R.id.coordinatorLayout);
        card_payment_button=(Button)rootView.findViewById(R.id.card_payment_button);
        netBanking_button=(Button)rootView.findViewById(R.id.netBanking_button);

        card_payment_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Bundle args = new Bundle();
                PaymentDelivery fragment = new PaymentDelivery();
                fragment.setArguments(args);
                FragmentManager fragmentManager = getFragmentManager();
                fragmentManager.beginTransaction().replace(R.id.frame_payment, fragment).addToBackStack(null).commit();
            }

        });

        netBanking_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        return rootView;
    }
}