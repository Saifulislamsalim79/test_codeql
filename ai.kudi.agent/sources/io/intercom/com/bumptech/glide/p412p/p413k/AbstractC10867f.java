package io.intercom.com.bumptech.glide.p412p.p413k;

import io.intercom.com.bumptech.glide.p416r.C10893i;
/* compiled from: SimpleTarget.java */
/* renamed from: io.intercom.com.bumptech.glide.p.k.f */
/* loaded from: classes3.dex */
public abstract class AbstractC10867f<Z> extends AbstractC10862a<Z> {
    private final int height;
    private final int width;

    public AbstractC10867f() {
        this(Integer.MIN_VALUE, Integer.MIN_VALUE);
    }

    @Override // io.intercom.com.bumptech.glide.p412p.p413k.InterfaceC10869h
    public final void getSize(InterfaceC10868g interfaceC10868g) {
        if (C10893i.m11994s(this.width, this.height)) {
            interfaceC10868g.mo12069d(this.width, this.height);
            return;
        }
        throw new IllegalArgumentException("Width and height must both be > 0 or Target#SIZE_ORIGINAL, but given width: " + this.width + " and height: " + this.height + ", either provide dimensions in the constructor or call override()");
    }

    @Override // io.intercom.com.bumptech.glide.p412p.p413k.InterfaceC10869h
    public void removeCallback(InterfaceC10868g interfaceC10868g) {
    }

    public AbstractC10867f(int i, int i2) {
        this.width = i;
        this.height = i2;
    }
}
