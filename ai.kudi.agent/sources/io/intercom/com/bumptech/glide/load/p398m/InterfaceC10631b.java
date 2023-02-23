package io.intercom.com.bumptech.glide.load.p398m;

import io.intercom.com.bumptech.glide.EnumC10482g;
import io.intercom.com.bumptech.glide.load.EnumC10507a;
/* compiled from: DataFetcher.java */
/* renamed from: io.intercom.com.bumptech.glide.load.m.b */
/* loaded from: classes3.dex */
public interface InterfaceC10631b<T> {

    /* compiled from: DataFetcher.java */
    /* renamed from: io.intercom.com.bumptech.glide.load.m.b$a */
    /* loaded from: classes3.dex */
    public interface InterfaceC10632a<T> {
        /* renamed from: c */
        void mo12497c(Exception exc);

        /* renamed from: d */
        void mo12496d(T t);
    }

    /* renamed from: a */
    Class<T> mo12474a();

    /* renamed from: b */
    void mo12473b();

    void cancel();

    /* renamed from: e */
    void mo12472e(EnumC10482g enumC10482g, InterfaceC10632a<? super T> interfaceC10632a);

    EnumC10507a getDataSource();
}
