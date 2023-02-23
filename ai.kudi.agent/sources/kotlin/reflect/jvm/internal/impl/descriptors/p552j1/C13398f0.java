package kotlin.reflect.jvm.internal.impl.descriptors.p552j1;

import kotlin.p493j0.p494o.p495c.p497p0.p523i.p531w.p532o.InterfaceC12797d;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13513m;
import kotlin.reflect.jvm.internal.impl.descriptors.p550h1.InterfaceC13346g;
/* compiled from: ReceiverParameterDescriptorImpl.java */
/* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.j1.f0 */
/* loaded from: classes3.dex */
public class C13398f0 extends AbstractC13383c {

    /* renamed from: f */
    private final InterfaceC13513m f29663f;

    /* renamed from: w */
    private InterfaceC12797d f29664w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C13398f0(InterfaceC13513m interfaceC13513m, InterfaceC12797d interfaceC12797d, InterfaceC13346g interfaceC13346g) {
        super(interfaceC13346g);
        if (interfaceC13513m == null) {
            m5183N(0);
            throw null;
        } else if (interfaceC12797d == null) {
            m5183N(1);
            throw null;
        } else if (interfaceC13346g != null) {
            this.f29663f = interfaceC13513m;
            this.f29664w = interfaceC12797d;
        } else {
            m5183N(2);
            throw null;
        }
    }

    /* renamed from: N */
    private static /* synthetic */ void m5183N(int i) {
        String str = (i == 3 || i == 4) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i == 3 || i == 4) ? 2 : 3];
        switch (i) {
            case 1:
                objArr[0] = "value";
                break;
            case 2:
                objArr[0] = "annotations";
                break;
            case 3:
            case 4:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/ReceiverParameterDescriptorImpl";
                break;
            case 5:
                objArr[0] = "newOwner";
                break;
            case 6:
                objArr[0] = "outType";
                break;
            default:
                objArr[0] = "containingDeclaration";
                break;
        }
        if (i == 3) {
            objArr[1] = "getValue";
        } else if (i != 4) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/ReceiverParameterDescriptorImpl";
        } else {
            objArr[1] = "getContainingDeclaration";
        }
        if (i != 3 && i != 4) {
            if (i == 5) {
                objArr[2] = "copy";
            } else if (i != 6) {
                objArr[2] = "<init>";
            } else {
                objArr[2] = "setOutType";
            }
        }
        String format = String.format(str, objArr);
        if (i != 3 && i != 4) {
            throw new IllegalArgumentException(format);
        }
        throw new IllegalStateException(format);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13513m
    /* renamed from: d */
    public InterfaceC13513m mo4687d() {
        InterfaceC13513m interfaceC13513m = this.f29663f;
        if (interfaceC13513m != null) {
            return interfaceC13513m;
        }
        m5183N(4);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13524r0
    public InterfaceC12797d getValue() {
        InterfaceC12797d interfaceC12797d = this.f29664w;
        if (interfaceC12797d != null) {
            return interfaceC12797d;
        }
        m5183N(3);
        throw null;
    }
}
