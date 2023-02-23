package p425j.p434c.p435a.p436u.p438f;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.text.Layout;
import android.text.style.LeadingMarginSpan;
import p425j.p434c.p435a.p436u.C11228c;
/* compiled from: BlockQuoteSpan.java */
/* renamed from: j.c.a.u.f.a */
/* loaded from: classes3.dex */
public class C11240a implements LeadingMarginSpan {

    /* renamed from: c */
    private final C11228c f25363c;

    /* renamed from: d */
    private final Rect f25364d = AbstractC11247h.m11280b();

    /* renamed from: e */
    private final Paint f25365e = AbstractC11247h.m11281a();

    public C11240a(C11228c c11228c) {
        this.f25363c = c11228c;
    }

    @Override // android.text.style.LeadingMarginSpan
    public void drawLeadingMargin(Canvas canvas, Paint paint, int i, int i2, int i3, int i4, int i5, CharSequence charSequence, int i6, int i7, boolean z, Layout layout) {
        int m11321k = this.f25363c.m11321k();
        this.f25365e.set(paint);
        this.f25363c.m11331a(this.f25365e);
        int i8 = i2 * m11321k;
        int i9 = i + i8;
        int i10 = i8 + i9;
        this.f25364d.set(Math.min(i9, i10), i3, Math.max(i9, i10), i5);
        canvas.drawRect(this.f25364d, this.f25365e);
    }

    @Override // android.text.style.LeadingMarginSpan
    public int getLeadingMargin(boolean z) {
        return this.f25363c.m11322j();
    }
}
