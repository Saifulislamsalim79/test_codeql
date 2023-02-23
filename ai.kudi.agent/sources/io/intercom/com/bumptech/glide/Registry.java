package io.intercom.com.bumptech.glide;

import io.intercom.com.bumptech.glide.load.InterfaceC10510d;
import io.intercom.com.bumptech.glide.load.InterfaceC10511e;
import io.intercom.com.bumptech.glide.load.InterfaceC10627j;
import io.intercom.com.bumptech.glide.load.InterfaceC10628k;
import io.intercom.com.bumptech.glide.load.engine.C10542h;
import io.intercom.com.bumptech.glide.load.engine.C10566r;
import io.intercom.com.bumptech.glide.load.engine.InterfaceC10569t;
import io.intercom.com.bumptech.glide.load.p398m.C10635d;
import io.intercom.com.bumptech.glide.load.p398m.InterfaceC10633c;
import io.intercom.com.bumptech.glide.load.p400n.C10700p;
import io.intercom.com.bumptech.glide.load.p400n.InterfaceC10697n;
import io.intercom.com.bumptech.glide.load.p400n.InterfaceC10699o;
import io.intercom.com.bumptech.glide.load.p402o.p408h.C10810e;
import io.intercom.com.bumptech.glide.load.p402o.p408h.InterfaceC10809d;
import io.intercom.com.bumptech.glide.p411o.C10839a;
import io.intercom.com.bumptech.glide.p411o.C10841b;
import io.intercom.com.bumptech.glide.p411o.C10842c;
import io.intercom.com.bumptech.glide.p411o.C10843d;
import io.intercom.com.bumptech.glide.p411o.C10844e;
import io.intercom.com.bumptech.glide.p411o.C10846f;
import io.intercom.com.bumptech.glide.p416r.p417j.C10895a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import p201g.p227h.p237k.InterfaceC7672e;
/* loaded from: classes3.dex */
public class Registry {

    /* renamed from: a */
    private final C10700p f23919a;

    /* renamed from: b */
    private final C10839a f23920b;

    /* renamed from: c */
    private final C10844e f23921c;

    /* renamed from: d */
    private final C10846f f23922d;

    /* renamed from: e */
    private final C10635d f23923e;

    /* renamed from: f */
    private final C10810e f23924f;

    /* renamed from: g */
    private final C10841b f23925g;

    /* renamed from: h */
    private final C10843d f23926h = new C10843d();

    /* renamed from: i */
    private final C10842c f23927i = new C10842c();

    /* renamed from: j */
    private final InterfaceC7672e<List<Throwable>> f23928j;

    /* loaded from: classes3.dex */
    public static class MissingComponentException extends RuntimeException {
        public MissingComponentException(String str) {
            super(str);
        }
    }

    /* loaded from: classes3.dex */
    public static final class NoImageHeaderParserException extends MissingComponentException {
        public NoImageHeaderParserException() {
            super("Failed to find image header parser.");
        }
    }

    /* loaded from: classes3.dex */
    public static class NoModelLoaderAvailableException extends MissingComponentException {
        public NoModelLoaderAvailableException(Object obj) {
            super("Failed to find any ModelLoaders for model: " + obj);
        }

        public NoModelLoaderAvailableException(Class<?> cls, Class<?> cls2) {
            super("Failed to find any ModelLoaders for model: " + cls + " and data: " + cls2);
        }
    }

    /* loaded from: classes3.dex */
    public static class NoResultEncoderAvailableException extends MissingComponentException {
        public NoResultEncoderAvailableException(Class<?> cls) {
            super("Failed to find result encoder for resource class: " + cls);
        }
    }

    /* loaded from: classes3.dex */
    public static class NoSourceEncoderAvailableException extends MissingComponentException {
        public NoSourceEncoderAvailableException(Class<?> cls) {
            super("Failed to find source encoder for data class: " + cls);
        }
    }

    public Registry() {
        InterfaceC7672e<List<Throwable>> m11987f = C10895a.m11987f();
        this.f23928j = m11987f;
        this.f23919a = new C10700p(m11987f);
        this.f23920b = new C10839a();
        this.f23921c = new C10844e();
        this.f23922d = new C10846f();
        this.f23923e = new C10635d();
        this.f23924f = new C10810e();
        this.f23925g = new C10841b();
        m13039r(Arrays.asList("Gif", "Bitmap", "BitmapDrawable"));
    }

