package kotlin.p493j0.p494o.p495c.p497p0.p533j.p534b;

import kotlin.NoWhenBranchMatchedException;
import kotlin.e0.d.l;
import kotlin.p493j0.p494o.p495c.p497p0.p515e.C12509c;
import kotlin.p493j0.p494o.p495c.p497p0.p515e.C12555q;
import kotlin.p493j0.p494o.p495c.p497p0.p515e.C12565s;
import kotlin.p493j0.p494o.p495c.p497p0.p515e.EnumC12535k;
import kotlin.p493j0.p494o.p495c.p497p0.p515e.EnumC12583x;
import kotlin.p493j0.p494o.p495c.p497p0.p538l.EnumC13008h1;
import kotlin.reflect.jvm.internal.impl.descriptors.EnumC13319f;
import kotlin.reflect.jvm.internal.impl.descriptors.EnumC13560z;
/* compiled from: ProtoEnumFlags.kt */
/* renamed from: kotlin.j0.o.c.p0.j.b.y */
/* loaded from: classes3.dex */
public final class C12919y {

    /* renamed from: a */
    public static final C12919y f28972a = new C12919y();

    /* compiled from: ProtoEnumFlags.kt */
    /* renamed from: kotlin.j0.o.c.p0.j.b.y$a */
    /* loaded from: classes3.dex */
    public /* synthetic */ class C12920a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f28973a;

        /* renamed from: b */
        public static final /* synthetic */ int[] f28974b;

        /* renamed from: c */
        public static final /* synthetic */ int[] f28975c;

        /* renamed from: d */
        public static final /* synthetic */ int[] f28976d;

