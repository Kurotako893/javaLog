package jp.techacademy.machida.kenji.javalog;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Human human = new Human("エド", 15, "錬金術");   //  インスタンス生成
        human.say();                                       //   メンバ関数（自己紹介Log出力）
        human.think();                                     //   メンバ関数（考え紹介Log出力）


        /* とりあえず消していないだけです。気にしないでください。
        Dog dog = new Dog("ポチ", 3);     //  インスタンス生成
        dog.say();  //  メンバ関数（Log出力）
        Log.d("javatest","犬の名前は" + dog.name + "です。");
        Log.d("javatest","犬の年齢は" + dog.age + "です。");
        dog.move();

        Dog.introduce(); //  クラス関数（Log出力）
        Log.d("javatest","犬の名前は" + Dog.to_jp + "です。");
        Log.d("javatest","犬の年齢は" + dog.age + "です。");

        BigDog bigdog = new BigDog("ヨーゼフ", 15);
        BigDog.introduce();
        bigdog.say();
        Log.d("javatest","犬の名前は" + bigdog.name + "です。");
        Log.d("javatest","犬の年齢は" + bigdog.age + "です。");
        */
    }
}
