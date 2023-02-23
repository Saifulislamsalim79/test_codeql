package kotlin.p493j0.p494o.p495c.p497p0.p523i.p531w.p532o;

import kotlin.p493j0.p494o.p495c.p497p0.p538l.AbstractC12965b0;
/* compiled from: TransientReceiver.java */
/* renamed from: kotlin.j0.o.c.p0.i.w.o.g */
/* loaded from: classes3.dex */
public class C12800g extends AbstractC12794a {
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C12800g(AbstractC12965b0 abstractC12965b0) {
        this(abstractC12965b0, null);
        if (abstractC12965b0 != null) {
        } else {
            m6750b(0);
            throw null;
        }
    }

    /* renamed from: b */
    private static /* synthetic */ void m6750b(int i) {
        Object[] objArr = new Object[3];
        if (i != 2) {
            objArr[0] = "type";
        } else {
            objArr[0] = "newType";
        }
        objArr[1] = "kotlin/reflect/jvm/internal/impl/resolve/scopes/receivers/TransientReceiver";
        if (i != 2) {
            objArr[2] = "<init>";
        } else {
            objArr[2] = "replaceType";
        }
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
    }

    public String toString() {
        return "{Transient} : " + mo4724c();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    private C12800g(AbstractC12965b0 abstractC12965b0, InterfaceC12797d interfaceC12797d) {
        super(abstractC12965b0, interfaceC12797d);
        if (abstractC12965b0 != null) {
        } else {
            m6750b(1);
            throw null;
        }
    }
}
