package com.google.firebase.installations.p160p;

import com.google.firebase.installations.p160p.C6441a;
import com.google.firebase.installations.p160p.C6445c;
/* compiled from: PersistedInstallationEntry.java */
/* renamed from: com.google.firebase.installations.p.d */
/* loaded from: classes2.dex */
public abstract class AbstractC6447d {

    /* compiled from: PersistedInstallationEntry.java */
    /* renamed from: com.google.firebase.installations.p.d$a */
    /* loaded from: classes2.dex */
    public static abstract class AbstractC6448a {
        /* renamed from: a */
        public abstract AbstractC6447d mo21994a();

        /* renamed from: b */
        public abstract AbstractC6448a mo21993b(String str);

        /* renamed from: c */
        public abstract AbstractC6448a mo21992c(long j);

        /* renamed from: d */
        public abstract AbstractC6448a mo21991d(String str);

        /* renamed from: e */
        public abstract AbstractC6448a mo21990e(String str);

        /* renamed from: f */
        public abstract AbstractC6448a mo21989f(String str);

        /* renamed from: g */
        public abstract AbstractC6448a mo21988g(C6445c.EnumC6446a enumC6446a);

        /* renamed from: h */
        public abstract AbstractC6448a mo21987h(long j);
    }

    static {
        m22014a().mo21994a();
    }

    /* renamed from: a */
    public static AbstractC6448a m22014a() {
        C6441a.C6443b c6443b = new C6441a.C6443b();
        c6443b.mo21987h(0L);
        c6443b.mo21988g(C6445c.EnumC6446a.ATTEMPT_MIGRATION);
        c6443b.mo21992c(0L);
        return c6443b;
    }

    /* renamed from: b */
    public abstract String mo22013b();

    /* renamed from: c */
    public abstract long mo22012c();

    /* renamed from: d */
    public abstract String mo22011d();

    /* renamed from: e */
    public abstract String mo22010e();

    /* renamed from: f */
    public abstract String mo22009f();

    /* renamed from: g */
    public abstract C6445c.EnumC6446a mo22008g();

    /* renamed from: h */
    public abstract long mo22007h();

    /* renamed from: i */
    public boolean m22006i() {
        return mo22008g() == C6445c.EnumC6446a.REGISTER_ERROR;
    }

    /* renamed from: j */
    public boolean m22005j() {
        return mo22008g() == C6445c.EnumC6446a.NOT_GENERATED || mo22008g() == C6445c.EnumC6446a.ATTEMPT_MIGRATION;
    }

    /* renamed from: k */
    public boolean m22004k() {
        return mo22008g() == C6445c.EnumC6446a.REGISTERED;
    }

    /* renamed from: l */
    public boolean m22003l() {
        return mo22008g() == C6445c.EnumC6446a.UNREGISTERED;
    }

    /* renamed from: m */
    public boolean m22002m() {
        return mo22008g() == C6445c.EnumC6446a.ATTEMPT_MIGRATION;
    }

    /* renamed from: n */
    public abstract AbstractC6448a mo22001n();

    /* renamed from: o */
    public AbstractC6447d m22000o(String str, long j, long j2) {
        AbstractC6448a mo22001n = mo22001n();
        mo22001n.mo21993b(str);
        mo22001n.mo21992c(j);
        mo22001n.mo21987h(j2);
        return mo22001n.mo21994a();
    }

    /* renamed from: p */
    public AbstractC6447d m21999p() {
        AbstractC6448a mo22001n = mo22001n();
        mo22001n.mo21993b(null);
        return mo22001n.mo21994a();
    }

    /* renamed from: q */
    public AbstractC6447d m21998q(String str) {
        AbstractC6448a mo22001n = mo22001n();
        mo22001n.mo21990e(str);
        mo22001n.mo21988g(C6445c.EnumC6446a.REGISTER_ERROR);
        return mo22001n.mo21994a();
    }

    /* renamed from: r */
    public AbstractC6447d m21997r() {
        AbstractC6448a mo22001n = mo22001n();
        mo22001n.mo21988g(C6445c.EnumC6446a.NOT_GENERATED);
        return mo22001n.mo21994a();
    }

    /* renamed from: s */
    public AbstractC6447d m21996s(String str, String str2, long j, String str3, long j2) {
        AbstractC6448a mo22001n = mo22001n();
        mo22001n.mo21991d(str);
        mo22001n.mo21988g(C6445c.EnumC6446a.REGISTERED);
        mo22001n.mo21993b(str3);
        mo22001n.mo21989f(str2);
        mo22001n.mo21992c(j2);
        mo22001n.mo21987h(j);
        return mo22001n.mo21994a();
    }

    /* renamed from: t */
    public AbstractC6447d m21995t(String str) {
        AbstractC6448a mo22001n = mo22001n();
        mo22001n.mo21991d(str);
        mo22001n.mo21988g(C6445c.EnumC6446a.UNREGISTERED);
        return mo22001n.mo21994a();
    }
}
