package androidx.constraintlayout.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
/* loaded from: classes2.dex */
public class Guideline extends View {
    public Guideline(Context context) {
        super(context);
        super.setVisibility(8);
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
    }

    @Override // android.view.View
    protected void onMeasure(int i, int i2) {
        setMeasuredDimension(0, 0);
    }

    public void setGuidelineBegin(int i) {
        ConstraintLayout.C1255b c1255b = (ConstraintLayout.C1255b) getLayoutParams();
        c1255b.f3785a = i;
        setLayoutParams(c1255b);
    }

    public void setGuidelineEnd(int i) {
        ConstraintLayout.C1255b c1255b = (ConstraintLayout.C1255b) getLayoutParams();
        c1255b.f3787b = i;
        setLayoutParams(c1255b);
    }

    public void setGuidelinePercent(float f) {
        ConstraintLayout.C1255b c1255b = (ConstraintLayout.C1255b) getLayoutParams();
        c1255b.f3789c = f;
        setLayoutParams(c1255b);
    }

    @Override // android.view.View
    public void setVisibility(int i) {
    }

    public Guideline(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        super.setVisibility(8);
    }
}
