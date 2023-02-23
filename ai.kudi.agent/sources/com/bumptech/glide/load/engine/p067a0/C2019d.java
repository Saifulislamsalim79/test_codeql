package com.bumptech.glide.load.engine.p067a0;

import com.bumptech.glide.load.engine.p067a0.InterfaceC2012a;
import java.io.File;
/* compiled from: DiskLruCacheFactory.java */
/* renamed from: com.bumptech.glide.load.engine.a0.d */
/* loaded from: classes2.dex */
public class C2019d implements InterfaceC2012a.InterfaceC2013a {

    /* renamed from: a */
    private final long f6117a;

    /* renamed from: b */
    private final InterfaceC2020a f6118b;

    /* compiled from: DiskLruCacheFactory.java */
    /* renamed from: com.bumptech.glide.load.engine.a0.d$a */
    /* loaded from: classes2.dex */
    public interface InterfaceC2020a {
        /* renamed from: a */
        File mo33914a();
    }

    public C2019d(InterfaceC2020a interfaceC2020a, long j) {
        this.f6117a = j;
        this.f6118b = interfaceC2020a;
    }

    @Override // com.bumptech.glide.load.engine.p067a0.InterfaceC2012a.InterfaceC2013a
    public InterfaceC2012a build() {
        File mo33914a = this.f6118b.mo33914a();
        if (mo33914a == null) {
            return null;
        }
        if (mo33914a.mkdirs() || (mo33914a.exists() && mo33914a.isDirectory())) {
            return C2021e.m33916c(mo33914a, this.f6117a);
        }
        return null;
    }
}
