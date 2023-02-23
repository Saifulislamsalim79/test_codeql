package com.google.firebase.encoders;

import java.lang.annotation.Annotation;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
/* compiled from: FieldDescriptor.java */
/* renamed from: com.google.firebase.encoders.b */
/* loaded from: classes2.dex */
public final class C5961b {

    /* renamed from: a */
    private final String f14606a;

    /* renamed from: b */
    private final Map<Class<?>, Object> f14607b;

    /* compiled from: FieldDescriptor.java */
    /* renamed from: com.google.firebase.encoders.b$b */
    /* loaded from: classes2.dex */
    public static final class C5963b {

        /* renamed from: a */
        private final String f14608a;

        /* renamed from: b */
        private Map<Class<?>, Object> f14609b = null;

        C5963b(String str) {
            this.f14608a = str;
        }

        /* renamed from: a */
        public C5961b m23167a() {
            Map unmodifiableMap;
            String str = this.f14608a;
            if (this.f14609b == null) {
                unmodifiableMap = Collections.emptyMap();
            } else {
                unmodifiableMap = Collections.unmodifiableMap(new HashMap(this.f14609b));
            }
            return new C5961b(str, unmodifiableMap);
        }

        /* renamed from: b */
        public <T extends Annotation> C5963b m23166b(T t) {
            if (this.f14609b == null) {
                this.f14609b = new HashMap();
            }
            this.f14609b.put(t.annotationType(), t);
            return this;
        }
    }

    /* renamed from: a */
    public static C5963b m23171a(String str) {
        return new C5963b(str);
    }

    /* renamed from: d */
    public static C5961b m23168d(String str) {
        return new C5961b(str, Collections.emptyMap());
    }

    /* renamed from: b */
    public String m23170b() {
        return this.f14606a;
    }

    /* renamed from: c */
    public <T extends Annotation> T m23169c(Class<T> cls) {
        return (T) this.f14607b.get(cls);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C5961b) {
            C5961b c5961b = (C5961b) obj;
            return this.f14606a.equals(c5961b.f14606a) && this.f14607b.equals(c5961b.f14607b);
        }
        return false;
    }

    public int hashCode() {
        return (this.f14606a.hashCode() * 31) + this.f14607b.hashCode();
    }

    public String toString() {
        return "FieldDescriptor{name=" + this.f14606a + ", properties=" + this.f14607b.values() + "}";
    }

    private C5961b(String str, Map<Class<?>, Object> map) {
        this.f14606a = str;
        this.f14607b = map;
    }
}
