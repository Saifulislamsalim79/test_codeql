package kotlin.p493j0.p494o.p495c.p497p0.p498b;

import kotlin.e0.d.l;
import kotlin.p493j0.p494o.p495c.p497p0.p520f.C12608b;
import kotlin.p493j0.p494o.p495c.p497p0.p520f.C12614f;
/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum e uses external variables
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
/* renamed from: kotlin.j0.o.c.p0.b.m */
/* loaded from: classes3.dex */
public final class EnumC12062m {

    /* renamed from: e */
    public static final EnumC12062m f26876e;

    /* renamed from: f */
    public static final EnumC12062m f26877f;

    /* renamed from: w */
    public static final EnumC12062m f26878w;

    /* renamed from: x */
    public static final EnumC12062m f26879x;

    /* renamed from: y */
    private static final /* synthetic */ EnumC12062m[] f26880y;

    /* renamed from: c */
    private final C12608b f26881c;

    /* renamed from: d */
    private final C12614f f26882d;

    static {
        C12608b m7392e = C12608b.m7392e("kotlin/UByteArray");
        l.e(m7392e, "fromString(\"kotlin/UByteArray\")");
        f26876e = new EnumC12062m("UBYTEARRAY", 0, m7392e);
        C12608b m7392e2 = C12608b.m7392e("kotlin/UShortArray");
        l.e(m7392e2, "fromString(\"kotlin/UShortArray\")");
        f26877f = new EnumC12062m("USHORTARRAY", 1, m7392e2);
        C12608b m7392e3 = C12608b.m7392e("kotlin/UIntArray");
        l.e(m7392e3, "fromString(\"kotlin/UIntArray\")");
        f26878w = new EnumC12062m("UINTARRAY", 2, m7392e3);
        C12608b m7392e4 = C12608b.m7392e("kotlin/ULongArray");
        l.e(m7392e4, "fromString(\"kotlin/ULongArray\")");
        f26879x = new EnumC12062m("ULONGARRAY", 3, m7392e4);
        f26880y = m9825a();
    }

    private EnumC12062m(String str, int i, C12608b c12608b) {
        this.f26881c = c12608b;
        C12614f m7387j = c12608b.m7387j();
        l.e(m7387j, "classId.shortClassName");
        this.f26882d = m7387j;
    }

    /* renamed from: a */
    private static final /* synthetic */ EnumC12062m[] m9825a() {
        return new EnumC12062m[]{f26876e, f26877f, f26878w, f26879x};
    }

    public static EnumC12062m valueOf(String str) {
        return (EnumC12062m) Enum.valueOf(EnumC12062m.class, str);
    }

    public static EnumC12062m[] values() {
        return (EnumC12062m[]) f26880y.clone();
    }

    /* renamed from: b */
    public final C12614f m9824b() {
        return this.f26882d;
    }
}
