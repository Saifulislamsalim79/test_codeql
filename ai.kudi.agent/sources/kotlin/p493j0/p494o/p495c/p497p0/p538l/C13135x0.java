package kotlin.p493j0.p494o.p495c.p497p0.p538l;

import kotlin.p493j0.p494o.p495c.p497p0.p538l.p539j1.AbstractC13026h;
/* compiled from: TypeProjectionImpl.java */
/* renamed from: kotlin.j0.o.c.p0.l.x0 */
/* loaded from: classes3.dex */
public class C13135x0 extends AbstractC13133w0 {

    /* renamed from: a */
    private final EnumC13008h1 f29218a;

    /* renamed from: b */
    private final AbstractC12965b0 f29219b;

    public C13135x0(EnumC13008h1 enumC13008h1, AbstractC12965b0 abstractC12965b0) {
        if (enumC13008h1 == null) {
            m5756e(0);
            throw null;
        } else if (abstractC12965b0 != null) {
            this.f29218a = enumC13008h1;
            this.f29219b = abstractC12965b0;
        } else {
            m5756e(1);
            throw null;
        }
    }

    /* renamed from: e */
    private static /* synthetic */ void m5756e(int i) {
        String str = (i == 4 || i == 5) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i == 4 || i == 5) ? 2 : 3];
        switch (i) {
            case 1:
            case 2:
            case 3:
                objArr[0] = "type";
                break;
            case 4:
            case 5:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/types/TypeProjectionImpl";
                break;
            case 6:
                objArr[0] = "kotlinTypeRefiner";
                break;
            default:
                objArr[0] = "projection";
                break;
        }
        if (i == 4) {
            objArr[1] = "getProjectionKind";
        } else if (i != 5) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/types/TypeProjectionImpl";
        } else {
            objArr[1] = "getType";
        }
        if (i == 3) {
            objArr[2] = "replaceType";
        } else if (i != 4 && i != 5) {
            if (i != 6) {
                objArr[2] = "<init>";
            } else {
                objArr[2] = "refine";
            }
        }
        String format = String.format(str, objArr);
        if (i != 4 && i != 5) {
            throw new IllegalArgumentException(format);
        }
        throw new IllegalStateException(format);
    }

    @Override // kotlin.p493j0.p494o.p495c.p497p0.p538l.InterfaceC13131v0
    /* renamed from: a */
    public EnumC13008h1 mo5760a() {
        EnumC13008h1 enumC13008h1 = this.f29218a;
        if (enumC13008h1 != null) {
            return enumC13008h1;
        }
        m5756e(4);
        throw null;
    }

    @Override // kotlin.p493j0.p494o.p495c.p497p0.p538l.InterfaceC13131v0
    /* renamed from: b */
    public InterfaceC13131v0 mo5759b(AbstractC13026h abstractC13026h) {
        if (abstractC13026h != null) {
            EnumC13008h1 enumC13008h1 = this.f29218a;
            AbstractC12965b0 abstractC12965b0 = this.f29219b;
            abstractC13026h.mo6099g(abstractC12965b0);
            return new C13135x0(enumC13008h1, abstractC12965b0);
        }
        m5756e(6);
        throw null;
    }

    @Override // kotlin.p493j0.p494o.p495c.p497p0.p538l.InterfaceC13131v0
    /* renamed from: c */
    public AbstractC12965b0 mo5758c() {
        AbstractC12965b0 abstractC12965b0 = this.f29219b;
        if (abstractC12965b0 != null) {
            return abstractC12965b0;
        }
        m5756e(5);
        throw null;
    }

    @Override // kotlin.p493j0.p494o.p495c.p497p0.p538l.InterfaceC13131v0
    /* renamed from: d */
    public boolean mo5757d() {
        return false;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C13135x0(AbstractC12965b0 abstractC12965b0) {
        this(EnumC13008h1.INVARIANT, abstractC12965b0);
        if (abstractC12965b0 != null) {
        } else {
            m5756e(2);
            throw null;
        }
    }
}
