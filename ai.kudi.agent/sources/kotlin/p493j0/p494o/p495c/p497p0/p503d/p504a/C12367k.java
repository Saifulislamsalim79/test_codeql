package kotlin.p493j0.p494o.p495c.p497p0.p503d.p504a;

import kotlin.p493j0.p494o.p495c.p497p0.p498b.C12039c;
import kotlin.p493j0.p494o.p495c.p497p0.p498b.C12041d;
import kotlin.p493j0.p494o.p495c.p497p0.p523i.C12673d;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13300b;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13312e;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13513m;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13518o0;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13547v;
/* compiled from: DescriptorsJvmAbiUtil.java */
/* renamed from: kotlin.j0.o.c.p0.d.a.k */
/* loaded from: classes3.dex */
public final class C12367k {
    /* renamed from: a */
    private static /* synthetic */ void m9113a(int i) {
        Object[] objArr = new Object[3];
        if (i == 1 || i == 2) {
            objArr[0] = "companionObject";
        } else if (i != 3) {
            objArr[0] = "propertyDescriptor";
        } else {
            objArr[0] = "memberDescriptor";
        }
        objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/DescriptorsJvmAbiUtil";
        if (i == 1) {
            objArr[2] = "isClassCompanionObjectWithBackingFieldsInOuter";
        } else if (i == 2) {
            objArr[2] = "isMappedIntrinsicCompanionObject";
        } else if (i != 3) {
            objArr[2] = "isPropertyWithBackingFieldInOuterClass";
        } else {
            objArr[2] = "hasJvmFieldAnnotation";
        }
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
    }

    /* renamed from: b */
    public static boolean m9112b(InterfaceC13300b interfaceC13300b) {
        InterfaceC13547v mo4750A0;
        if (interfaceC13300b != null) {
            if ((interfaceC13300b instanceof InterfaceC13518o0) && (mo4750A0 = ((InterfaceC13518o0) interfaceC13300b).mo4750A0()) != null && mo4750A0.mo4956y().mo5304Q(C12385u.f27467b)) {
                return true;
            }
            return interfaceC13300b.mo4956y().mo5304Q(C12385u.f27467b);
        }
        m9113a(3);
        throw null;
    }

    /* renamed from: c */
    public static boolean m9111c(InterfaceC13513m interfaceC13513m) {
        if (interfaceC13513m != null) {
            return C12673d.m7011x(interfaceC13513m) && C12673d.m7012w(interfaceC13513m.mo4687d()) && !m9110d((InterfaceC13312e) interfaceC13513m);
        }
        m9113a(1);
        throw null;
    }

    /* renamed from: d */
    public static boolean m9110d(InterfaceC13312e interfaceC13312e) {
        if (interfaceC13312e != null) {
            return C12041d.m9955a(C12039c.f26758a, interfaceC13312e);
        }
        m9113a(2);
        throw null;
    }

    /* renamed from: e */
    public static boolean m9109e(InterfaceC13518o0 interfaceC13518o0) {
        if (interfaceC13518o0 != null) {
            if (interfaceC13518o0.mo5057w() == InterfaceC13300b.EnumC13301a.FAKE_OVERRIDE) {
                return false;
            }
            if (m9111c(interfaceC13518o0.mo4687d())) {
                return true;
            }
            return C12673d.m7011x(interfaceC13518o0.mo4687d()) && m9112b(interfaceC13518o0);
        }
        m9113a(0);
        throw null;
    }
}
