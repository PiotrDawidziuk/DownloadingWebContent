package pl.apka.downloadingwebcontentapp;

import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import java.net.URL;

public class MainActivity extends AppCompatActivity {

    public class DownloadTask extends AsyncTask<String, Void, String> {
        @Override
        protected String doInBackground(String... strings) {

            String result = "";
            URL url;

            return "Done";
        }

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        DownloadTask task = new DownloadTask();

        String result = null;

        try {
            result = task.execute("https://zappycode.com/").get();
        } catch (Exception e) {
            e.printStackTrace();
        }

        Log.i("Result", result);
        }
}
