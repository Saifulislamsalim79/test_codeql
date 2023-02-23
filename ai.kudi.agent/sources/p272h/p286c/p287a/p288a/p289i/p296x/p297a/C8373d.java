package p272h.p286c.p287a.p288a.p289i.p296x.p297a;

import com.google.firebase.encoders.i.f;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/* compiled from: LogSourceMetrics.java */
/* renamed from: h.c.a.a.i.x.a.d */
/* loaded from: classes2.dex */
public final class C8373d {

    /* renamed from: a */
    private final String f20046a;

    /* renamed from: b */
    private final List<C8370c> f20047b;

    /* compiled from: LogSourceMetrics.java */
    /* renamed from: h.c.a.a.i.x.a.d$a */
    /* loaded from: classes2.dex */
    public static final class C8374a {

        /* renamed from: a */
        private String f20048a = "";

        /* renamed from: b */
        private List<C8370c> f20049b = new ArrayList();

        C8374a() {
        }

        /* renamed from: a */
        public C8373d m16182a() {
            return new C8373d(this.f20048a, Collections.unmodifiableList(this.f20049b));
        }

        /* renamed from: b */
        public C8374a m16181b(List<C8370c> list) {
            this.f20049b = list;
            return this;
        }

        /* renamed from: c */
        public C8374a m16180c(String str) {
            this.f20048a = str;
            return this;
        }
    }

    static {
        new C8374a().m16182a();
    }

    C8373d(String str, List<C8370c> list) {
        this.f20046a = str;
        this.f20047b = list;
    }

    /* renamed from: c */
    public static C8374a m16183c() {
        return new C8374a();
    }

    @f(tag = 2)
    /* renamed from: a */
    public List<C8370c> m16185a() {
        return this.f20047b;
    }

    @f(tag = 1)
    /* renamed from: b */
    public String m16184b() {
        return this.f20046a;
    }
}
