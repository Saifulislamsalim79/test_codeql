package kotlin.p493j0.p494o.p495c.p497p0.p538l;

import java.util.HashMap;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13513m;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13545u0;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13562z0;
import kotlin.reflect.jvm.internal.impl.descriptors.p552j1.C13410k0;
/* compiled from: DescriptorSubstitutor.java */
/* renamed from: kotlin.j0.o.c.p0.l.o */
/* loaded from: classes3.dex */
public class C13103o {
    /* renamed from: a */
    private static /* synthetic */ void m5860a(int i) {
        String str = i != 4 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
        Object[] objArr = new Object[i != 4 ? 3 : 2];
        switch (i) {
            case 1:
            case 6:
                objArr[0] = "originalSubstitution";
                break;
            case 2:
            case 7:
                objArr[0] = "newContainingDeclaration";
                break;
            case 3:
            case 8:
                objArr[0] = "result";
                break;
            case 4:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/types/DescriptorSubstitutor";
                break;
            case 5:
            default:
                objArr[0] = "typeParameters";
                break;
        }
        if (i != 4) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/types/DescriptorSubstitutor";
        } else {
            objArr[1] = "substituteTypeParameters";
        }
        if (i != 4) {
            objArr[2] = "substituteTypeParameters";
        }
        String format = String.format(str, objArr);
        if (i == 4) {
            throw new IllegalStateException(format);
        }
    }

    /* renamed from: b */
    public static C12959a1 m5859b(List<InterfaceC13562z0> list, AbstractC13137y0 abstractC13137y0, InterfaceC13513m interfaceC13513m, List<InterfaceC13562z0> list2) {
        if (list == null) {
            m5860a(0);
            throw null;
        } else if (abstractC13137y0 == null) {
            m5860a(1);
            throw null;
        } else if (interfaceC13513m == null) {
            m5860a(2);
            throw null;
        } else if (list2 != null) {
            C12959a1 m5858c = m5858c(list, abstractC13137y0, interfaceC13513m, list2, null);
            if (m5858c != null) {
                if (m5858c != null) {
                    return m5858c;
                }
                m5860a(4);
                throw null;
            }
            throw new AssertionError("Substitution failed");
        } else {
            m5860a(3);
            throw null;
        }
    }

    /* renamed from: c */
    public static C12959a1 m5858c(List<InterfaceC13562z0> list, AbstractC13137y0 abstractC13137y0, InterfaceC13513m interfaceC13513m, List<InterfaceC13562z0> list2, boolean[] zArr) {
        if (list == null) {
            m5860a(5);
            throw null;
        } else if (abstractC13137y0 == null) {
            m5860a(6);
            throw null;
        } else if (interfaceC13513m == null) {
            m5860a(7);
            throw null;
        } else if (list2 != null) {
            HashMap hashMap = new HashMap();
            HashMap hashMap2 = new HashMap();
            int i = 0;
            for (InterfaceC13562z0 interfaceC13562z0 : list) {
                C13410k0 m5146b1 = C13410k0.m5146b1(interfaceC13513m, interfaceC13562z0.mo4956y(), interfaceC13562z0.mo4652L(), interfaceC13562z0.mo4648r(), interfaceC13562z0.mo5012b(), i, InterfaceC13545u0.f29903a, interfaceC13562z0.mo4647r0());
                hashMap.put(interfaceC13562z0.mo4649n(), new C13135x0(m5146b1.mo5010x()));
                hashMap2.put(interfaceC13562z0, m5146b1);
                list2.add(m5146b1);
                i++;
            }
            C12959a1 m6341h = C12959a1.m6341h(abstractC13137y0, AbstractC13127u0.m5787i(hashMap));
            for (InterfaceC13562z0 interfaceC13562z02 : list) {
                C13410k0 c13410k0 = (C13410k0) hashMap2.get(interfaceC13562z02);
                for (AbstractC12965b0 abstractC12965b0 : interfaceC13562z02.getUpperBounds()) {
                    AbstractC12965b0 m6333p = m6341h.m6333p(abstractC12965b0, EnumC13008h1.IN_VARIANCE);
                    if (m6333p == null) {
                        return null;
                    }
                    if (m6333p != abstractC12965b0 && zArr != null) {
                        zArr[0] = true;
                    }
                    c13410k0.m5150X0(m6333p);
                }
                c13410k0.m5142f1();
            }
            return m6341h;
        } else {
            m5860a(8);
            throw null;
        }
    }
}
