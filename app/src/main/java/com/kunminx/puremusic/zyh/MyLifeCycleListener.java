package com.kunminx.puremusic.zyh;

import android.util.Log;

import androidx.annotation.NonNull;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.OnLifecycleEvent;

/**
 *  PureMusic
 *
 * @author zhengyouhong
 * @date 2020/6/9
 */
public class MyLifeCycleListener implements DefaultLifecycleObserver, LifecycleEventObserver {

    private static final String TAG = "MyLifeCycleListener";


//    @Override
//    public void onCreate(@NonNull LifecycleOwner owner) {
//        Log.e(TAG, "onCreate");
//    }
//
//    @Override
//    public void onStart(@NonNull LifecycleOwner owner) {
//        Log.e(TAG, "onStart");
//    }
//
//    @Override
//    public void onResume(@NonNull LifecycleOwner owner) {
//        Log.e(TAG, "onResume");
//    }
//
//    @Override
//    public void onStop(@NonNull LifecycleOwner owner) {
//        Log.e(TAG, "onStop");
//    }
//
//    @Override
//    public void onPause(@NonNull LifecycleOwner owner) {
//        Log.e(TAG, "onPause");
//    }

    @OnLifecycleEvent(Lifecycle.Event.ON_CREATE)
    public void create() {
        Log.e(TAG, "annotation create");
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
    public void resume() {
        Log.e(TAG, "annotation resume");
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_START)
    public void start() {
        Log.e(TAG, "annotation start");
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_STOP)
    public void stop() {
        Log.e(TAG, "annotation stop");
    }


    @OnLifecycleEvent(Lifecycle.Event.ON_PAUSE)
    public void pause() {
        Log.e(TAG, "annotation pause");
    }


    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    public void destroy() {
        Log.e(TAG, "annotation destroy");
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_ANY)
    public void any() {
        Log.e(TAG, "annotation any");
    }

    @Override
    public void onStateChanged(@NonNull LifecycleOwner source, @NonNull Lifecycle.Event event) {
        Log.e(TAG, event.name());
    }
}
