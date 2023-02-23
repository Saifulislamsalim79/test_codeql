package androidx.constraintlayout.widget;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import p201g.p219f.p223b.p224k.C7561e;
/* compiled from: Placeholder.java */
/* renamed from: androidx.constraintlayout.widget.g */
/* loaded from: classes2.dex */
public class C1274g extends View {

    /* renamed from: c */
    private int f3990c;

    /* renamed from: d */
    private View f3991d;

    /* renamed from: e */
    private int f3992e;

    /* renamed from: a */
    public void m36570a(ConstraintLayout constraintLayout) {
        if (this.f3991d == null) {
            return;
        }
        ConstraintLayout.C1255b c1255b = (ConstraintLayout.C1255b) getLayoutParams();
        ConstraintLayout.C1255b c1255b2 = (ConstraintLayout.C1255b) this.f3991d.getLayoutParams();
        c1255b2.f3810m0.m18265T0(0);
        if (c1255b.f3810m0.m18216y() != C7561e.EnumC7563b.FIXED) {
            c1255b.f3810m0.m18263U0(c1255b2.f3810m0.m18270R());
        }
        if (c1255b.f3810m0.m18276O() != C7561e.EnumC7563b.FIXED) {
            c1255b.f3810m0.m18221v0(c1255b2.f3810m0.m18222v());
        }
        c1255b2.f3810m0.m18265T0(8);
    }

    /* renamed from: b */
    public void m36569b(ConstraintLayout constraintLayout) {
        if (this.f3990c == -1 && !isInEditMode()) {
            setVisibility(this.f3992e);
        }
        View findViewById = constraintLayout.findViewById(this.f3990c);
        this.f3991d = findViewById;
        if (findViewById != null) {
            ((ConstraintLayout.C1255b) findViewById.getLayoutParams()).f3786a0 = true;
            this.f3991d.setVisibility(0);
            setVisibility(0);
        }
    }

    public View getContent() {
        return this.f3991d;
    }

    public int getEmptyVisibility() {
        return this.f3992e;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        if (isInEditMode()) {
            canvas.drawRGB(223, 223, 223);
            Paint paint = new Paint();
            paint.setARGB(255, 210, 210, 210);
            paint.setTextAlign(Paint.Align.CENTER);
            paint.setTypeface(Typeface.create(Typeface.DEFAULT, 0));
            Rect rect = new Rect();
            canvas.getClipBounds(rect);
            paint.setTextSize(rect.height());
            int height = rect.height();
            int width = rect.width();
            paint.setTextAlign(Paint.Align.LEFT);
            paint.getTextBounds("?", 0, 1, rect);
            canvas.drawText("?", ((width / 2.0f) - (rect.width() / 2.0f)) - rect.left, ((height / 2.0f) + (rect.height() / 2.0f)) - rect.bottom, paint);
        }
    }

    public void setContentId(int i) {
        View findViewById;
        if (this.f3990c == i) {
            return;
        }
        View view = this.f3991d;
        if (view != null) {
            view.setVisibility(0);
            ((ConstraintLayout.C1255b) this.f3991d.getLayoutParams()).f3786a0 = false;
            this.f3991d = null;
        }
        this.f3990c = i;
        if (i == -1 || (findViewById = ((View) getParent()).findViewById(i)) == null) {
            return;
        }
        findViewById.setVisibility(8);
    }

    public void setEmptyVisibility(int i) {
        this.f3992e = i;
    }
}
