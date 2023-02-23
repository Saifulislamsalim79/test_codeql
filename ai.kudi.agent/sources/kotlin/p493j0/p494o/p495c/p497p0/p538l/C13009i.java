package kotlin.p493j0.p494o.p495c.p497p0.p538l;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import kotlin.p493j0.p494o.p495c.p497p0.p523i.C12673d;
import kotlin.p493j0.p494o.p495c.p497p0.p537k.InterfaceC12954n;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13312e;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13556x0;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13562z0;
/* compiled from: ClassTypeConstructorImpl.java */
/* renamed from: kotlin.j0.o.c.p0.l.i */
/* loaded from: classes3.dex */
public class C13009i extends AbstractC12964b implements InterfaceC13125t0 {

    /* renamed from: d */
    private final InterfaceC13312e f29090d;

    /* renamed from: e */
    private final List<InterfaceC13562z0> f29091e;

    /* renamed from: f */
    private final Collection<AbstractC12965b0> f29092f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C13009i(InterfaceC13312e interfaceC13312e, List<? extends InterfaceC13562z0> list, Collection<AbstractC12965b0> collection, InterfaceC12954n interfaceC12954n) {
        super(interfaceC12954n);
        if (interfaceC13312e == null) {
            m6204v(0);
            throw null;
        } else if (list == null) {
            m6204v(1);
            throw null;
        } else if (collection == null) {
            m6204v(2);
            throw null;
        } else if (interfaceC12954n != null) {
            this.f29090d = interfaceC13312e;
            this.f29091e = Collections.unmodifiableList(new ArrayList(list));
            this.f29092f = Collections.unmodifiableCollection(collection);
        } else {
            m6204v(3);
            throw null;
        }
    }

    /* renamed from: v */
    private static /* synthetic */ void m6204v(int i) {
        String str = (i == 4 || i == 5 || i == 6 || i == 7) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i == 4 || i == 5 || i == 6 || i == 7) ? 2 : 3];
        switch (i) {
            case 1:
                objArr[0] = "parameters";
                break;
            case 2:
                objArr[0] = "supertypes";
                break;
            case 3:
                objArr[0] = "storageManager";
                break;
            case 4:
            case 5:
            case 6:
            case 7:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/types/ClassTypeConstructorImpl";
                break;
            default:
                objArr[0] = "classDescriptor";
                break;
        }
        if (i == 4) {
            objArr[1] = "getParameters";
        } else if (i == 5) {
            objArr[1] = "getDeclarationDescriptor";
        } else if (i == 6) {
            objArr[1] = "computeSupertypes";
        } else if (i != 7) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/types/ClassTypeConstructorImpl";
        } else {
            objArr[1] = "getSupertypeLoopChecker";
        }
        if (i != 4 && i != 5 && i != 6 && i != 7) {
            objArr[2] = "<init>";
        }
        String format = String.format(str, objArr);
        if (i != 4 && i != 5 && i != 6 && i != 7) {
            throw new IllegalArgumentException(format);
        }
        throw new IllegalStateException(format);
    }

    @Override // kotlin.p493j0.p494o.p495c.p497p0.p538l.InterfaceC13125t0
    /* renamed from: c */
    public List<InterfaceC13562z0> mo5207c() {
        List<InterfaceC13562z0> list = this.f29091e;
        if (list != null) {
            return list;
        }
        m6204v(4);
        throw null;
    }

    @Override // kotlin.p493j0.p494o.p495c.p497p0.p538l.InterfaceC13125t0
    /* renamed from: e */
    public boolean mo5205e() {
        return true;
    }

    @Override // kotlin.p493j0.p494o.p495c.p497p0.p538l.AbstractC12993g
    /* renamed from: j */
    protected Collection<AbstractC12965b0> mo5204j() {
        Collection<AbstractC12965b0> collection = this.f29092f;
        if (collection != null) {
            return collection;
        }
        m6204v(6);
        throw null;
    }

    @Override // kotlin.p493j0.p494o.p495c.p497p0.p538l.AbstractC12993g
    /* renamed from: n */
    protected InterfaceC13556x0 mo5202n() {
        InterfaceC13556x0.C13557a c13557a = InterfaceC13556x0.C13557a.f29907a;
        if (c13557a != null) {
            return c13557a;
        }
        m6204v(7);
        throw null;
    }

    public String toString() {
        return C12673d.m7022m(this.f29090d).m7371b();
    }

    @Override // kotlin.p493j0.p494o.p495c.p497p0.p538l.AbstractC12993g, kotlin.p493j0.p494o.p495c.p497p0.p538l.InterfaceC13125t0
    /* renamed from: w */
    public InterfaceC13312e mo5206d() {
        InterfaceC13312e interfaceC13312e = this.f29090d;
        if (interfaceC13312e != null) {
            return interfaceC13312e;
        }
        m6204v(5);
        throw null;
    }
}
