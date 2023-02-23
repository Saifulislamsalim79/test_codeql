package kotlin.p493j0.p494o.p495c.p497p0.p498b.p500q;

import java.io.InputStream;
import java.util.List;
import kotlin.e0.d.l;
import kotlin.p493j0.p494o.p495c.p497p0.p498b.p499p.C12065a;
import kotlin.p493j0.p494o.p495c.p497p0.p501c.p502b.InterfaceC12113c;
import kotlin.p493j0.p494o.p495c.p497p0.p503d.p513b.InterfaceC12442m;
import kotlin.p493j0.p494o.p495c.p497p0.p520f.C12609c;
import kotlin.p493j0.p494o.p495c.p497p0.p523i.p530v.InterfaceC12760a;
import kotlin.p493j0.p494o.p495c.p497p0.p533j.p534b.AbstractC12802a;
import kotlin.p493j0.p494o.p495c.p497p0.p533j.p534b.AbstractC12895n;
import kotlin.p493j0.p494o.p495c.p497p0.p533j.p534b.C12820d;
import kotlin.p493j0.p494o.p495c.p497p0.p533j.p534b.C12889j;
import kotlin.p493j0.p494o.p495c.p497p0.p533j.p534b.C12894m;
import kotlin.p493j0.p494o.p495c.p497p0.p533j.p534b.InterfaceC12886i;
import kotlin.p493j0.p494o.p495c.p497p0.p533j.p534b.InterfaceC12890k;
import kotlin.p493j0.p494o.p495c.p497p0.p533j.p534b.InterfaceC12899p;
import kotlin.p493j0.p494o.p495c.p497p0.p533j.p534b.InterfaceC12901q;
import kotlin.p493j0.p494o.p495c.p497p0.p533j.p534b.InterfaceC12905t;
import kotlin.p493j0.p494o.p495c.p497p0.p533j.p534b.p535c0.C12814a;
import kotlin.p493j0.p494o.p495c.p497p0.p533j.p534b.p535c0.C12817c;
import kotlin.p493j0.p494o.p495c.p497p0.p537k.InterfaceC12954n;
import kotlin.p493j0.p494o.p495c.p497p0.p538l.p539j1.InterfaceC13036m;
import kotlin.p557z.C13726r;
import kotlin.reflect.jvm.internal.impl.descriptors.C13313e0;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13305c0;
import kotlin.reflect.jvm.internal.impl.descriptors.p551i1.InterfaceC13362a;
import kotlin.reflect.jvm.internal.impl.descriptors.p551i1.InterfaceC13365c;
/* compiled from: JvmBuiltInsPackageFragmentProvider.kt */
/* renamed from: kotlin.j0.o.c.p0.b.q.h */
/* loaded from: classes3.dex */
public final class C12107h extends AbstractC12802a {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C12107h(InterfaceC12954n interfaceC12954n, InterfaceC12442m interfaceC12442m, InterfaceC13305c0 interfaceC13305c0, C13313e0 c13313e0, InterfaceC13362a interfaceC13362a, InterfaceC13365c interfaceC13365c, InterfaceC12890k interfaceC12890k, InterfaceC13036m interfaceC13036m, InterfaceC12760a interfaceC12760a) {
        super(interfaceC12954n, interfaceC12442m, interfaceC13305c0);
        List m3888h;
        l.f(interfaceC12954n, "storageManager");
        l.f(interfaceC12442m, "finder");
        l.f(interfaceC13305c0, "moduleDescriptor");
        l.f(c13313e0, "notFoundClasses");
        l.f(interfaceC13362a, "additionalClassPartsProvider");
        l.f(interfaceC13365c, "platformDependentDeclarationFilter");
        l.f(interfaceC12890k, "deserializationConfiguration");
        l.f(interfaceC13036m, "kotlinTypeChecker");
        l.f(interfaceC12760a, "samConversionResolver");
        C12894m c12894m = new C12894m(this);
        C12820d c12820d = new C12820d(interfaceC13305c0, c13313e0, C12814a.f28728m);
        InterfaceC12905t.C12906a c12906a = InterfaceC12905t.C12906a.f28937a;
        InterfaceC12899p interfaceC12899p = InterfaceC12899p.f28931a;
        l.e(interfaceC12899p, "DO_NOTHING");
        InterfaceC12113c.C12114a c12114a = InterfaceC12113c.C12114a.f27002a;
        InterfaceC12901q.C12902a c12902a = InterfaceC12901q.C12902a.f28932a;
        m3888h = C13726r.m3888h(new C12065a(interfaceC12954n, interfaceC13305c0), new C12083e(interfaceC12954n, interfaceC13305c0, null, 4, null));
        m6732i(new C12889j(interfaceC12954n, interfaceC13305c0, interfaceC12890k, c12894m, c12820d, this, c12906a, interfaceC12899p, c12114a, c12902a, m3888h, c13313e0, InterfaceC12886i.f28890a.m6513a(), interfaceC13362a, interfaceC13365c, C12814a.f28728m.m6745e(), interfaceC13036m, interfaceC12760a, null, 262144, null));
    }

    @Override // kotlin.p493j0.p494o.p495c.p497p0.p533j.p534b.AbstractC12802a
    /* renamed from: d */
    protected AbstractC12895n mo6737d(C12609c c12609c) {
        l.f(c12609c, "fqName");
        InputStream mo4919b = m6735f().mo4919b(c12609c);
        if (mo4919b == null) {
            return null;
        }
        return C12817c.f28730D.m6698a(c12609c, m6733h(), m6734g(), mo4919b, false);
    }
}
