package com.example.n2;

import androidx.appcompat.app.AppCompatActivity;

public class Puzzle  extends AppCompatActivity {
    Button[] btn = new Button[16];
    float y, x;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn[0] = findViewById(R.id.btnNone);
        btn[1] = findViewById(R.id.btn1);
        btn[2] = findViewById(R.id.btn2);
        btn[3] = findViewById(R.id.btn3);
        btn[4] = findViewById(R.id.btn4);
        btn[5] = findViewById(R.id.btn5);
        btn[6] = findViewById(R.id.btn6);
        btn[7] = findViewById(R.id.btn7);
        btn[8] = findViewById(R.id.btn8);
        btn[9] = findViewById(R.id.btn9);
        btn[10] = findViewById(R.id.btn10);
        btn[11] = findViewById(R.id.btn11);
        btn[12] = findViewById(R.id.btn12);
        btn[13] = findViewById(R.id.btn13);
        btn[14] = findViewById(R.id.btn14);
        btn[15] = findViewById(R.id.btn15);

        init();
    }

    public void init(){
        btn[1].setBackgroundResource(R.drawable.android_piece1);
        btn[2].setBackgroundResource(R.drawable.android_piece2);
        btn[3].setBackgroundResource(R.drawable.android_piece3);
        btn[4].setBackgroundResource(R.drawable.android_piece4);
        btn[5].setBackgroundResource(R.drawable.android_piece5);
        btn[6].setBackgroundResource(R.drawable.android_piece6);
        btn[7].setBackgroundResource(R.drawable.android_piece7);
        btn[8].setBackgroundResource(R.drawable.android_piece8);
        btn[9].setBackgroundResource(R.drawable.android_piece9);
        btn[10].setBackgroundResource(R.drawable.android_piece10);
        btn[11].setBackgroundResource(R.drawable.android_piece11);
        btn[12].setBackgroundResource(R.drawable.android_piece12);
        btn[13].setBackgroundResource(R.drawable.android_piece13);
        btn[14].setBackgroundResource(R.drawable.android_piece14);
        btn[15].setBackgroundResource(R.drawable.android_piece15);




    }


    public void onClick(View view){
        switch (view.getId()){
            case R.id.btn1:
                y = btn[1].getY();
                x = btn[1].getX();
                btn[1].setY(btn[0].getY());
                btn[0].setY(y);
                btn[1].setX(btn[0].getX());
                btn[0].setX(x);
                break;
            case R.id.btn2:
                y = btn[2].getY();
                x = btn[2].getX();
                btn[2].setY(btn[0].getY());
                btn[0].setY(y);
                btn[2].setX(btn[0].getX());
                btn[0].setX(x);
                break;
            case R.id.btn3:
                y = btn[3].getY();
                x = btn[3].getX();
                btn[3].setY(btn[0].getY());
                btn[0].setY(y);
                btn[3].setX(btn[0].getX());
                btn[0].setX(x);
                break;
            case R.id.btn4:
                y = btn[4].getY();
                x = btn[4].getX();
                btn[4].setY(btn[0].getY());
                btn[0].setY(y);
                btn[4].setX(btn[0].getX());
                btn[0].setX(x);
                break;
            case R.id.btn5:
                y = btn[5].getY();
                x = btn[5].getX();
                btn[5].setY(btn[0].getY());
                btn[0].setY(y);
                btn[5].setX(btn[0].getX());
                btn[0].setX(x);
                break;
            case R.id.btn6:
                y = btn[6].getY();
                x = btn[6].getX();
                btn[6].setY(btn[0].getY());
                btn[0].setY(y);
                btn[6].setX(btn[0].getX());
                btn[0].setX(x);
                break;
            case R.id.btn7:
                y = btn[7].getY();
                x = btn[7].getX();
                btn[7].setY(btn[0].getY());
                btn[0].setY(y);
                btn[7].setX(btn[0].getX());
                btn[0].setX(x);
                break;
            case R.id.btn8:
                y = btn[8].getY();
                x = btn[8].getX();
                btn[8].setY(btn[0].getY());
                btn[0].setY(y);
                btn[8].setX(btn[0].getX());
                btn[0].setX(x);
                break;
            case R.id.btn9:
                y = btn[9].getY();
                x = btn[9].getX();
                btn[9].setY(btn[0].getY());
                btn[0].setY(y);
                btn[9].setX(btn[0].getX());
                btn[0].setX(x);
                break;
            case R.id.btn10:
                y = btn[10].getY();
                x = btn[10].getX();
                btn[10].setY(btn[0].getY());
                btn[0].setY(y);
                btn[10].setX(btn[0].getX());
                btn[0].setX(x);
                break;
            case R.id.btn11:
                y = btn[11].getY();
                x = btn[11].getX();
                btn[11].setY(btn[0].getY());
                btn[0].setY(y);
                btn[11].setX(btn[0].getX());
                btn[0].setX(x);
                break;
            case R.id.btn12:
                y = btn[12].getY();
                x = btn[12].getX();
                btn[12].setY(btn[0].getY());
                btn[0].setY(y);
                btn[12].setX(btn[0].getX());
                btn[0].setX(x);
                break;
            case R.id.btn13:
                y = btn[13].getY();
                x = btn[13].getX();
                btn[13].setY(btn[0].getY());
                btn[0].setY(y);
                btn[13].setX(btn[0].getX());
                btn[0].setX(x);
                break;
            case R.id.btn14:
                y = btn[14].getY();
                x = btn[14].getX();
                btn[14].setY(btn[0].getY());
                btn[0].setY(y);
                btn[14].setX(btn[0].getX());
                btn[0].setX(x);
                break;
            case R.id.btn15:
                y = btn[15].getY();
                x = btn[15].getX();
                btn[15].setY(btn[0].getY());
                btn[0].setY(y);
                btn[15].setX(btn[0].getX());
                btn[0].setX(x);
                break;

        }
    }
}
