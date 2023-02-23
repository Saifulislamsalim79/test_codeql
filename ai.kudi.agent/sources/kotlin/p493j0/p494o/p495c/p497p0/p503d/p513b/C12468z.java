package kotlin.p493j0.p494o.p495c.p497p0.p503d.p513b;

import ai.kudi.agent.wallettopup.WalletTopUpActivity;
import java.util.Collection;
import java.util.List;
import kotlin.e0.d.l;
import kotlin.p493j0.p494o.p495c.p497p0.p498b.EnumC12052i;
import kotlin.p493j0.p494o.p495c.p497p0.p498b.p500q.C12080c;
import kotlin.p493j0.p494o.p495c.p497p0.p503d.p504a.p512g0.C12359r;
import kotlin.p493j0.p494o.p495c.p497p0.p520f.C12608b;
import kotlin.p493j0.p494o.p495c.p497p0.p520f.C12610d;
import kotlin.p493j0.p494o.p495c.p497p0.p523i.p529u.C12756d;
import kotlin.p493j0.p494o.p495c.p497p0.p523i.p529u.EnumC12757e;
import kotlin.p493j0.p494o.p495c.p497p0.p538l.InterfaceC12966b1;
import kotlin.p493j0.p494o.p495c.p497p0.p538l.p541l1.InterfaceC13073i;
import kotlin.p493j0.p494o.p495c.p497p0.p538l.p541l1.InterfaceC13077m;
/* compiled from: typeSignatureMapping.kt */
/* renamed from: kotlin.j0.o.c.p0.d.b.z */
/* loaded from: classes3.dex */
public final class C12468z {
    /* renamed from: a */
    public static final <T> T m8822a(InterfaceC12439k<T> interfaceC12439k, T t, boolean z) {
        l.f(interfaceC12439k, "<this>");
        l.f(t, "possiblyPrimitiveType");
        return z ? interfaceC12439k.mo8897d(t) : t;
    }

    /* renamed from: b */
    public static final <T> T m8821b(InterfaceC12966b1 interfaceC12966b1, InterfaceC13073i interfaceC13073i, InterfaceC12439k<T> interfaceC12439k, C12466y c12466y) {
        l.f(interfaceC12966b1, "<this>");
        l.f(interfaceC13073i, "type");
        l.f(interfaceC12439k, "typeFactory");
        l.f(c12466y, WalletTopUpActivity.EXTRA_MODE);
        InterfaceC13077m mo5946t = interfaceC12966b1.mo5946t(interfaceC13073i);
        if (interfaceC12966b1.mo5986P(mo5946t)) {
            EnumC12052i mo6061b0 = interfaceC12966b1.mo6061b0(mo5946t);
            boolean z = true;
            if (mo6061b0 != null) {
                T mo8895f = interfaceC12439k.mo8895f(mo6061b0);
                if (!interfaceC12966b1.mo5963i0(interfaceC13073i) && !C12359r.m9135b(interfaceC12966b1, interfaceC13073i)) {
                    z = false;
                }
                return (T) m8822a(interfaceC12439k, mo8895f, z);
            }
            EnumC12052i mo6058j = interfaceC12966b1.mo6058j(mo5946t);
            if (mo6058j != null) {
                return interfaceC12439k.mo8899b(l.m("[", EnumC12757e.m6827e(mo6058j).m6826g()));
            }
            if (interfaceC12966b1.mo6059g(mo5946t)) {
                C12610d mo6064D = interfaceC12966b1.mo6064D(mo5946t);
                C12608b m9766o = mo6064D == null ? null : C12080c.f26925a.m9766o(mo6064D);
                if (m9766o != null) {
                    if (!c12466y.m8829a()) {
                        List<C12080c.C12081a> m9771j = C12080c.f26925a.m9771j();
                        if (!(m9771j instanceof Collection) || !m9771j.isEmpty()) {
                            for (C12080c.C12081a c12081a : m9771j) {
                                if (l.b(c12081a.m9760d(), m9766o)) {
                                    break;
                                }
                            }
                        }
                        z = false;
                        if (z) {
                            return null;
                        }
                    }
                    String m6831f = C12756d.m6835b(m9766o).m6831f();
                    l.e(m6831f, "byClassId(classId).internalName");
                    return interfaceC12439k.mo8898c(m6831f);
                }
            }
            return null;
        }
        return null;
    }
}
