package io.grpc;

import com.google.common.base.C5051n;
import java.util.concurrent.atomic.AtomicLong;
/* compiled from: InternalLogId.java */
/* renamed from: io.grpc.h0 */
/* loaded from: classes2.dex */
public final class C9526h0 {

    /* renamed from: d */
    private static final AtomicLong f22279d = new AtomicLong();

    /* renamed from: a */
    private final String f22280a;

    /* renamed from: b */
    private final String f22281b;

    /* renamed from: c */
    private final long f22282c;

    C9526h0(String str, String str2, long j) {
        C5051n.m25779o(str, "typeName");
        C5051n.m25789e(!str.isEmpty(), "empty type");
        this.f22280a = str;
        this.f22281b = str2;
        this.f22282c = j;
    }

    /* renamed from: a */
    public static C9526h0 m14527a(Class<?> cls, String str) {
        return m14526b(m14525c(cls), str);
    }

    /* renamed from: b */
    public static C9526h0 m14526b(String str, String str2) {
        return new C9526h0(str, str2, m14523e());
    }

    /* renamed from: c */
    private static String m14525c(Class<?> cls) {
        C5051n.m25779o(cls, "type");
        String simpleName = cls.getSimpleName();
        return !simpleName.isEmpty() ? simpleName : cls.getName().substring(cls.getPackage().getName().length() + 1);
    }

    /* renamed from: e */
    static long m14523e() {
        return f22279d.incrementAndGet();
    }

    /* renamed from: d */
    public long m14524d() {
        return this.f22282c;
    }

    /* renamed from: f */
    public String m14522f() {
        return this.f22280a + "<" + this.f22282c + ">";
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(m14522f());
        if (this.f22281b != null) {
            sb.append(": (");
            sb.append(this.f22281b);
            sb.append(')');
        }
        return sb.toString();
    }
}
