package com.example.thkim_ptj14_1;

import android.app.Service;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.IBinder;

import androidx.annotation.Nullable;

public class MusicService extends Service {
    MediaPlayer mp;

    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override
    public void onCreate() {
        android.util.Log.i("서비스 테스트", "onCreate()");
        super.onCreate(); }

    @Override
    public void onDestroy() {
        android.util.Log.i("서비스 테스트", "onCreate()");
//음악 나오지 않게
        mp.stop();
        super.onDestroy(); }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
//음악 나오게
        android.util.Log.i("서비스 테스트", "onCreate()");
        mp = MediaPlayer.create(this, R.raw.song1);
        mp.setLooping(true);
        mp.start(); //음악 시작
        return super.onStartCommand(intent, flags, startId);
    }
}
