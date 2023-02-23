package p425j.p434c.p435a.p436u.p438f;

import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;
import p425j.p434c.p435a.p436u.C11228c;
/* compiled from: CodeSpan.java */
/* renamed from: j.c.a.u.f.d */
/* loaded from: classes3.dex */
public class C11243d extends MetricAffectingSpan {

    /* renamed from: c */
    private final C11228c f25375c;

    public C11243d(C11228c c11228c) {
        this.f25375c = c11228c;
    }

    /* renamed from: a */
    private void m11283a(TextPaint textPaint) {
        this.f25375c.m11329c(textPaint);
    }

    @Override // android.text.style.CharacterStyle
    public void updateDrawState(TextPaint textPaint) {
        m11283a(textPaint);
        textPaint.bgColor = this.f25375c.m11319m(textPaint);
    }

    @Override // android.text.style.MetricAffectingSpan
    public void updateMeasureState(TextPaint textPaint) {
        m11283a(textPaint);
    }
}
