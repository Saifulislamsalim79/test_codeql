package com.google.android.gms.measurement.internal;
/* compiled from: com.google.android.gms:play-services-measurement-impl@@20.0.0 */
/* renamed from: com.google.android.gms.measurement.internal.q */
/* loaded from: classes2.dex */
final class C4332q {

    /* renamed from: a */
    final String f10598a;

    /* renamed from: b */
    final String f10599b;

    /* renamed from: c */
    final long f10600c;

    /* renamed from: d */
    final long f10601d;

    /* renamed from: e */
    final long f10602e;

    /* renamed from: f */
    final long f10603f;

    /* renamed from: g */
    final long f10604g;

    /* renamed from: h */
    final Long f10605h;

    /* renamed from: i */
    final Long f10606i;

    /* renamed from: j */
    final Long f10607j;

    /* renamed from: k */
    final Boolean f10608k;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C4332q(String str, String str2, long j, long j2, long j3, long j4, long j5, Long l, Long l2, Long l3, Boolean bool) {
        com.google.android.gms.common.internal.s.f(str);
        com.google.android.gms.common.internal.s.f(str2);
        com.google.android.gms.common.internal.s.a(j >= 0);
        com.google.android.gms.common.internal.s.a(j2 >= 0);
        com.google.android.gms.common.internal.s.a(j3 >= 0);
        com.google.android.gms.common.internal.s.a(j5 >= 0);
        this.f10598a = str;
        this.f10599b = str2;
        this.f10600c = j;
        this.f10601d = j2;
        this.f10602e = j3;
        this.f10603f = j4;
        this.f10604g = j5;
        this.f10605h = l;
        this.f10606i = l2;
        this.f10607j = l3;
        this.f10608k = bool;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final C4332q m27993a(Long l, Long l2, Boolean bool) {
        return new C4332q(this.f10598a, this.f10599b, this.f10600c, this.f10601d, this.f10602e, this.f10603f, this.f10604g, this.f10605h, l, l2, (bool == null || bool.booleanValue()) ? bool : null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public final C4332q m27992b(long j, long j2) {
        return new C4332q(this.f10598a, this.f10599b, this.f10600c, this.f10601d, this.f10602e, this.f10603f, j, Long.valueOf(j2), this.f10606i, this.f10607j, this.f10608k);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public final C4332q m27991c(long j) {
        return new C4332q(this.f10598a, this.f10599b, this.f10600c, this.f10601d, this.f10602e, j, this.f10604g, this.f10605h, this.f10606i, this.f10607j, this.f10608k);
    }
}
