package kotlin.p493j0.p494o.p495c.p497p0.p520f;

import ai.kudi.agent.wallettopup.data.BanksWithMethods;
import kotlin.e0.d.g;
import kotlin.e0.d.l;
import kotlin.p549l0.C13276s;
/* compiled from: CallableId.kt */
/* renamed from: kotlin.j0.o.c.p0.f.a */
/* loaded from: classes3.dex */
public final class C12607a {
    @Deprecated

    /* renamed from: e */
    private static final C12614f f28365e;

    /* renamed from: a */
    private final C12609c f28366a;

    /* renamed from: b */
    private final C12609c f28367b;

    /* renamed from: c */
    private final C12614f f28368c;

    /* renamed from: d */
    private final C12609c f28369d;

    static {
        C12614f m7346n = C12614f.m7346n("<local>");
        l.e(m7346n, "special(\"<local>\")");
        f28365e = m7346n;
        l.e(C12609c.m7373k(m7346n), "topLevel(LOCAL_NAME)");
    }

    public C12607a(C12609c c12609c, C12609c c12609c2, C12614f c12614f, C12609c c12609c3) {
        l.f(c12609c, BanksWithMethods.PACKAGE_NAME);
        l.f(c12614f, "callableName");
        this.f28366a = c12609c;
        this.f28367b = c12609c2;
        this.f28368c = c12614f;
        this.f28369d = c12609c3;
    }

    /* renamed from: a */
    public final C12614f m7399a() {
        return this.f28368c;
    }

    /* renamed from: b */
    public final C12609c m7398b() {
        return this.f28367b;
    }

    /* renamed from: c */
    public final C12609c m7397c() {
        return this.f28366a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C12607a) {
            C12607a c12607a = (C12607a) obj;
            return l.b(this.f28366a, c12607a.f28366a) && l.b(this.f28367b, c12607a.f28367b) && l.b(this.f28368c, c12607a.f28368c) && l.b(this.f28369d, c12607a.f28369d);
        }
        return false;
    }

    public int hashCode() {
        int hashCode = this.f28366a.hashCode() * 31;
        C12609c c12609c = this.f28367b;
        int hashCode2 = (((hashCode + (c12609c == null ? 0 : c12609c.hashCode())) * 31) + this.f28368c.hashCode()) * 31;
        C12609c c12609c2 = this.f28369d;
        return hashCode2 + (c12609c2 != null ? c12609c2.hashCode() : 0);
    }

    public String toString() {
        String m5435z;
        StringBuilder sb = new StringBuilder();
        String m7382b = m7397c().m7382b();
        l.e(m7382b, "packageName.asString()");
        m5435z = C13276s.m5435z(m7382b, '.', '/', false, 4, null);
        sb.append(m5435z);
        sb.append("/");
        if (m7398b() != null) {
            sb.append(m7398b());
            sb.append(".");
        }
        sb.append(m7399a());
        String sb2 = sb.toString();
        l.e(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }

    public /* synthetic */ C12607a(C12609c c12609c, C12609c c12609c2, C12614f c12614f, C12609c c12609c3, int i, g gVar) {
        this(c12609c, c12609c2, c12614f, (i & 8) != 0 ? null : c12609c3);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C12607a(C12609c c12609c, C12614f c12614f) {
        this(c12609c, null, c12614f, null, 8, null);
        l.f(c12609c, BanksWithMethods.PACKAGE_NAME);
        l.f(c12614f, "callableName");
    }
}
