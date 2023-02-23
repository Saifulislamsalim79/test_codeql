package com.bumptech.glide;

import com.bumptech.glide.AbstractC1955i;
import com.bumptech.glide.p082o.p084k.C2361a;
import com.bumptech.glide.p082o.p084k.InterfaceC2364c;
/* compiled from: TransitionOptions.java */
/* renamed from: com.bumptech.glide.i */
/* loaded from: classes2.dex */
public abstract class AbstractC1955i<CHILD extends AbstractC1955i<CHILD, TranscodeType>, TranscodeType> implements Cloneable {

    /* renamed from: c */
    private InterfaceC2364c<? super TranscodeType> f5952c = C2361a.m33163a();

    /* renamed from: a */
    public final CHILD clone() {
        try {
            return (CHILD) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public final InterfaceC2364c<? super TranscodeType> m34108b() {
        return this.f5952c;
    }
}
