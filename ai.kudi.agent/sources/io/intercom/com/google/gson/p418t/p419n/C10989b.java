package io.intercom.com.google.gson.p418t.p419n;

import io.intercom.com.google.gson.AbstractC10936q;
import io.intercom.com.google.gson.C10916e;
import io.intercom.com.google.gson.InterfaceC10938r;
import io.intercom.com.google.gson.p418t.C10944b;
import io.intercom.com.google.gson.p418t.C10948c;
import io.intercom.com.google.gson.p418t.InterfaceC10976i;
import io.intercom.com.google.gson.p422u.C11058a;
import io.intercom.com.google.gson.stream.C10939a;
import io.intercom.com.google.gson.stream.C10942c;
import io.intercom.com.google.gson.stream.EnumC10941b;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.Collection;
/* compiled from: CollectionTypeAdapterFactory.java */
/* renamed from: io.intercom.com.google.gson.t.n.b */
/* loaded from: classes3.dex */
public final class C10989b implements InterfaceC10938r {

    /* renamed from: c */
    private final C10948c f25006c;

    /* compiled from: CollectionTypeAdapterFactory.java */
    /* renamed from: io.intercom.com.google.gson.t.n.b$a */
    /* loaded from: classes3.dex */
    private static final class C10990a<E> extends AbstractC10936q<Collection<E>> {

        /* renamed from: a */
        private final AbstractC10936q<E> f25007a;

        /* renamed from: b */
        private final InterfaceC10976i<? extends Collection<E>> f25008b;

        public C10990a(C10916e c10916e, Type type, AbstractC10936q<E> abstractC10936q, InterfaceC10976i<? extends Collection<E>> interfaceC10976i) {
            this.f25007a = new C11014m(c10916e, abstractC10936q, type);
            this.f25008b = interfaceC10976i;
        }

        @Override // io.intercom.com.google.gson.AbstractC10936q
        /* renamed from: e */
        public Collection<E> mo11675b(C10939a c10939a) throws IOException {
            if (c10939a.mo11789C0() == EnumC10941b.NULL) {
                c10939a.mo11771w0();
                return null;
            }
            Collection<E> mo11808a = this.f25008b.mo11808a();
            c10939a.mo11781c();
            while (c10939a.mo11785V()) {
                mo11808a.add(this.f25007a.mo11675b(c10939a));
            }
            c10939a.mo11788J();
            return mo11808a;
        }

        @Override // io.intercom.com.google.gson.AbstractC10936q
        /* renamed from: f */
        public void mo11674d(C10942c c10942c, Collection<E> collection) throws IOException {
            if (collection == null) {
                c10942c.mo11757f0();
                return;
            }
            c10942c.mo11756m();
            for (E e : collection) {
                this.f25007a.mo11674d(c10942c, e);
            }
            c10942c.mo11763J();
        }
    }

    public C10989b(C10948c c10948c) {
        this.f25006c = c10948c;
    }

    @Override // io.intercom.com.google.gson.InterfaceC10938r
    /* renamed from: a */
    public <T> AbstractC10936q<T> mo11671a(C10916e c10916e, C11058a<T> c11058a) {
        Type m11657e = c11058a.m11657e();
        Class<? super T> m11659c = c11058a.m11659c();
        if (Collection.class.isAssignableFrom(m11659c)) {
            Type m11860h = C10944b.m11860h(m11657e, m11659c);
            return new C10990a(c10916e, m11860h, c10916e.m11959l(C11058a.m11660b(m11860h)), this.f25006c.m11846a(c11058a));
        }
        return null;
    }
}
