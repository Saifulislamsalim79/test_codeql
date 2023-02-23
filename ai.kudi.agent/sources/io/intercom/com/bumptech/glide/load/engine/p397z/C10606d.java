package io.intercom.com.bumptech.glide.load.engine.p397z;

import io.intercom.com.bumptech.glide.load.engine.p397z.InterfaceC10599a;
import java.io.File;
/* compiled from: DiskLruCacheFactory.java */
/* renamed from: io.intercom.com.bumptech.glide.load.engine.z.d */
/* loaded from: classes3.dex */
public class C10606d implements InterfaceC10599a.InterfaceC10600a {

    /* renamed from: a */
    private final long f24390a;

    /* renamed from: b */
    private final InterfaceC10607a f24391b;

    /* compiled from: DiskLruCacheFactory.java */
    /* renamed from: io.intercom.com.bumptech.glide.load.engine.z.d$a */
    /* loaded from: classes3.dex */
    public interface InterfaceC10607a {
        /* renamed from: a */
        File mo12633a();
    }

    public C10606d(InterfaceC10607a interfaceC10607a, long j) {
        this.f24390a = j;
        this.f24391b = interfaceC10607a;
    }

    @Override // io.intercom.com.bumptech.glide.load.engine.p397z.InterfaceC10599a.InterfaceC10600a
    public InterfaceC10599a build() {
        File mo12633a = this.f24391b.mo12633a();
        if (mo12633a == null) {
            return null;
        }
        if (mo12633a.mkdirs() || (mo12633a.exists() && mo12633a.isDirectory())) {
            return C10608e.m12635c(mo12633a, this.f24390a);
        }
        return null;
    }
}
