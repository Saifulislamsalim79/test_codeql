package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.view.View;
import com.google.android.gms.common.api.C2730a;
import com.google.android.gms.common.api.Scope;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import p201g.p218e.C7523b;
import p272h.p286c.p287a.p300b.p320f.C9206a;
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* renamed from: com.google.android.gms.common.internal.e */
/* loaded from: classes2.dex */
public final class C2867e {

    /* renamed from: a */
    private final Account f7969a;

    /* renamed from: b */
    private final Set<Scope> f7970b;

    /* renamed from: c */
    private final Set<Scope> f7971c;

    /* renamed from: d */
    private final Map<C2730a<?>, C2872f0> f7972d;

    /* renamed from: e */
    private final String f7973e;

    /* renamed from: f */
    private final String f7974f;

    /* renamed from: g */
    private final C9206a f7975g;

    /* renamed from: h */
    private Integer f7976h;

    /* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
    /* renamed from: com.google.android.gms.common.internal.e$a */
    /* loaded from: classes2.dex */
    public static final class C2868a {

        /* renamed from: a */
        private Account f7977a;

        /* renamed from: b */
        private C7523b<Scope> f7978b;

        /* renamed from: c */
        private String f7979c;

        /* renamed from: d */
        private String f7980d;

        /* renamed from: e */
        private C9206a f7981e = C9206a.f21593B;

        /* renamed from: a */
        public C2867e m31754a() {
            return new C2867e(this.f7977a, this.f7978b, null, 0, null, this.f7979c, this.f7980d, this.f7981e, false);
        }

        /* renamed from: b */
        public C2868a m31753b(String str) {
            this.f7979c = str;
            return this;
        }

        /* renamed from: c */
        public final C2868a m31752c(Collection<Scope> collection) {
            if (this.f7978b == null) {
                this.f7978b = new C7523b<>();
            }
            this.f7978b.addAll(collection);
            return this;
        }

        /* renamed from: d */
        public final C2868a m31751d(Account account) {
            this.f7977a = account;
            return this;
        }

        /* renamed from: e */
        public final C2868a m31750e(String str) {
            this.f7980d = str;
            return this;
        }
    }

    public C2867e(Account account, Set<Scope> set, Map<C2730a<?>, C2872f0> map, int i, View view, String str, String str2, C9206a c9206a, boolean z) {
        this.f7969a = account;
        this.f7970b = set == null ? Collections.emptySet() : Collections.unmodifiableSet(set);
        this.f7972d = map == null ? Collections.emptyMap() : map;
        this.f7973e = str;
        this.f7974f = str2;
        this.f7975g = c9206a == null ? C9206a.f21593B : c9206a;
        HashSet hashSet = new HashSet(this.f7970b);
        for (C2872f0 c2872f0 : this.f7972d.values()) {
            hashSet.addAll(c2872f0.f7988a);
        }
        this.f7971c = Collections.unmodifiableSet(hashSet);
    }

    /* renamed from: a */
    public Account m31763a() {
        return this.f7969a;
    }

    /* renamed from: b */
    public Account m31762b() {
        Account account = this.f7969a;
        return account != null ? account : new Account("<<default account>>", "com.google");
    }

    /* renamed from: c */
    public Set<Scope> m31761c() {
        return this.f7971c;
    }

    /* renamed from: d */
    public String m31760d() {
        return this.f7973e;
    }

    /* renamed from: e */
    public Set<Scope> m31759e() {
        return this.f7970b;
    }

    /* renamed from: f */
    public final C9206a m31758f() {
        return this.f7975g;
    }

    /* renamed from: g */
    public final Integer m31757g() {
        return this.f7976h;
    }

    /* renamed from: h */
    public final String m31756h() {
        return this.f7974f;
    }

    /* renamed from: i */
    public final void m31755i(Integer num) {
        this.f7976h = num;
    }
}
