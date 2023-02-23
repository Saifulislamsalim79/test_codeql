package kotlin.p493j0.p494o.p495c.p497p0.p533j.p534b;

import kotlin.e0.d.l;
import kotlin.p493j0.p494o.p495c.p497p0.p515e.EnumC12534j;
import kotlin.p493j0.p494o.p495c.p497p0.p515e.EnumC12583x;
import kotlin.reflect.jvm.internal.impl.descriptors.AbstractC13544u;
import kotlin.reflect.jvm.internal.impl.descriptors.C13530t;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13300b;
/* compiled from: ProtoEnumFlagsUtils.kt */
/* renamed from: kotlin.j0.o.c.p0.j.b.z */
/* loaded from: classes3.dex */
public final class C12921z {

    /* compiled from: ProtoEnumFlagsUtils.kt */
    /* renamed from: kotlin.j0.o.c.p0.j.b.z$a */
    /* loaded from: classes3.dex */
    public /* synthetic */ class C12922a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f28977a;

        /* renamed from: b */
        public static final /* synthetic */ int[] f28978b;

        static {
            int[] iArr = new int[EnumC12534j.values().length];
            iArr[EnumC12534j.DECLARATION.ordinal()] = 1;
            iArr[EnumC12534j.FAKE_OVERRIDE.ordinal()] = 2;
            iArr[EnumC12534j.DELEGATION.ordinal()] = 3;
            iArr[EnumC12534j.SYNTHESIZED.ordinal()] = 4;
            f28977a = iArr;
            int[] iArr2 = new int[InterfaceC13300b.EnumC13301a.values().length];
            iArr2[InterfaceC13300b.EnumC13301a.DECLARATION.ordinal()] = 1;
            iArr2[InterfaceC13300b.EnumC13301a.FAKE_OVERRIDE.ordinal()] = 2;
            iArr2[InterfaceC13300b.EnumC13301a.DELEGATION.ordinal()] = 3;
            iArr2[InterfaceC13300b.EnumC13301a.SYNTHESIZED.ordinal()] = 4;
            int[] iArr3 = new int[EnumC12583x.values().length];
            iArr3[EnumC12583x.INTERNAL.ordinal()] = 1;
            iArr3[EnumC12583x.PRIVATE.ordinal()] = 2;
            iArr3[EnumC12583x.PRIVATE_TO_THIS.ordinal()] = 3;
            iArr3[EnumC12583x.PROTECTED.ordinal()] = 4;
            iArr3[EnumC12583x.PUBLIC.ordinal()] = 5;
            iArr3[EnumC12583x.LOCAL.ordinal()] = 6;
            f28978b = iArr3;
        }
    }

    /* renamed from: a */
    public static final AbstractC13544u m6414a(C12919y c12919y, EnumC12583x enumC12583x) {
        l.f(c12919y, "<this>");
        switch (enumC12583x == null ? -1 : C12922a.f28978b[enumC12583x.ordinal()]) {
            case 1:
                AbstractC13544u abstractC13544u = C13530t.f29891d;
                l.e(abstractC13544u, "INTERNAL");
                return abstractC13544u;
            case 2:
                AbstractC13544u abstractC13544u2 = C13530t.f29888a;
                l.e(abstractC13544u2, "PRIVATE");
                return abstractC13544u2;
            case 3:
                AbstractC13544u abstractC13544u3 = C13530t.f29889b;
                l.e(abstractC13544u3, "PRIVATE_TO_THIS");
                return abstractC13544u3;
            case 4:
                AbstractC13544u abstractC13544u4 = C13530t.f29890c;
                l.e(abstractC13544u4, "PROTECTED");
                return abstractC13544u4;
            case 5:
                AbstractC13544u abstractC13544u5 = C13530t.f29892e;
                l.e(abstractC13544u5, "PUBLIC");
                return abstractC13544u5;
            case 6:
                AbstractC13544u abstractC13544u6 = C13530t.f29893f;
                l.e(abstractC13544u6, "LOCAL");
                return abstractC13544u6;
            default:
                AbstractC13544u abstractC13544u7 = C13530t.f29888a;
                l.e(abstractC13544u7, "PRIVATE");
                return abstractC13544u7;
        }
    }

    /* renamed from: b */
    public static final InterfaceC13300b.EnumC13301a m6413b(C12919y c12919y, EnumC12534j enumC12534j) {
        l.f(c12919y, "<this>");
        int i = enumC12534j == null ? -1 : C12922a.f28977a[enumC12534j.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        return InterfaceC13300b.EnumC13301a.DECLARATION;
                    }
                    return InterfaceC13300b.EnumC13301a.SYNTHESIZED;
                }
                return InterfaceC13300b.EnumC13301a.DELEGATION;
            }
            return InterfaceC13300b.EnumC13301a.FAKE_OVERRIDE;
        }
        return InterfaceC13300b.EnumC13301a.DECLARATION;
    }
}
