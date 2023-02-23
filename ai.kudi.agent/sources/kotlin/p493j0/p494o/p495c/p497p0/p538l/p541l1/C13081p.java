package kotlin.p493j0.p494o.p495c.p497p0.p538l.p541l1;

import kotlin.NoWhenBranchMatchedException;
import kotlin.e0.d.l;
import kotlin.p493j0.p494o.p495c.p497p0.p538l.EnumC13008h1;
/* compiled from: TypeSystemContext.kt */
/* renamed from: kotlin.j0.o.c.p0.l.l1.p */
/* loaded from: classes3.dex */
public final class C13081p {

    /* compiled from: TypeSystemContext.kt */
    /* renamed from: kotlin.j0.o.c.p0.l.l1.p$a */
    /* loaded from: classes3.dex */
    public /* synthetic */ class C13082a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f29157a;

        static {
            int[] iArr = new int[EnumC13008h1.values().length];
            iArr[EnumC13008h1.INVARIANT.ordinal()] = 1;
            iArr[EnumC13008h1.IN_VARIANCE.ordinal()] = 2;
            iArr[EnumC13008h1.OUT_VARIANCE.ordinal()] = 3;
            f29157a = iArr;
        }
    }

    /* renamed from: a */
    public static final EnumC13087t m5925a(EnumC13008h1 enumC13008h1) {
        l.f(enumC13008h1, "<this>");
        int i = C13082a.f29157a[enumC13008h1.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    return EnumC13087t.OUT;
                }
                throw new NoWhenBranchMatchedException();
            }
            return EnumC13087t.IN;
        }
        return EnumC13087t.INV;
    }
}
