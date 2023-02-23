package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import android.app.job.JobInfo;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.C2662q;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import p272h.p286c.p287a.p288a.EnumC8238d;
import p272h.p286c.p287a.p288a.p289i.p292b0.InterfaceC8318a;
/* compiled from: SchedulerConfig.java */
/* renamed from: com.google.android.datatransport.runtime.scheduling.jobscheduling.s */
/* loaded from: classes2.dex */
public abstract class AbstractC2666s {

    /* compiled from: SchedulerConfig.java */
    /* renamed from: com.google.android.datatransport.runtime.scheduling.jobscheduling.s$a */
    /* loaded from: classes2.dex */
    public static class C2667a {

        /* renamed from: a */
        private InterfaceC8318a f7466a;

        /* renamed from: b */
        private Map<EnumC8238d, AbstractC2668b> f7467b = new HashMap();

        /* renamed from: a */
        public C2667a m32430a(EnumC8238d enumC8238d, AbstractC2668b abstractC2668b) {
            this.f7467b.put(enumC8238d, abstractC2668b);
            return this;
        }

        /* renamed from: b */
        public AbstractC2666s m32429b() {
            if (this.f7466a != null) {
                if (this.f7467b.keySet().size() >= EnumC8238d.values().length) {
                    Map<EnumC8238d, AbstractC2668b> map = this.f7467b;
                    this.f7467b = new HashMap();
                    return AbstractC2666s.m32437d(this.f7466a, map);
                }
                throw new IllegalStateException("Not all priorities have been configured");
            }
            throw new NullPointerException("missing required property: clock");
        }

        /* renamed from: c */
        public C2667a m32428c(InterfaceC8318a interfaceC8318a) {
            this.f7466a = interfaceC8318a;
            return this;
        }
    }

    /* compiled from: SchedulerConfig.java */
    /* renamed from: com.google.android.datatransport.runtime.scheduling.jobscheduling.s$b */
    /* loaded from: classes2.dex */
    public static abstract class AbstractC2668b {

        /* compiled from: SchedulerConfig.java */
        /* renamed from: com.google.android.datatransport.runtime.scheduling.jobscheduling.s$b$a */
        /* loaded from: classes2.dex */
        public static abstract class AbstractC2669a {
            /* renamed from: a */
            public abstract AbstractC2668b mo32423a();

            /* renamed from: b */
            public abstract AbstractC2669a mo32422b(long j);

            /* renamed from: c */
            public abstract AbstractC2669a mo32421c(Set<EnumC2670c> set);

            /* renamed from: d */
            public abstract AbstractC2669a mo32420d(long j);
        }

        /* renamed from: a */
        public static AbstractC2669a m32427a() {
            C2662q.C2664b c2664b = new C2662q.C2664b();
            c2664b.mo32421c(Collections.emptySet());
            return c2664b;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: b */
        public abstract long mo32426b();

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: c */
        public abstract Set<EnumC2670c> mo32425c();

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: d */
        public abstract long mo32424d();
    }

    /* compiled from: SchedulerConfig.java */
    /* renamed from: com.google.android.datatransport.runtime.scheduling.jobscheduling.s$c */
    /* loaded from: classes2.dex */
    public enum EnumC2670c {
        NETWORK_UNMETERED,
        DEVICE_IDLE,
        DEVICE_CHARGING
    }

    /* renamed from: a */
    private long m32440a(int i, long j) {
        int i2 = i - 1;
        double max = Math.max(1.0d, Math.log(10000.0d) / Math.log((j > 1 ? j : 2L) * i2));
        double pow = Math.pow(3.0d, i2);
        double d = j;
        Double.isNaN(d);
        return (long) (pow * d * max);
    }

    /* renamed from: b */
    public static C2667a m32439b() {
        return new C2667a();
    }

    /* renamed from: d */
    static AbstractC2666s m32437d(InterfaceC8318a interfaceC8318a, Map<EnumC8238d, AbstractC2668b> map) {
        return new C2661p(interfaceC8318a, map);
    }

    /* renamed from: f */
    public static AbstractC2666s m32435f(InterfaceC8318a interfaceC8318a) {
        C2667a m32439b = m32439b();
        EnumC8238d enumC8238d = EnumC8238d.DEFAULT;
        AbstractC2668b.AbstractC2669a m32427a = AbstractC2668b.m32427a();
        m32427a.mo32422b(30000L);
        m32427a.mo32420d(86400000L);
        m32439b.m32430a(enumC8238d, m32427a.mo32423a());
        EnumC8238d enumC8238d2 = EnumC8238d.HIGHEST;
        AbstractC2668b.AbstractC2669a m32427a2 = AbstractC2668b.m32427a();
        m32427a2.mo32422b(1000L);
        m32427a2.mo32420d(86400000L);
        m32439b.m32430a(enumC8238d2, m32427a2.mo32423a());
        EnumC8238d enumC8238d3 = EnumC8238d.VERY_LOW;
        AbstractC2668b.AbstractC2669a m32427a3 = AbstractC2668b.m32427a();
        m32427a3.mo32422b(86400000L);
        m32427a3.mo32420d(86400000L);
        m32427a3.mo32421c(m32432i(EnumC2670c.NETWORK_UNMETERED, EnumC2670c.DEVICE_IDLE));
        m32439b.m32430a(enumC8238d3, m32427a3.mo32423a());
        m32439b.m32428c(interfaceC8318a);
        return m32439b.m32429b();
    }

    /* renamed from: i */
    private static <T> Set<T> m32432i(T... tArr) {
        return Collections.unmodifiableSet(new HashSet(Arrays.asList(tArr)));
    }

    /* renamed from: j */
    private void m32431j(JobInfo.Builder builder, Set<EnumC2670c> set) {
        if (set.contains(EnumC2670c.NETWORK_UNMETERED)) {
            builder.setRequiredNetworkType(2);
        } else {
            builder.setRequiredNetworkType(1);
        }
        if (set.contains(EnumC2670c.DEVICE_CHARGING)) {
            builder.setRequiresCharging(true);
        }
        if (set.contains(EnumC2670c.DEVICE_IDLE)) {
            builder.setRequiresDeviceIdle(true);
        }
    }

    /* renamed from: c */
    public JobInfo.Builder m32438c(JobInfo.Builder builder, EnumC8238d enumC8238d, long j, int i) {
        builder.setMinimumLatency(m32434g(enumC8238d, j, i));
        m32431j(builder, mo32433h().get(enumC8238d).mo32425c());
        return builder;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public abstract InterfaceC8318a mo32436e();

    /* renamed from: g */
    public long m32434g(EnumC8238d enumC8238d, long j, int i) {
        long mo16295a = j - mo32436e().mo16295a();
        AbstractC2668b abstractC2668b = mo32433h().get(enumC8238d);
        return Math.min(Math.max(m32440a(i, abstractC2668b.mo32426b()), mo16295a), abstractC2668b.mo32424d());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h */
    public abstract Map<EnumC8238d, AbstractC2668b> mo32433h();
}
