package io.intercom.com.bumptech.glide.load.p402o.p404d;

import io.intercom.com.bumptech.glide.load.engine.InterfaceC10569t;
import io.intercom.com.bumptech.glide.p416r.C10892h;
/* compiled from: BytesResource.java */
/* renamed from: io.intercom.com.bumptech.glide.load.o.d.b */
/* loaded from: classes3.dex */
public class C10780b implements InterfaceC10569t<byte[]> {

    /* renamed from: c */
    private final byte[] f24628c;

    public C10780b(byte[] bArr) {
        C10892h.m12014d(bArr);
        this.f24628c = bArr;
    }

    @Override // io.intercom.com.bumptech.glide.load.engine.InterfaceC10569t
    /* renamed from: a */
    public byte[] get() {
        return this.f24628c;
    }

    @Override // io.intercom.com.bumptech.glide.load.engine.InterfaceC10569t
    /* renamed from: b */
    public void mo12303b() {
    }

    @Override // io.intercom.com.bumptech.glide.load.engine.InterfaceC10569t
    /* renamed from: c */
    public Class<byte[]> mo12302c() {
        return byte[].class;
    }

    @Override // io.intercom.com.bumptech.glide.load.engine.InterfaceC10569t
    public int getSize() {
        return this.f24628c.length;
    }
}
