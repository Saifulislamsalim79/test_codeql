package com.google.firebase.inappmessaging.display.internal.layout;

import android.content.Context;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.widget.FrameLayout;
import com.google.firebase.inappmessaging.display.internal.layout.p147b.C6060a;
/* loaded from: classes2.dex */
public class FiamFrameLayout extends FrameLayout {

    /* renamed from: c */
    private C6060a f14793c;

    public FiamFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        Boolean m22839a = this.f14793c.m22839a(keyEvent);
        if (m22839a != null) {
            return m22839a.booleanValue();
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    public void setDismissListener(View.OnClickListener onClickListener) {
        this.f14793c = new C6060a(this, onClickListener);
    }
}
