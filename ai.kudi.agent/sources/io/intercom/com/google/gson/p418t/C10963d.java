package io.intercom.com.google.gson.p418t;

import io.intercom.com.google.gson.AbstractC10936q;
import io.intercom.com.google.gson.C10907b;
import io.intercom.com.google.gson.C10916e;
import io.intercom.com.google.gson.InterfaceC10906a;
import io.intercom.com.google.gson.InterfaceC10938r;
import io.intercom.com.google.gson.p422u.C11058a;
import io.intercom.com.google.gson.s.a;
import io.intercom.com.google.gson.s.d;
import io.intercom.com.google.gson.s.e;
import io.intercom.com.google.gson.stream.C10939a;
import io.intercom.com.google.gson.stream.C10942c;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Collections;
import java.util.List;
/* compiled from: Excluder.java */
/* renamed from: io.intercom.com.google.gson.t.d */
/* loaded from: classes3.dex */
public final class C10963d implements InterfaceC10938r, Cloneable {

    /* renamed from: y */
    public static final C10963d f24956y = new C10963d();

    /* renamed from: f */
    private boolean f24960f;

    /* renamed from: c */
    private double f24957c = -1.0d;

    /* renamed from: d */
    private int f24958d = 136;

    /* renamed from: e */
    private boolean f24959e = true;

    /* renamed from: w */
    private List<InterfaceC10906a> f24961w = Collections.emptyList();

    /* renamed from: x */
    private List<InterfaceC10906a> f24962x = Collections.emptyList();

    /* compiled from: Excluder.java */
    /* renamed from: io.intercom.com.google.gson.t.d$a */
    /* loaded from: classes3.dex */
    class C10964a extends AbstractC10936q<T> {

        /* renamed from: a */
        private AbstractC10936q<T> f24963a;

        /* renamed from: b */
        final /* synthetic */ boolean f24964b;

        /* renamed from: c */
        final /* synthetic */ boolean f24965c;

        /* renamed from: d */
        final /* synthetic */ C10916e f24966d;

        /* renamed from: e */
        final /* synthetic */ C11058a f24967e;

        C10964a(boolean z, boolean z2, C10916e c10916e, C11058a c11058a) {
            this.f24964b = z;
            this.f24965c = z2;
            this.f24966d = c10916e;
            this.f24967e = c11058a;
        }

        /* renamed from: e */
        private AbstractC10936q<T> m11831e() {
            AbstractC10936q<T> abstractC10936q = this.f24963a;
            if (abstractC10936q != 0) {
                return abstractC10936q;
            }
            AbstractC10936q<T> m11957n = this.f24966d.m11957n(C10963d.this, this.f24967e);
            this.f24963a = m11957n;
            return m11957n;
        }

        /* JADX WARN: Type inference failed for: r2v1, types: [T, java.lang.Object] */
        @Override // io.intercom.com.google.gson.AbstractC10936q
        /* renamed from: b */
        public T mo11675b(C10939a c10939a) throws IOException {
            if (this.f24964b) {
                c10939a.mo11786U0();
                return null;
            }
            return m11831e().mo11675b(c10939a);
        }

        @Override // io.intercom.com.google.gson.AbstractC10936q
        /* renamed from: d */
        public void mo11674d(C10942c c10942c, T t) throws IOException {
            if (this.f24965c) {
                c10942c.mo11757f0();
            } else {
                m11831e().mo11674d(c10942c, t);
            }
        }
    }

    /* renamed from: d */
    private boolean m11840d(Class<?> cls) {
        if (this.f24957c == -1.0d || m11832l((d) cls.getAnnotation(d.class), (e) cls.getAnnotation(e.class))) {
            return (!this.f24959e && m11836h(cls)) || m11837g(cls);
        }
        return true;
    }

    /* renamed from: e */
    private boolean m11839e(Class<?> cls, boolean z) {
        for (InterfaceC10906a interfaceC10906a : z ? this.f24961w : this.f24962x) {
            if (interfaceC10906a.m11976a(cls)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: g */
    private boolean m11837g(Class<?> cls) {
        return !Enum.class.isAssignableFrom(cls) && (cls.isAnonymousClass() || cls.isLocalClass());
    }

    /* renamed from: h */
    private boolean m11836h(Class<?> cls) {
        return cls.isMemberClass() && !m11835i(cls);
    }

    /* renamed from: i */
    private boolean m11835i(Class<?> cls) {
        return (cls.getModifiers() & 8) != 0;
    }

    /* renamed from: j */
    private boolean m11834j(d dVar) {
        return dVar == null || dVar.value() <= this.f24957c;
    }

    /* renamed from: k */
    private boolean m11833k(e eVar) {
        return eVar == null || eVar.value() > this.f24957c;
    }

    /* renamed from: l */
    private boolean m11832l(d dVar, e eVar) {
        return m11834j(dVar) && m11833k(eVar);
    }

    @Override // io.intercom.com.google.gson.InterfaceC10938r
    /* renamed from: a */
    public <T> AbstractC10936q<T> mo11671a(C10916e c10916e, C11058a<T> c11058a) {
        Class<? super T> m11659c = c11058a.m11659c();
        boolean m11840d = m11840d(m11659c);
        boolean z = m11840d || m11839e(m11659c, true);
        boolean z2 = m11840d || m11839e(m11659c, false);
        if (z || z2) {
            return new C10964a(z2, z, c10916e, c11058a);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: b */
    public C10963d clone() {
        try {
            return (C10963d) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(e);
        }
    }

    /* renamed from: c */
    public boolean m11841c(Class<?> cls, boolean z) {
        return m11840d(cls) || m11839e(cls, z);
    }

    /* renamed from: f */
    public boolean m11838f(Field field, boolean z) {
        a annotation;
        if ((this.f24958d & field.getModifiers()) != 0) {
            return true;
        }
        if ((this.f24957c == -1.0d || m11832l((d) field.getAnnotation(d.class), (e) field.getAnnotation(e.class))) && !field.isSynthetic()) {
            if (!this.f24960f || ((annotation = field.getAnnotation(a.class)) != null && (!z ? !annotation.deserialize() : !annotation.serialize()))) {
                if ((this.f24959e || !m11836h(field.getType())) && !m11837g(field.getType())) {
                    List<InterfaceC10906a> list = z ? this.f24961w : this.f24962x;
                    if (list.isEmpty()) {
                        return false;
                    }
                    C10907b c10907b = new C10907b(field);
                    for (InterfaceC10906a interfaceC10906a : list) {
                        if (interfaceC10906a.m11975b(c10907b)) {
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
