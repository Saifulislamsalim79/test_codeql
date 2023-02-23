package p272h.p286c.p287a.p288a.p289i.p296x.p297a;

import com.google.firebase.encoders.i.f;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p272h.p286c.p287a.p288a.p289i.AbstractC8347m;
/* compiled from: ClientMetrics.java */
/* renamed from: h.c.a.a.i.x.a.a */
/* loaded from: classes2.dex */
public final class C8366a {

    /* renamed from: a */
    private final C8377f f20023a;

    /* renamed from: b */
    private final List<C8373d> f20024b;

    /* renamed from: c */
    private final C8368b f20025c;

    /* renamed from: d */
    private final String f20026d;

    /* compiled from: ClientMetrics.java */
    /* renamed from: h.c.a.a.i.x.a.a$a */
    /* loaded from: classes2.dex */
    public static final class C8367a {

        /* renamed from: a */
        private C8377f f20027a = null;

        /* renamed from: b */
        private List<C8373d> f20028b = new ArrayList();

        /* renamed from: c */
        private C8368b f20029c = null;

        /* renamed from: d */
        private String f20030d = "";

        C8367a() {
        }

        /* renamed from: a */
        public C8367a m16201a(C8373d c8373d) {
            this.f20028b.add(c8373d);
            return this;
        }

        /* renamed from: b */
        public C8366a m16200b() {
            return new C8366a(this.f20027a, Collections.unmodifiableList(this.f20028b), this.f20029c, this.f20030d);
        }

        /* renamed from: c */
        public C8367a m16199c(String str) {
            this.f20030d = str;
            return this;
        }

        /* renamed from: d */
        public C8367a m16198d(C8368b c8368b) {
            this.f20029c = c8368b;
            return this;
        }

        /* renamed from: e */
        public C8367a m16197e(C8377f c8377f) {
            this.f20027a = c8377f;
            return this;
        }
    }

    static {
        new C8367a().m16200b();
    }

    C8366a(C8377f c8377f, List<C8373d> list, C8368b c8368b, String str) {
        this.f20023a = c8377f;
        this.f20024b = list;
        this.f20025c = c8368b;
        this.f20026d = str;
    }

    /* renamed from: e */
    public static C8367a m16203e() {
        return new C8367a();
    }

    @f(tag = 4)
    /* renamed from: a */
    public String m16207a() {
        return this.f20026d;
    }

    @f(tag = 3)
    /* renamed from: b */
    public C8368b m16206b() {
        return this.f20025c;
    }

    @f(tag = 2)
    /* renamed from: c */
    public List<C8373d> m16205c() {
        return this.f20024b;
    }

    @f(tag = 1)
    /* renamed from: d */
    public C8377f m16204d() {
        return this.f20023a;
    }

    /* renamed from: f */
    public byte[] m16202f() {
        return AbstractC8347m.m16257a(this);
    }
}
