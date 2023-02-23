package p425j.p434c.p435a.p436u.p438f;

import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;
/* compiled from: StrongEmphasisSpan.java */
/* renamed from: j.c.a.u.f.j */
/* loaded from: classes3.dex */
public class C11249j extends MetricAffectingSpan {
    @Override // android.text.style.CharacterStyle
    public void updateDrawState(TextPaint textPaint) {
        textPaint.setFakeBoldText(true);
    }

    @Override // android.text.style.MetricAffectingSpan
    public void updateMeasureState(TextPaint textPaint) {
        textPaint.setFakeBoldText(true);
    }
}
