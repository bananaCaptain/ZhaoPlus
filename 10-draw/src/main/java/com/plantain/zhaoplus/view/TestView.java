package com.plantain.zhaoplus.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;

import androidx.annotation.Nullable;

public class TestView extends View {

    private Paint mPaint = new Paint(Paint.ANTI_ALIAS_FLAG);




    public TestView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        canvas.drawLine(100, 100, 200, 200, mPaint);
        canvas.drawCircle(getWidth() / 2, getHeight() / 2, 400, mPaint);
    }
}
