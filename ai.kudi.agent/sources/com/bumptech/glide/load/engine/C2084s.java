package com.bumptech.glide.load.engine;

import com.bumptech.glide.load.C2122h;
import com.bumptech.glide.load.engine.C2058i;
import com.bumptech.glide.load.p070m.InterfaceC2132e;
import com.bumptech.glide.p086q.C2380j;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import p201g.p227h.p237k.InterfaceC7672e;
/* compiled from: LoadPath.java */
/* renamed from: com.bumptech.glide.load.engine.s */
/* loaded from: classes2.dex */
public class C2084s<Data, ResourceType, Transcode> {

    /* renamed from: a */
    private final InterfaceC7672e<List<Throwable>> f6331a;

    /* renamed from: b */
    private final List<? extends C2058i<Data, ResourceType, Transcode>> f6332b;

    /* renamed from: c */
    private final String f6333c;

    public C2084s(Class<Data> cls, Class<ResourceType> cls2, Class<Transcode> cls3, List<C2058i<Data, ResourceType, Transcode>> list, InterfaceC7672e<List<Throwable>> interfaceC7672e) {
        this.f6331a = interfaceC7672e;
        C2380j.m33130c(list);
        this.f6332b = list;
        this.f6333c = "Failed LoadPath{" + cls.getSimpleName() + "->" + cls2.getSimpleName() + "->" + cls3.getSimpleName() + "}";
    }

    /* renamed from: b */
    private InterfaceC2087u<Transcode> m33760b(InterfaceC2132e<Data> interfaceC2132e, C2122h c2122h, int i, int i2, C2058i.InterfaceC2059a<ResourceType> interfaceC2059a, List<Throwable> list) throws GlideException {
        int size = this.f6332b.size();
        InterfaceC2087u<Transcode> interfaceC2087u = null;
        for (int i3 = 0; i3 < size; i3++) {
            try {
                interfaceC2087u = this.f6332b.get(i3).m33820a(interfaceC2132e, i, i2, c2122h, interfaceC2059a);
            } catch (GlideException e) {
                list.add(e);
            }
            if (interfaceC2087u != null) {
                break;
            }
        }
        if (interfaceC2087u != null) {
            return interfaceC2087u;
        }
        throw new GlideException(this.f6333c, new ArrayList(list));
    }

    /* renamed from: a */
    public InterfaceC2087u<Transcode> m33761a(InterfaceC2132e<Data> interfaceC2132e, C2122h c2122h, int i, int i2, C2058i.InterfaceC2059a<ResourceType> interfaceC2059a) throws GlideException {
        List<Throwable> mo11982b = this.f6331a.mo11982b();
        C2380j.m33129d(mo11982b);
        List<Throwable> list = mo11982b;
        try {
            return m33760b(interfaceC2132e, c2122h, i, i2, interfaceC2059a, list);
        } finally {
            this.f6331a.mo11983a(list);
        }
    }

    public String toString() {
        return "LoadPath{decodePaths=" + Arrays.toString(this.f6332b.toArray()) + '}';
    }
}
