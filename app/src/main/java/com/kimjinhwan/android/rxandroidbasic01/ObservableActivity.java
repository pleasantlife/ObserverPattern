package com.kimjinhwan.android.rxandroidbasic01;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import io.reactivex.Observable;
import io.reactivex.ObservableEmitter;
import io.reactivex.ObservableOnSubscribe;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;

/**
 * 옵저버블 사용전 gradle에 dependency 추가
 */

public class ObservableActivity extends AppCompatActivity {

    //문자열을 발행하는 옵저버블
    Observable<String> observable;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_observable);

        createObservable();
        bindObserver();
    }

    /**
    //옵저버블 생성 (오리지널 자바 스타일)
    private void createObservable(){
        observable = Observable.create(new ObservableOnSubscribe<String>() {
            @Override
            public void subscribe(ObservableEmitter<String> e) throws Exception {
                e.onNext("Hello RxAndroid");
                e.onNext("Good to see you!");
                e.onComplete();
            }
        });
    }
    */


    //옵저버블 생성 (Lambda)
    private void createObservable(){

        observable = Observable.create(emitter -> {
                emitter.onNext("Hello RxAndroid");
                emitter.onNext("Good to see you");
                emitter.onComplete();
        });
    }


    private void bindObserver(){
        Observer<String> observer = new Observer<String>() {

            @Override
            public void onSubscribe(Disposable d) {

            }

            @Override
            public void onNext(String value) {
                Log.e("OnNext","================"+value);
            }

            @Override
            public void onError(Throwable e) {
                Log.e("OnError", "xxxxxxxxxxxxxxxxx"+e.getMessage());
            }

            @Override
            public void onComplete() {
                Log.w("OnComplete","ooooooooooooooo complete!");
            }
        };
        observable.subscribe(observer);


        // 옵저버 내에 있는 하나의 함수만
        Consumer<String> onNext = new Consumer<String>(){

            @Override
            public void accept(String s) throws Exception {
                Log.e("onNext","==============="+s);
            }
        };

        Consumer<String> onError = new Consumer<String>() {
            @Override
            public void accept(String s) throws Exception {

            }
        };




        observable.subscribe(str-> Log.e("OnNext","=================="+str),
                throwable -> Log.e("OnError","xxxxxxxxxxxx"+throwable.getMessage()),
                () -> Log.w("OnComplete","oooooooooooooooo complete!")
        );
    }

    /**
    //옵저버 등록
    private void bindObserver(){
        Observer<String> observer = new Observer<String>() {
            @Override
            public void onSubscribe(Disposable d) {

            }

            @Override
            public void onNext(String value) {
                System.out.print(value);
            }

            @Override
            public void onError(Throwable e) {

            }

            @Override
            public void onComplete() {
                System.out.println("Complete");
            }
        };
        observable.subscribe(observer);
    }
     */

}
