package kotlin.reflect.jvm.internal.impl.descriptors.p552j1;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import kotlin.p493j0.p494o.p495c.p497p0.p520f.C12614f;
import kotlin.p493j0.p494o.p495c.p497p0.p538l.C12959a1;
import kotlin.reflect.jvm.internal.impl.descriptors.AbstractC13544u;
import kotlin.reflect.jvm.internal.impl.descriptors.EnumC13560z;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13300b;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13307c1;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13309d;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13312e;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13452l;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13513m;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13517o;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13524r0;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13545u0;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13554x;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13562z0;
import kotlin.reflect.jvm.internal.impl.descriptors.p550h1.InterfaceC13346g;
/* compiled from: ClassConstructorDescriptorImpl.java */
/* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.j1.f */
/* loaded from: classes3.dex */
public class C13397f extends AbstractC13426p implements InterfaceC13309d {

    /* renamed from: W */
    private static final C12614f f29661W = C12614f.m7346n("<init>");

    /* renamed from: V */
    protected final boolean f29662V;

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C13397f(InterfaceC13312e interfaceC13312e, InterfaceC13452l interfaceC13452l, InterfaceC13346g interfaceC13346g, boolean z, InterfaceC13300b.EnumC13301a enumC13301a, InterfaceC13545u0 interfaceC13545u0) {
        super(interfaceC13312e, interfaceC13452l, interfaceC13346g, f29661W, enumC13301a, interfaceC13545u0);
        if (interfaceC13312e == null) {
            m5189N(0);
            throw null;
        } else if (interfaceC13346g == null) {
            m5189N(1);
            throw null;
        } else if (enumC13301a == null) {
            m5189N(2);
            throw null;
        } else if (interfaceC13545u0 != null) {
            this.f29662V = z;
        } else {
            m5189N(3);
            throw null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0018  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00a5 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00aa  */
    /* renamed from: N */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static /* synthetic */ void m5189N(int r8) {
        /*
            Method dump skipped, instructions count: 324
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.descriptors.p552j1.C13397f.m5189N(int):void");
    }

    /* renamed from: x1 */
    public static C13397f m5186x1(InterfaceC13312e interfaceC13312e, InterfaceC13346g interfaceC13346g, boolean z, InterfaceC13545u0 interfaceC13545u0) {
        if (interfaceC13312e == null) {
            m5189N(4);
            throw null;
        } else if (interfaceC13346g == null) {
            m5189N(5);
            throw null;
        } else if (interfaceC13545u0 != null) {
            return new C13397f(interfaceC13312e, null, interfaceC13346g, z, InterfaceC13300b.EnumC13301a.DECLARATION, interfaceC13545u0);
        } else {
            m5189N(6);
            throw null;
        }
    }

    /* renamed from: A1 */
    public C13397f m5191A1(List<InterfaceC13307c1> list, AbstractC13544u abstractC13544u) {
        if (list == null) {
            m5189N(13);
            throw null;
        } else if (abstractC13544u != null) {
            m5190B1(list, abstractC13544u, mo4687d().mo4975B());
            return this;
        } else {
            m5189N(14);
            throw null;
        }
    }

    /* renamed from: B1 */
    public C13397f m5190B1(List<InterfaceC13307c1> list, AbstractC13544u abstractC13544u, List<InterfaceC13562z0> list2) {
        if (list == null) {
            m5189N(10);
            throw null;
        } else if (abstractC13544u == null) {
            m5189N(11);
            throw null;
        } else if (list2 != null) {
            super.mo5080c1(null, m5188v1(), list2, list, null, EnumC13560z.FINAL, abstractC13544u);
            return this;
        } else {
            m5189N(12);
            throw null;
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13452l
    /* renamed from: H */
    public boolean mo4945H() {
        return this.f29662V;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.p552j1.AbstractC13426p, kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13300b
    /* renamed from: H0 */
    public void mo5092H0(Collection<? extends InterfaceC13300b> collection) {
        if (collection != null) {
            return;
        }
        m5189N(20);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13452l
    /* renamed from: I */
    public InterfaceC13312e mo4944I() {
        InterfaceC13312e mo4687d = mo4687d();
        if (mo4687d != null) {
            return mo4687d;
        }
        m5189N(16);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.p552j1.AbstractC13426p, kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13513m
    /* renamed from: S */
    public <R, D> R mo4769S(InterfaceC13517o<R, D> interfaceC13517o, D d) {
        return interfaceC13517o.mo4756h(this, d);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.p552j1.AbstractC13426p, kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13554x, kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13300b, kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13293a
    /* renamed from: g */
    public Collection<? extends InterfaceC13554x> mo4685g() {
        Set emptySet = Collections.emptySet();
        if (emptySet != null) {
            return emptySet;
        }
        m5189N(19);
        throw null;
    }

    /* renamed from: v1 */
    public InterfaceC13524r0 m5188v1() {
        InterfaceC13312e mo4687d = mo4687d();
        if (mo4687d.mo4967U()) {
            InterfaceC13513m mo4687d2 = mo4687d.mo4687d();
            if (mo4687d2 instanceof InterfaceC13312e) {
                return ((InterfaceC13312e) mo4687d2).mo5015T0();
            }
            return null;
        }
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.p552j1.AbstractC13426p, kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13300b
    /* renamed from: w1 */
    public InterfaceC13309d mo5059u0(InterfaceC13513m interfaceC13513m, EnumC13560z enumC13560z, AbstractC13544u abstractC13544u, InterfaceC13300b.EnumC13301a enumC13301a, boolean z) {
        InterfaceC13309d interfaceC13309d = (InterfaceC13309d) super.mo5059u0(interfaceC13513m, enumC13560z, abstractC13544u, enumC13301a, z);
        if (interfaceC13309d != null) {
            return interfaceC13309d;
        }
        m5189N(25);
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlin.reflect.jvm.internal.impl.descriptors.p552j1.AbstractC13426p
    /* renamed from: y1 */
    public C13397f mo5086W0(InterfaceC13513m interfaceC13513m, InterfaceC13554x interfaceC13554x, InterfaceC13300b.EnumC13301a enumC13301a, C12614f c12614f, InterfaceC13346g interfaceC13346g, InterfaceC13545u0 interfaceC13545u0) {
        if (interfaceC13513m == null) {
            m5189N(21);
            throw null;
        } else if (enumC13301a == null) {
            m5189N(22);
            throw null;
        } else if (interfaceC13346g == null) {
            m5189N(23);
            throw null;
        } else if (interfaceC13545u0 != null) {
            if (enumC13301a != InterfaceC13300b.EnumC13301a.DECLARATION && enumC13301a != InterfaceC13300b.EnumC13301a.SYNTHESIZED) {
                throw new IllegalStateException("Attempt at creating a constructor that is not a declaration: \ncopy from: " + this + "\nnewOwner: " + interfaceC13513m + "\nkind: " + enumC13301a);
            }
            return new C13397f((InterfaceC13312e) interfaceC13513m, this, interfaceC13346g, this.f29662V, InterfaceC13300b.EnumC13301a.DECLARATION, interfaceC13545u0);
        } else {
            m5189N(24);
            throw null;
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.p552j1.AbstractC13409k, kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13513m
    /* renamed from: z1 */
    public InterfaceC13312e mo4687d() {
        InterfaceC13312e interfaceC13312e = (InterfaceC13312e) super.mo4687d();
        if (interfaceC13312e != null) {
            return interfaceC13312e;
        }
        m5189N(15);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.p552j1.AbstractC13426p, kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13554x, kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13553w0
    /* renamed from: e */
    public InterfaceC13309d mo4686e(C12959a1 c12959a1) {
        if (c12959a1 != null) {
            return (InterfaceC13309d) super.mo4686e(c12959a1);
        }
        m5189N(18);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.p552j1.AbstractC13426p, kotlin.reflect.jvm.internal.impl.descriptors.p552j1.AbstractC13409k, kotlin.reflect.jvm.internal.impl.descriptors.p552j1.AbstractC13405j, kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13513m
    /* renamed from: a */
    public InterfaceC13309d mo4651a() {
        InterfaceC13309d interfaceC13309d = (InterfaceC13309d) super.mo4651a();
        if (interfaceC13309d != null) {
            return interfaceC13309d;
        }
        m5189N(17);
        throw null;
    }
}
