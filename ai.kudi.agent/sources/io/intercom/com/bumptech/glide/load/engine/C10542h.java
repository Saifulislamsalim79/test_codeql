package io.intercom.com.bumptech.glide.load.engine;

import android.util.Log;
import io.intercom.com.bumptech.glide.load.C10626i;
import io.intercom.com.bumptech.glide.load.InterfaceC10627j;
import io.intercom.com.bumptech.glide.load.p398m.InterfaceC10633c;
import io.intercom.com.bumptech.glide.load.p402o.p408h.InterfaceC10809d;
import io.intercom.com.bumptech.glide.p416r.C10892h;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import p201g.p227h.p237k.InterfaceC7672e;
/* compiled from: DecodePath.java */
/* renamed from: io.intercom.com.bumptech.glide.load.engine.h */
/* loaded from: classes3.dex */
public class C10542h<DataType, ResourceType, Transcode> {

    /* renamed from: a */
    private final Class<DataType> f24231a;

    /* renamed from: b */
    private final List<? extends InterfaceC10627j<DataType, ResourceType>> f24232b;

    /* renamed from: c */
    private final InterfaceC10809d<ResourceType, Transcode> f24233c;

    /* renamed from: d */
    private final InterfaceC7672e<List<Throwable>> f24234d;

    /* renamed from: e */
    private final String f24235e;

    /* compiled from: DecodePath.java */
    /* renamed from: io.intercom.com.bumptech.glide.load.engine.h$a */
    /* loaded from: classes3.dex */
    interface InterfaceC10543a<ResourceType> {
        /* renamed from: a */
        InterfaceC10569t<ResourceType> mo12776a(InterfaceC10569t<ResourceType> interfaceC10569t);
    }

    public C10542h(Class<DataType> cls, Class<ResourceType> cls2, Class<Transcode> cls3, List<? extends InterfaceC10627j<DataType, ResourceType>> list, InterfaceC10809d<ResourceType, Transcode> interfaceC10809d, InterfaceC7672e<List<Throwable>> interfaceC7672e) {
        this.f24231a = cls;
        this.f24232b = list;
        this.f24233c = interfaceC10809d;
        this.f24234d = interfaceC7672e;
        this.f24235e = "Failed DecodePath{" + cls.getSimpleName() + "->" + cls2.getSimpleName() + "->" + cls3.getSimpleName() + "}";
    }

    /* renamed from: b */
    private InterfaceC10569t<ResourceType> m12778b(InterfaceC10633c<DataType> interfaceC10633c, int i, int i2, C10626i c10626i) throws GlideException {
        List<Throwable> mo11982b = this.f24234d.mo11982b();
        C10892h.m12014d(mo11982b);
        List<Throwable> list = mo11982b;
        try {
            return m12777c(interfaceC10633c, i, i2, c10626i, list);
        } finally {
            this.f24234d.mo11983a(list);
        }
    }

    /* renamed from: c */
    private InterfaceC10569t<ResourceType> m12777c(InterfaceC10633c<DataType> interfaceC10633c, int i, int i2, C10626i c10626i, List<Throwable> list) throws GlideException {
        int size = this.f24232b.size();
        InterfaceC10569t<ResourceType> interfaceC10569t = null;
        for (int i3 = 0; i3 < size; i3++) {
            InterfaceC10627j<DataType, ResourceType> interfaceC10627j = this.f24232b.get(i3);
            try {
                if (interfaceC10627j.mo12275b(interfaceC10633c.mo12358a(), c10626i)) {
                    interfaceC10569t = interfaceC10627j.mo12276a(interfaceC10633c.mo12358a(), i, i2, c10626i);
                }
            } catch (IOException | OutOfMemoryError | RuntimeException e) {
                if (Log.isLoggable("DecodePath", 2)) {
                    Log.v("DecodePath", "Failed to decode data for " + interfaceC10627j, e);
                }
                list.add(e);
            }
            if (interfaceC10569t != null) {
                break;
            }
        }
        if (interfaceC10569t != null) {
            return interfaceC10569t;
        }
        throw new GlideException(this.f24235e, new ArrayList(list));
    }

    /* renamed from: a */
    public InterfaceC10569t<Transcode> m12779a(InterfaceC10633c<DataType> interfaceC10633c, int i, int i2, C10626i c10626i, InterfaceC10543a<ResourceType> interfaceC10543a) throws GlideException {
        return this.f24233c.mo12267a(interfaceC10543a.mo12776a(m12778b(interfaceC10633c, i, i2, c10626i)), c10626i);
    }

    public String toString() {
        return "DecodePath{ dataClass=" + this.f24231a + ", decoders=" + this.f24232b + ", transcoder=" + this.f24233c + '}';
    }
}
