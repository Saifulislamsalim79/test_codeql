package com.google.common.collect;

import com.google.common.base.AbstractC5035e;
import com.google.common.base.C5027b;
import com.google.common.base.C5042j;
import com.google.common.base.C5051n;
import com.google.common.collect.ConcurrentMapC5084o;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
/* compiled from: MapMaker.java */
/* renamed from: com.google.common.collect.n */
/* loaded from: classes2.dex */
public final class C5083n {

    /* renamed from: a */
    boolean f12729a;

    /* renamed from: b */
    int f12730b = -1;

    /* renamed from: c */
    int f12731c = -1;

    /* renamed from: d */
    ConcurrentMapC5084o.EnumC5100n f12732d;

    /* renamed from: e */
    ConcurrentMapC5084o.EnumC5100n f12733e;

    /* renamed from: f */
    AbstractC5035e<Object> f12734f;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public int m25700a() {
        int i = this.f12731c;
        if (i == -1) {
            return 4;
        }
        return i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public int m25699b() {
        int i = this.f12730b;
        if (i == -1) {
            return 16;
        }
        return i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public AbstractC5035e<Object> m25698c() {
        return (AbstractC5035e) C5042j.m25814a(this.f12734f, m25697d().mo25638b());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public ConcurrentMapC5084o.EnumC5100n m25697d() {
        return (ConcurrentMapC5084o.EnumC5100n) C5042j.m25814a(this.f12732d, ConcurrentMapC5084o.EnumC5100n.f12771c);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public ConcurrentMapC5084o.EnumC5100n m25696e() {
        return (ConcurrentMapC5084o.EnumC5100n) C5042j.m25814a(this.f12733e, ConcurrentMapC5084o.EnumC5100n.f12771c);
    }

    /* renamed from: f */
    public <K, V> ConcurrentMap<K, V> m25695f() {
        if (!this.f12729a) {
            return new ConcurrentHashMap(m25699b(), 0.75f, m25700a());
        }
        return ConcurrentMapC5084o.m25691b(this);
    }

    /* renamed from: g */
    C5083n m25694g(ConcurrentMapC5084o.EnumC5100n enumC5100n) {
        C5051n.m25771w(this.f12732d == null, "Key strength was already set to %s", this.f12732d);
        C5051n.m25780n(enumC5100n);
        this.f12732d = enumC5100n;
        if (enumC5100n != ConcurrentMapC5084o.EnumC5100n.f12771c) {
            this.f12729a = true;
        }
        return this;
    }

    /* renamed from: h */
    public C5083n m25693h() {
        m25694g(ConcurrentMapC5084o.EnumC5100n.f12772d);
        return this;
    }

    public String toString() {
        C5042j.C5044b m25812c = C5042j.m25812c(this);
        int i = this.f12730b;
        if (i != -1) {
            m25812c.m25810b("initialCapacity", i);
        }
        int i2 = this.f12731c;
        if (i2 != -1) {
            m25812c.m25810b("concurrencyLevel", i2);
        }
        ConcurrentMapC5084o.EnumC5100n enumC5100n = this.f12732d;
        if (enumC5100n != null) {
            m25812c.m25808d("keyStrength", C5027b.m25835c(enumC5100n.toString()));
        }
        ConcurrentMapC5084o.EnumC5100n enumC5100n2 = this.f12733e;
        if (enumC5100n2 != null) {
            m25812c.m25808d("valueStrength", C5027b.m25835c(enumC5100n2.toString()));
        }
        if (this.f12734f != null) {
            m25812c.m25803i("keyEquivalence");
        }
        return m25812c.toString();
    }
}
