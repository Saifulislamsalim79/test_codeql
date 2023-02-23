package kotlin.p493j0.p494o.p495c.p497p0.p538l;
/* compiled from: TypeProjectionBase.java */
/* renamed from: kotlin.j0.o.c.p0.l.w0 */
/* loaded from: classes3.dex */
public abstract class AbstractC13133w0 implements InterfaceC13131v0 {
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof InterfaceC13131v0) {
            InterfaceC13131v0 interfaceC13131v0 = (InterfaceC13131v0) obj;
            return mo5757d() == interfaceC13131v0.mo5757d() && mo5760a() == interfaceC13131v0.mo5760a() && mo5758c().equals(interfaceC13131v0.mo5758c());
        }
        return false;
    }

    public int hashCode() {
        int hashCode = mo5760a().hashCode();
        if (C12974c1.m6280v(mo5758c())) {
            return (hashCode * 31) + 19;
        }
        return (hashCode * 31) + (mo5757d() ? 17 : mo5758c().hashCode());
    }

    public String toString() {
        if (mo5757d()) {
            return "*";
        }
        if (mo5760a() == EnumC13008h1.INVARIANT) {
            return mo5758c().toString();
        }
        return mo5760a() + " " + mo5758c();
    }
}
