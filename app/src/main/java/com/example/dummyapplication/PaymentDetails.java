package com.example.dummyapplication;


import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
import com.example.dummyapplication.ResponseModel.PaymentResponse;


public class PaymentDetails extends AppCompatActivity {
    TextView txtId, txtAmount, txtStatus;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_payment_details);
        txtId = findViewById(R.id.txtId);
        txtAmount = findViewById(R.id.txtAmount);
        txtStatus = findViewById(R.id.txtStatus);
        Intent intent = this.getIntent();
        Bundle bundle = intent.getExtras();
        String amount=intent.getStringExtra("Amount");
        PaymentResponse paymentResponse= (PaymentResponse) bundle.getSerializable("payment response");
        txtAmount.setText(amount);
        txtStatus.setText(paymentResponse.getResponse().getState());
        txtId.setText(paymentResponse.getResponse().getId());
    }
}

