package com.example.myapplication;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.view.View;

public class MyDraw extends View {
    public MyDraw(Context context) {
        super(context);
    }
    @Override
    protected void onDraw(Canvas canvas){
        super.onDraw(canvas);
        Paint p=new Paint();
        p.setColor(Color.BLUE);
        p.setStrokeWidth(100);
        p.setTextSize(180);
        canvas.drawText("abcdjsdfhh",140,120,p);

    }
}
