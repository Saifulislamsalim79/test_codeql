package io.intercom.android.sdk.views;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import androidx.core.content.C1335a;
import io.intercom.android.sdk.C10110R;
import io.intercom.android.sdk.commons.utilities.ScreenUtils;
/* loaded from: classes3.dex */
class BackButtonCountDrawable extends Drawable {
    private static final String COUNT_BACKGROUND_COLOR = "#FE536C";
    private static final int COUNT_BACKGROUND_RADIUS_DP = 8;
    private static final int COUNT_TEXT_PADDING_TOP = 4;
    private static final int COUNT_TEXT_SIZE_DP = 11;
    private static final int ICON_PADDING_DP = 16;
    private static final int ICON_SIZE_DP = 24;
    private final Drawable backIcon;
    private final Paint countBackgroundPaint;
    private final int countBackgroundRadius;
    private final int iconPadding;
    private final int iconSize;
    private String text;
    private final Paint textPaint;
    private final int textTopPadding;

    /* JADX INFO: Access modifiers changed from: package-private */
    public BackButtonCountDrawable(Context context, String str) {
        this.text = str;
        this.backIcon = C1335a.m36322f(context, C10110R.C10111drawable.intercom_back);
        this.iconPadding = ScreenUtils.dpToPx(16.0f, context);
        this.iconSize = ScreenUtils.dpToPx(24.0f, context);
        Paint paint = new Paint();
        this.countBackgroundPaint = paint;
        paint.setAntiAlias(true);
        this.countBackgroundPaint.setColor(Color.parseColor(COUNT_BACKGROUND_COLOR));
        this.countBackgroundPaint.setStyle(Paint.Style.FILL);
        this.countBackgroundRadius = ScreenUtils.dpToPx(8.0f, context);
        Paint paint2 = new Paint();
        this.textPaint = paint2;
        paint2.setAntiAlias(true);
        this.textPaint.setColor(-1);
        this.textPaint.setTextSize(ScreenUtils.dpToPx(11.0f, context));
        this.textPaint.setFakeBoldText(true);
        this.textPaint.setStyle(Paint.Style.FILL);
        this.textPaint.setTextAlign(Paint.Align.CENTER);
        this.textTopPadding = ScreenUtils.dpToPx(4.0f, context);
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Rect bounds = getBounds();
        int i = bounds.left;
        int i2 = this.iconPadding;
        int i3 = i + i2;
        int i4 = bounds.top + i2;
        int i5 = this.iconSize;
        int i6 = i3 + i5;
        this.backIcon.setBounds(i3, i4, i6, i5 + i4);
        this.backIcon.draw(canvas);
        if (TextUtils.isEmpty(this.text)) {
            return;
        }
        float f = i6;
        canvas.drawCircle(f, i4, this.countBackgroundRadius, this.countBackgroundPaint);
        canvas.drawText(this.text, f, i4 + this.textTopPadding, this.textPaint);
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        this.textPaint.setAlpha(i);
        this.countBackgroundPaint.setAlpha(i);
        this.backIcon.setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.backIcon.setColorFilter(colorFilter);
    }

    public void setText(String str) {
        this.text = str;
        invalidateSelf();
    }
}
