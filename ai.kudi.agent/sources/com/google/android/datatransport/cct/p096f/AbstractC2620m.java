package com.google.android.datatransport.cct.p096f;

import com.google.android.datatransport.cct.p096f.C2607g;
import java.util.List;
/* compiled from: LogRequest.java */
/* renamed from: com.google.android.datatransport.cct.f.m */
/* loaded from: classes2.dex */
public abstract class AbstractC2620m {

    /* compiled from: LogRequest.java */
    /* renamed from: com.google.android.datatransport.cct.f.m$a */
    /* loaded from: classes2.dex */
    public static abstract class AbstractC2621a {
        /* renamed from: a */
        public abstract AbstractC2620m mo32499a();

        /* renamed from: b */
        public abstract AbstractC2621a mo32498b(AbstractC2615k abstractC2615k);

        /* renamed from: c */
        public abstract AbstractC2621a mo32497c(List<AbstractC2618l> list);

        /* renamed from: d */
        abstract AbstractC2621a mo32496d(Integer num);

        /* renamed from: e */
        abstract AbstractC2621a mo32495e(String str);

        /* renamed from: f */
        public abstract AbstractC2621a mo32494f(EnumC2627p enumC2627p);

        /* renamed from: g */
        public abstract AbstractC2621a mo32493g(long j);

        /* renamed from: h */
        public abstract AbstractC2621a mo32492h(long j);

        /* renamed from: i */
        public AbstractC2621a m32491i(int i) {
            mo32496d(Integer.valueOf(i));
            return this;
        }

        /* renamed from: j */
        public AbstractC2621a m32490j(String str) {
            mo32495e(str);
            return this;
        }
    }

    /* renamed from: a */
    public static AbstractC2621a m32507a() {
        return new C2607g.C2609b();
    }

    /* renamed from: b */
    public abstract AbstractC2615k mo32506b();

    /* renamed from: c */
    public abstract List<AbstractC2618l> mo32505c();

    /* renamed from: d */
    public abstract Integer mo32504d();

    /* renamed from: e */
    public abstract String mo32503e();

    /* renamed from: f */
    public abstract EnumC2627p mo32502f();

    /* renamed from: g */
    public abstract long mo32501g();

    /* renamed from: h */
    public abstract long mo32500h();
}
