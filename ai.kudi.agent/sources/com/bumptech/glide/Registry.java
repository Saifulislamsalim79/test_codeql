package com.bumptech.glide;

import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.InterfaceC1996d;
import com.bumptech.glide.load.InterfaceC2124j;
import com.bumptech.glide.load.InterfaceC2125k;
import com.bumptech.glide.load.engine.C2058i;
import com.bumptech.glide.load.engine.C2084s;
import com.bumptech.glide.load.engine.InterfaceC2087u;
import com.bumptech.glide.load.p070m.C2134f;
import com.bumptech.glide.load.p070m.InterfaceC2132e;
import com.bumptech.glide.load.p072n.C2202p;
import com.bumptech.glide.load.p072n.InterfaceC2199n;
import com.bumptech.glide.load.p072n.InterfaceC2201o;
import com.bumptech.glide.load.p074o.p079h.C2283f;
import com.bumptech.glide.load.p074o.p079h.InterfaceC2282e;
import com.bumptech.glide.p081n.C2337a;
import com.bumptech.glide.p081n.C2339b;
import com.bumptech.glide.p081n.C2340c;
import com.bumptech.glide.p081n.C2341d;
import com.bumptech.glide.p081n.C2342e;
import com.bumptech.glide.p081n.C2344f;
import com.bumptech.glide.p086q.p087l.C2383a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import p201g.p227h.p237k.InterfaceC7672e;
/* loaded from: classes2.dex */
public class Registry {

    /* renamed from: a */
    private final C2202p f5864a;

    /* renamed from: b */
    private final C2337a f5865b;

    /* renamed from: c */
    private final C2342e f5866c;

    /* renamed from: d */
    private final C2344f f5867d;

    /* renamed from: e */
    private final C2134f f5868e;

    /* renamed from: f */
    private final C2283f f5869f;

    /* renamed from: g */
    private final C2339b f5870g;

    /* renamed from: h */
    private final C2341d f5871h = new C2341d();

    /* renamed from: i */
    private final C2340c f5872i = new C2340c();

    /* renamed from: j */
    private final InterfaceC7672e<List<Throwable>> f5873j;

    /* loaded from: classes2.dex */
    public static class MissingComponentException extends RuntimeException {
        public MissingComponentException(String str) {
            super(str);
        }
    }

    /* loaded from: classes2.dex */
    public static final class NoImageHeaderParserException extends MissingComponentException {
        public NoImageHeaderParserException() {
            super("Failed to find image header parser.");
        }
    }

    /* loaded from: classes2.dex */
    public static class NoModelLoaderAvailableException extends MissingComponentException {
        public NoModelLoaderAvailableException(Object obj) {
            super("Failed to find any ModelLoaders registered for model class: " + obj.getClass());
        }

        public <M> NoModelLoaderAvailableException(M m, List<InterfaceC2199n<M, ?>> list) {
            super("Found ModelLoaders for model class: " + list + ", but none that handle this specific model instance: " + m);
        }

        public NoModelLoaderAvailableException(Class<?> cls, Class<?> cls2) {
            super("Failed to find any ModelLoaders for model: " + cls + " and data: " + cls2);
        }
    }

    /* loaded from: classes2.dex */
    public static class NoResultEncoderAvailableException extends MissingComponentException {
        public NoResultEncoderAvailableException(Class<?> cls) {
            super("Failed to find result encoder for resource class: " + cls + ", you may need to consider registering a new Encoder for the requested type or DiskCacheStrategy.DATA/DiskCacheStrategy.NONE if caching your transformed resource is unnecessary.");
        }
    }

    /* loaded from: classes2.dex */
    public static class NoSourceEncoderAvailableException extends MissingComponentException {
        public NoSourceEncoderAvailableException(Class<?> cls) {
            super("Failed to find source encoder for data class: " + cls);
        }
    }

    public Registry() {
        InterfaceC7672e<List<Throwable>> m33104e = C2383a.m33104e();
        this.f5873j = m33104e;
        this.f5864a = new C2202p(m33104e);
        this.f5865b = new C2337a();
        this.f5866c = new C2342e();
        this.f5867d = new C2344f();
        this.f5868e = new C2134f();
        this.f5869f = new C2283f();
        this.f5870g = new C2339b();
        m34172r(Arrays.asList("Gif", "Bitmap", "BitmapDrawable"));
    }

