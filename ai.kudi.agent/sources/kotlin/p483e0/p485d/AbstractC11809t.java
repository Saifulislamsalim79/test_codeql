package kotlin.p483e0.p485d;

import kotlin.p493j0.InterfaceC11862a;
import kotlin.p493j0.InterfaceC11872i;
/* compiled from: PropertyReference.java */
/* renamed from: kotlin.e0.d.t */
/* loaded from: classes3.dex */
public abstract class AbstractC11809t extends AbstractC11783c implements InterfaceC11872i {
    public AbstractC11809t() {
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC11809t) {
            AbstractC11809t abstractC11809t = (AbstractC11809t) obj;
            return mo4698g().equals(abstractC11809t.mo4698g()) && mo4699b().equals(abstractC11809t.mo4699b()) && mo4697i().equals(abstractC11809t.mo4697i()) && l.b(m10332f(), abstractC11809t.m10332f());
        } else if (obj instanceof InterfaceC11872i) {
            return obj.equals(m10333c());
        } else {
            return false;
        }
    }

    public int hashCode() {
        return (((mo4698g().hashCode() * 31) + mo4699b().hashCode()) * 31) + mo4697i().hashCode();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlin.p483e0.p485d.AbstractC11783c
    /* renamed from: j */
    public InterfaceC11872i mo10319h() {
        return (InterfaceC11872i) super.mo10319h();
    }

    public String toString() {
        InterfaceC11862a m10333c = m10333c();
        if (m10333c != this) {
            return m10333c.toString();
        }
        return "property " + mo4699b() + " (Kotlin reflection is not available)";
    }

    public AbstractC11809t(Object obj, Class cls, String str, String str2, int i) {
        super(obj, cls, str, str2, (i & 1) == 1);
    }
}
