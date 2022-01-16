package com.example.canvas_alvaroleivatoledano;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Vista vista = new Vista(this);
        setContentView(vista);
    }

    class Vista extends View {

        public Vista(Context context) {
            super(context);
        }

        public void onDraw(Canvas canvas) {
            /*
            Paint rectangle = new Paint();
            rectangle.setStyle(Paint.Style.FILL_AND_STROKE);
            rectangle.setStrokeWidth(5);
            rectangle.setColor(Color.BLUE);

            int ancho = canvas.getWidth();
            canvas.drawRect(10,100,ancho-10,20,rectangle);
             */
            //super.onDraw(canvas);

            int ancho = canvas.getWidth();
            int alto = canvas.getHeight();
            int centroX = canvas.getWidth()/2;
            int centroY = canvas.getHeight()/2;

            Paint circleRed = new Paint();
            circleRed.setStyle(Paint.Style.FILL_AND_STROKE);
            circleRed.setARGB(255, 255, 0, 0);

            Paint circleYellow = new Paint();
            circleYellow.setStyle(Paint.Style.FILL_AND_STROKE);
            circleYellow.setARGB(255, 255, 251, 64);

            Paint circleOrange = new Paint();
            circleOrange.setStyle(Paint.Style.FILL_AND_STROKE);
            circleOrange.setARGB(255, 255, 174, 64);

            Paint circleBlue = new Paint();
            circleBlue.setStyle(Paint.Style.FILL_AND_STROKE);
            circleBlue.setARGB(255, 64, 154, 255);

            Paint oval = new Paint();
            oval.setStrokeWidth(5);
            oval.setStyle(Paint.Style.STROKE);
            oval.setARGB(255, 64, 227, 255);
            RectF rectangulo = new RectF(100, 100, ancho-100, alto-100);
            RectF rectangulo1 = new RectF(40, 500, ancho-40, alto-500);

            canvas.drawCircle(centroX-120, centroY, 60, circleRed);
            canvas.drawCircle(centroX+70, centroY-80, 60, circleOrange);
            canvas.drawCircle(centroX-50, centroY+80, 60, circleRed);
            canvas.drawCircle(centroX, centroY+80, 60, circleYellow);
            canvas.drawCircle(centroX+70, centroY+80, 60, circleOrange);
            canvas.drawCircle(centroX-130, centroY+100, 60, circleOrange);
            canvas.drawCircle(centroX+110, centroY-80, 60, circleRed);
            canvas.drawCircle(centroX, centroY-80, 60, circleYellow);
            canvas.drawCircle(centroX-110, centroY-80, 60, circleOrange);
            canvas.drawCircle(centroX+100, centroY, 60, circleYellow);
            canvas.drawCircle(centroX-90, centroY+20, 60, circleYellow);
            canvas.drawCircle(centroX, centroY, 60, circleRed);
            canvas.drawOval(rectangulo, oval);
            canvas.drawOval(rectangulo1, oval);
            canvas.drawCircle(centroX, 100, 20, circleBlue);
            canvas.drawCircle(centroX+250, alto-220, 20, circleBlue);
            canvas.drawCircle(ancho-100, centroY, 20, circleBlue);
            canvas.drawCircle(centroX-200, centroY-250, 20, circleBlue);
        }
    }

}