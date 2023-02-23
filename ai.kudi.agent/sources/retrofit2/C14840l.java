package retrofit2;

import p565l.AbstractC14135d0;
import p565l.C14131c0;
/* compiled from: Response.java */
/* renamed from: retrofit2.l */
/* loaded from: classes3.dex */
public final class C14840l<T> {

    /* renamed from: a */
    private final C14131c0 f33146a;

    /* renamed from: b */
    private final T f33147b;

    /* renamed from: c */
    private final AbstractC14135d0 f33148c;

    private C14840l(C14131c0 c14131c0, T t, AbstractC14135d0 abstractC14135d0) {
        this.f33146a = c14131c0;
        this.f33147b = t;
        this.f33148c = abstractC14135d0;
    }

    /* renamed from: c */
    public static <T> C14840l<T> m282c(AbstractC14135d0 abstractC14135d0, C14131c0 c14131c0) {
        C14846o.m239b(abstractC14135d0, "body == null");
        C14846o.m239b(c14131c0, "rawResponse == null");
        if (!c14131c0.m2882V()) {
            return new C14840l<>(c14131c0, null, abstractC14135d0);
        }
        throw new IllegalArgumentException("rawResponse should not be successful response");
    }

    /* renamed from: g */
    public static <T> C14840l<T> m278g(T t, C14131c0 c14131c0) {
        C14846o.m239b(c14131c0, "rawResponse == null");
        if (c14131c0.m2882V()) {
            return new C14840l<>(c14131c0, t, null);
        }
        throw new IllegalArgumentException("rawResponse must be successful response");
    }

    /* renamed from: a */
    public T m284a() {
        return this.f33147b;
    }

    /* renamed from: b */
    public int m283b() {
        return this.f33146a.m2887F();
    }

    /* renamed from: d */
    public AbstractC14135d0 m281d() {
        return this.f33148c;
    }

    /* renamed from: e */
    public boolean m280e() {
        return this.f33146a.m2882V();
    }

    /* renamed from: f */
    public String m279f() {
        return this.f33146a.m2881X();
    }

    public String toString() {
        return this.f33146a.toString();
    }
}
