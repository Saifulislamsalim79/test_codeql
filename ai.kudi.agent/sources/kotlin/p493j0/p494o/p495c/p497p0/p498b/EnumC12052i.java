package kotlin.p493j0.p494o.p495c.p497p0.p498b;

import java.util.Set;
import kotlin.C13218k;
import kotlin.EnumC13285m;
import kotlin.InterfaceC11824h;
import kotlin.e0.d.l;
import kotlin.p483e0.p484c.InterfaceC11756a;
import kotlin.p483e0.p485d.AbstractC11802m;
import kotlin.p493j0.p494o.p495c.p497p0.p520f.C12609c;
import kotlin.p493j0.p494o.p495c.p497p0.p520f.C12614f;
import kotlin.p557z.C13741y0;
/* compiled from: PrimitiveType.kt */
/* renamed from: kotlin.j0.o.c.p0.b.i */
/* loaded from: classes3.dex */
public enum EnumC12052i {
    BOOLEAN("Boolean"),
    CHAR("Char"),
    BYTE("Byte"),
    SHORT("Short"),
    INT("Int"),
    FLOAT("Float"),
    LONG("Long"),
    DOUBLE("Double");
    

    /* renamed from: w */
    public static final Set<EnumC12052i> f26781w;

    /* renamed from: c */
    private final C12614f f26785c;

    /* renamed from: d */
    private final C12614f f26786d;

    /* renamed from: e */
    private final InterfaceC11824h f26787e;

    /* renamed from: f */
    private final InterfaceC11824h f26788f;

    /* compiled from: PrimitiveType.kt */
    /* renamed from: kotlin.j0.o.c.p0.b.i$a */
    /* loaded from: classes3.dex */
    static final class C12053a extends AbstractC11802m implements InterfaceC11756a<C12609c> {
        C12053a() {
            super(0);
        }

        @Override // kotlin.p483e0.p484c.InterfaceC11756a
        /* renamed from: a */
        public final C12609c invoke() {
            C12609c m7381c = C12059k.f26808k.m7381c(EnumC12052i.this.m9850e());
            l.e(m7381c, "BUILT_INS_PACKAGE_FQ_NAME.child(arrayTypeName)");
            return m7381c;
        }
    }

    /* compiled from: PrimitiveType.kt */
    /* renamed from: kotlin.j0.o.c.p0.b.i$b */
    /* loaded from: classes3.dex */
    static final class C12054b extends AbstractC11802m implements InterfaceC11756a<C12609c> {
        C12054b() {
            super(0);
        }

        @Override // kotlin.p483e0.p484c.InterfaceC11756a
        /* renamed from: a */
        public final C12609c invoke() {
            C12609c m7381c = C12059k.f26808k.m7381c(EnumC12052i.this.m9848h());
            l.e(m7381c, "BUILT_INS_PACKAGE_FQ_NAME.child(this.typeName)");
            return m7381c;
        }
    }

    static {
        Set<EnumC12052i> m3827f;
        m3827f = C13741y0.m3827f(CHAR, BYTE, SHORT, INT, FLOAT, LONG, DOUBLE);
        f26781w = m3827f;
    }

    EnumC12052i(String str) {
        InterfaceC11824h m5626a;
        InterfaceC11824h m5626a2;
        C12614f m7349i = C12614f.m7349i(str);
        l.e(m7349i, "identifier(typeName)");
        this.f26785c = m7349i;
        C12614f m7349i2 = C12614f.m7349i(l.m(str, "Array"));
        l.e(m7349i2, "identifier(\"${typeName}Array\")");
        this.f26786d = m7349i2;
        m5626a = C13218k.m5626a(EnumC13285m.PUBLICATION, new C12054b());
        this.f26787e = m5626a;
        m5626a2 = C13218k.m5626a(EnumC13285m.PUBLICATION, new C12053a());
        this.f26788f = m5626a2;
    }

    /* renamed from: b */
    public final C12609c m9851b() {
        return (C12609c) this.f26788f.getValue();
    }

    /* renamed from: e */
    public final C12614f m9850e() {
        return this.f26786d;
    }

    /* renamed from: g */
    public final C12609c m9849g() {
        return (C12609c) this.f26787e.getValue();
    }

    /* renamed from: h */
    public final C12614f m9848h() {
        return this.f26785c;
    }
}
