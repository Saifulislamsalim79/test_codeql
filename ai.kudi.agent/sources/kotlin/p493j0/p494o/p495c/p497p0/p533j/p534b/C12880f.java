package kotlin.p493j0.p494o.p495c.p497p0.p533j.p534b;

import kotlin.e0.d.l;
import kotlin.p493j0.p494o.p495c.p497p0.p515e.C12509c;
import kotlin.p493j0.p494o.p495c.p497p0.p515e.p519z.AbstractC12587a;
import kotlin.p493j0.p494o.p495c.p497p0.p515e.p519z.InterfaceC12593c;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13545u0;
/* compiled from: ClassData.kt */
/* renamed from: kotlin.j0.o.c.p0.j.b.f */
/* loaded from: classes3.dex */
public final class C12880f {

    /* renamed from: a */
    private final InterfaceC12593c f28879a;

    /* renamed from: b */
    private final C12509c f28880b;

    /* renamed from: c */
    private final AbstractC12587a f28881c;

    /* renamed from: d */
    private final InterfaceC13545u0 f28882d;

    public C12880f(InterfaceC12593c interfaceC12593c, C12509c c12509c, AbstractC12587a abstractC12587a, InterfaceC13545u0 interfaceC13545u0) {
        l.f(interfaceC12593c, "nameResolver");
        l.f(c12509c, "classProto");
        l.f(abstractC12587a, "metadataVersion");
        l.f(interfaceC13545u0, "sourceElement");
        this.f28879a = interfaceC12593c;
        this.f28880b = c12509c;
        this.f28881c = abstractC12587a;
        this.f28882d = interfaceC13545u0;
    }

    /* renamed from: a */
    public final InterfaceC12593c m6526a() {
        return this.f28879a;
    }

    /* renamed from: b */
    public final C12509c m6525b() {
        return this.f28880b;
    }

    /* renamed from: c */
    public final AbstractC12587a m6524c() {
        return this.f28881c;
    }

    /* renamed from: d */
    public final InterfaceC13545u0 m6523d() {
        return this.f28882d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C12880f) {
            C12880f c12880f = (C12880f) obj;
            return l.b(this.f28879a, c12880f.f28879a) && l.b(this.f28880b, c12880f.f28880b) && l.b(this.f28881c, c12880f.f28881c) && l.b(this.f28882d, c12880f.f28882d);
        }
        return false;
    }

    public int hashCode() {
        return (((((this.f28879a.hashCode() * 31) + this.f28880b.hashCode()) * 31) + this.f28881c.hashCode()) * 31) + this.f28882d.hashCode();
    }

    public String toString() {
        return "ClassData(nameResolver=" + this.f28879a + ", classProto=" + this.f28880b + ", metadataVersion=" + this.f28881c + ", sourceElement=" + this.f28882d + ')';
    }
}
