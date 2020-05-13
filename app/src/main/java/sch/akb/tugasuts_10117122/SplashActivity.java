package sch.akb.tugasuts_10117122;
/*Nama : Bonaventura Aldino Senda Seni
NIM    : 10117122
KELAS  : AKB-IF3
Tanggal Pengerjaan : 09 mei 2020*/
import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

public class SplashActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        Thread thread = new Thread() {
            public void run(){
            try  {
                sleep(4000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                startActivity(new Intent(SplashActivity.this, MainActivity.class));
                finish();
            }
            }
        };
        thread.start();
    }
}
