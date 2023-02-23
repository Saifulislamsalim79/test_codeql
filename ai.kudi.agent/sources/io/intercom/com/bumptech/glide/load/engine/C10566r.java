package io.intercom.com.bumptech.glide.load.engine;

import io.intercom.com.bumptech.glide.load.C10626i;
import io.intercom.com.bumptech.glide.load.engine.C10542h;
import io.intercom.com.bumptech.glide.load.p398m.InterfaceC10633c;
import io.intercom.com.bumptech.glide.p416r.C10892h;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import p201g.p227h.p237k.InterfaceC7672e;
/* compiled from: LoadPath.java */
/* renamed from: io.intercom.com.bumptech.glide.load.engine.r */
/* loaded from: classes3.dex */
public class C10566r<Data, ResourceType, Transcode> {

    /* renamed from: a */
    private final InterfaceC7672e<List<Throwable>> f24306a;

    /* renamed from: b */
    private final List<? extends C10542h<Data, ResourceType, Transcode>> f24307b;

    /* renamed from: c */
    private final String f24308c;

    public C10566r(Class<Data> cls, Class<ResourceType> cls2, Class<Transcode> cls3, List<C10542h<Data, ResourceType, Transcode>> list, InterfaceC7672e<List<Throwable>> interfaceC7672e) {
        this.f24306a = interfaceC7672e;
        C10892h.m12015c(list);
        this.f24307b = list;
        this.f24308c = "Failed LoadPath{" + cls.getSimpleName() + "->" + cls2.getSimpleName() + "->" + cls3.getSimpleName() + "}";
    }

    /* renamed from: b */
    private InterfaceC10569t<Transcode> m12728b(InterfaceC10633c<Data> interfaceC10633c, C10626i c10626i, int i, int i2, C10542h.InterfaceC10543a<ResourceType> interfaceC10543a, List<Throwable> list) throws GlideException {
        int size = this.f24307b.size();
        InterfaceC10569t<Transcode> interfaceC10569t = null;
        for (int i3 = 0; i3 < size; i3++) {
            try {
                interfaceC10569t = this.f24307b.get(i3).m12779a(interfaceC10633c, i, i2, c10626i, interfaceC10543a);
            } catch (GlideException e) {
                list.add(e);
            }
            if (interfaceC10569t != null) {
                break;
            }
        }
        if (interfaceC10569t != null) {
            return interfaceC10569t;
        }
        throw new GlideException(this.f24308c, new ArrayList(list));
    }

    /* renamed from: a */
    public InterfaceC10569t<Transcode> m12729a(InterfaceC10633c<Data> interfaceC10633c, C10626i c10626i, int i, int i2, C10542h.InterfaceC10543a<ResourceType> interfaceC10543a) throws GlideException {
        List<Throwable> mo11982b = this.f24306a.mo11982b();
        C10892h.m12014d(mo11982b);
        List<Throwable> list = mo11982b;
        try {
            return m12728b(interfaceC10633c, c10626i, i, i2, interfaceC10543a, list);
        } finally {
            this.f24306a.mo11983a(list);
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("LoadPath{decodePaths=");
        List<? extends C10542h<Data, ResourceType, Transcode>> list = this.f24307b;
        sb.append(Arrays.toString(list.toArray(new C10542h[list.size()])));
        sb.append('}');
        return sb.toString();
    }
}
