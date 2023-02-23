package p425j.p434c.p435a.p436u.p438f;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.text.Layout;
import android.text.TextPaint;
import android.text.style.LeadingMarginSpan;
import android.text.style.MetricAffectingSpan;
import p425j.p434c.p435a.p436u.C11228c;
/* compiled from: CodeBlockSpan.java */
/* renamed from: j.c.a.u.f.c */
/* loaded from: classes3.dex */
public class C11242c extends MetricAffectingSpan implements LeadingMarginSpan {

    /* renamed from: c */
    private final C11228c f25372c;

    /* renamed from: d */
    private final Rect f25373d = AbstractC11247h.m11280b();

    /* renamed from: e */
    private final Paint f25374e = AbstractC11247h.m11281a();

    public C11242c(C11228c c11228c) {
        this.f25372c = c11228c;
    }

    /* renamed from: a */
    private void m11284a(TextPaint textPaint) {
        this.f25372c.m11330b(textPaint);
    }

    @Override // android.text.style.LeadingMarginSpan
    public void drawLeadingMargin(Canvas canvas, Paint paint, int i, int i2, int i3, int i4, int i5, CharSequence charSequence, int i6, int i7, boolean z, Layout layout) {
        int i8;
        this.f25374e.setStyle(Paint.Style.FILL);
        this.f25374e.setColor(this.f25372c.m11318n(paint));
        if (i2 > 0) {
            i8 = canvas.getWidth();
        } else {
            i -= canvas.getWidth();
            i8 = i;
        }
        this.f25373d.set(i, i3, i8, i5);
        canvas.drawRect(this.f25373d, this.f25374e);
    }

    @Override // android.text.style.LeadingMarginSpan
    public int getLeadingMargin(boolean z) {
        return this.f25372c.m11317o();
    }

    @Override // android.text.style.CharacterStyle
    public void updateDrawState(TextPaint textPaint) {
        m11284a(textPaint);
    }

    @Override // android.text.style.MetricAffectingSpan
    public void updateMeasureState(TextPaint textPaint) {
        m11284a(textPaint);
    }
}
