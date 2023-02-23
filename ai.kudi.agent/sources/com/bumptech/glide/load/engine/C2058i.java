package com.bumptech.glide.load.engine;

import android.util.Log;
import com.bumptech.glide.load.C2122h;
import com.bumptech.glide.load.InterfaceC2124j;
import com.bumptech.glide.load.p070m.InterfaceC2132e;
import com.bumptech.glide.load.p074o.p079h.InterfaceC2282e;
import com.bumptech.glide.p086q.C2380j;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import p201g.p227h.p237k.InterfaceC7672e;
/* compiled from: DecodePath.java */
/* renamed from: com.bumptech.glide.load.engine.i */
/* loaded from: classes2.dex */
public class C2058i<DataType, ResourceType, Transcode> {

    /* renamed from: a */
    private final Class<DataType> f6247a;

    /* renamed from: b */
    private final List<? extends InterfaceC2124j<DataType, ResourceType>> f6248b;

    /* renamed from: c */
    private final InterfaceC2282e<ResourceType, Transcode> f6249c;

    /* renamed from: d */
    private final InterfaceC7672e<List<Throwable>> f6250d;

    /* renamed from: e */
    private final String f6251e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: DecodePath.java */
    /* renamed from: com.bumptech.glide.load.engine.i$a */
    /* loaded from: classes2.dex */
    public interface InterfaceC2059a<ResourceType> {
        /* renamed from: a */
        InterfaceC2087u<ResourceType> mo33817a(InterfaceC2087u<ResourceType> interfaceC2087u);
    }

    public C2058i(Class<DataType> cls, Class<ResourceType> cls2, Class<Transcode> cls3, List<? extends InterfaceC2124j<DataType, ResourceType>> list, InterfaceC2282e<ResourceType, Transcode> interfaceC2282e, InterfaceC7672e<List<Throwable>> interfaceC7672e) {
        this.f6247a = cls;
        this.f6248b = list;
        this.f6249c = interfaceC2282e;
        this.f6250d = interfaceC7672e;
        this.f6251e = "Failed DecodePath{" + cls.getSimpleName() + "->" + cls2.getSimpleName() + "->" + cls3.getSimpleName() + "}";
    }

    /* renamed from: b */
    private InterfaceC2087u<ResourceType> m33819b(InterfaceC2132e<DataType> interfaceC2132e, int i, int i2, C2122h c2122h) throws GlideException {
        List<Throwable> mo11982b = this.f6250d.mo11982b();
        C2380j.m33129d(mo11982b);
        List<Throwable> list = mo11982b;
        try {
            return m33818c(interfaceC2132e, i, i2, c2122h, list);
        } finally {
            this.f6250d.mo11983a(list);
        }
    }

    /* renamed from: c */
    private InterfaceC2087u<ResourceType> m33818c(InterfaceC2132e<DataType> interfaceC2132e, int i, int i2, C2122h c2122h, List<Throwable> list) throws GlideException {
        int size = this.f6248b.size();
        InterfaceC2087u<ResourceType> interfaceC2087u = null;
        for (int i3 = 0; i3 < size; i3++) {
            InterfaceC2124j<DataType, ResourceType> interfaceC2124j = this.f6248b.get(i3);
            try {
                if (interfaceC2124j.mo33301a(interfaceC2132e.mo33492a(), c2122h)) {
                    interfaceC2087u = interfaceC2124j.mo33300b(interfaceC2132e.mo33492a(), i, i2, c2122h);
                }
            } catch (IOException | OutOfMemoryError | RuntimeException e) {
                if (Log.isLoggable("DecodePath", 2)) {
                    Log.v("DecodePath", "Failed to decode data for " + interfaceC2124j, e);
                }
                list.add(e);
            }
            if (interfaceC2087u != null) {
                break;
            }
        }
        if (interfaceC2087u != null) {
            return interfaceC2087u;
        }
        throw new GlideException(this.f6251e, new ArrayList(list));
    }

    /* renamed from: a */
    public InterfaceC2087u<Transcode> m33820a(InterfaceC2132e<DataType> interfaceC2132e, int i, int i2, C2122h c2122h, InterfaceC2059a<ResourceType> interfaceC2059a) throws GlideException {
        return this.f6249c.mo33407a(interfaceC2059a.mo33817a(m33819b(interfaceC2132e, i, i2, c2122h)), c2122h);
    }

    public String toString() {
        return "DecodePath{ dataClass=" + this.f6247a + ", decoders=" + this.f6248b + ", transcoder=" + this.f6249c + '}';
    }
}
