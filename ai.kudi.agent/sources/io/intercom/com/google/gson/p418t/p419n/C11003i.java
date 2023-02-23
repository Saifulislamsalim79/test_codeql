package io.intercom.com.google.gson.p418t.p419n;

import io.intercom.com.google.gson.AbstractC10936q;
import io.intercom.com.google.gson.C10916e;
import io.intercom.com.google.gson.InterfaceC10915d;
import io.intercom.com.google.gson.InterfaceC10938r;
import io.intercom.com.google.gson.JsonSyntaxException;
import io.intercom.com.google.gson.p418t.C10944b;
import io.intercom.com.google.gson.p418t.C10948c;
import io.intercom.com.google.gson.p418t.C10963d;
import io.intercom.com.google.gson.p418t.C10978k;
import io.intercom.com.google.gson.p418t.InterfaceC10976i;
import io.intercom.com.google.gson.p418t.p421o.AbstractC11056b;
import io.intercom.com.google.gson.p422u.C11058a;
import io.intercom.com.google.gson.s.b;
import io.intercom.com.google.gson.s.c;
import io.intercom.com.google.gson.stream.C10939a;
import io.intercom.com.google.gson.stream.C10942c;
import io.intercom.com.google.gson.stream.EnumC10941b;
import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
/* compiled from: ReflectiveTypeAdapterFactory.java */
/* renamed from: io.intercom.com.google.gson.t.n.i */
/* loaded from: classes3.dex */
public final class C11003i implements InterfaceC10938r {

    /* renamed from: c */
    private final C10948c f25031c;

    /* renamed from: d */
    private final InterfaceC10915d f25032d;

    /* renamed from: e */
    private final C10963d f25033e;

    /* renamed from: f */
    private final C10993d f25034f;

    /* renamed from: w */
    private final AbstractC11056b f25035w = AbstractC11056b.m11666a();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ReflectiveTypeAdapterFactory.java */
    /* renamed from: io.intercom.com.google.gson.t.n.i$a */
    /* loaded from: classes3.dex */
    public class C11004a extends AbstractC11006c {

        /* renamed from: d */
        final /* synthetic */ Field f25036d;

        /* renamed from: e */
        final /* synthetic */ boolean f25037e;

        /* renamed from: f */
        final /* synthetic */ AbstractC10936q f25038f;

        /* renamed from: g */
        final /* synthetic */ C10916e f25039g;

        /* renamed from: h */
        final /* synthetic */ C11058a f25040h;

        /* renamed from: i */
        final /* synthetic */ boolean f25041i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C11004a(C11003i c11003i, String str, boolean z, boolean z2, Field field, boolean z3, AbstractC10936q abstractC10936q, C10916e c10916e, C11058a c11058a, boolean z4) {
            super(str, z, z2);
            this.f25036d = field;
            this.f25037e = z3;
            this.f25038f = abstractC10936q;
            this.f25039g = c10916e;
            this.f25040h = c11058a;
            this.f25041i = z4;
        }

        @Override // io.intercom.com.google.gson.p418t.p419n.C11003i.AbstractC11006c
        /* renamed from: a */
        void mo11746a(C10939a c10939a, Object obj) throws IOException, IllegalAccessException {
            Object mo11675b = this.f25038f.mo11675b(c10939a);
            if (mo11675b == null && this.f25041i) {
                return;
            }
            this.f25036d.set(obj, mo11675b);
        }

        @Override // io.intercom.com.google.gson.p418t.p419n.C11003i.AbstractC11006c
        /* renamed from: b */
        void mo11745b(C10942c c10942c, Object obj) throws IOException, IllegalAccessException {
            (this.f25037e ? this.f25038f : new C11014m(this.f25039g, this.f25038f, this.f25040h.m11657e())).mo11674d(c10942c, this.f25036d.get(obj));
        }

        @Override // io.intercom.com.google.gson.p418t.p419n.C11003i.AbstractC11006c
        /* renamed from: c */
        public boolean mo11744c(Object obj) throws IOException, IllegalAccessException {
            return this.f25045b && this.f25036d.get(obj) != obj;
        }
    }

