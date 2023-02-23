package io.intercom.com.bumptech.glide.load.engine;

import io.intercom.com.bumptech.glide.load.C10626i;
import io.intercom.com.bumptech.glide.load.InterfaceC10510d;
import io.intercom.com.bumptech.glide.load.engine.p397z.InterfaceC10599a;
import java.io.File;
/* compiled from: DataCacheWriter.java */
/* renamed from: io.intercom.com.bumptech.glide.load.engine.d */
/* loaded from: classes3.dex */
class C10529d<DataType> implements InterfaceC10599a.InterfaceC10601b {

    /* renamed from: a */
    private final InterfaceC10510d<DataType> f24159a;

    /* renamed from: b */
    private final DataType f24160b;

    /* renamed from: c */
    private final C10626i f24161c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C10529d(InterfaceC10510d<DataType> interfaceC10510d, DataType datatype, C10626i c10626i) {
        this.f24159a = interfaceC10510d;
        this.f24160b = datatype;
        this.f24161c = c10626i;
    }

    @Override // io.intercom.com.bumptech.glide.load.engine.p397z.InterfaceC10599a.InterfaceC10601b
    /* renamed from: a */
    public boolean mo12642a(File file) {
        return this.f24159a.mo12306b(this.f24160b, file, this.f24161c);
    }
}
