package com.kimjinhwan.android.rxandroidbasic01;

import java.util.ArrayList;
import java.util.List;

/**
 * 옵저버 패턴 이해하기
 * 1초에 한번씩 등록된 옵저버들에게 Hello 메시지를 날린다.
 */

public class Subject extends Thread {

    List<Observer> observers = new ArrayList<>();   //옵저버를 등록하는 저장소
    boolean run = true;

    @Override
    public void run() {
        while(run) {
            try {
                Thread.sleep(1000);
                for (Observer observer : observers) {
                    observer.notification("Hello");
                }

            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            super.run();
        }
    }


    //옵저버를 등록하는 함수
    public void addObserver(Observer observer){
        observers.add(observer);
    }

    public void removeObserver(int count){
        observers.remove(count);
    }

    public void clearObserver(){
        observers.clear();
    }


    //옵저버에 공지하는 함수
    public interface Observer {
        public void notification(String msg);
    }
}
