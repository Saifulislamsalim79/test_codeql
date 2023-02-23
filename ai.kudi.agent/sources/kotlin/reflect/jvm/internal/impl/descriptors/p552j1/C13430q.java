package kotlin.reflect.jvm.internal.impl.descriptors.p552j1;

import kotlin.p493j0.p494o.p495c.p497p0.p523i.p531w.p532o.C12796c;
import kotlin.p493j0.p494o.p495c.p497p0.p523i.p531w.p532o.InterfaceC12797d;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13312e;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13513m;
import kotlin.reflect.jvm.internal.impl.descriptors.p550h1.InterfaceC13346g;
/* compiled from: LazyClassReceiverParameterDescriptor.java */
/* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.j1.q */
/* loaded from: classes3.dex */
public class C13430q extends AbstractC13383c {

    /* renamed from: f */
    private final InterfaceC13312e f29764f;

    /* renamed from: w */
    private final C12796c f29765w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C13430q(InterfaceC13312e interfaceC13312e) {
        super(InterfaceC13346g.f29516s.m5317b());
        if (interfaceC13312e != null) {
            this.f29764f = interfaceC13312e;
            this.f29765w = new C12796c(interfaceC13312e, null);
            return;
        }
        m5025N(0);
        throw null;
    }

    /* renamed from: N */
    private static /* synthetic */ void m5025N(int i) {
        String str = (i == 1 || i == 2) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i == 1 || i == 2) ? 2 : 3];
        if (i == 1 || i == 2) {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/LazyClassReceiverParameterDescriptor";
        } else if (i != 3) {
            objArr[0] = "descriptor";
        } else {
            objArr[0] = "newOwner";
        }
        if (i == 1) {
            objArr[1] = "getValue";
        } else if (i != 2) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/LazyClassReceiverParameterDescriptor";
        } else {
            objArr[1] = "getContainingDeclaration";
        }
        if (i != 1 && i != 2) {
            if (i != 3) {
                objArr[2] = "<init>";
            } else {
                objArr[2] = "copy";
            }
        }
        String format = String.format(str, objArr);
        if (i != 1 && i != 2) {
            throw new IllegalArgumentException(format);
        }
        throw new IllegalStateException(format);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13513m
    /* renamed from: d */
    public InterfaceC13513m mo4687d() {
        InterfaceC13312e interfaceC13312e = this.f29764f;
        if (interfaceC13312e != null) {
            return interfaceC13312e;
        }
        m5025N(2);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13524r0
    public InterfaceC12797d getValue() {
        C12796c c12796c = this.f29765w;
        if (c12796c != null) {
            return c12796c;
        }
        m5025N(1);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.p552j1.AbstractC13405j
    public String toString() {
        return "class " + this.f29764f.mo5012b() + "::this";
    }
}
