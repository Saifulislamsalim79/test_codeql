package io.grpc;

import com.google.common.base.C5051n;
/* compiled from: ConnectivityStateInfo.java */
/* renamed from: io.grpc.r */
/* loaded from: classes2.dex */
public final class C10041r {

    /* renamed from: a */
    private final EnumC10039q f23774a;

    /* renamed from: b */
    private final C9497c1 f23775b;

    private C10041r(EnumC10039q enumC10039q, C9497c1 c9497c1) {
        C5051n.m25779o(enumC10039q, "state is null");
        this.f23774a = enumC10039q;
        C5051n.m25779o(c9497c1, "status is null");
        this.f23775b = c9497c1;
    }

    /* renamed from: a */
    public static C10041r m13244a(EnumC10039q enumC10039q) {
        C5051n.m25789e(enumC10039q != EnumC10039q.TRANSIENT_FAILURE, "state is TRANSIENT_ERROR. Use forError() instead");
        return new C10041r(enumC10039q, C9497c1.f22187f);
    }

    /* renamed from: b */
    public static C10041r m13243b(C9497c1 c9497c1) {
        C5051n.m25789e(!c9497c1.m14580p(), "The error status must not be OK");
        return new C10041r(EnumC10039q.TRANSIENT_FAILURE, c9497c1);
    }

    /* renamed from: c */
    public EnumC10039q m13242c() {
        return this.f23774a;
    }

    /* renamed from: d */
    public C9497c1 m13241d() {
        return this.f23775b;
    }

    public boolean equals(Object obj) {
        if (obj instanceof C10041r) {
            C10041r c10041r = (C10041r) obj;
            return this.f23774a.equals(c10041r.f23774a) && this.f23775b.equals(c10041r.f23775b);
        }
        return false;
    }

    public int hashCode() {
        return this.f23774a.hashCode() ^ this.f23775b.hashCode();
    }

    public String toString() {
        if (this.f23775b.m14580p()) {
            return this.f23774a.toString();
        }
        return this.f23774a + "(" + this.f23775b + ")";
    }
}