    /* compiled from: ReflectiveTypeAdapterFactory.java */
    /* renamed from: io.intercom.com.google.gson.t.n.i$b */
    /* loaded from: classes3.dex */
    public static final class C11005b<T> extends AbstractC10936q<T> {

        /* renamed from: a */
        private final InterfaceC10976i<T> f25042a;

        /* renamed from: b */
        private final Map<String, AbstractC11006c> f25043b;

        C11005b(InterfaceC10976i<T> interfaceC10976i, Map<String, AbstractC11006c> map) {
            this.f25042a = interfaceC10976i;
            this.f25043b = map;
        }

        @Override // io.intercom.com.google.gson.AbstractC10936q
        /* renamed from: b */
        public T mo11675b(C10939a c10939a) throws IOException {
            if (c10939a.mo11789C0() == EnumC10941b.NULL) {
                c10939a.mo11771w0();
                return null;
            }
            T mo11808a = this.f25042a.mo11808a();
            try {
                c10939a.mo11776g();
                while (c10939a.mo11785V()) {
                    AbstractC11006c abstractC11006c = this.f25043b.get(c10939a.mo11772o0());
                    if (abstractC11006c != null && abstractC11006c.f25046c) {
                        abstractC11006c.mo11746a(c10939a, mo11808a);
                    }
                    c10939a.mo11786U0();
                }
                c10939a.mo11787O();
                return mo11808a;
            } catch (IllegalAccessException e) {
                throw new AssertionError(e);
            } catch (IllegalStateException e2) {
                throw new JsonSyntaxException(e2);
            }
        }

