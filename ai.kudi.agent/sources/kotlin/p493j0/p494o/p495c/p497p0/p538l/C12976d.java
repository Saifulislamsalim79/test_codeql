package kotlin.p493j0.p494o.p495c.p497p0.p538l;

import kotlin.e0.d.l;
import kotlin.p493j0.p494o.p495c.p497p0.p538l.p541l1.InterfaceC13071g;
import kotlin.p493j0.p494o.p495c.p497p0.p538l.p541l1.InterfaceC13073i;
import kotlin.p493j0.p494o.p495c.p497p0.p538l.p541l1.InterfaceC13074j;
import kotlin.p493j0.p494o.p495c.p497p0.p538l.p541l1.InterfaceC13076l;
import kotlin.p493j0.p494o.p495c.p497p0.p538l.p541l1.InterfaceC13079o;
/* compiled from: AbstractStrictEqualityTypeChecker.kt */
/* renamed from: kotlin.j0.o.c.p0.l.d */
/* loaded from: classes3.dex */
public final class C12976d {

    /* renamed from: a */
    public static final C12976d f29044a = new C12976d();

    private C12976d() {
    }

    /* renamed from: a */
    private final boolean m6277a(InterfaceC13079o interfaceC13079o, InterfaceC13074j interfaceC13074j, InterfaceC13074j interfaceC13074j2) {
        int mo5966h;
        if (interfaceC13079o.mo5966h(interfaceC13074j) == interfaceC13079o.mo5966h(interfaceC13074j2) && interfaceC13079o.mo5985Q(interfaceC13074j) == interfaceC13079o.mo5985Q(interfaceC13074j2)) {
            if ((interfaceC13079o.mo5959l0(interfaceC13074j) == null) == (interfaceC13079o.mo5959l0(interfaceC13074j2) == null) && interfaceC13079o.mo5948r0(interfaceC13079o.mo5975b(interfaceC13074j), interfaceC13079o.mo5975b(interfaceC13074j2))) {
                if (!interfaceC13079o.mo5910m0(interfaceC13074j, interfaceC13074j2) && (mo5966h = interfaceC13079o.mo5966h(interfaceC13074j)) > 0) {
                    int i = 0;
                    while (true) {
                        int i2 = i + 1;
                        InterfaceC13076l mo5978Z = interfaceC13079o.mo5978Z(interfaceC13074j, i);
                        InterfaceC13076l mo5978Z2 = interfaceC13079o.mo5978Z(interfaceC13074j2, i);
                        if (interfaceC13079o.mo5997E(mo5978Z) != interfaceC13079o.mo5997E(mo5978Z2)) {
                            return false;
                        }
                        if (!interfaceC13079o.mo5997E(mo5978Z) && (interfaceC13079o.mo5973c0(mo5978Z) != interfaceC13079o.mo5973c0(mo5978Z2) || !m6275c(interfaceC13079o, interfaceC13079o.mo5952p0(mo5978Z), interfaceC13079o.mo5952p0(mo5978Z2)))) {
                            return false;
                        }
                        if (i2 >= mo5966h) {
                            break;
                        }
                        i = i2;
                    }
                }
                return true;
            }
        }
        return false;
    }

    /* renamed from: c */
    private final boolean m6275c(InterfaceC13079o interfaceC13079o, InterfaceC13073i interfaceC13073i, InterfaceC13073i interfaceC13073i2) {
        if (interfaceC13073i == interfaceC13073i2) {
            return true;
        }
        InterfaceC13074j mo5977a = interfaceC13079o.mo5977a(interfaceC13073i);
        InterfaceC13074j mo5977a2 = interfaceC13079o.mo5977a(interfaceC13073i2);
        if (mo5977a != null && mo5977a2 != null) {
            return m6277a(interfaceC13079o, mo5977a, mo5977a2);
        }
        InterfaceC13071g mo5996F = interfaceC13079o.mo5996F(interfaceC13073i);
        InterfaceC13071g mo5996F2 = interfaceC13079o.mo5996F(interfaceC13073i2);
        return mo5996F != null && mo5996F2 != null && m6277a(interfaceC13079o, interfaceC13079o.mo5970e(mo5996F), interfaceC13079o.mo5970e(mo5996F2)) && m6277a(interfaceC13079o, interfaceC13079o.mo5972d(mo5996F), interfaceC13079o.mo5972d(mo5996F2));
    }

    /* renamed from: b */
    public final boolean m6276b(InterfaceC13079o interfaceC13079o, InterfaceC13073i interfaceC13073i, InterfaceC13073i interfaceC13073i2) {
        l.f(interfaceC13079o, "context");
        l.f(interfaceC13073i, "a");
        l.f(interfaceC13073i2, "b");
        return m6275c(interfaceC13079o, interfaceC13073i, interfaceC13073i2);
    }
}
