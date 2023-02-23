package com.google.common.base;

import java.io.Serializable;
/* compiled from: Equivalence.java */
/* renamed from: com.google.common.base.e */
/* loaded from: classes2.dex */
public abstract class AbstractC5035e<T> {

    /* compiled from: Equivalence.java */
    /* renamed from: com.google.common.base.e$a */
    /* loaded from: classes2.dex */
    static final class C5036a extends AbstractC5035e<Object> implements Serializable {

        /* renamed from: c */
        static final C5036a f12687c = new C5036a();

        C5036a() {
        }

        @Override // com.google.common.base.AbstractC5035e
        /* renamed from: a */
        protected boolean mo25824a(Object obj, Object obj2) {
            return obj.equals(obj2);
        }

        @Override // com.google.common.base.AbstractC5035e
        /* renamed from: b */
        protected int mo25823b(Object obj) {
            return obj.hashCode();
        }
    }

    /* compiled from: Equivalence.java */
    /* renamed from: com.google.common.base.e$b */
    /* loaded from: classes2.dex */
    static final class C5037b extends AbstractC5035e<Object> implements Serializable {

        /* renamed from: c */
        static final C5037b f12688c = new C5037b();

        C5037b() {
        }

        @Override // com.google.common.base.AbstractC5035e
        /* renamed from: a */
        protected boolean mo25824a(Object obj, Object obj2) {
            return false;
        }

        @Override // com.google.common.base.AbstractC5035e
        /* renamed from: b */
        protected int mo25823b(Object obj) {
            return System.identityHashCode(obj);
        }
    }

    protected AbstractC5035e() {
    }

    /* renamed from: c */
    public static AbstractC5035e<Object> m25828c() {
        return C5036a.f12687c;
    }

    /* renamed from: f */
    public static AbstractC5035e<Object> m25825f() {
        return C5037b.f12688c;
    }

    /* renamed from: a */
    protected abstract boolean mo25824a(T t, T t2);

    /* renamed from: b */
    protected abstract int mo25823b(T t);

    /* renamed from: d */
    public final boolean m25827d(T t, T t2) {
        if (t == t2) {
            return true;
        }
        if (t == null || t2 == null) {
            return false;
        }
        return mo25824a(t, t2);
    }

    /* renamed from: e */
    public final int m25826e(T t) {
        if (t == null) {
            return 0;
        }
        return mo25823b(t);
    }
}
