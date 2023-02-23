package com.google.gson.internal;

import com.google.gson.AbstractC6909s;
import com.google.gson.C6775c;
import com.google.gson.C6784f;
import com.google.gson.InterfaceC6774b;
import com.google.gson.InterfaceC6915t;
import com.google.gson.p184v.C6916a;
import com.google.gson.stream.C6911a;
import com.google.gson.stream.C6914c;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Collections;
import java.util.List;
/* loaded from: classes2.dex */
public final class Excluder implements InterfaceC6915t, Cloneable {

    /* renamed from: y */
    public static final Excluder f16348y = new Excluder();

    /* renamed from: f */
    private boolean f16352f;

    /* renamed from: c */
    private double f16349c = -1.0d;

    /* renamed from: d */
    private int f16350d = 136;

    /* renamed from: e */
    private boolean f16351e = true;

    /* renamed from: w */
    private List<InterfaceC6774b> f16353w = Collections.emptyList();

    /* renamed from: x */
    private List<InterfaceC6774b> f16354x = Collections.emptyList();

    /* renamed from: com.google.gson.internal.Excluder$a */
    /* loaded from: classes2.dex */
    class C6794a extends AbstractC6909s<T> {

        /* renamed from: a */
        private AbstractC6909s<T> f16355a;

        /* renamed from: b */
        final /* synthetic */ boolean f16356b;

        /* renamed from: c */
        final /* synthetic */ boolean f16357c;

        /* renamed from: d */
        final /* synthetic */ C6784f f16358d;

        /* renamed from: e */
        final /* synthetic */ C6916a f16359e;

        C6794a(boolean z, boolean z2, C6784f c6784f, C6916a c6916a) {
            this.f16356b = z;
            this.f16357c = z2;
            this.f16358d = c6784f;
            this.f16359e = c6916a;
        }

        /* renamed from: e */
        private AbstractC6909s<T> m20718e() {
            AbstractC6909s<T> abstractC6909s = this.f16355a;
            if (abstractC6909s != 0) {
                return abstractC6909s;
            }
            AbstractC6909s<T> m20756p = this.f16358d.m20756p(Excluder.this, this.f16359e);
            this.f16355a = m20756p;
            return m20756p;
        }

        /* JADX WARN: Type inference failed for: r2v1, types: [T, java.lang.Object] */
        @Override // com.google.gson.AbstractC6909s
        /* renamed from: b */
        public T mo20528b(C6911a c6911a) throws IOException {
            if (this.f16356b) {
                c6911a.mo20510U0();
                return null;
            }
            return m20718e().mo20528b(c6911a);
        }

        @Override // com.google.gson.AbstractC6909s
        /* renamed from: d */
        public void mo20527d(C6914c c6914c, T t) throws IOException {
            if (this.f16357c) {
                c6914c.mo20474f0();
            } else {
                m20718e().mo20527d(c6914c, t);
            }
        }
    }

    /* renamed from: d */
    private boolean m20727d(Class<?> cls) {
        if (this.f16349c == -1.0d || m20719l((com.google.gson.u.d) cls.getAnnotation(com.google.gson.u.d.class), (com.google.gson.u.e) cls.getAnnotation(com.google.gson.u.e.class))) {
            return (!this.f16351e && m20723h(cls)) || m20724g(cls);
        }
        return true;
    }

    /* renamed from: e */
    private boolean m20726e(Class<?> cls, boolean z) {
        for (InterfaceC6774b interfaceC6774b : z ? this.f16353w : this.f16354x) {
            if (interfaceC6774b.m20778a(cls)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: g */
    private boolean m20724g(Class<?> cls) {
        return !Enum.class.isAssignableFrom(cls) && (cls.isAnonymousClass() || cls.isLocalClass());
    }

    /* renamed from: h */
    private boolean m20723h(Class<?> cls) {
        return cls.isMemberClass() && !m20722i(cls);
    }

    /* renamed from: i */
    private boolean m20722i(Class<?> cls) {
        return (cls.getModifiers() & 8) != 0;
    }

    /* renamed from: j */
    private boolean m20721j(com.google.gson.u.d dVar) {
        return dVar == null || dVar.value() <= this.f16349c;
    }

    /* renamed from: k */
    private boolean m20720k(com.google.gson.u.e eVar) {
        return eVar == null || eVar.value() > this.f16349c;
    }

    /* renamed from: l */
    private boolean m20719l(com.google.gson.u.d dVar, com.google.gson.u.e eVar) {
        return m20721j(dVar) && m20720k(eVar);
    }

    @Override // com.google.gson.InterfaceC6915t
    /* renamed from: a */
    public <T> AbstractC6909s<T> mo20463a(C6784f c6784f, C6916a<T> c6916a) {
        Class<? super T> rawType = c6916a.getRawType();
        boolean m20727d = m20727d(rawType);
        boolean z = m20727d || m20726e(rawType, true);
        boolean z2 = m20727d || m20726e(rawType, false);
        if (z || z2) {
            return new C6794a(z2, z, c6784f, c6916a);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: b */
    public Excluder clone() {
        try {
            return (Excluder) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(e);
        }
    }

    /* renamed from: c */
    public boolean m20728c(Class<?> cls, boolean z) {
        return m20727d(cls) || m20726e(cls, z);
    }

    /* renamed from: f */
    public boolean m20725f(Field field, boolean z) {
        com.google.gson.u.a annotation;
        if ((this.f16350d & field.getModifiers()) != 0) {
            return true;
        }
        if ((this.f16349c == -1.0d || m20719l((com.google.gson.u.d) field.getAnnotation(com.google.gson.u.d.class), (com.google.gson.u.e) field.getAnnotation(com.google.gson.u.e.class))) && !field.isSynthetic()) {
            if (!this.f16352f || ((annotation = field.getAnnotation(com.google.gson.u.a.class)) != null && (!z ? !annotation.deserialize() : !annotation.serialize()))) {
                if ((this.f16351e || !m20723h(field.getType())) && !m20724g(field.getType())) {
                    List<InterfaceC6774b> list = z ? this.f16353w : this.f16354x;
                    if (list.isEmpty()) {
                        return false;
                    }
                    C6775c c6775c = new C6775c(field);
                    for (InterfaceC6774b interfaceC6774b : list) {
                        if (interfaceC6774b.m20777b(c6775c)) {
                            return true;
                        }
                    }
                    return false;
                }
                return true;
            }
            return true;
        }
        return true;
    }
}