        static {
            int[] iArr = new int[EnumC12535k.values().length];
            iArr[EnumC12535k.FINAL.ordinal()] = 1;
            iArr[EnumC12535k.OPEN.ordinal()] = 2;
            iArr[EnumC12535k.ABSTRACT.ordinal()] = 3;
            iArr[EnumC12535k.SEALED.ordinal()] = 4;
            f28973a = iArr;
            int[] iArr2 = new int[EnumC13560z.values().length];
            iArr2[EnumC13560z.FINAL.ordinal()] = 1;
            iArr2[EnumC13560z.OPEN.ordinal()] = 2;
            iArr2[EnumC13560z.ABSTRACT.ordinal()] = 3;
            iArr2[EnumC13560z.SEALED.ordinal()] = 4;
            int[] iArr3 = new int[EnumC12583x.values().length];
            iArr3[EnumC12583x.INTERNAL.ordinal()] = 1;
            iArr3[EnumC12583x.PRIVATE.ordinal()] = 2;
            iArr3[EnumC12583x.PRIVATE_TO_THIS.ordinal()] = 3;
            iArr3[EnumC12583x.PROTECTED.ordinal()] = 4;
            iArr3[EnumC12583x.PUBLIC.ordinal()] = 5;
            iArr3[EnumC12583x.LOCAL.ordinal()] = 6;
            int[] iArr4 = new int[C12509c.EnumC12512c.values().length];
            iArr4[C12509c.EnumC12512c.CLASS.ordinal()] = 1;
            iArr4[C12509c.EnumC12512c.INTERFACE.ordinal()] = 2;
            iArr4[C12509c.EnumC12512c.ENUM_CLASS.ordinal()] = 3;
            iArr4[C12509c.EnumC12512c.ENUM_ENTRY.ordinal()] = 4;
            iArr4[C12509c.EnumC12512c.ANNOTATION_CLASS.ordinal()] = 5;
            iArr4[C12509c.EnumC12512c.OBJECT.ordinal()] = 6;
            iArr4[C12509c.EnumC12512c.COMPANION_OBJECT.ordinal()] = 7;
            f28974b = iArr4;
            int[] iArr5 = new int[EnumC13319f.values().length];
            iArr5[EnumC13319f.CLASS.ordinal()] = 1;
            iArr5[EnumC13319f.INTERFACE.ordinal()] = 2;
            iArr5[EnumC13319f.ENUM_CLASS.ordinal()] = 3;
            iArr5[EnumC13319f.ENUM_ENTRY.ordinal()] = 4;
            iArr5[EnumC13319f.ANNOTATION_CLASS.ordinal()] = 5;
            iArr5[EnumC13319f.OBJECT.ordinal()] = 6;
            int[] iArr6 = new int[C12565s.EnumC12568c.values().length];
            iArr6[C12565s.EnumC12568c.IN.ordinal()] = 1;
            iArr6[C12565s.EnumC12568c.OUT.ordinal()] = 2;
            iArr6[C12565s.EnumC12568c.INV.ordinal()] = 3;
            f28975c = iArr6;
            int[] iArr7 = new int[C12555q.C12557b.EnumC12560c.values().length];
            iArr7[C12555q.C12557b.EnumC12560c.IN.ordinal()] = 1;
            iArr7[C12555q.C12557b.EnumC12560c.OUT.ordinal()] = 2;
            iArr7[C12555q.C12557b.EnumC12560c.INV.ordinal()] = 3;
            iArr7[C12555q.C12557b.EnumC12560c.STAR.ordinal()] = 4;
            f28976d = iArr7;
            int[] iArr8 = new int[EnumC13008h1.values().length];
            iArr8[EnumC13008h1.IN_VARIANCE.ordinal()] = 1;
            iArr8[EnumC13008h1.OUT_VARIANCE.ordinal()] = 2;
            iArr8[EnumC13008h1.INVARIANT.ordinal()] = 3;
        }
    }

    private C12919y() {
    }

    /* renamed from: a */
    public final EnumC13319f m6418a(C12509c.EnumC12512c enumC12512c) {
        switch (enumC12512c == null ? -1 : C12920a.f28974b[enumC12512c.ordinal()]) {
            case 1:
                return EnumC13319f.CLASS;
            case 2:
                return EnumC13319f.INTERFACE;
            case 3:
                return EnumC13319f.ENUM_CLASS;
            case 4:
                return EnumC13319f.ENUM_ENTRY;
            case 5:
                return EnumC13319f.ANNOTATION_CLASS;
            case 6:
            case 7:
                return EnumC13319f.OBJECT;
            default:
                return EnumC13319f.CLASS;
        }
    }

    /* renamed from: b */
    public final EnumC13560z m6417b(EnumC12535k enumC12535k) {
        int i = enumC12535k == null ? -1 : C12920a.f28973a[enumC12535k.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        return EnumC13560z.FINAL;
                    }
                    return EnumC13560z.SEALED;
                }
                return EnumC13560z.ABSTRACT;
            }
            return EnumC13560z.OPEN;
        }
        return EnumC13560z.FINAL;
    }

    /* renamed from: c */
    public final EnumC13008h1 m6416c(C12555q.C12557b.EnumC12560c enumC12560c) {
        l.f(enumC12560c, "projection");
        int i = C12920a.f28976d[enumC12560c.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        throw new NoWhenBranchMatchedException();
                    }
                    throw new IllegalArgumentException(l.m("Only IN, OUT and INV are supported. Actual argument: ", enumC12560c));
                }
                return EnumC13008h1.INVARIANT;
            }
            return EnumC13008h1.OUT_VARIANCE;
        }
        return EnumC13008h1.IN_VARIANCE;
    }

    /* renamed from: d */
    public final EnumC13008h1 m6415d(C12565s.EnumC12568c enumC12568c) {
        l.f(enumC12568c, "variance");
        int i = C12920a.f28975c[enumC12568c.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    return EnumC13008h1.INVARIANT;
                }
                throw new NoWhenBranchMatchedException();
            }
            return EnumC13008h1.OUT_VARIANCE;
        }
        return EnumC13008h1.IN_VARIANCE;
    }
}
