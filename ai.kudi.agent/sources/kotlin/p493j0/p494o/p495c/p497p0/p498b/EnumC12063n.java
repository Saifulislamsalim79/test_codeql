package kotlin.p493j0.p494o.p495c.p497p0.p498b;

import kotlin.e0.d.l;
import kotlin.p493j0.p494o.p495c.p497p0.p520f.C12608b;
import kotlin.p493j0.p494o.p495c.p497p0.p520f.C12614f;
/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum f uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:444)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByField(EnumVisitor.java:368)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByWrappedInsn(EnumVisitor.java:333)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:318)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:258)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInvoke(EnumVisitor.java:289)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* compiled from: UnsignedType.kt */
/* renamed from: kotlin.j0.o.c.p0.b.n */
/* loaded from: classes3.dex */
public final class EnumC12063n {

    /* renamed from: f */
    public static final EnumC12063n f26883f;

    /* renamed from: w */
    public static final EnumC12063n f26884w;

    /* renamed from: x */
    public static final EnumC12063n f26885x;

    /* renamed from: y */
    public static final EnumC12063n f26886y;

    /* renamed from: z */
    private static final /* synthetic */ EnumC12063n[] f26887z;

    /* renamed from: c */
    private final C12608b f26888c;

    /* renamed from: d */
    private final C12614f f26889d;

    /* renamed from: e */
    private final C12608b f26890e;

    static {
        C12608b m7392e = C12608b.m7392e("kotlin/UByte");
        l.e(m7392e, "fromString(\"kotlin/UByte\")");
        f26883f = new EnumC12063n("UBYTE", 0, m7392e);
        C12608b m7392e2 = C12608b.m7392e("kotlin/UShort");
        l.e(m7392e2, "fromString(\"kotlin/UShort\")");
        f26884w = new EnumC12063n("USHORT", 1, m7392e2);
        C12608b m7392e3 = C12608b.m7392e("kotlin/UInt");
        l.e(m7392e3, "fromString(\"kotlin/UInt\")");
        f26885x = new EnumC12063n("UINT", 2, m7392e3);
        C12608b m7392e4 = C12608b.m7392e("kotlin/ULong");
        l.e(m7392e4, "fromString(\"kotlin/ULong\")");
        f26886y = new EnumC12063n("ULONG", 3, m7392e4);
        f26887z = m9823a();
    }

    private EnumC12063n(String str, int i, C12608b c12608b) {
        this.f26888c = c12608b;
        C12614f m7387j = c12608b.m7387j();
        l.e(m7387j, "classId.shortClassName");
        this.f26889d = m7387j;
        this.f26890e = new C12608b(this.f26888c.m7389h(), C12614f.m7349i(l.m(this.f26889d.m7353b(), "Array")));
    }

    /* renamed from: a */
    private static final /* synthetic */ EnumC12063n[] m9823a() {
        return new EnumC12063n[]{f26883f, f26884w, f26885x, f26886y};
    }

    public static EnumC12063n valueOf(String str) {
        return (EnumC12063n) Enum.valueOf(EnumC12063n.class, str);
    }

    public static EnumC12063n[] values() {
        return (EnumC12063n[]) f26887z.clone();
    }

    /* renamed from: b */
    public final C12608b m9822b() {
        return this.f26890e;
    }

    /* renamed from: e */
    public final C12608b m9821e() {
        return this.f26888c;
    }

    /* renamed from: g */
    public final C12614f m9820g() {
        return this.f26889d;
    }
}
