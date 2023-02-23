package com.bumptech.glide.load.p074o.p075d;

import com.bumptech.glide.load.engine.InterfaceC2087u;
import com.bumptech.glide.p086q.C2380j;
/* compiled from: BytesResource.java */
/* renamed from: com.bumptech.glide.load.o.d.b */
/* loaded from: classes2.dex */
public class C2253b implements InterfaceC2087u<byte[]> {

    /* renamed from: c */
    private final byte[] f6592c;

    public C2253b(byte[] bArr) {
        C2380j.m33129d(bArr);
        this.f6592c = bArr;
    }

    @Override // com.bumptech.glide.load.engine.InterfaceC2087u
    /* renamed from: a */
    public byte[] get() {
        return this.f6592c;
    }

    @Override // com.bumptech.glide.load.engine.InterfaceC2087u
    /* renamed from: b */
    public void mo33303b() {
    }

    @Override // com.bumptech.glide.load.engine.InterfaceC2087u
    /* renamed from: c */
    public Class<byte[]> mo33302c() {
        return byte[].class;
    }

    @Override // com.bumptech.glide.load.engine.InterfaceC2087u
    public int getSize() {
        return this.f6592c.length;
    }
}
