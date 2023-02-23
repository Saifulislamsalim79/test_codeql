package com.bumptech.glide.p081n;

import com.bumptech.glide.load.InterfaceC2124j;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* compiled from: ResourceDecoderRegistry.java */
/* renamed from: com.bumptech.glide.n.e */
/* loaded from: classes2.dex */
public class C2342e {

    /* renamed from: a */
    private final List<String> f6754a = new ArrayList();

    /* renamed from: b */
    private final Map<String, List<C2343a<?, ?>>> f6755b = new HashMap();

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: ResourceDecoderRegistry.java */
    /* renamed from: com.bumptech.glide.n.e$a */
    /* loaded from: classes2.dex */
    public static class C2343a<T, R> {

        /* renamed from: a */
        private final Class<T> f6756a;

        /* renamed from: b */
        final Class<R> f6757b;

        /* renamed from: c */
        final InterfaceC2124j<T, R> f6758c;

        public C2343a(Class<T> cls, Class<R> cls2, InterfaceC2124j<T, R> interfaceC2124j) {
            this.f6756a = cls;
            this.f6757b = cls2;
            this.f6758c = interfaceC2124j;
        }

        /* renamed from: a */
        public boolean m33261a(Class<?> cls, Class<?> cls2) {
            return this.f6756a.isAssignableFrom(cls) && cls2.isAssignableFrom(this.f6757b);
        }
    }

    /* renamed from: c */
    private synchronized List<C2343a<?, ?>> m33264c(String str) {
        List<C2343a<?, ?>> list;
        if (!this.f6754a.contains(str)) {
            this.f6754a.add(str);
        }
        list = this.f6755b.get(str);
        if (list == null) {
            list = new ArrayList<>();
            this.f6755b.put(str, list);
        }
        return list;
    }

    /* renamed from: a */
    public synchronized <T, R> void m33266a(String str, InterfaceC2124j<T, R> interfaceC2124j, Class<T> cls, Class<R> cls2) {
        m33264c(str).add(new C2343a<>(cls, cls2, interfaceC2124j));
    }

    /* renamed from: b */
    public synchronized <T, R> List<InterfaceC2124j<T, R>> m33265b(Class<T> cls, Class<R> cls2) {
        ArrayList arrayList;
        arrayList = new ArrayList();
        for (String str : this.f6754a) {
            List<C2343a<?, ?>> list = this.f6755b.get(str);
            if (list != null) {
                for (C2343a<?, ?> c2343a : list) {
                    if (c2343a.m33261a(cls, cls2)) {
                        arrayList.add(c2343a.f6758c);
                    }
                }
            }
        }
        return arrayList;
    }

    /* renamed from: d */
    public synchronized <T, R> List<Class<R>> m33263d(Class<T> cls, Class<R> cls2) {
        ArrayList arrayList;
        arrayList = new ArrayList();
        for (String str : this.f6754a) {
            List<C2343a<?, ?>> list = this.f6755b.get(str);
            if (list != null) {
                for (C2343a<?, ?> c2343a : list) {
                    if (c2343a.m33261a(cls, cls2) && !arrayList.contains(c2343a.f6757b)) {
                        arrayList.add(c2343a.f6757b);
                    }
                }
            }
        }
        return arrayList;
    }

    /* renamed from: e */
    public synchronized void m33262e(List<String> list) {
        ArrayList<String> arrayList = new ArrayList(this.f6754a);
        this.f6754a.clear();
        for (String str : list) {
            this.f6754a.add(str);
        }
        for (String str2 : arrayList) {
            if (!list.contains(str2)) {
                this.f6754a.add(str2);
            }
        }
    }
}
