package com.google.firebase.inappmessaging.display.internal.layout.p147b;

import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
/* compiled from: BackButtonHandler.java */
/* renamed from: com.google.firebase.inappmessaging.display.internal.layout.b.a */
/* loaded from: classes2.dex */
public class C6060a {

    /* renamed from: a */
    private ViewGroup f14809a;

    /* renamed from: b */
    private View.OnClickListener f14810b;

    public C6060a(ViewGroup viewGroup, View.OnClickListener onClickListener) {
        this.f14809a = viewGroup;
        this.f14810b = onClickListener;
    }

    /* renamed from: a */
    public Boolean m22839a(KeyEvent keyEvent) {
        if (keyEvent != null && keyEvent.getKeyCode() == 4 && keyEvent.getAction() == 1) {
            View.OnClickListener onClickListener = this.f14810b;
            if (onClickListener != null) {
                onClickListener.onClick(this.f14809a);
                return Boolean.TRUE;
            }
            return Boolean.FALSE;
        }
        return null;
    }
}
