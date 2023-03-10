package io.intercom.android.sdk.spans;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.Layout;
import android.text.Spanned;
import android.text.style.LeadingMarginSpan;
import io.intercom.android.sdk.commons.utilities.ScreenUtils;
/* loaded from: classes3.dex */
public class UnorderedListSpan implements LeadingMarginSpan {
    private static final int BULLET_RADIUS_IN_DP = 2;
    private static final int INDENT_IN_DP = 5;
    private final int bulletRadius;
    private final int gapWidth;
    private final int indent;

    public UnorderedListSpan(int i, Context context) {
        this.gapWidth = i;
        this.bulletRadius = ScreenUtils.dpToPx(2.0f, context);
        this.indent = ScreenUtils.dpToPx(5.0f, context);
    }

    @Override // android.text.style.LeadingMarginSpan
    public void drawLeadingMargin(Canvas canvas, Paint paint, int i, int i2, int i3, int i4, int i5, CharSequence charSequence, int i6, int i7, boolean z, Layout layout) {
        if (((Spanned) charSequence).getSpanStart(this) == i6) {
            Paint.Style style = paint.getStyle();
            paint.setStyle(Paint.Style.FILL);
            int i8 = this.bulletRadius;
            canvas.drawCircle(i + (i2 * i8) + this.indent, (i3 + i5) / 2.0f, i8, paint);
            paint.setStyle(style);
        }
    }

    @Override // android.text.style.LeadingMarginSpan
    public int getLeadingMargin(boolean z) {
        return (this.bulletRadius * 2) + this.gapWidth;
    }
}