    /* renamed from: f */
    private <Data, TResource, Transcode> List<C2058i<Data, TResource, Transcode>> m34184f(Class<Data> cls, Class<TResource> cls2, Class<Transcode> cls3) {
        ArrayList arrayList = new ArrayList();
        for (Class cls4 : this.f5866c.m33263d(cls, cls2)) {
            for (Class cls5 : this.f5869f.m33410b(cls4, cls3)) {
                arrayList.add(new C2058i(cls, cls4, cls5, this.f5866c.m33265b(cls, cls4), this.f5869f.m33411a(cls4, cls5), this.f5873j));
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    public <Data> Registry m34189a(Class<Data> cls, InterfaceC1996d<Data> interfaceC1996d) {
        this.f5865b.m33277a(cls, interfaceC1996d);
        return this;
    }

    /* renamed from: b */
    public <TResource> Registry m34188b(Class<TResource> cls, InterfaceC2125k<TResource> interfaceC2125k) {
        this.f5867d.m33260a(cls, interfaceC2125k);
        return this;
    }

    /* renamed from: c */
    public <Data, TResource> Registry m34187c(Class<Data> cls, Class<TResource> cls2, InterfaceC2124j<Data, TResource> interfaceC2124j) {
        m34185e("legacy_append", cls, cls2, interfaceC2124j);
        return this;
    }

    /* renamed from: d */
    public <Model, Data> Registry m34186d(Class<Model> cls, Class<Data> cls2, InterfaceC2201o<Model, Data> interfaceC2201o) {
        this.f5864a.m33554a(cls, cls2, interfaceC2201o);
        return this;
    }

    /* renamed from: e */
    public <Data, TResource> Registry m34185e(String str, Class<Data> cls, Class<TResource> cls2, InterfaceC2124j<Data, TResource> interfaceC2124j) {
        this.f5866c.m33266a(str, interfaceC2124j, cls, cls2);
        return this;
    }

    /* renamed from: g */
    public List<ImageHeaderParser> m34183g() {
        List<ImageHeaderParser> m33273b = this.f5870g.m33273b();
        if (m33273b.isEmpty()) {
            throw new NoImageHeaderParserException();
        }
        return m33273b;
    }

    /* renamed from: h */
    public <Data, TResource, Transcode> C2084s<Data, TResource, Transcode> m34182h(Class<Data> cls, Class<TResource> cls2, Class<Transcode> cls3) {
        C2084s<Data, TResource, Transcode> m33272a = this.f5872i.m33272a(cls, cls2, cls3);
        if (this.f5872i.m33270c(m33272a)) {
            return null;
        }
        if (m33272a == null) {
            List<C2058i<Data, TResource, Transcode>> m34184f = m34184f(cls, cls2, cls3);
            m33272a = m34184f.isEmpty() ? null : new C2084s<>(cls, cls2, cls3, m34184f, this.f5873j);
            this.f5872i.m33269d(cls, cls2, cls3, m33272a);
        }
        return m33272a;
    }

    /* renamed from: i */
    public <Model> List<InterfaceC2199n<Model, ?>> m34181i(Model model) {
        return this.f5864a.m33551d(model);
    }

    /* renamed from: j */
    public <Model, TResource, Transcode> List<Class<?>> m34180j(Class<Model> cls, Class<TResource> cls2, Class<Transcode> cls3) {
        List<Class<?>> m33268a = this.f5871h.m33268a(cls, cls2, cls3);
        if (m33268a == null) {
            m33268a = new ArrayList<>();
            for (Class<?> cls4 : this.f5864a.m33552c(cls)) {
                for (Class<?> cls5 : this.f5866c.m33263d(cls4, cls2)) {
                    if (!this.f5869f.m33410b(cls5, cls3).isEmpty() && !m33268a.contains(cls5)) {
                        m33268a.add(cls5);
                    }
                }
            }
            this.f5871h.m33267b(cls, cls2, cls3, Collections.unmodifiableList(m33268a));
        }
        return m33268a;
    }

    /* renamed from: k */
    public <X> InterfaceC2125k<X> m34179k(InterfaceC2087u<X> interfaceC2087u) throws NoResultEncoderAvailableException {
        InterfaceC2125k<X> m33259b = this.f5867d.m33259b(interfaceC2087u.mo33302c());
        if (m33259b != null) {
            return m33259b;
        }
        throw new NoResultEncoderAvailableException(interfaceC2087u.mo33302c());
    }

    /* renamed from: l */
    public <X> InterfaceC2132e<X> m34178l(X x) {
        return this.f5868e.m33652a(x);
    }

    /* renamed from: m */
    public <X> InterfaceC1996d<X> m34177m(X x) throws NoSourceEncoderAvailableException {
        InterfaceC1996d<X> m33276b = this.f5865b.m33276b(x.getClass());
        if (m33276b != null) {
            return m33276b;
        }
        throw new NoSourceEncoderAvailableException(x.getClass());
    }

    /* renamed from: n */
    public boolean m34176n(InterfaceC2087u<?> interfaceC2087u) {
        return this.f5867d.m33259b(interfaceC2087u.mo33302c()) != null;
    }

    /* renamed from: o */
    public Registry m34175o(ImageHeaderParser imageHeaderParser) {
        this.f5870g.m33274a(imageHeaderParser);
        return this;
    }

    /* renamed from: p */
    public Registry m34174p(InterfaceC2132e.InterfaceC2133a<?> interfaceC2133a) {
        this.f5868e.m33651b(interfaceC2133a);
        return this;
    }

    /* renamed from: q */
    public <TResource, Transcode> Registry m34173q(Class<TResource> cls, Class<Transcode> cls2, InterfaceC2282e<TResource, Transcode> interfaceC2282e) {
        this.f5869f.m33409c(cls, cls2, interfaceC2282e);
        return this;
    }

    /* renamed from: r */
    public final Registry m34172r(List<String> list) {
        ArrayList arrayList = new ArrayList(list.size());
        arrayList.addAll(list);
        arrayList.add(0, "legacy_prepend_all");
        arrayList.add("legacy_append");
        this.f5866c.m33262e(arrayList);
        return this;
    }
}
