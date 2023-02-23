package com.bumptech.glide.load.p070m;

import com.bumptech.glide.EnumC1949f;
import com.bumptech.glide.load.EnumC1993a;
/* compiled from: DataFetcher.java */
/* renamed from: com.bumptech.glide.load.m.d */
/* loaded from: classes2.dex */
public interface InterfaceC2130d<T> {

    /* compiled from: DataFetcher.java */
    /* renamed from: com.bumptech.glide.load.m.d$a */
    /* loaded from: classes2.dex */
    public interface InterfaceC2131a<T> {
        /* renamed from: c */
        void mo33546c(Exception exc);

        /* renamed from: d */
        void mo33545d(T t);
    }

    /* renamed from: a */
    Class<T> mo33507a();

    /* renamed from: b */
    void mo33506b();

    void cancel();

    /* renamed from: e */
    void mo33503e(EnumC1949f enumC1949f, InterfaceC2131a<? super T> interfaceC2131a);

    EnumC1993a getDataSource();
}
