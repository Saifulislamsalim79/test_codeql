package io.intercom.com.google.gson.p418t.p419n;

import io.intercom.com.google.gson.AbstractC10936q;
import io.intercom.com.google.gson.C10916e;
import io.intercom.com.google.gson.InterfaceC10938r;
import io.intercom.com.google.gson.p418t.C10944b;
import io.intercom.com.google.gson.p422u.C11058a;
import io.intercom.com.google.gson.stream.C10939a;
import io.intercom.com.google.gson.stream.C10942c;
import io.intercom.com.google.gson.stream.EnumC10941b;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;
import java.util.ArrayList;
/* compiled from: ArrayTypeAdapter.java */
/* renamed from: io.intercom.com.google.gson.t.n.a */
/* loaded from: classes3.dex */
public final class C10987a<E> extends AbstractC10936q<Object> {

    /* renamed from: c */
    public static final InterfaceC10938r f25003c = new C10988a();

    /* renamed from: a */
    private final Class<E> f25004a;

    /* renamed from: b */
    private final AbstractC10936q<E> f25005b;

    /* compiled from: ArrayTypeAdapter.java */
    /* renamed from: io.intercom.com.google.gson.t.n.a$a */
    /* loaded from: classes3.dex */
    static class C10988a implements InterfaceC10938r {
        C10988a() {
        }

        @Override // io.intercom.com.google.gson.InterfaceC10938r
        /* renamed from: a */
        public <T> AbstractC10936q<T> mo11671a(C10916e c10916e, C11058a<T> c11058a) {
            Type m11657e = c11058a.m11657e();
            if ((m11657e instanceof GenericArrayType) || ((m11657e instanceof Class) && ((Class) m11657e).isArray())) {
                Type m11861g = C10944b.m11861g(m11657e);
                return new C10987a(c10916e, c10916e.m11959l(C11058a.m11660b(m11861g)), C10944b.m11857k(m11861g));
            }
            return null;
        }
    }

    public C10987a(C10916e c10916e, AbstractC10936q<E> abstractC10936q, Class<E> cls) {
        this.f25005b = new C11014m(c10916e, abstractC10936q, cls);
        this.f25004a = cls;
    }

    @Override // io.intercom.com.google.gson.AbstractC10936q
    /* renamed from: b */
    public Object mo11675b(C10939a c10939a) throws IOException {
        if (c10939a.mo11789C0() == EnumC10941b.NULL) {
            c10939a.mo11771w0();
            return null;
        }
        ArrayList arrayList = new ArrayList();
        c10939a.mo11781c();
        while (c10939a.mo11785V()) {
            arrayList.add(this.f25005b.mo11675b(c10939a));
        }
        c10939a.mo11788J();
        int size = arrayList.size();
        Object newInstance = Array.newInstance((Class<?>) this.f25004a, size);
        for (int i = 0; i < size; i++) {
            Array.set(newInstance, i, arrayList.get(i));
        }
        return newInstance;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // io.intercom.com.google.gson.AbstractC10936q
    /* renamed from: d */
    public void mo11674d(C10942c c10942c, Object obj) throws IOException {
        if (obj == null) {
            c10942c.mo11757f0();
            return;
        }
        c10942c.mo11756m();
        int length = Array.getLength(obj);
        for (int i = 0; i < length; i++) {
            this.f25005b.mo11674d(c10942c, Array.get(obj, i));
        }
        c10942c.mo11763J();
    }
}
