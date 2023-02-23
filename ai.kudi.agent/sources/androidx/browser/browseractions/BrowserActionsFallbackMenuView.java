package androidx.browser.browseractions;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import p201g.p215c.C7512a;
/* loaded from: classes2.dex */
public class BrowserActionsFallbackMenuView extends LinearLayout {

    /* renamed from: c */
    private final int f3678c;

    /* renamed from: d */
    private final int f3679d;

    public BrowserActionsFallbackMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f3678c = getResources().getDimensionPixelOffset(C7512a.browser_actions_context_menu_min_padding);
        this.f3679d = getResources().getDimensionPixelOffset(C7512a.browser_actions_context_menu_max_width);
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(Math.min(getResources().getDisplayMetrics().widthPixels - (this.f3678c * 2), this.f3679d), 1073741824), i2);
    }
}
