package androidx.appcompat.widget;

import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.widget.PopupWindow;
import androidx.core.widget.C1397h;
import p201g.p202a.C7461j;
/* compiled from: AppCompatPopupWindow.java */
/* renamed from: androidx.appcompat.widget.m */
/* loaded from: classes2.dex */
class C1125m extends PopupWindow {

    /* renamed from: b */
    private static final boolean f3432b;

    /* renamed from: a */
    private boolean f3433a;

    static {
        f3432b = Build.VERSION.SDK_INT < 21;
    }

    public C1125m(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        m37068a(context, attributeSet, i, i2);
    }

    /* renamed from: a */
    private void m37068a(Context context, AttributeSet attributeSet, int i, int i2) {
        C1138r0 m37026v = C1138r0.m37026v(context, attributeSet, C7461j.PopupWindow, i, i2);
        if (m37026v.m37029s(C7461j.PopupWindow_overlapAnchor)) {
            m37067b(m37026v.m37047a(C7461j.PopupWindow_overlapAnchor, false));
        }
        setBackgroundDrawable(m37026v.m37041g(C7461j.PopupWindow_android_popupBackground));
        m37026v.m37025w();
    }

    /* renamed from: b */
    private void m37067b(boolean z) {
        if (f3432b) {
            this.f3433a = z;
        } else {
            C1397h.m36108a(this, z);
        }
    }

    @Override // android.widget.PopupWindow
    public void showAsDropDown(View view, int i, int i2) {
        if (f3432b && this.f3433a) {
            i2 -= view.getHeight();
        }
        super.showAsDropDown(view, i, i2);
    }

    @Override // android.widget.PopupWindow
    public void update(View view, int i, int i2, int i3, int i4) {
        if (f3432b && this.f3433a) {
            i2 -= view.getHeight();
        }
        super.update(view, i, i2, i3, i4);
    }

    @Override // android.widget.PopupWindow
    public void showAsDropDown(View view, int i, int i2, int i3) {
        if (f3432b && this.f3433a) {
            i2 -= view.getHeight();
        }
        super.showAsDropDown(view, i, i2, i3);
    }
}
