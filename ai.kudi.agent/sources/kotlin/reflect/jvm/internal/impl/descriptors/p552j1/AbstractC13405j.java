package kotlin.reflect.jvm.internal.impl.descriptors.p552j1;

import kotlin.p493j0.p494o.p495c.p497p0.p520f.C12614f;
import kotlin.p493j0.p494o.p495c.p497p0.p522h.AbstractC12624c;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13513m;
import kotlin.reflect.jvm.internal.impl.descriptors.p550h1.C13339b;
import kotlin.reflect.jvm.internal.impl.descriptors.p550h1.InterfaceC13346g;
/* compiled from: DeclarationDescriptorImpl.java */
/* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.j1.j */
/* loaded from: classes3.dex */
public abstract class AbstractC13405j extends C13339b implements InterfaceC13513m {

    /* renamed from: d */
    private final C12614f f29677d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC13405j(InterfaceC13346g interfaceC13346g, C12614f c12614f) {
        super(interfaceC13346g);
        if (interfaceC13346g == null) {
            m5168N(0);
            throw null;
        } else if (c12614f != null) {
            this.f29677d = c12614f;
        } else {
            m5168N(1);
            throw null;
        }
    }

    /* renamed from: N */
    private static /* synthetic */ void m5168N(int i) {
        String str = (i == 2 || i == 3 || i == 5 || i == 6) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i == 2 || i == 3 || i == 5 || i == 6) ? 2 : 3];
        switch (i) {
            case 1:
                objArr[0] = "name";
                break;
            case 2:
            case 3:
            case 5:
            case 6:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/DeclarationDescriptorImpl";
                break;
            case 4:
                objArr[0] = "descriptor";
                break;
            default:
                objArr[0] = "annotations";
                break;
        }
        if (i == 2) {
            objArr[1] = "getName";
        } else if (i == 3) {
            objArr[1] = "getOriginal";
        } else if (i == 5 || i == 6) {
            objArr[1] = "toString";
        } else {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/DeclarationDescriptorImpl";
        }
        if (i != 2 && i != 3) {
            if (i == 4) {
                objArr[2] = "toString";
            } else if (i != 5 && i != 6) {
                objArr[2] = "<init>";
            }
        }
        String format = String.format(str, objArr);
        if (i != 2 && i != 3 && i != 5 && i != 6) {
            throw new IllegalArgumentException(format);
        }
        throw new IllegalStateException(format);
    }

    /* renamed from: R */
    public static String m5167R(InterfaceC13513m interfaceC13513m) {
        if (interfaceC13513m != null) {
            try {
                String str = AbstractC12624c.f28405c.mo7207q(interfaceC13513m) + "[" + interfaceC13513m.getClass().getSimpleName() + "@" + Integer.toHexString(System.identityHashCode(interfaceC13513m)) + "]";
                if (str != null) {
                    return str;
                }
                m5168N(5);
                throw null;
            } catch (Throwable unused) {
                String str2 = interfaceC13513m.getClass().getSimpleName() + " " + interfaceC13513m.mo5012b();
                if (str2 != null) {
                    return str2;
                }
                m5168N(6);
                throw null;
            }
        }
        m5168N(4);
        throw null;
    }

    /* renamed from: a */
    public InterfaceC13513m mo4651a() {
        return this;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13310d0
    /* renamed from: b */
    public C12614f mo5012b() {
        C12614f c12614f = this.f29677d;
        if (c12614f != null) {
            return c12614f;
        }
        m5168N(2);
        throw null;
    }

    public String toString() {
        return m5167R(this);
    }
}