    /* renamed from: f */
    private <Data, TResource, Transcode> List<C10542h<Data, TResource, Transcode>> m13051f(Class<Data> cls, Class<TResource> cls2, Class<Transcode> cls3) {
        ArrayList arrayList = new ArrayList();
        for (Class cls4 : this.f23921c.m12193d(cls, cls2)) {
            for (Class cls5 : this.f23924f.m12270b(cls4, cls3)) {
                arrayList.add(new C10542h(cls, cls4, cls5, this.f23921c.m12195b(cls, cls4), this.f23924f.m12271a(cls4, cls5), this.f23928j));
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    public <Data> Registry m13056a(Class<Data> cls, InterfaceC10510d<Data> interfaceC10510d) {
        this.f23920b.m12207a(cls, interfaceC10510d);
        return this;
    }

    /* renamed from: b */
    public <TResource> Registry m13055b(Class<TResource> cls, InterfaceC10628k<TResource> interfaceC10628k) {
        this.f23922d.m12190a(cls, interfaceC10628k);
        return this;
    }

    /* renamed from: c */
    public <Data, TResource> Registry m13054c(Class<Data> cls, Class<TResource> cls2, InterfaceC10627j<Data, TResource> interfaceC10627j) {
        m13052e("legacy_append", cls, cls2, interfaceC10627j);
        return this;
    }

    /* renamed from: d */
    public <Model, Data> Registry m13053d(Class<Model> cls, Class<Data> cls2, InterfaceC10699o<Model, Data> interfaceC10699o) {
        this.f23919a.m12505a(cls, cls2, interfaceC10699o);
        return this;
    }

    /* renamed from: e */
    public <Data, TResource> Registry m13052e(String str, Class<Data> cls, Class<TResource> cls2, InterfaceC10627j<Data, TResource> interfaceC10627j) {
        this.f23921c.m12196a(str, interfaceC10627j, cls, cls2);
        return this;
    }

    /* renamed from: g */
    public List<InterfaceC10511e> m13050g() {
        List<InterfaceC10511e> m12203b = this.f23925g.m12203b();
        if (m12203b.isEmpty()) {
            throw new NoImageHeaderParserException();
        }
        return m12203b;
    }

    /* renamed from: h */
    public <Data, TResource, Transcode> C10566r<Data, TResource, Transcode> m13049h(Class<Data> cls, Class<TResource> cls2, Class<Transcode> cls3) {
        C10566r<Data, TResource, Transcode> m12201b = this.f23927i.m12201b(cls, cls2, cls3);
        if (m12201b == null && !this.f23927i.m12202a(cls, cls2, cls3)) {
            List<C10542h<Data, TResource, Transcode>> m13051f = m13051f(cls, cls2, cls3);
            m12201b = m13051f.isEmpty() ? null : new C10566r<>(cls, cls2, cls3, m13051f, this.f23928j);
            this.f23927i.m12199d(cls, cls2, cls3, m12201b);
        }
        return m12201b;
    }

    /* renamed from: i */
    public <Model> List<InterfaceC10697n<Model, ?>> m13048i(Model model) {
        List<InterfaceC10697n<Model, ?>> m12502d = this.f23919a.m12502d(model);
        if (m12502d.isEmpty()) {
            throw new NoModelLoaderAvailableException(model);
        }
        return m12502d;
    }

    /* renamed from: j */
    public <Model, TResource, Transcode> List<Class<?>> m13047j(Class<Model> cls, Class<TResource> cls2, Class<Transcode> cls3) {
        List<Class<?>> m12198a = this.f23926h.m12198a(cls, cls2);
        if (m12198a == null) {
            m12198a = new ArrayList<>();
            for (Class<?> cls4 : this.f23919a.m12503c(cls)) {
                for (Class<?> cls5 : this.f23921c.m12193d(cls4, cls2)) {
                    if (!this.f23924f.m12270b(cls5, cls3).isEmpty() && !m12198a.contains(cls5)) {
                        m12198a.add(cls5);
                    }
                }
            }
            this.f23926h.m12197b(cls, cls2, Collections.unmodifiableList(m12198a));
        }
        return m12198a;
    }

    /* renamed from: k */
    public <X> InterfaceC10628k<X> m13046k(InterfaceC10569t<X> interfaceC10569t) throws NoResultEncoderAvailableException {
        InterfaceC10628k<X> m12189b = this.f23922d.m12189b(interfaceC10569t.mo12302c());
        if (m12189b != null) {
            return m12189b;
        }
        throw new NoResultEncoderAvailableException(interfaceC10569t.mo12302c());
    }

    /* renamed from: l */
    public <X> InterfaceC10633c<X> m13045l(X x) {
        return this.f23923e.m12589a(x);
    }

    /* renamed from: m */
    public <X> InterfaceC10510d<X> m13044m(X x) throws NoSourceEncoderAvailableException {
        InterfaceC10510d<X> m12206b = this.f23920b.m12206b(x.getClass());
        if (m12206b != null) {
            return m12206b;
        }
        throw new NoSourceEncoderAvailableException(x.getClass());
    }

    /* renamed from: n */
    public boolean m13043n(InterfaceC10569t<?> interfaceC10569t) {
        return this.f23922d.m12189b(interfaceC10569t.mo12302c()) != null;
    }

    /* renamed from: o */
    public Registry m13042o(InterfaceC10511e interfaceC10511e) {
        this.f23925g.m12204a(interfaceC10511e);
        return this;
    }

    /* renamed from: p */
    public Registry m13041p(InterfaceC10633c.InterfaceC10634a<?> interfaceC10634a) {
        this.f23923e.m12588b(interfaceC10634a);
        return this;
    }

    /* renamed from: q */
    public <TResource, Transcode> Registry m13040q(Class<TResource> cls, Class<Transcode> cls2, InterfaceC10809d<TResource, Transcode> interfaceC10809d) {
        this.f23924f.m12269c(cls, cls2, interfaceC10809d);
        return this;
    }

    /* renamed from: r */
    public final Registry m13039r(List<String> list) {
        ArrayList arrayList = new ArrayList(list);
        arrayList.add(0, "legacy_prepend_all");
        arrayList.add("legacy_append");
        this.f23921c.m12192e(arrayList);
        return this;
    }
}
