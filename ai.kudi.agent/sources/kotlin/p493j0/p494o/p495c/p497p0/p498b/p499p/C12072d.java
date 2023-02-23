package kotlin.p493j0.p494o.p495c.p497p0.p498b.p499p;

import java.util.List;
import kotlin.e0.d.l;
import kotlin.p493j0.p494o.p495c.p497p0.p523i.p531w.AbstractC12771e;
import kotlin.p493j0.p494o.p495c.p497p0.p537k.InterfaceC12954n;
import kotlin.p557z.C13724q;
import kotlin.p557z.C13726r;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13554x;
/* compiled from: FunctionClassScope.kt */
/* renamed from: kotlin.j0.o.c.p0.b.p.d */
/* loaded from: classes3.dex */
public final class C12072d extends AbstractC12771e {

    /* compiled from: FunctionClassScope.kt */
    /* renamed from: kotlin.j0.o.c.p0.b.p.d$a */
    /* loaded from: classes3.dex */
    public /* synthetic */ class C12073a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f26919a;

        static {
            int[] iArr = new int[EnumC12069c.values().length];
            iArr[EnumC12069c.Function.ordinal()] = 1;
            iArr[EnumC12069c.SuspendFunction.ordinal()] = 2;
            f26919a = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C12072d(InterfaceC12954n interfaceC12954n, C12066b c12066b) {
        super(interfaceC12954n, c12066b);
        l.f(interfaceC12954n, "storageManager");
        l.f(c12066b, "containingClass");
    }

    @Override // kotlin.p493j0.p494o.p495c.p497p0.p523i.p531w.AbstractC12771e
    /* renamed from: i */
    protected List<InterfaceC13554x> mo6784i() {
        List<InterfaceC13554x> m3901b;
        List<InterfaceC13554x> m3901b2;
        List<InterfaceC13554x> m3891e;
        int i = C12073a.f26919a[((C12066b) m6781l()).m9805f1().ordinal()];
        if (i == 1) {
            m3901b = C13724q.m3901b(C12074e.f26920V.m9787a((C12066b) m6781l(), false));
            return m3901b;
        } else if (i != 2) {
            m3891e = C13726r.m3891e();
            return m3891e;
        } else {
            m3901b2 = C13724q.m3901b(C12074e.f26920V.m9787a((C12066b) m6781l(), true));
            return m3901b2;
        }
    }
}
