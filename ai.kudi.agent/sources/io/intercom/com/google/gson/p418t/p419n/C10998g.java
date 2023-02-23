package io.intercom.com.google.gson.p418t.p419n;

import io.intercom.com.google.gson.AbstractC10927j;
import io.intercom.com.google.gson.AbstractC10936q;
import io.intercom.com.google.gson.C10916e;
import io.intercom.com.google.gson.C10930m;
import io.intercom.com.google.gson.InterfaceC10938r;
import io.intercom.com.google.gson.JsonSyntaxException;
import io.intercom.com.google.gson.p418t.AbstractC10966f;
import io.intercom.com.google.gson.p418t.C10944b;
import io.intercom.com.google.gson.p418t.C10948c;
import io.intercom.com.google.gson.p418t.C10979l;
import io.intercom.com.google.gson.p418t.InterfaceC10976i;
import io.intercom.com.google.gson.p422u.C11058a;
import io.intercom.com.google.gson.stream.C10939a;
import io.intercom.com.google.gson.stream.C10942c;
import io.intercom.com.google.gson.stream.EnumC10941b;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Map;
/* compiled from: MapTypeAdapterFactory.java */
/* renamed from: io.intercom.com.google.gson.t.n.g */
/* loaded from: classes3.dex */
public final class C10998g implements InterfaceC10938r {

    /* renamed from: c */
    private final C10948c f25022c;

    /* renamed from: d */
    final boolean f25023d;

    /* compiled from: MapTypeAdapterFactory.java */
    /* renamed from: io.intercom.com.google.gson.t.n.g$a */
    /* loaded from: classes3.dex */
    private final class C10999a<K, V> extends AbstractC10936q<Map<K, V>> {

        /* renamed from: a */
        private final AbstractC10936q<K> f25024a;

        /* renamed from: b */
        private final AbstractC10936q<V> f25025b;

        /* renamed from: c */
        private final InterfaceC10976i<? extends Map<K, V>> f25026c;

        public C10999a(C10916e c10916e, Type type, AbstractC10936q<K> abstractC10936q, Type type2, AbstractC10936q<V> abstractC10936q2, InterfaceC10976i<? extends Map<K, V>> interfaceC10976i) {
            this.f25024a = new C11014m(c10916e, abstractC10936q, type);
            this.f25025b = new C11014m(c10916e, abstractC10936q2, type2);
            this.f25026c = interfaceC10976i;
        }

        /* renamed from: e */
        private String m11754e(AbstractC10927j abstractC10927j) {
            if (abstractC10927j.m11925m()) {
                C10930m m11929f = abstractC10927j.m11929f();
                if (m11929f.m11915X()) {
                    return String.valueOf(m11929f.m11919J());
                }
                if (m11929f.m11917P()) {
                    return Boolean.toString(m11929f.m11911s());
                }
                if (m11929f.m11913b0()) {
                    return m11929f.m11918O();
                }
                throw new AssertionError();
            } else if (abstractC10927j.m11927k()) {
                return "null";
            } else {
                throw new AssertionError();
            }
        }

        @Override // io.intercom.com.google.gson.AbstractC10936q
        /* renamed from: f */
        public Map<K, V> mo11675b(C10939a c10939a) throws IOException {
            EnumC10941b mo11789C0 = c10939a.mo11789C0();
            if (mo11789C0 == EnumC10941b.NULL) {
                c10939a.mo11771w0();
                return null;
            }
            Map<K, V> mo11808a = this.f25026c.mo11808a();
            if (mo11789C0 == EnumC10941b.BEGIN_ARRAY) {
                c10939a.mo11781c();
                while (c10939a.mo11785V()) {
                    c10939a.mo11781c();
                    K mo11675b = this.f25024a.mo11675b(c10939a);
                    if (mo11808a.put(mo11675b, this.f25025b.mo11675b(c10939a)) == null) {
                        c10939a.mo11788J();
                    } else {
                        throw new JsonSyntaxException("duplicate key: " + mo11675b);
                    }
                }
                c10939a.mo11788J();
            } else {
                c10939a.mo11776g();
                while (c10939a.mo11785V()) {
                    AbstractC10966f.f24970a.mo11824a(c10939a);
                    K mo11675b2 = this.f25024a.mo11675b(c10939a);
                    if (mo11808a.put(mo11675b2, this.f25025b.mo11675b(c10939a)) != null) {
                        throw new JsonSyntaxException("duplicate key: " + mo11675b2);
                    }
                }
                c10939a.mo11787O();
            }
            return mo11808a;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // io.intercom.com.google.gson.AbstractC10936q
        /* renamed from: g */
        public void mo11674d(C10942c c10942c, Map<K, V> map) throws IOException {
            if (map == null) {
                c10942c.mo11757f0();
            } else if (!C10998g.this.f25023d) {
                c10942c.mo11766F();
                for (Map.Entry<K, V> entry : map.entrySet()) {
                    c10942c.mo11758Z(String.valueOf(entry.getKey()));
                    this.f25025b.mo11674d(c10942c, entry.getValue());
                }
                c10942c.mo11760O();
            } else {
                ArrayList arrayList = new ArrayList(map.size());
                ArrayList arrayList2 = new ArrayList(map.size());
                int i = 0;
                boolean z = false;
                for (Map.Entry<K, V> entry2 : map.entrySet()) {
                    AbstractC10927j m11907c = this.f25024a.m11907c(entry2.getKey());
                    arrayList.add(m11907c);
                    arrayList2.add(entry2.getValue());
                    z |= m11907c.m11928h() || m11907c.m11926l();
                }
                if (z) {
                    c10942c.mo11756m();
                    int size = arrayList.size();
                    while (i < size) {
                        c10942c.mo11756m();
                        C10979l.m11800b((AbstractC10927j) arrayList.get(i), c10942c);
                        this.f25025b.mo11674d(c10942c, arrayList2.get(i));
                        c10942c.mo11763J();
                        i++;
                    }
                    c10942c.mo11763J();
                    return;
                }
                c10942c.mo11766F();
                int size2 = arrayList.size();
                while (i < size2) {
                    c10942c.mo11758Z(m11754e((AbstractC10927j) arrayList.get(i)));
                    this.f25025b.mo11674d(c10942c, arrayList2.get(i));
                    i++;
                }
                c10942c.mo11760O();
            }
        }
    }

    public C10998g(C10948c c10948c, boolean z) {
        this.f25022c = c10948c;
        this.f25023d = z;
    }

    /* renamed from: b */
    private AbstractC10936q<?> m11755b(C10916e c10916e, Type type) {
        if (type != Boolean.TYPE && type != Boolean.class) {
            return c10916e.m11959l(C11058a.m11660b(type));
        }
        return C11015n.f25092f;
    }

    @Override // io.intercom.com.google.gson.InterfaceC10938r
    /* renamed from: a */
    public <T> AbstractC10936q<T> mo11671a(C10916e c10916e, C11058a<T> c11058a) {
        Type m11657e = c11058a.m11657e();
        if (Map.class.isAssignableFrom(c11058a.m11659c())) {
            Type[] m11858j = C10944b.m11858j(m11657e, C10944b.m11857k(m11657e));
            return new C10999a(c10916e, m11858j[0], m11755b(c10916e, m11858j[0]), m11858j[1], c10916e.m11959l(C11058a.m11660b(m11858j[1])), this.f25022c.m11846a(c11058a));
        }
        return null;
    }
}
