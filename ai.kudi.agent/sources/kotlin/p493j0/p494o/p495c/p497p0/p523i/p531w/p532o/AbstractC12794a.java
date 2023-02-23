package kotlin.p493j0.p494o.p495c.p497p0.p523i.p531w.p532o;

import kotlin.p493j0.p494o.p495c.p497p0.p538l.AbstractC12965b0;
/* compiled from: AbstractReceiverValue.java */
/* renamed from: kotlin.j0.o.c.p0.i.w.o.a */
/* loaded from: classes3.dex */
public abstract class AbstractC12794a implements InterfaceC12797d {

    /* renamed from: a */
    protected final AbstractC12965b0 f28686a;

    public AbstractC12794a(AbstractC12965b0 abstractC12965b0, InterfaceC12797d interfaceC12797d) {
        if (abstractC12965b0 != null) {
            this.f28686a = abstractC12965b0;
        } else {
            m6755b(0);
            throw null;
        }
    }

    /* renamed from: b */
    private static /* synthetic */ void m6755b(int i) {
        String str = (i == 1 || i == 2) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i == 1 || i == 2) ? 2 : 3];
        if (i == 1 || i == 2) {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/resolve/scopes/receivers/AbstractReceiverValue";
        } else {
            objArr[0] = "receiverType";
        }
        if (i == 1) {
            objArr[1] = "getType";
        } else if (i != 2) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/resolve/scopes/receivers/AbstractReceiverValue";
        } else {
            objArr[1] = "getOriginal";
        }
        if (i != 1 && i != 2) {
            objArr[2] = "<init>";
        }
        String format = String.format(str, objArr);
        if (i != 1 && i != 2) {
            throw new IllegalArgumentException(format);
        }
        throw new IllegalStateException(format);
    }

    @Override // kotlin.p493j0.p494o.p495c.p497p0.p523i.p531w.p532o.InterfaceC12797d
    /* renamed from: c */
    public AbstractC12965b0 mo4724c() {
        AbstractC12965b0 abstractC12965b0 = this.f28686a;
        if (abstractC12965b0 != null) {
            return abstractC12965b0;
        }
        m6755b(1);
        throw null;
    }
}
