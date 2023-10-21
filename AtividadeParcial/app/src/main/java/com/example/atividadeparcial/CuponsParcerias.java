package com.example.atividadeparcial;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class ParceriaActivity extends AppCompatActivity {

    private ListView couponsListView;
    private List<Coupon> couponsList;
    private CouponAdapter couponAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cupons_parceria);

        couponsListView = findViewById(R.id.couponsListView);
        couponsList = new ArrayList<>();


        couponAdapter = new CouponAdapter(this, couponsList);
        couponsListView.setAdapter(couponAdapter);


        couponsListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Coupon selectedCoupon = couponsList.get(position);

            }
        });
    }
}

