package unikys.icu;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.widget.LinearLayout;

public class ICUMapBalloon extends LinearLayout {

	public ICUMapBalloon(Context context, AttributeSet attrs) {
		super(context, attrs);
	}

	@Override
	protected void dispatchDraw(Canvas canvas) {
/*		int markerHeight = 70;
        Paint panelPaint  = new Paint();
        panelPaint.setARGB(0, 0, 0, 0);
                
        RectF panelRect = new RectF();
        panelRect.set(0,0, getMeasuredWidth(), getMeasuredHeight());
        canvas.drawRoundRect(panelRect, 5, 5, panelPaint);
        
        RectF baloonRect = new RectF();
        baloonRect.set(0,0, getMeasuredWidth(), getMeasuredHeight() - markerHeight);
        panelPaint.setARGB(230, 255, 255, 255);        
        canvas.drawRoundRect(baloonRect, 10, 10, panelPaint);
        
        Path baloonTip = new Path();
        baloonTip.moveTo(7*(getMeasuredWidth()/16), getMeasuredHeight() - markerHeight);
        baloonTip.lineTo(getMeasuredWidth()/2, getMeasuredHeight() - markerHeight + 15);
        baloonTip.lineTo(9*(getMeasuredWidth()/16), getMeasuredHeight() - markerHeight);
        
        canvas.drawPath(baloonTip, panelPaint);
        
		super.dispatchDraw(canvas);*/
	}
}
