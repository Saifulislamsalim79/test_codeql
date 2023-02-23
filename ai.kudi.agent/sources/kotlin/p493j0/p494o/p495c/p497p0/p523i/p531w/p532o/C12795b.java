package kotlin.p493j0.p494o.p495c.p497p0.p523i.p531w.p532o;

import kotlin.p493j0.p494o.p495c.p497p0.p538l.AbstractC12965b0;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13293a;
/* compiled from: ExtensionReceiver.java */
/* renamed from: kotlin.j0.o.c.p0.i.w.o.b */
/* loaded from: classes3.dex */
public class C12795b extends AbstractC12794a implements InterfaceC12797d {

    /* renamed from: b */
    private final InterfaceC13293a f28687b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C12795b(InterfaceC13293a interfaceC13293a, AbstractC12965b0 abstractC12965b0, InterfaceC12797d interfaceC12797d) {
        super(abstractC12965b0, interfaceC12797d);
        if (interfaceC13293a == null) {
            m6754b(0);
            throw null;
        } else if (abstractC12965b0 != null) {
            this.f28687b = interfaceC13293a;
        } else {
            m6754b(1);
            throw null;
        }
    }

    /* renamed from: b */
    private static /* synthetic */ void m6754b(int i) {
        String str = i != 2 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
        Object[] objArr = new Object[i != 2 ? 3 : 2];
        if (i == 1) {
            objArr[0] = "receiverType";
        } else if (i == 2) {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/resolve/scopes/receivers/ExtensionReceiver";
        } else if (i != 3) {
            objArr[0] = "callableDescriptor";
        } else {
            objArr[0] = "newType";
        }
        if (i != 2) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/resolve/scopes/receivers/ExtensionReceiver";
        } else {
            objArr[1] = "getDeclarationDescriptor";
        }
        if (i != 2) {
            if (i != 3) {
                objArr[2] = "<init>";
            } else {
                objArr[2] = "replaceType";
            }
        }
        String format = String.format(str, objArr);
        if (i == 2) {
            throw new IllegalStateException(format);
        }
    }

    public String toString() {
        return mo4724c() + ": Ext {" + this.f28687b + "}";
    }
}
