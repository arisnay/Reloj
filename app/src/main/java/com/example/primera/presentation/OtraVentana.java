package com.example.primera.presentation;
import android.os.Bundle
import androidx.activity.ComponentActivity
import com.example.a2025.R
import com.example.primera.R;

public class OtraVentana: ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?){
        super.onCreate(savedInstanceState)
                setContentWiew(R.layout.otra_ventana);
    }
}
