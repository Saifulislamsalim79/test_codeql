package io.intercom.android.sdk.views;

import android.content.Context;
import android.graphics.Rect;
import android.os.Build;
import android.util.AttributeSet;
import android.widget.FrameLayout;
/* loaded from: classes3.dex */
public final class FullscreenFrameLayout extends FrameLayout {
    public FullscreenFrameLayout(Context context) {
        super(context);
    }

    @Override // android.view.View
    protected final boolean fitSystemWindows(Rect rect) {
        if (Build.VERSION.SDK_INT >= 19) {
            rect.top = 0;
        }
        return super.fitSystemWindows(rect);
    }

    public FullscreenFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public FullscreenFrameLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
