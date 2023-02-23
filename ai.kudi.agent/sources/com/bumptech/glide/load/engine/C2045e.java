package com.bumptech.glide.load.engine;

import com.bumptech.glide.load.C2122h;
import com.bumptech.glide.load.InterfaceC1996d;
import com.bumptech.glide.load.engine.p067a0.InterfaceC2012a;
import java.io.File;
/* compiled from: DataCacheWriter.java */
/* renamed from: com.bumptech.glide.load.engine.e */
/* loaded from: classes2.dex */
class C2045e<DataType> implements InterfaceC2012a.InterfaceC2014b {

    /* renamed from: a */
    private final InterfaceC1996d<DataType> f6173a;

    /* renamed from: b */
    private final DataType f6174b;

    /* renamed from: c */
    private final C2122h f6175c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C2045e(InterfaceC1996d<DataType> interfaceC1996d, DataType datatype, C2122h c2122h) {
        this.f6173a = interfaceC1996d;
        this.f6174b = datatype;
        this.f6175c = c2122h;
    }

    @Override // com.bumptech.glide.load.engine.p067a0.InterfaceC2012a.InterfaceC2014b
    /* renamed from: a */
    public boolean mo33879a(File file) {
        return this.f6173a.mo33388a(this.f6174b, file, this.f6175c);
    }
}
