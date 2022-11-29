package com.mycompany.pr28v;
import android.app.*;
import android.os.*;
import android.view.*;
import android.widget.*;

public class MainActivity extends Activity {
    EditText etUsername,etPassword;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        etUsername =findViewById(R.id.etUsername);
        etPassword =findViewById(R.id.etPassword);}
    public void login(View view) {
        String msg = validateUser();
        Toast.makeText(MainActivity.this, msg, Toast.LENGTH_SHORT).show();}
    private String validateUser() {
        String uname = etUsername.getText().toString();
        String pwd = etPassword.getText().toString();
        if(uname.equals("") || pwd.equals("")) {
            return "Plz enter both username and password";}
        if(uname.equals("Raj") && pwd.equals("admin")) {
            return "Login Successful";}
        else {
            return "Login Unuccessful";}}}
