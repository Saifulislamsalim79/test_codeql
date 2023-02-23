package p425j.p434c.p435a.p436u.p438f;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.text.Layout;
import android.text.TextPaint;
import android.text.style.LeadingMarginSpan;
import android.text.style.MetricAffectingSpan;
import p425j.p434c.p435a.p436u.C11228c;
import p425j.p434c.p435a.p442x.AbstractC11264c;
/* compiled from: HeadingSpan.java */
/* renamed from: j.c.a.u.f.f */
/* loaded from: classes3.dex */
public class C11245f extends MetricAffectingSpan implements LeadingMarginSpan {

    /* renamed from: c */
    private final C11228c f25376c;

    /* renamed from: d */
    private final Rect f25377d = AbstractC11247h.m11280b();

    /* renamed from: e */
    private final Paint f25378e = AbstractC11247h.m11281a();

    /* renamed from: f */
    private final int f25379f;

    public C11245f(C11228c c11228c, int i) {
        this.f25376c = c11228c;
        this.f25379f = i;
    }

    /* renamed from: a */
    private void m11282a(TextPaint textPaint) {
        this.f25376c.m11327e(textPaint, this.f25379f);
    }

    @Override // android.text.style.LeadingMarginSpan
    public void drawLeadingMargin(Canvas canvas, Paint paint, int i, int i2, int i3, int i4, int i5, CharSequence charSequence, int i6, int i7, boolean z, Layout layout) {
        int i8;
        int i9 = this.f25379f;
        if ((i9 == 1 || i9 == 2) && AbstractC11264c.m11269a(i7, charSequence, this)) {
            this.f25378e.set(paint);
            this.f25376c.m11328d(this.f25378e);
            float strokeWidth = this.f25378e.getStrokeWidth();
            if (strokeWidth > 0.0f) {
                int i10 = (int) ((i5 - strokeWidth) + 0.5f);
                if (i2 > 0) {
                    i8 = canvas.getWidth();
                } else {
                    i8 = i;
                    i -= canvas.getWidth();
                }
                this.f25377d.set(i, i10, i8, i5);
                canvas.drawRect(this.f25377d, this.f25378e);
            }
        }
    }

    @Override // android.text.style.LeadingMarginSpan
    public int getLeadingMargin(boolean z) {
        return 0;
    }

    @Override // android.text.style.CharacterStyle
    public void updateDrawState(TextPaint textPaint) {
        m11282a(textPaint);
    }

    @Override // android.text.style.MetricAffectingSpan
    public void updateMeasureState(TextPaint textPaint) {
        m11282a(textPaint);
    }
}
