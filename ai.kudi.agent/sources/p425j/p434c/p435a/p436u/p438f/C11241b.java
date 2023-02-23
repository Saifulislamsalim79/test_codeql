package p425j.p434c.p435a.p436u.p438f;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.text.Layout;
import android.text.style.LeadingMarginSpan;
import p425j.p434c.p435a.p436u.C11228c;
import p425j.p434c.p435a.p442x.AbstractC11264c;
/* compiled from: BulletListItemSpan.java */
/* renamed from: j.c.a.u.f.b */
/* loaded from: classes3.dex */
public class C11241b implements LeadingMarginSpan {

    /* renamed from: x */
    private static final boolean f25366x;

    /* renamed from: c */
    private C11228c f25367c;

    /* renamed from: d */
    private final Paint f25368d = AbstractC11247h.m11281a();

    /* renamed from: e */
    private final RectF f25369e = AbstractC11247h.m11279c();

    /* renamed from: f */
    private final Rect f25370f = AbstractC11247h.m11280b();

    /* renamed from: w */
    private final int f25371w;

    static {
        int i = Build.VERSION.SDK_INT;
        f25366x = 24 == i || 25 == i;
    }

    public C11241b(C11228c c11228c, int i) {
        this.f25367c = c11228c;
        this.f25371w = i;
    }

    @Override // android.text.style.LeadingMarginSpan
    public void drawLeadingMargin(Canvas canvas, Paint paint, int i, int i2, int i3, int i4, int i5, CharSequence charSequence, int i6, int i7, boolean z, Layout layout) {
        int i8;
        int i9;
        Paint.Style style;
        int i10;
        if (z && AbstractC11264c.m11268b(i6, charSequence, this)) {
            this.f25368d.set(paint);
            this.f25367c.m11325g(this.f25368d);
            int save = canvas.save();
            try {
                int m11322j = this.f25367c.m11322j();
                int m11320l = this.f25367c.m11320l((int) ((this.f25368d.descent() - this.f25368d.ascent()) + 0.5f));
                int i11 = (m11322j - m11320l) / 2;
                if (f25366x) {
                    if (i2 < 0) {
                        i10 = i - (layout.getWidth() - (m11322j * this.f25371w));
                    } else {
                        i10 = (m11322j * this.f25371w) - i;
                    }
                    int i12 = i + (i11 * i2);
                    int i13 = (i2 * m11320l) + i12;
                    int i14 = i2 * i10;
                    i8 = Math.min(i12, i13) + i14;
                    i9 = Math.max(i12, i13) + i14;
                } else {
                    if (i2 <= 0) {
                        i -= m11322j;
                    }
                    i8 = i + i11;
                    i9 = i8 + m11320l;
                }
                int descent = (i4 + ((int) (((this.f25368d.descent() + this.f25368d.ascent()) / 2.0f) + 0.5f))) - (m11320l / 2);
                int i15 = m11320l + descent;
                if (this.f25371w != 0 && this.f25371w != 1) {
                    this.f25370f.set(i8, descent, i9, i15);
                    this.f25368d.setStyle(Paint.Style.FILL);
                    canvas.drawRect(this.f25370f, this.f25368d);
                }
                this.f25369e.set(i8, descent, i9, i15);
                if (this.f25371w == 0) {
                    style = Paint.Style.FILL;
                } else {
                    style = Paint.Style.STROKE;
                }
                this.f25368d.setStyle(style);
                canvas.drawOval(this.f25369e, this.f25368d);
            } finally {
                canvas.restoreToCount(save);
            }
        }
    }

    @Override // android.text.style.LeadingMarginSpan
    public int getLeadingMargin(boolean z) {
        return this.f25367c.m11322j();
    }
}
