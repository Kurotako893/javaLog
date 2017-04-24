package jp.techacademy.machida.kenji.javalog;

import android.util.Log;

class Human extends Animal implements Thinkable{

    String hobby;   //  メンバ変数

    //  コンストラクタ
    public Human(String name, int age, String hobby){
        this.name = name;       //  名前
        this.age = age;         //  年齢
        this.hobby = hobby;     //   趣味
    }

    //  メンバ関数
    //  自己紹介
    @Override
    public void say(){
        Log.d("javatest", "私の名前は" +  this.name + "です。" +
                "" + "年は" + this.age + "歳" + "です。");
    }

    //  私の考え
    @Override
    public void think(){
        Log.d("javatest", "私は" + this.hobby + "について考える");
    }
}
