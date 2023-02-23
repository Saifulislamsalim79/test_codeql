package kotlin.p483e0.p485d;

import kotlin.p493j0.InterfaceC11862a;
import kotlin.p493j0.InterfaceC11866e;
/* compiled from: FunctionReference.java */
/* renamed from: kotlin.e0.d.i */
/* loaded from: classes3.dex */
public class C11799i extends AbstractC11783c implements InterfaceC11798h, InterfaceC11866e {

    /* renamed from: A */
    private final int f26494A;

    /* renamed from: z */
    private final int f26495z;

    public C11799i(int i) {
        this(i, AbstractC11783c.f26476y, null, null, null, 0);
    }

    @Override // kotlin.p483e0.p485d.AbstractC11783c
    /* renamed from: e */
    protected InterfaceC11862a mo10320e() {
        return C11813x.m10317a(this);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C11799i) {
            C11799i c11799i = (C11799i) obj;
            return l.b(mo4698g(), c11799i.mo4698g()) && mo4699b().equals(c11799i.mo4699b()) && mo4697i().equals(c11799i.mo4697i()) && this.f26494A == c11799i.f26494A && this.f26495z == c11799i.f26495z && l.b(m10332f(), c11799i.m10332f());
        } else if (obj instanceof InterfaceC11866e) {
            return obj.equals(m10333c());
        } else {
            return false;
        }
    }

    @Override // kotlin.p483e0.p485d.InterfaceC11798h
    public int getArity() {
        return this.f26495z;
    }

    public int hashCode() {
        return (((mo4698g() == null ? 0 : mo4698g().hashCode() * 31) + mo4699b().hashCode()) * 31) + mo4697i().hashCode();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlin.p483e0.p485d.AbstractC11783c
    /* renamed from: j */
    public InterfaceC11866e mo10319h() {
        return (InterfaceC11866e) super.mo10319h();
    }

    public String toString() {
        InterfaceC11862a m10333c = m10333c();
        if (m10333c != this) {
            return m10333c.toString();
        }
        if ("<init>".equals(mo4699b())) {
            return "constructor (Kotlin reflection is not available)";
        }
        return "function " + mo4699b() + " (Kotlin reflection is not available)";
    }

    public C11799i(int i, Object obj) {
        this(i, obj, null, null, null, 0);
    }

    public C11799i(int i, Object obj, Class cls, String str, String str2, int i2) {
        super(obj, cls, str, str2, (i2 & 1) == 1);
        this.f26495z = i;
        this.f26494A = i2 >> 1;
    }
}
