package kotlin.p493j0.p494o.p495c.p497p0.p538l;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import kotlin.p493j0.p494o.p495c.p497p0.p498b.AbstractC12046h;
import kotlin.p493j0.p494o.p495c.p497p0.p523i.p528t.C12747a;
import kotlin.p493j0.p494o.p495c.p497p0.p537k.InterfaceC12954n;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13312e;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13334h;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13513m;
import kotlin.reflect.jvm.internal.impl.utils.C13653g;
/* compiled from: AbstractClassTypeConstructor.java */
/* renamed from: kotlin.j0.o.c.p0.l.b */
/* loaded from: classes3.dex */
public abstract class AbstractC12964b extends AbstractC12993g implements InterfaceC13125t0 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC12964b(InterfaceC12954n interfaceC12954n) {
        super(interfaceC12954n);
        if (interfaceC12954n != null) {
        } else {
            m6325v(0);
            throw null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0045  */
    /* renamed from: v */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static /* synthetic */ void m6325v(int r9) {
        /*
            r0 = 4
            r1 = 3
            r2 = 1
            if (r9 == r2) goto Lc
            if (r9 == r1) goto Lc
            if (r9 == r0) goto Lc
            java.lang.String r3 = "Argument for @NotNull parameter '%s' of %s.%s must not be null"
            goto Le
        Lc:
            java.lang.String r3 = "@NotNull method %s.%s must not return null"
        Le:
            r4 = 2
            if (r9 == r2) goto L17
            if (r9 == r1) goto L17
            if (r9 == r0) goto L17
            r5 = 3
            goto L18
        L17:
            r5 = 2
        L18:
            java.lang.Object[] r5 = new java.lang.Object[r5]
            java.lang.String r6 = "kotlin/reflect/jvm/internal/impl/types/AbstractClassTypeConstructor"
            r7 = 0
            if (r9 == r2) goto L2f
            if (r9 == r4) goto L2a
            if (r9 == r1) goto L2f
            if (r9 == r0) goto L2f
            java.lang.String r8 = "storageManager"
            r5[r7] = r8
            goto L31
        L2a:
            java.lang.String r8 = "classifier"
            r5[r7] = r8
            goto L31
        L2f:
            r5[r7] = r6
        L31:
            if (r9 == r2) goto L3f
            if (r9 == r1) goto L3a
            if (r9 == r0) goto L3a
            r5[r2] = r6
            goto L43
        L3a:
            java.lang.String r6 = "getAdditionalNeighboursInSupertypeGraph"
            r5[r2] = r6
            goto L43
        L3f:
            java.lang.String r6 = "getBuiltIns"
            r5[r2] = r6
        L43:
            if (r9 == r2) goto L54
            if (r9 == r4) goto L50
            if (r9 == r1) goto L54
            if (r9 == r0) goto L54
            java.lang.String r6 = "<init>"
            r5[r4] = r6
            goto L54
        L50:
            java.lang.String r6 = "isSameClassifier"
            r5[r4] = r6
        L54:
            java.lang.String r3 = java.lang.String.format(r3, r5)
            if (r9 == r2) goto L64
            if (r9 == r1) goto L64
            if (r9 == r0) goto L64
            java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
            r9.<init>(r3)
            goto L69
        L64:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            r9.<init>(r3)
        L69:
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.p493j0.p494o.p495c.p497p0.p538l.AbstractC12964b.m6325v(int):void");
    }

    @Override // kotlin.p493j0.p494o.p495c.p497p0.p538l.AbstractC12993g
    /* renamed from: k */
    protected AbstractC12965b0 mo5203k() {
        if (AbstractC12046h.m9873r0(mo6203w())) {
            return null;
        }
        return mo5199s().m9892i();
    }

    @Override // kotlin.p493j0.p494o.p495c.p497p0.p538l.AbstractC12993g
    /* renamed from: l */
    protected Collection<AbstractC12965b0> mo6228l(boolean z) {
        InterfaceC13513m mo4687d = mo6203w().mo4687d();
        if (!(mo4687d instanceof InterfaceC13312e)) {
            List emptyList = Collections.emptyList();
            if (emptyList != null) {
                return emptyList;
            }
            m6325v(3);
            throw null;
        }
        C13653g c13653g = new C13653g();
        InterfaceC13312e interfaceC13312e = (InterfaceC13312e) mo4687d;
        c13653g.add(interfaceC13312e.mo5010x());
        InterfaceC13312e mo4959c0 = interfaceC13312e.mo4959c0();
        if (z && mo4959c0 != null) {
            c13653g.add(mo4959c0.mo5010x());
        }
        return c13653g;
    }

    @Override // kotlin.p493j0.p494o.p495c.p497p0.p538l.AbstractC12993g
    /* renamed from: q */
    protected boolean mo5201q(InterfaceC13334h interfaceC13334h) {
        if (interfaceC13334h != null) {
            return (interfaceC13334h instanceof InterfaceC13312e) && m6230h(mo6203w(), interfaceC13334h);
        }
        m6325v(2);
        throw null;
    }

    @Override // kotlin.p493j0.p494o.p495c.p497p0.p538l.InterfaceC13125t0
    /* renamed from: s */
    public AbstractC12046h mo5199s() {
        AbstractC12046h m6863g = C12747a.m6863g(mo6203w());
        if (m6863g != null) {
            return m6863g;
        }
        m6325v(1);
        throw null;
    }

    /* renamed from: w */
    public abstract InterfaceC13312e mo6203w();
}
