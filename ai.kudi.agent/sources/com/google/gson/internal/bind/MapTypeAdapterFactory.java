package com.google.gson.internal.bind;

import com.google.gson.AbstractC6900l;
import com.google.gson.AbstractC6909s;
import com.google.gson.C6784f;
import com.google.gson.C6903o;
import com.google.gson.InterfaceC6915t;
import com.google.gson.JsonSyntaxException;
import com.google.gson.internal.AbstractC6874e;
import com.google.gson.internal.C6796b;
import com.google.gson.internal.C6858c;
import com.google.gson.internal.C6887k;
import com.google.gson.internal.InterfaceC6884h;
import com.google.gson.p184v.C6916a;
import com.google.gson.stream.C6911a;
import com.google.gson.stream.C6914c;
import com.google.gson.stream.EnumC6913b;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Map;
/* loaded from: classes2.dex */
public final class MapTypeAdapterFactory implements InterfaceC6915t {

    /* renamed from: c */
    private final C6858c f16377c;

    /* renamed from: d */
    final boolean f16378d;

    /* renamed from: com.google.gson.internal.bind.MapTypeAdapterFactory$a */
    /* loaded from: classes2.dex */
    private final class C6803a<K, V> extends AbstractC6909s<Map<K, V>> {

        /* renamed from: a */
        private final AbstractC6909s<K> f16379a;

        /* renamed from: b */
        private final AbstractC6909s<V> f16380b;

        /* renamed from: c */
        private final InterfaceC6884h<? extends Map<K, V>> f16381c;

        public C6803a(C6784f c6784f, Type type, AbstractC6909s<K> abstractC6909s, Type type2, AbstractC6909s<V> abstractC6909s2, InterfaceC6884h<? extends Map<K, V>> interfaceC6884h) {
            this.f16379a = new C6856c(c6784f, abstractC6909s, type);
            this.f16380b = new C6856c(c6784f, abstractC6909s2, type2);
            this.f16381c = interfaceC6884h;
        }

        /* renamed from: e */
        private String m20687e(AbstractC6900l abstractC6900l) {
            if (abstractC6900l.m20544m()) {
                C6903o m20548f = abstractC6900l.m20548f();
                if (m20548f.m20535V()) {
                    return String.valueOf(m20548f.m20539I());
                }
                if (m20548f.m20537O()) {
                    return Boolean.toString(m20548f.m20533s());
                }
                if (m20548f.m20534X()) {
                    return m20548f.m20538J();
                }
                throw new AssertionError();
            } else if (abstractC6900l.m20546k()) {
                return "null";
            } else {
                throw new AssertionError();
            }
        }

        @Override // com.google.gson.AbstractC6909s
        /* renamed from: f */
        public Map<K, V> mo20528b(C6911a c6911a) throws IOException {
            EnumC6913b mo20525C0 = c6911a.mo20525C0();
            if (mo20525C0 == EnumC6913b.NULL) {
                c6911a.mo20495w0();
                return null;
            }
            Map<K, V> mo20568a = this.f16381c.mo20568a();
            if (mo20525C0 == EnumC6913b.BEGIN_ARRAY) {
                c6911a.mo20504c();
                while (c6911a.mo20509V()) {
                    c6911a.mo20504c();
                    K mo20528b = this.f16379a.mo20528b(c6911a);
                    if (mo20568a.put(mo20528b, this.f16380b.mo20528b(c6911a)) == null) {
                        c6911a.mo20518J();
                    } else {
                        throw new JsonSyntaxException("duplicate key: " + mo20528b);
                    }
                }
                c6911a.mo20518J();
            } else {
                c6911a.mo20502g();
                while (c6911a.mo20509V()) {
                    AbstractC6874e.f16515a.mo20492a(c6911a);
                    K mo20528b2 = this.f16379a.mo20528b(c6911a);
                    if (mo20568a.put(mo20528b2, this.f16380b.mo20528b(c6911a)) != null) {
                        throw new JsonSyntaxException("duplicate key: " + mo20528b2);
                    }
                }
                c6911a.mo20514O();
            }
            return mo20568a;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.gson.AbstractC6909s
        /* renamed from: g */
        public void mo20527d(C6914c c6914c, Map<K, V> map) throws IOException {
            if (map == null) {
                c6914c.mo20474f0();
            } else if (!MapTypeAdapterFactory.this.f16378d) {
                c6914c.mo20487F();
                for (Map.Entry<K, V> entry : map.entrySet()) {
                    c6914c.mo20477Z(String.valueOf(entry.getKey()));
                    this.f16380b.mo20527d(c6914c, entry.getValue());
                }
                c6914c.mo20481O();
            } else {
                ArrayList arrayList = new ArrayList(map.size());
                ArrayList arrayList2 = new ArrayList(map.size());
                int i = 0;
                boolean z = false;
                for (Map.Entry<K, V> entry2 : map.entrySet()) {
                    AbstractC6900l m20529c = this.f16379a.m20529c(entry2.getKey());
                    arrayList.add(m20529c);
                    arrayList2.add(entry2.getValue());
                    z |= m20529c.m20547h() || m20529c.m20545l();
                }
                if (z) {
                    c6914c.mo20469m();
                    int size = arrayList.size();
                    while (i < size) {
                        c6914c.mo20469m();
                        C6887k.m20561b((AbstractC6900l) arrayList.get(i), c6914c);
                        this.f16380b.mo20527d(c6914c, arrayList2.get(i));
                        c6914c.mo20483J();
                        i++;
                    }
                    c6914c.mo20483J();
                    return;
                }
                c6914c.mo20487F();
                int size2 = arrayList.size();
                while (i < size2) {
                    c6914c.mo20477Z(m20687e((AbstractC6900l) arrayList.get(i)));
                    this.f16380b.mo20527d(c6914c, arrayList2.get(i));
                    i++;
                }
                c6914c.mo20481O();
            }
        }
    }

    public MapTypeAdapterFactory(C6858c c6858c, boolean z) {
        this.f16377c = c6858c;
        this.f16378d = z;
    }

    /* renamed from: b */
    private AbstractC6909s<?> m20688b(C6784f c6784f, Type type) {
        if (type != Boolean.TYPE && type != Boolean.class) {
            return c6784f.m20758n(C6916a.get(type));
        }
        return TypeAdapters.f16449f;
    }

    @Override // com.google.gson.InterfaceC6915t
    /* renamed from: a */
    public <T> AbstractC6909s<T> mo20463a(C6784f c6784f, C6916a<T> c6916a) {
        Type type = c6916a.getType();
        if (Map.class.isAssignableFrom(c6916a.getRawType())) {
            Type[] m20706j = C6796b.m20706j(type, C6796b.m20705k(type));
            return new C6803a(c6784f, m20706j[0], m20688b(c6784f, m20706j[0]), m20706j[1], c6784f.m20758n(C6916a.get(m20706j[1])), this.f16377c.m20593a(c6916a));
        }
        return null;
    }
}
