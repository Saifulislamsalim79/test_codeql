package com.bumptech.glide.p082o.p083j;

import android.graphics.drawable.Drawable;
import com.bumptech.glide.p066l.InterfaceC1981i;
import com.bumptech.glide.p082o.InterfaceC2348c;
import com.bumptech.glide.p082o.p084k.InterfaceC2363b;
/* compiled from: Target.java */
/* renamed from: com.bumptech.glide.o.j.d */
/* loaded from: classes2.dex */
public interface InterfaceC2360d<R> extends InterfaceC1981i {
    /* renamed from: a */
    void mo33166a(InterfaceC2359c interfaceC2359c);

    /* renamed from: b */
    void mo22923b(R r, InterfaceC2363b<? super R> interfaceC2363b);

    /* renamed from: c */
    void mo33165c(InterfaceC2348c interfaceC2348c);

    /* renamed from: d */
    void mo33164d(InterfaceC2359c interfaceC2359c);

    InterfaceC2348c getRequest();

    void onLoadCleared(Drawable drawable);

    void onLoadFailed(Drawable drawable);

    void onLoadStarted(Drawable drawable);
}
