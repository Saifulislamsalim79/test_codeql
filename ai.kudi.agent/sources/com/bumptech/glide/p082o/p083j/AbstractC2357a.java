package com.bumptech.glide.p082o.p083j;

import android.graphics.drawable.Drawable;
import com.bumptech.glide.p082o.InterfaceC2348c;
import com.bumptech.glide.p086q.C2381k;
/* compiled from: CustomTarget.java */
/* renamed from: com.bumptech.glide.o.j.a */
/* loaded from: classes2.dex */
public abstract class AbstractC2357a<T> implements InterfaceC2360d<T> {

    /* renamed from: c */
    private final int f6845c;

    /* renamed from: d */
    private final int f6846d;

    /* renamed from: e */
    private InterfaceC2348c f6847e;

    public AbstractC2357a() {
        this(Integer.MIN_VALUE, Integer.MIN_VALUE);
    }

    @Override // com.bumptech.glide.p082o.p083j.InterfaceC2360d
    /* renamed from: a */
    public final void mo33166a(InterfaceC2359c interfaceC2359c) {
    }

    @Override // com.bumptech.glide.p082o.p083j.InterfaceC2360d
    /* renamed from: c */
    public final void mo33165c(InterfaceC2348c interfaceC2348c) {
        this.f6847e = interfaceC2348c;
    }

    @Override // com.bumptech.glide.p082o.p083j.InterfaceC2360d
    /* renamed from: d */
    public final void mo33164d(InterfaceC2359c interfaceC2359c) {
        interfaceC2359c.mo33167d(this.f6845c, this.f6846d);
    }

    @Override // com.bumptech.glide.p082o.p083j.InterfaceC2360d
    public final InterfaceC2348c getRequest() {
        return this.f6847e;
    }

    @Override // com.bumptech.glide.p066l.InterfaceC1981i
    public void onDestroy() {
    }

    @Override // com.bumptech.glide.p082o.p083j.InterfaceC2360d
    public void onLoadFailed(Drawable drawable) {
    }

    @Override // com.bumptech.glide.p082o.p083j.InterfaceC2360d
    public void onLoadStarted(Drawable drawable) {
    }

    @Override // com.bumptech.glide.p066l.InterfaceC1981i
    public void onStart() {
    }

    @Override // com.bumptech.glide.p066l.InterfaceC1981i
    public void onStop() {
    }

    public AbstractC2357a(int i, int i2) {
        if (C2381k.m33110r(i, i2)) {
            this.f6845c = i;
            this.f6846d = i2;
            return;
        }
        throw new IllegalArgumentException("Width and height must both be > 0 or Target#SIZE_ORIGINAL, but given width: " + i + " and height: " + i2);
    }
}
