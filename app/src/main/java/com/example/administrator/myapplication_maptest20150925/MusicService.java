package com.example.administrator.myapplication_maptest20150925;

import android.app.Service;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Environment;
import android.os.IBinder;
import android.util.Log;
import android.widget.Toast;

import java.io.File;

/**
 * Created by user on 2015/10/27.
 */
public class MusicService extends Service {
    private MediaPlayer myplayer;
    @Override
    public IBinder onBind(Intent i) {
        return null;
    }
    @Override
    public void onCreate() {
        myplayer = new MediaPlayer();
        try {
            File file = searchsong();
            if (file == null) {
                Toast.makeText(this, "找不到可以撥放的音樂",
                        Toast.LENGTH_SHORT).show();
                return;
            }
            myplayer.setDataSource("/storage/ext_sd/banana.mp3");//如果不行就用絕對路徑  第一次試有直接抓到
            Log.d("music","setDataSource : "+ file.getPath()); ///storage/emulated/0/happy.mp3
            myplayer.setOnCompletionListener(comL);
            myplayer.prepare();
        } catch (Exception e) {
        }
    }
    MediaPlayer.OnCompletionListener comL = new MediaPlayer.OnCompletionListener() {
        @Override
        public void onCompletion(MediaPlayer nouse) {
            try {
                myplayer.stop();
                myplayer.prepare();
            } catch (Exception e){
            }
            stopSelf();
        }
    };
    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        boolean isPause = intent.getBooleanExtra("KEY_ISPAUSE", true);
        if (isPause == true) {
            if(myplayer.isPlaying() == false) return 0;
            try {
                myplayer.pause();
            } catch (Exception e) {
            }
        } else {
            try {
                myplayer.start();
            } catch (Exception e) {
            }
        }
        return 0;
    }
    @Override
    public void onDestroy() {
        try {
            myplayer.stop();
            myplayer.prepare();
        } catch (Exception e) {
        }
    }

    File searchsong() {
        File sdcard = Environment.getExternalStorageDirectory();
        File files [] = sdcard.listFiles();

        for (int i = 0; i < files.length; i++) {
            File f = files[i];
            if (f.isFile() == false) continue;
            String name = f.getName();
            int start = name.lastIndexOf('.');
            String subname = name.substring(start+1);
            if (subname.equalsIgnoreCase("mp3")) return f;
        }
        return null;
    }
}