        @Override // io.intercom.com.google.gson.AbstractC10936q
        /* renamed from: d */
        public void mo11674d(C10942c c10942c, T t) throws IOException {
            if (t == null) {
                c10942c.mo11757f0();
                return;
            }
            c10942c.mo11766F();
            try {
                for (AbstractC11006c abstractC11006c : this.f25043b.values()) {
                    if (abstractC11006c.mo11744c(t)) {
                        c10942c.mo11758Z(abstractC11006c.f25044a);
                        abstractC11006c.mo11745b(c10942c, t);
                    }
                }
                c10942c.mo11760O();
            } catch (IllegalAccessException e) {
                throw new AssertionError(e);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ReflectiveTypeAdapterFactory.java */
    /* renamed from: io.intercom.com.google.gson.t.n.i$c */
    /* loaded from: classes3.dex */
    public static abstract class AbstractC11006c {

        /* renamed from: a */
        final String f25044a;

        /* renamed from: b */
        final boolean f25045b;

        /* renamed from: c */
        final boolean f25046c;

        protected AbstractC11006c(String str, boolean z, boolean z2) {
            this.f25044a = str;
            this.f25045b = z;
            this.f25046c = z2;
        }

        /* renamed from: a */
        abstract void mo11746a(C10939a c10939a, Object obj) throws IOException, IllegalAccessException;

        /* renamed from: b */
        abstract void mo11745b(C10942c c10942c, Object obj) throws IOException, IllegalAccessException;

        /* renamed from: c */
        abstract boolean mo11744c(Object obj) throws IOException, IllegalAccessException;
    }

    public C11003i(C10948c c10948c, InterfaceC10915d interfaceC10915d, C10963d c10963d, C10993d c10993d) {
        this.f25031c = c10948c;
        this.f25032d = interfaceC10915d;
        this.f25033e = c10963d;
        this.f25034f = c10993d;
    }

    /* renamed from: b */
    private AbstractC11006c m11751b(C10916e c10916e, Field field, String str, C11058a<?> c11058a, boolean z, boolean z2) {
        boolean m11803b = C10978k.m11803b(c11058a.m11659c());
        b annotation = field.getAnnotation(b.class);
        AbstractC10936q<?> m11790b = annotation != null ? this.f25034f.m11790b(this.f25031c, c10916e, c11058a, annotation) : null;
        boolean z3 = m11790b != null;
        if (m11790b == null) {
            m11790b = c10916e.m11959l(c11058a);
        }
        return new C11004a(this, str, z, z2, field, z3, m11790b, c10916e, c11058a, m11803b);
    }

    /* renamed from: d */
    static boolean m11749d(Field field, boolean z, C10963d c10963d) {
        return (c10963d.m11841c(field.getType(), z) || c10963d.m11838f(field, z)) ? false : true;
    }

    /* renamed from: e */
    private Map<String, AbstractC11006c> m11748e(C10916e c10916e, C11058a<?> c11058a, Class<?> cls) {
        AbstractC11006c abstractC11006c;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (cls.isInterface()) {
            return linkedHashMap;
        }
        Type m11657e = c11058a.m11657e();
        C11058a<?> c11058a2 = c11058a;
        Class<?> cls2 = cls;
        while (cls2 != Object.class) {
            Field[] declaredFields = cls2.getDeclaredFields();
            int length = declaredFields.length;
            boolean z = false;
            int i = 0;
            while (i < length) {
                Field field = declaredFields[i];
                boolean m11750c = m11750c(field, true);
                boolean m11750c2 = m11750c(field, z);
                if (m11750c || m11750c2) {
                    this.f25035w.mo11665b(field);
                    Type m11852p = C10944b.m11852p(c11058a2.m11657e(), cls2, field.getGenericType());
                    List<String> m11747f = m11747f(field);
                    int size = m11747f.size();
                    AbstractC11006c abstractC11006c2 = null;
                    int i2 = 0;
                    while (i2 < size) {
                        String str = m11747f.get(i2);
                        boolean z2 = i2 != 0 ? false : m11750c;
                        int i3 = i2;
                        AbstractC11006c abstractC11006c3 = abstractC11006c2;
                        int i4 = size;
                        List<String> list = m11747f;
                        Field field2 = field;
                        abstractC11006c2 = abstractC11006c3 == null ? (AbstractC11006c) linkedHashMap.put(str, m11751b(c10916e, field, str, C11058a.m11660b(m11852p), z2, m11750c2)) : abstractC11006c3;
                        i2 = i3 + 1;
                        m11750c = z2;
                        m11747f = list;
                        size = i4;
                        field = field2;
                    }
                    if (abstractC11006c2 != null) {
                        throw new IllegalArgumentException(m11657e + " declares multiple JSON fields named " + abstractC11006c.f25044a);
                    }
                }
                i++;
                z = false;
            }
            c11058a2 = C11058a.m11660b(C10944b.m11852p(c11058a2.m11657e(), cls2, cls2.getGenericSuperclass()));
            cls2 = c11058a2.m11659c();
        }
        return linkedHashMap;
    }

    /* renamed from: f */
    private List<String> m11747f(Field field) {
        c annotation = field.getAnnotation(c.class);
        if (annotation == null) {
            return Collections.singletonList(this.f25032d.mo11971a(field));
        }
        String value = annotation.value();
        String[] alternate = annotation.alternate();
        if (alternate.length == 0) {
            return Collections.singletonList(value);
        }
        ArrayList arrayList = new ArrayList(alternate.length + 1);
        arrayList.add(value);
        for (String str : alternate) {
            arrayList.add(str);
        }
        return arrayList;
    }

    @Override // io.intercom.com.google.gson.InterfaceC10938r
    /* renamed from: a */
    public <T> AbstractC10936q<T> mo11671a(C10916e c10916e, C11058a<T> c11058a) {
        Class<? super T> m11659c = c11058a.m11659c();
        if (Object.class.isAssignableFrom(m11659c)) {
            return new C11005b(this.f25031c.m11846a(c11058a), m11748e(c10916e, c11058a, m11659c));
        }
        return null;
    }

    /* renamed from: c */
    public boolean m11750c(Field field, boolean z) {
        return m11749d(field, z, this.f25033e);
    }
}
