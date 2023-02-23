package com.bumptech.glide.load.engine.p069z;
/* compiled from: IntegerArrayAdapter.java */
/* renamed from: com.bumptech.glide.load.engine.z.i */
/* loaded from: classes2.dex */
public final class C2105i implements InterfaceC2094a<int[]> {
    @Override // com.bumptech.glide.load.engine.p069z.InterfaceC2094a
    /* renamed from: a */
    public int mo33722a() {
        return 4;
    }

    @Override // com.bumptech.glide.load.engine.p069z.InterfaceC2094a
    /* renamed from: c */
    public int mo33721b(int[] iArr) {
        return iArr.length;
    }

    @Override // com.bumptech.glide.load.engine.p069z.InterfaceC2094a
    /* renamed from: d */
    public int[] newArray(int i) {
        return new int[i];
    }

    @Override // com.bumptech.glide.load.engine.p069z.InterfaceC2094a
    public String getTag() {
        return "IntegerArrayPool";
    }
}
