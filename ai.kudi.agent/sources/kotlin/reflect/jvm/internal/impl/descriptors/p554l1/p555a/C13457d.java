package kotlin.reflect.jvm.internal.impl.descriptors.p554l1.p555a;

import ai.kudi.agent.transactions.domain.dto.TransactionRequest;
import java.util.Set;
import kotlin.e0.d.l;
import kotlin.p493j0.p494o.p495c.p497p0.p503d.p504a.InterfaceC12373o;
import kotlin.p493j0.p494o.p495c.p497p0.p503d.p504a.p511f0.InterfaceC12277g;
import kotlin.p493j0.p494o.p495c.p497p0.p503d.p504a.p511f0.InterfaceC12292u;
import kotlin.p493j0.p494o.p495c.p497p0.p520f.C12608b;
import kotlin.p493j0.p494o.p495c.p497p0.p520f.C12609c;
import kotlin.p549l0.C13276s;
import kotlin.reflect.jvm.internal.impl.descriptors.p554l1.p556b.C13486j;
import kotlin.reflect.jvm.internal.impl.descriptors.p554l1.p556b.C13506u;
/* compiled from: ReflectJavaClassFinder.kt */
/* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.l1.a.d */
/* loaded from: classes3.dex */
public final class C13457d implements InterfaceC12373o {

    /* renamed from: a */
    private final ClassLoader f29813a;

    public C13457d(ClassLoader classLoader) {
        l.f(classLoader, "classLoader");
        this.f29813a = classLoader;
    }

    @Override // kotlin.p493j0.p494o.p495c.p497p0.p503d.p504a.InterfaceC12373o
    /* renamed from: a */
    public InterfaceC12277g mo4930a(InterfaceC12373o.C12374a c12374a) {
        String m5435z;
        l.f(c12374a, TransactionRequest.TYPE_REQUEST);
        C12608b m9104a = c12374a.m9104a();
        C12609c m7389h = m9104a.m7389h();
        l.e(m7389h, "classId.packageFqName");
        String m7382b = m9104a.m7388i().m7382b();
        l.e(m7382b, "classId.relativeClassName.asString()");
        m5435z = C13276s.m5435z(m7382b, '.', '$', false, 4, null);
        if (!m7389h.m7380d()) {
            m5435z = m7389h.m7382b() + '.' + m5435z;
        }
        Class<?> m4927a = C13458e.m4927a(this.f29813a, m5435z);
        if (m4927a != null) {
            return new C13486j(m4927a);
        }
        return null;
    }

    @Override // kotlin.p493j0.p494o.p495c.p497p0.p503d.p504a.InterfaceC12373o
    /* renamed from: b */
    public InterfaceC12292u mo4929b(C12609c c12609c) {
        l.f(c12609c, "fqName");
        return new C13506u(c12609c);
    }

    @Override // kotlin.p493j0.p494o.p495c.p497p0.p503d.p504a.InterfaceC12373o
    /* renamed from: c */
    public Set<String> mo4928c(C12609c c12609c) {
        l.f(c12609c, "packageFqName");
        return null;
    }
}
