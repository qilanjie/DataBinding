package com.qwh.databinding;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import android.database.DatabaseUtils;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.qwh.databinding.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
//Button button;
//TextView textView;
MyViewModel myViewModel;
ActivityMainBinding activityMainBinding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
        activityMainBinding= DataBindingUtil.setContentView(this,R.layout.activity_main);
//        button=findViewById(R.id.button);
//        textView=findViewById(R.id.textView);
        myViewModel=new ViewModelProvider(this).get(MyViewModel.class);
        activityMainBinding.setData(myViewModel);
        activityMainBinding.setLifecycleOwner(this);
//        myViewModel.getNumber().observe(this, new Observer<Integer>() {
//            @Override
//            public void onChanged(Integer integer) {
////                textView.setText(String.valueOf(integer));
//                activityMainBinding.textView.setText(String.valueOf(integer));
//            }
//        });
//        activityMainBinding.button.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                myViewModel.add();
//            }
//        });
    }
}