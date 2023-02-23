package io.intercom.com.bumptech.glide.load.p402o;

import io.intercom.com.bumptech.glide.load.engine.InterfaceC10569t;
import io.intercom.com.bumptech.glide.p416r.C10892h;
/* compiled from: SimpleResource.java */
/* renamed from: io.intercom.com.bumptech.glide.load.o.a */
/* loaded from: classes3.dex */
public class C10736a<T> implements InterfaceC10569t<T> {

    /* renamed from: c */
    protected final T f24555c;

    public C10736a(T t) {
        C10892h.m12014d(t);
        this.f24555c = t;
    }

    @Override // io.intercom.com.bumptech.glide.load.engine.InterfaceC10569t
    /* renamed from: b */
    public void mo12303b() {
    }

    @Override // io.intercom.com.bumptech.glide.load.engine.InterfaceC10569t
    /* renamed from: c */
    public Class<T> mo12302c() {
        return (Class<T>) this.f24555c.getClass();
    }

    @Override // io.intercom.com.bumptech.glide.load.engine.InterfaceC10569t
    public final T get() {
        return this.f24555c;
    }

    @Override // io.intercom.com.bumptech.glide.load.engine.InterfaceC10569t
    public final int getSize() {
        return 1;
    }
}
