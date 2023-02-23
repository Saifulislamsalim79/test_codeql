package com.google.gson.internal.bind;

import com.google.gson.AbstractC6909s;
import com.google.gson.C6784f;
import com.google.gson.InterfaceC6783e;
import com.google.gson.InterfaceC6915t;
import com.google.gson.JsonSyntaxException;
import com.google.gson.internal.C6796b;
import com.google.gson.internal.C6858c;
import com.google.gson.internal.C6886j;
import com.google.gson.internal.Excluder;
import com.google.gson.internal.InterfaceC6884h;
import com.google.gson.internal.p183m.AbstractC6896b;
import com.google.gson.p184v.C6916a;
import com.google.gson.stream.C6911a;
import com.google.gson.stream.C6914c;
import com.google.gson.stream.EnumC6913b;
import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
/* loaded from: classes2.dex */
public final class ReflectiveTypeAdapterFactory implements InterfaceC6915t {

    /* renamed from: c */
    private final C6858c f16386c;

    /* renamed from: d */
    private final InterfaceC6783e f16387d;

    /* renamed from: e */
    private final Excluder f16388e;

    /* renamed from: f */
    private final JsonAdapterAnnotationTypeAdapterFactory f16389f;

    /* renamed from: w */
    private final AbstractC6896b f16390w = AbstractC6896b.m20556a();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.gson.internal.bind.ReflectiveTypeAdapterFactory$a */
    /* loaded from: classes2.dex */
    public class C6806a extends AbstractC6808c {

        /* renamed from: d */
        final /* synthetic */ Field f16391d;

        /* renamed from: e */
        final /* synthetic */ boolean f16392e;

        /* renamed from: f */
        final /* synthetic */ AbstractC6909s f16393f;

        /* renamed from: g */
        final /* synthetic */ C6784f f16394g;

        /* renamed from: h */
        final /* synthetic */ C6916a f16395h;

        /* renamed from: i */
        final /* synthetic */ boolean f16396i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C6806a(ReflectiveTypeAdapterFactory reflectiveTypeAdapterFactory, String str, boolean z, boolean z2, Field field, boolean z3, AbstractC6909s abstractC6909s, C6784f c6784f, C6916a c6916a, boolean z4) {
            super(str, z, z2);
            this.f16391d = field;
            this.f16392e = z3;
            this.f16393f = abstractC6909s;
            this.f16394g = c6784f;
            this.f16395h = c6916a;
            this.f16396i = z4;
        }

        @Override // com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.AbstractC6808c
        /* renamed from: a */
        void mo20679a(C6911a c6911a, Object obj) throws IOException, IllegalAccessException {
            Object mo20528b = this.f16393f.mo20528b(c6911a);
            if (mo20528b == null && this.f16396i) {
                return;
            }
            this.f16391d.set(obj, mo20528b);
        }

        @Override // com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.AbstractC6808c
        /* renamed from: b */
        void mo20678b(C6914c c6914c, Object obj) throws IOException, IllegalAccessException {
            (this.f16392e ? this.f16393f : new C6856c(this.f16394g, this.f16393f, this.f16395h.getType())).mo20527d(c6914c, this.f16391d.get(obj));
        }

        @Override // com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.AbstractC6808c
        /* renamed from: c */
        public boolean mo20677c(Object obj) throws IOException, IllegalAccessException {
            return this.f16400b && this.f16391d.get(obj) != obj;
        }
    }

    /* renamed from: com.google.gson.internal.bind.ReflectiveTypeAdapterFactory$b */
    /* loaded from: classes2.dex */
    public static final class C6807b<T> extends AbstractC6909s<T> {

        /* renamed from: a */
        private final InterfaceC6884h<T> f16397a;

        /* renamed from: b */
        private final Map<String, AbstractC6808c> f16398b;

        C6807b(InterfaceC6884h<T> interfaceC6884h, Map<String, AbstractC6808c> map) {
            this.f16397a = interfaceC6884h;
            this.f16398b = map;
        }

        @Override // com.google.gson.AbstractC6909s
        /* renamed from: b */
        public T mo20528b(C6911a c6911a) throws IOException {
            if (c6911a.mo20525C0() == EnumC6913b.NULL) {
                c6911a.mo20495w0();
                return null;
            }
            T mo20568a = this.f16397a.mo20568a();
            try {
                c6911a.mo20502g();
                while (c6911a.mo20509V()) {
                    AbstractC6808c abstractC6808c = this.f16398b.get(c6911a.mo20497o0());
                    if (abstractC6808c != null && abstractC6808c.f16401c) {
                        abstractC6808c.mo20679a(c6911a, mo20568a);
                    }
                    c6911a.mo20510U0();
                }
                c6911a.mo20514O();
                return mo20568a;
            } catch (IllegalAccessException e) {
                throw new AssertionError(e);
            } catch (IllegalStateException e2) {
                throw new JsonSyntaxException(e2);
            }
        }

