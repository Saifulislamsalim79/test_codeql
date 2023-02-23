package p425j.p434c.p435a.p436u.p438f;

import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;
/* compiled from: EmphasisSpan.java */
/* renamed from: j.c.a.u.f.e */
/* loaded from: classes3.dex */
public class C11244e extends MetricAffectingSpan {
    @Override // android.text.style.CharacterStyle
    public void updateDrawState(TextPaint textPaint) {
        textPaint.setTextSkewX(-0.25f);
    }

    @Override // android.text.style.MetricAffectingSpan
    public void updateMeasureState(TextPaint textPaint) {
        textPaint.setTextSkewX(-0.25f);
    }
}
