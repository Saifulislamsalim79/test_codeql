package p425j.p434c.p435a.p436u.p438f;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.Layout;
import android.text.Spanned;
import android.text.TextPaint;
import android.text.style.LeadingMarginSpan;
import android.widget.TextView;
import p425j.p434c.p435a.p436u.C11228c;
import p425j.p434c.p435a.p442x.AbstractC11264c;
/* compiled from: OrderedListItemSpan.java */
/* renamed from: j.c.a.u.f.i */
/* loaded from: classes3.dex */
public class C11248i implements LeadingMarginSpan {

    /* renamed from: c */
    private final C11228c f25386c;

    /* renamed from: d */
    private final String f25387d;

    /* renamed from: e */
    private final Paint f25388e = AbstractC11247h.m11281a();

    /* renamed from: f */
    private int f25389f;

    public C11248i(C11228c c11228c, String str) {
        this.f25386c = c11228c;
        this.f25387d = str;
    }

    /* renamed from: a */
    public static void m11278a(TextView textView, CharSequence charSequence) {
        if (charSequence instanceof Spanned) {
            C11248i[] c11248iArr = (C11248i[]) ((Spanned) charSequence).getSpans(0, charSequence.length(), C11248i.class);
            if (c11248iArr != null) {
                TextPaint paint = textView.getPaint();
                for (C11248i c11248i : c11248iArr) {
                    c11248i.f25389f = (int) (paint.measureText(c11248i.f25387d) + 0.5f);
                }
            }
        }
    }

    @Override // android.text.style.LeadingMarginSpan
    public void drawLeadingMargin(Canvas canvas, Paint paint, int i, int i2, int i3, int i4, int i5, CharSequence charSequence, int i6, int i7, boolean z, Layout layout) {
        if (z && AbstractC11264c.m11268b(i6, charSequence, this)) {
            this.f25388e.set(paint);
            this.f25386c.m11325g(this.f25388e);
            int measureText = (int) (this.f25388e.measureText(this.f25387d) + 0.5f);
            int m11322j = this.f25386c.m11322j();
            if (measureText > m11322j) {
                this.f25389f = measureText;
                m11322j = measureText;
            } else {
                this.f25389f = 0;
            }
            canvas.drawText(this.f25387d, i2 > 0 ? (i + (m11322j * i2)) - measureText : i + (i2 * m11322j) + (m11322j - measureText), i4, this.f25388e);
        }
    }

    @Override // android.text.style.LeadingMarginSpan
    public int getLeadingMargin(boolean z) {
        return Math.max(this.f25389f, this.f25386c.m11322j());
    }
}