        @Override // com.google.gson.AbstractC6909s
        /* renamed from: d */
        public void mo20527d(C6914c c6914c, T t) throws IOException {
            if (t == null) {
                c6914c.mo20474f0();
                return;
            }
            c6914c.mo20487F();
            try {
                for (AbstractC6808c abstractC6808c : this.f16398b.values()) {
                    if (abstractC6808c.mo20677c(t)) {
                        c6914c.mo20477Z(abstractC6808c.f16399a);
                        abstractC6808c.mo20678b(c6914c, t);
                    }
                }
                c6914c.mo20481O();
            } catch (IllegalAccessException e) {
                throw new AssertionError(e);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.gson.internal.bind.ReflectiveTypeAdapterFactory$c */
    /* loaded from: classes2.dex */
    public static abstract class AbstractC6808c {

        /* renamed from: a */
        final String f16399a;

        /* renamed from: b */
        final boolean f16400b;

        /* renamed from: c */
        final boolean f16401c;

        protected AbstractC6808c(String str, boolean z, boolean z2) {
            this.f16399a = str;
            this.f16400b = z;
            this.f16401c = z2;
        }

        /* renamed from: a */
        abstract void mo20679a(C6911a c6911a, Object obj) throws IOException, IllegalAccessException;

        /* renamed from: b */
        abstract void mo20678b(C6914c c6914c, Object obj) throws IOException, IllegalAccessException;

        /* renamed from: c */
        abstract boolean mo20677c(Object obj) throws IOException, IllegalAccessException;
    }

    public ReflectiveTypeAdapterFactory(C6858c c6858c, InterfaceC6783e interfaceC6783e, Excluder excluder, JsonAdapterAnnotationTypeAdapterFactory jsonAdapterAnnotationTypeAdapterFactory) {
        this.f16386c = c6858c;
        this.f16387d = interfaceC6783e;
        this.f16388e = excluder;
        this.f16389f = jsonAdapterAnnotationTypeAdapterFactory;
    }

    /* renamed from: b */
    private AbstractC6808c m20684b(C6784f c6784f, Field field, String str, C6916a<?> c6916a, boolean z, boolean z2) {
        boolean m20564a = C6886j.m20564a(c6916a.getRawType());
        com.google.gson.u.b annotation = field.getAnnotation(com.google.gson.u.b.class);
        AbstractC6909s<?> m20689b = annotation != null ? this.f16389f.m20689b(this.f16386c, c6784f, c6916a, annotation) : null;
        boolean z3 = m20689b != null;
        if (m20689b == null) {
            m20689b = c6784f.m20758n(c6916a);
        }
        return new C6806a(this, str, z, z2, field, z3, m20689b, c6784f, c6916a, m20564a);
    }

    /* renamed from: d */
    static boolean m20682d(Field field, boolean z, Excluder excluder) {
        return (excluder.m20728c(field.getType(), z) || excluder.m20725f(field, z)) ? false : true;
    }

    /* renamed from: e */
    private Map<String, AbstractC6808c> m20681e(C6784f c6784f, C6916a<?> c6916a, Class<?> cls) {
        AbstractC6808c abstractC6808c;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (cls.isInterface()) {
            return linkedHashMap;
        }
        Type type = c6916a.getType();
        C6916a<?> c6916a2 = c6916a;
        Class<?> cls2 = cls;
        while (cls2 != Object.class) {
            Field[] declaredFields = cls2.getDeclaredFields();
            int length = declaredFields.length;
            boolean z = false;
            int i = 0;
            while (i < length) {
                Field field = declaredFields[i];
                boolean m20683c = m20683c(field, true);
                boolean m20683c2 = m20683c(field, z);
                if (m20683c || m20683c2) {
                    this.f16390w.mo20555b(field);
                    Type m20700p = C6796b.m20700p(c6916a2.getType(), cls2, field.getGenericType());
                    List<String> m20680f = m20680f(field);
                    int size = m20680f.size();
                    AbstractC6808c abstractC6808c2 = null;
                    int i2 = 0;
                    while (i2 < size) {
                        String str = m20680f.get(i2);
                        boolean z2 = i2 != 0 ? false : m20683c;
                        int i3 = i2;
                        AbstractC6808c abstractC6808c3 = abstractC6808c2;
                        int i4 = size;
                        List<String> list = m20680f;
                        Field field2 = field;
                        abstractC6808c2 = abstractC6808c3 == null ? (AbstractC6808c) linkedHashMap.put(str, m20684b(c6784f, field, str, C6916a.get(m20700p), z2, m20683c2)) : abstractC6808c3;
                        i2 = i3 + 1;
                        m20683c = z2;
                        m20680f = list;
                        size = i4;
                        field = field2;
                    }
                    if (abstractC6808c2 != null) {
                        throw new IllegalArgumentException(type + " declares multiple JSON fields named " + abstractC6808c.f16399a);
                    }
                }
                i++;
                z = false;
            }
            c6916a2 = C6916a.get(C6796b.m20700p(c6916a2.getType(), cls2, cls2.getGenericSuperclass()));
            cls2 = c6916a2.getRawType();
        }
        return linkedHashMap;
    }

    /* renamed from: f */
    private List<String> m20680f(Field field) {
        com.google.gson.u.c annotation = field.getAnnotation(com.google.gson.u.c.class);
        if (annotation == null) {
            return Collections.singletonList(this.f16387d.mo20774a(field));
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

    @Override // com.google.gson.InterfaceC6915t
    /* renamed from: a */
    public <T> AbstractC6909s<T> mo20463a(C6784f c6784f, C6916a<T> c6916a) {
        Class<? super T> rawType = c6916a.getRawType();
        if (Object.class.isAssignableFrom(rawType)) {
            return new C6807b(this.f16386c.m20593a(c6916a), m20681e(c6784f, c6916a, rawType));
        }
        return null;
    }

    /* renamed from: c */
    public boolean m20683c(Field field, boolean z) {
        return m20682d(field, z, this.f16388e);
    }
}
