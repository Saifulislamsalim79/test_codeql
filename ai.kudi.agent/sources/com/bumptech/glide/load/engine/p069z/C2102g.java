package com.bumptech.glide.load.engine.p069z;
/* compiled from: ByteArrayAdapter.java */
/* renamed from: com.bumptech.glide.load.engine.z.g */
/* loaded from: classes2.dex */
public final class C2102g implements InterfaceC2094a<byte[]> {
    @Override // com.bumptech.glide.load.engine.p069z.InterfaceC2094a
    /* renamed from: a */
    public int mo33722a() {
        return 1;
    }

    @Override // com.bumptech.glide.load.engine.p069z.InterfaceC2094a
    /* renamed from: c */
    public int mo33721b(byte[] bArr) {
        return bArr.length;
    }

    @Override // com.bumptech.glide.load.engine.p069z.InterfaceC2094a
    /* renamed from: d */
    public byte[] newArray(int i) {
        return new byte[i];
    }

    @Override // com.bumptech.glide.load.engine.p069z.InterfaceC2094a
    public String getTag() {
        return "ByteArrayPool";
    }
}
