package io.intercom.com.bumptech.glide.p411o;

import io.intercom.com.bumptech.glide.load.InterfaceC10627j;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* compiled from: ResourceDecoderRegistry.java */
/* renamed from: io.intercom.com.bumptech.glide.o.e */
/* loaded from: classes3.dex */
public class C10844e {

    /* renamed from: a */
    private final List<String> f24729a = new ArrayList();

    /* renamed from: b */
    private final Map<String, List<C10845a<?, ?>>> f24730b = new HashMap();

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: ResourceDecoderRegistry.java */
    /* renamed from: io.intercom.com.bumptech.glide.o.e$a */
    /* loaded from: classes3.dex */
    public static class C10845a<T, R> {

        /* renamed from: a */
        private final Class<T> f24731a;

        /* renamed from: b */
        final Class<R> f24732b;

        /* renamed from: c */
        final InterfaceC10627j<T, R> f24733c;

        public C10845a(Class<T> cls, Class<R> cls2, InterfaceC10627j<T, R> interfaceC10627j) {
            this.f24731a = cls;
            this.f24732b = cls2;
            this.f24733c = interfaceC10627j;
        }

        /* renamed from: a */
        public boolean m12191a(Class<?> cls, Class<?> cls2) {
            return this.f24731a.isAssignableFrom(cls) && cls2.isAssignableFrom(this.f24732b);
        }
    }

    /* renamed from: c */
    private synchronized List<C10845a<?, ?>> m12194c(String str) {
        List<C10845a<?, ?>> list;
        if (!this.f24729a.contains(str)) {
            this.f24729a.add(str);
        }
        list = this.f24730b.get(str);
        if (list == null) {
            list = new ArrayList<>();
            this.f24730b.put(str, list);
        }
        return list;
    }

    /* renamed from: a */
    public synchronized <T, R> void m12196a(String str, InterfaceC10627j<T, R> interfaceC10627j, Class<T> cls, Class<R> cls2) {
        m12194c(str).add(new C10845a<>(cls, cls2, interfaceC10627j));
    }

    /* renamed from: b */
    public synchronized <T, R> List<InterfaceC10627j<T, R>> m12195b(Class<T> cls, Class<R> cls2) {
        ArrayList arrayList;
        arrayList = new ArrayList();
        for (String str : this.f24729a) {
            List<C10845a<?, ?>> list = this.f24730b.get(str);
            if (list != null) {
                for (C10845a<?, ?> c10845a : list) {
                    if (c10845a.m12191a(cls, cls2)) {
                        arrayList.add(c10845a.f24733c);
                    }
                }
            }
        }
        return arrayList;
    }

    /* renamed from: d */
    public synchronized <T, R> List<Class<R>> m12193d(Class<T> cls, Class<R> cls2) {
        ArrayList arrayList;
        arrayList = new ArrayList();
        for (String str : this.f24729a) {
            List<C10845a<?, ?>> list = this.f24730b.get(str);
            if (list != null) {
                for (C10845a<?, ?> c10845a : list) {
                    if (c10845a.m12191a(cls, cls2)) {
                        arrayList.add(c10845a.f24732b);
                    }
                }
            }
        }
        return arrayList;
    }

    /* renamed from: e */
    public synchronized void m12192e(List<String> list) {
        ArrayList<String> arrayList = new ArrayList(this.f24729a);
        this.f24729a.clear();
        this.f24729a.addAll(list);
        for (String str : arrayList) {
            if (!list.contains(str)) {
                this.f24729a.add(str);
            }
        }
    }
}
