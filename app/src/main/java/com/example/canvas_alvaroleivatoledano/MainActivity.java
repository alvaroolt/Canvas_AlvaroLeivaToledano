package com.example.canvas_alvaroleivatoledano;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Bundle;
import android.view.View;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //Vista vista = new Vista(this);
        //setContentView(vista);
        DynamicView myView = new DynamicView(this, 1200, 1600);
        setContentView(myView);
    }

    class DynamicView extends View {
        int i = 0;
        Bitmap frame ;
        Canvas frameDrawer;
        Rect bounds;
        Paint paint ;
        Random random ;
        int width , height;

        public DynamicView(Context context ,int width ,int height) {
            super(context);

            this.width = width;
            this.height = height;

            frame = Bitmap.createBitmap(width,height,Bitmap.Config.ARGB_8888);
            frameDrawer = new Canvas(frame);
            bounds = new Rect(0 , 0, width,height);
            paint = new Paint();
            random = new Random();
        }

        @Override
        protected void onDraw(Canvas canvas) {

            paint.setColor(Color.argb(255, random.nextInt(255),
                    random.nextInt(255), random.nextInt(255)));
            frameDrawer.drawCircle(random.nextInt(width), random.nextInt(height), 50, paint);
            canvas.drawBitmap(frame, null, bounds , null);

            if (i < 1000) {
                i++;
                invalidate();
            }
        }

    }
}