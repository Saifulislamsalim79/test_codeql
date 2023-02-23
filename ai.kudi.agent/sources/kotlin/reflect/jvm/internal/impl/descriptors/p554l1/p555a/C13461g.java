package kotlin.reflect.jvm.internal.impl.descriptors.p554l1.p555a;

import java.io.InputStream;
import kotlin.e0.d.l;
import kotlin.p493j0.p494o.p495c.p497p0.p498b.C12059k;
import kotlin.p493j0.p494o.p495c.p497p0.p503d.p504a.p511f0.InterfaceC12277g;
import kotlin.p493j0.p494o.p495c.p497p0.p503d.p513b.InterfaceC12442m;
import kotlin.p493j0.p494o.p495c.p497p0.p520f.C12608b;
import kotlin.p493j0.p494o.p495c.p497p0.p520f.C12609c;
import kotlin.p493j0.p494o.p495c.p497p0.p533j.p534b.p535c0.C12814a;
import kotlin.p493j0.p494o.p495c.p497p0.p533j.p534b.p535c0.C12819d;
/* compiled from: ReflectKotlinClassFinder.kt */
/* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.l1.a.g */
/* loaded from: classes3.dex */
public final class C13461g implements InterfaceC12442m {

    /* renamed from: a */
    private final ClassLoader f29817a;

    /* renamed from: b */
    private final C12819d f29818b;

    public C13461g(ClassLoader classLoader) {
        l.f(classLoader, "classLoader");
        this.f29817a = classLoader;
        this.f29818b = new C12819d();
    }

    /* renamed from: d */
    private final InterfaceC12442m.AbstractC12443a m4917d(String str) {
        C13459f m4921a;
        Class<?> m4927a = C13458e.m4927a(this.f29817a, str);
        if (m4927a == null || (m4921a = C13459f.f29814c.m4921a(m4927a)) == null) {
            return null;
        }
        return new InterfaceC12442m.AbstractC12443a.C12445b(m4921a, null, 2, null);
    }

    @Override // kotlin.p493j0.p494o.p495c.p497p0.p503d.p513b.InterfaceC12442m
    /* renamed from: a */
    public InterfaceC12442m.AbstractC12443a mo4920a(InterfaceC12277g interfaceC12277g) {
        l.f(interfaceC12277g, "javaClass");
        C12609c mo4850f = interfaceC12277g.mo4850f();
        String m7382b = mo4850f == null ? null : mo4850f.m7382b();
        if (m7382b == null) {
            return null;
        }
        return m4917d(m7382b);
    }

    @Override // kotlin.p493j0.p494o.p495c.p497p0.p533j.p534b.InterfaceC12904s
    /* renamed from: b */
    public InputStream mo4919b(C12609c c12609c) {
        l.f(c12609c, "packageFqName");
        if (c12609c.m7375i(C12059k.f26807j)) {
            return this.f29818b.m6697a(C12814a.f28728m.m6703n(c12609c));
        }
        return null;
    }

    @Override // kotlin.p493j0.p494o.p495c.p497p0.p503d.p513b.InterfaceC12442m
    /* renamed from: c */
    public InterfaceC12442m.AbstractC12443a mo4918c(C12608b c12608b) {
        String m4915b;
        l.f(c12608b, "classId");
        m4915b = C13462h.m4915b(c12608b);
        return m4917d(m4915b);
    }
}
