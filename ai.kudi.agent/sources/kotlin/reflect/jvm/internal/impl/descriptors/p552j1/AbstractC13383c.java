package kotlin.reflect.jvm.internal.impl.descriptors.p552j1;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import kotlin.p493j0.p494o.p495c.p497p0.p520f.C12614f;
import kotlin.p493j0.p494o.p495c.p497p0.p523i.p531w.p532o.C12800g;
import kotlin.p493j0.p494o.p495c.p497p0.p538l.AbstractC12965b0;
import kotlin.p493j0.p494o.p495c.p497p0.p538l.C12959a1;
import kotlin.p493j0.p494o.p495c.p497p0.p538l.EnumC13008h1;
import kotlin.reflect.jvm.internal.impl.descriptors.AbstractC13544u;
import kotlin.reflect.jvm.internal.impl.descriptors.C13530t;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13293a;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13307c1;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13312e;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13453l0;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13513m;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13517o;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13524r0;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13545u0;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13562z0;
import kotlin.reflect.jvm.internal.impl.descriptors.p550h1.InterfaceC13346g;
/* compiled from: AbstractReceiverParameterDescriptor.java */
/* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.j1.c */
/* loaded from: classes3.dex */
public abstract class AbstractC13383c extends AbstractC13405j implements InterfaceC13524r0 {

    /* renamed from: e */
    private static final C12614f f29604e = C12614f.m7346n("<this>");

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC13383c(InterfaceC13346g interfaceC13346g) {
        super(interfaceC13346g, f29604e);
        if (interfaceC13346g != null) {
        } else {
            m5269N(0);
            throw null;
        }
    }

    /* renamed from: N */
    private static /* synthetic */ void m5269N(int i) {
        String str;
        int i2;
        switch (i) {
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
                str = "@NotNull method %s.%s must not return null";
                break;
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i) {
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
                i2 = 2;
                break;
            default:
                i2 = 3;
                break;
        }
        Object[] objArr = new Object[i2];
        switch (i) {
            case 1:
                objArr[0] = "substitutor";
                break;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractReceiverParameterDescriptor";
                break;
            default:
                objArr[0] = "annotations";
                break;
        }
        switch (i) {
            case 2:
                objArr[1] = "getTypeParameters";
                break;
            case 3:
                objArr[1] = "getType";
                break;
            case 4:
                objArr[1] = "getValueParameters";
                break;
            case 5:
                objArr[1] = "getOverriddenDescriptors";
                break;
            case 6:
                objArr[1] = "getVisibility";
                break;
            case 7:
                objArr[1] = "getOriginal";
                break;
            case 8:
                objArr[1] = "getSource";
                break;
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractReceiverParameterDescriptor";
                break;
        }
        switch (i) {
            case 1:
                objArr[2] = "substitute";
                break;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String format = String.format(str, objArr);
        switch (i) {
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
                throw new IllegalStateException(format);
            default:
                throw new IllegalArgumentException(format);
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13293a
    /* renamed from: M */
    public boolean mo5091M() {
        return false;
    }

    /* renamed from: N0 */
    public InterfaceC13453l0 m5268N0() {
        return this;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13513m
    /* renamed from: S */
    public <R, D> R mo4769S(InterfaceC13517o<R, D> interfaceC13517o, D d) {
        return interfaceC13517o.mo4752l(this, d);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.p552j1.AbstractC13405j, kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13513m
    /* renamed from: a */
    public /* bridge */ /* synthetic */ InterfaceC13293a mo4651a() {
        m5268N0();
        return this;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13303b1
    /* renamed from: c */
    public AbstractC12965b0 mo5121c() {
        AbstractC12965b0 mo4724c = getValue().mo4724c();
        if (mo4724c != null) {
            return mo4724c;
        }
        m5269N(3);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13293a
    /* renamed from: g */
    public Collection<? extends InterfaceC13293a> mo4685g() {
        Set emptySet = Collections.emptySet();
        if (emptySet != null) {
            return emptySet;
        }
        m5269N(5);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13521q, kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13558y
    /* renamed from: i */
    public AbstractC13544u mo4659i() {
        AbstractC13544u abstractC13544u = C13530t.f29893f;
        if (abstractC13544u != null) {
            return abstractC13544u;
        }
        m5269N(6);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13293a
    /* renamed from: j */
    public AbstractC12965b0 mo4943j() {
        return mo5121c();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13293a
    /* renamed from: k */
    public List<InterfaceC13307c1> mo5072k() {
        List<InterfaceC13307c1> emptyList = Collections.emptyList();
        if (emptyList != null) {
            return emptyList;
        }
        m5269N(4);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13293a
    /* renamed from: l */
    public List<InterfaceC13562z0> mo4942l() {
        List<InterfaceC13562z0> emptyList = Collections.emptyList();
        if (emptyList != null) {
            return emptyList;
        }
        m5269N(2);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13519p
    /* renamed from: m */
    public InterfaceC13545u0 mo4745m() {
        InterfaceC13545u0 interfaceC13545u0 = InterfaceC13545u0.f29903a;
        if (interfaceC13545u0 != null) {
            return interfaceC13545u0;
        }
        m5269N(8);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13293a
    /* renamed from: p0 */
    public InterfaceC13524r0 mo5066p0() {
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13293a
    /* renamed from: s0 */
    public <V> V mo5062s0(InterfaceC13293a.InterfaceC13294a<V> interfaceC13294a) {
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13293a
    /* renamed from: w0 */
    public InterfaceC13524r0 mo5056w0() {
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.p552j1.AbstractC13405j, kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13513m
    /* renamed from: a */
    public /* bridge */ /* synthetic */ InterfaceC13513m mo4651a() {
        m5268N0();
        return this;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13553w0
    /* renamed from: e  reason: avoid collision after fix types in other method */
    public InterfaceC13524r0 mo4686e(C12959a1 c12959a1) {
        AbstractC12965b0 m6333p;
        if (c12959a1 != null) {
            if (c12959a1.m6338k()) {
                return this;
            }
            if (mo4687d() instanceof InterfaceC13312e) {
                m6333p = c12959a1.m6333p(mo5121c(), EnumC13008h1.OUT_VARIANCE);
            } else {
                m6333p = c12959a1.m6333p(mo5121c(), EnumC13008h1.INVARIANT);
            }
            if (m6333p == null) {
                return null;
            }
            return m6333p == mo5121c() ? this : new C13398f0(mo4687d(), new C12800g(m6333p), mo4956y());
        }
        m5269N(1);
        throw null;
    }
}
