package p425j.p434c.p435a.p436u.p438f;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.text.Layout;
import android.text.style.LeadingMarginSpan;
import p425j.p434c.p435a.p436u.C11228c;
/* compiled from: ThematicBreakSpan.java */
/* renamed from: j.c.a.u.f.l */
/* loaded from: classes3.dex */
public class C11251l implements LeadingMarginSpan {

    /* renamed from: c */
    private final C11228c f25390c;

    /* renamed from: d */
    private final Rect f25391d = AbstractC11247h.m11280b();

    /* renamed from: e */
    private final Paint f25392e = AbstractC11247h.m11281a();

    public C11251l(C11228c c11228c) {
        this.f25390c = c11228c;
    }

    @Override // android.text.style.LeadingMarginSpan
    public void drawLeadingMargin(Canvas canvas, Paint paint, int i, int i2, int i3, int i4, int i5, CharSequence charSequence, int i6, int i7, boolean z, Layout layout) {
        int i8;
        int i9 = i3 + ((i5 - i3) / 2);
        this.f25392e.set(paint);
        this.f25390c.m11324h(this.f25392e);
        int strokeWidth = (int) ((((int) (this.f25392e.getStrokeWidth() + 0.5f)) / 2.0f) + 0.5f);
        if (i2 > 0) {
            i8 = canvas.getWidth();
        } else {
            i8 = i;
            i -= canvas.getWidth();
        }
        this.f25391d.set(i, i9 - strokeWidth, i8, i9 + strokeWidth);
        canvas.drawRect(this.f25391d, this.f25392e);
    }

    @Override // android.text.style.LeadingMarginSpan
    public int getLeadingMargin(boolean z) {
        return 0;
    }
}
