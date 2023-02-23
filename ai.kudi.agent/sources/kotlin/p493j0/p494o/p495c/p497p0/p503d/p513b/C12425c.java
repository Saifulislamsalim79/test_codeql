package kotlin.p493j0.p494o.p495c.p497p0.p503d.p513b;

import ai.kudi.agent.wallettopup.WalletTopUpActivity;
import kotlin.C13666w;
import kotlin.e0.d.l;
import kotlin.p483e0.p484c.InterfaceC11772q;
import kotlin.p493j0.p494o.p495c.p497p0.p498b.AbstractC12046h;
import kotlin.p493j0.p494o.p495c.p497p0.p498b.C12045g;
import kotlin.p493j0.p494o.p495c.p497p0.p498b.C12061l;
import kotlin.p493j0.p494o.p495c.p497p0.p520f.C12609c;
import kotlin.p493j0.p494o.p495c.p497p0.p520f.C12614f;
import kotlin.p493j0.p494o.p495c.p497p0.p520f.C12616h;
import kotlin.p493j0.p494o.p495c.p497p0.p523i.C12677f;
import kotlin.p493j0.p494o.p495c.p497p0.p538l.AbstractC12965b0;
import kotlin.p493j0.p494o.p495c.p497p0.p538l.C12956a0;
import kotlin.p493j0.p494o.p495c.p497p0.p538l.C12974c1;
import kotlin.p493j0.p494o.p495c.p497p0.p538l.C13118t;
import kotlin.p493j0.p494o.p495c.p497p0.p538l.C13126u;
import kotlin.p493j0.p494o.p495c.p497p0.p538l.EnumC13008h1;
import kotlin.p493j0.p494o.p495c.p497p0.p538l.InterfaceC13125t0;
import kotlin.p493j0.p494o.p495c.p497p0.p538l.InterfaceC13131v0;
import kotlin.p493j0.p494o.p495c.p497p0.p538l.p539j1.C13042r;
import kotlin.p493j0.p494o.p495c.p497p0.p538l.p542m1.C13090a;
import kotlin.p549l0.C13276s;
import kotlin.reflect.jvm.internal.impl.descriptors.EnumC13319f;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13293a;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13312e;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13320f0;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13334h;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13452l;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13513m;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13520p0;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13559y0;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13562z0;
import kotlin.reflect.jvm.internal.impl.utils.C13643d;
/* compiled from: descriptorBasedTypeSignatureMapping.kt */
/* renamed from: kotlin.j0.o.c.p0.d.b.c */
/* loaded from: classes3.dex */
public final class C12425c {
    /* renamed from: a */
    public static final String m8949a(InterfaceC13312e interfaceC13312e, InterfaceC12463w<?> interfaceC12463w) {
        String m5435z;
        l.f(interfaceC13312e, "klass");
        l.f(interfaceC12463w, "typeMappingConfiguration");
        String mo8836b = interfaceC12463w.mo8836b(interfaceC13312e);
        if (mo8836b == null) {
            InterfaceC13513m mo4687d = interfaceC13312e.mo4687d();
            l.e(mo4687d, "klass.containingDeclaration");
            String m7351g = C12616h.m7342c(interfaceC13312e.mo5012b()).m7351g();
            l.e(m7351g, "safeIdentifier(klass.name).identifier");
            if (mo4687d instanceof InterfaceC13320f0) {
                C12609c mo4954f = ((InterfaceC13320f0) mo4687d).mo4954f();
                if (mo4954f.m7380d()) {
                    return m7351g;
                }
                StringBuilder sb = new StringBuilder();
                String m7382b = mo4954f.m7382b();
                l.e(m7382b, "fqName.asString()");
                m5435z = C13276s.m5435z(m7382b, '.', '/', false, 4, null);
                sb.append(m5435z);
                sb.append('/');
                sb.append(m7351g);
                return sb.toString();
            }
            InterfaceC13312e interfaceC13312e2 = mo4687d instanceof InterfaceC13312e ? (InterfaceC13312e) mo4687d : null;
            if (interfaceC13312e2 != null) {
                String mo8834d = interfaceC12463w.mo8834d(interfaceC13312e2);
                if (mo8834d == null) {
                    mo8834d = m8949a(interfaceC13312e2, interfaceC12463w);
                }
                return mo8834d + '$' + m7351g;
            }
            throw new IllegalArgumentException("Unexpected container: " + mo4687d + " for " + interfaceC13312e);
        }
        return mo8836b;
    }

    /* renamed from: b */
    public static /* synthetic */ String m8948b(InterfaceC13312e interfaceC13312e, InterfaceC12463w interfaceC12463w, int i, Object obj) {
        if ((i & 2) != 0) {
            interfaceC12463w = C12465x.f27637a;
        }
        return m8949a(interfaceC13312e, interfaceC12463w);
    }

    /* renamed from: c */
    public static final boolean m8947c(InterfaceC13293a interfaceC13293a) {
        l.f(interfaceC13293a, "descriptor");
        if (interfaceC13293a instanceof InterfaceC13452l) {
            return true;
        }
        AbstractC12965b0 mo4943j = interfaceC13293a.mo4943j();
        l.d(mo4943j);
        if (AbstractC12046h.m9858z0(mo4943j)) {
            AbstractC12965b0 mo4943j2 = interfaceC13293a.mo4943j();
            l.d(mo4943j2);
            if (!C12974c1.m6290l(mo4943j2) && !(interfaceC13293a instanceof InterfaceC13520p0)) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v1, types: [T, java.lang.Object] */
    /* renamed from: d */
    public static final <T> T m8946d(AbstractC12965b0 abstractC12965b0, InterfaceC12439k<T> interfaceC12439k, C12466y c12466y, InterfaceC12463w<? extends T> interfaceC12463w, C12432h<T> c12432h, InterfaceC11772q<? super AbstractC12965b0, ? super T, ? super C12466y, C13666w> interfaceC11772q) {
        Object obj;
        AbstractC12965b0 abstractC12965b02;
        Object m8946d;
        l.f(abstractC12965b0, "kotlinType");
        l.f(interfaceC12439k, "factory");
        l.f(c12466y, WalletTopUpActivity.EXTRA_MODE);
        l.f(interfaceC12463w, "typeMappingConfiguration");
        l.f(interfaceC11772q, "writeGenericType");
        AbstractC12965b0 mo8833e = interfaceC12463w.mo8833e(abstractC12965b0);
        if (mo8833e == null) {
            if (C12045g.m9937o(abstractC12965b0)) {
                return (T) m8946d(C12061l.m9826b(abstractC12965b0, interfaceC12463w.mo8832f()), interfaceC12439k, c12466y, interfaceC12463w, c12432h, interfaceC11772q);
            }
            Object m8821b = C12468z.m8821b(C13042r.f29135a, abstractC12965b0, interfaceC12439k, c12466y);
            if (m8821b == null) {
                InterfaceC13125t0 mo5779W0 = abstractC12965b0.mo5779W0();
                if (mo5779W0 instanceof C12956a0) {
                    C12956a0 c12956a0 = (C12956a0) mo5779W0;
                    AbstractC12965b0 m6353i = c12956a0.m6353i();
                    if (m6353i == null) {
                        m6353i = interfaceC12463w.mo8835c(c12956a0.mo5218a());
                    }
                    return (T) m8946d(C13090a.m5888s(m6353i), interfaceC12439k, c12466y, interfaceC12463w, c12432h, interfaceC11772q);
                }
                InterfaceC13334h mo5206d = mo5779W0.mo5206d();
                if (mo5206d != null) {
                    if (C13118t.m5803r(mo5206d)) {
                        T t = (T) interfaceC12439k.mo8898c("error/NonExistentClass");
                        interfaceC12463w.mo8831g(abstractC12965b0, (InterfaceC13312e) mo5206d);
                        if (c12432h == null) {
                            return t;
                        }
                        c12432h.m8925c(t);
                        throw null;
                    }
                    boolean z = mo5206d instanceof InterfaceC13312e;
                    if (z && AbstractC12046h.m9904b0(abstractC12965b0)) {
                        if (abstractC12965b0.mo5780V0().size() == 1) {
                            InterfaceC13131v0 interfaceC13131v0 = abstractC12965b0.mo5780V0().get(0);
                            AbstractC12965b0 mo5758c = interfaceC13131v0.mo5758c();
                            l.e(mo5758c, "memberProjection.type");
                            if (interfaceC13131v0.mo5760a() == EnumC13008h1.IN_VARIANCE) {
                                m8946d = interfaceC12439k.mo8898c("java/lang/Object");
                                if (c12432h != null) {
                                    c12432h.m8926b();
                                    throw null;
                                }
                            } else if (c12432h == null) {
                                EnumC13008h1 mo5760a = interfaceC13131v0.mo5760a();
                                l.e(mo5760a, "memberProjection.projectionKind");
                                m8946d = m8946d(mo5758c, interfaceC12439k, c12466y.m8824f(mo5760a, true), interfaceC12463w, c12432h, interfaceC11772q);
                                if (c12432h != null) {
                                    c12432h.m8927a();
                                    throw null;
                                }
                            } else {
                                c12432h.m8926b();
                                throw null;
                            }
                            return (T) interfaceC12439k.mo8899b(l.m("[", interfaceC12439k.mo8900a(m8946d)));
                        }
                        throw new UnsupportedOperationException("arrays must have one type argument");
                    } else if (z) {
                        if (C12677f.m7005b(mo5206d) && !c12466y.m8827c() && (abstractC12965b02 = (AbstractC12965b0) C13126u.m5790a(C13042r.f29135a, abstractC12965b0)) != null) {
                            return (T) m8946d(abstractC12965b02, interfaceC12439k, c12466y.m8823g(), interfaceC12463w, c12432h, interfaceC11772q);
                        }
                        if (c12466y.m8825e() && AbstractC12046h.m9891i0((InterfaceC13312e) mo5206d)) {
                            obj = (Object) interfaceC12439k.mo8896e();
                        } else {
                            InterfaceC13312e interfaceC13312e = (InterfaceC13312e) mo5206d;
                            InterfaceC13312e mo4651a = interfaceC13312e.mo4651a();
                            l.e(mo4651a, "descriptor.original");
                            T mo8837a = interfaceC12463w.mo8837a(mo4651a);
                            if (mo8837a == null) {
                                if (interfaceC13312e.mo4957w() == EnumC13319f.ENUM_ENTRY) {
                                    interfaceC13312e = (InterfaceC13312e) interfaceC13312e.mo4687d();
                                }
                                InterfaceC13312e mo4651a2 = interfaceC13312e.mo4651a();
                                l.e(mo4651a2, "enumClassIfEnumEntry.original");
                                obj = (Object) interfaceC12439k.mo8898c(m8949a(mo4651a2, interfaceC12463w));
                            } else {
                                obj = (Object) mo8837a;
                            }
                        }
                        interfaceC11772q.invoke(abstractC12965b0, obj, c12466y);
                        return (T) obj;
                    } else if (mo5206d instanceof InterfaceC13562z0) {
                        T t2 = (T) m8946d(C13090a.m5898i((InterfaceC13562z0) mo5206d), interfaceC12439k, c12466y, interfaceC12463w, null, C13643d.m4265b());
                        if (c12432h == null) {
                            return t2;
                        }
                        C12614f mo5012b = mo5206d.mo5012b();
                        l.e(mo5012b, "descriptor.getName()");
                        c12432h.m8924d(mo5012b, t2);
                        throw null;
                    } else if ((mo5206d instanceof InterfaceC13559y0) && c12466y.m8828b()) {
                        return (T) m8946d(((InterfaceC13559y0) mo5206d).mo4657e0(), interfaceC12439k, c12466y, interfaceC12463w, c12432h, interfaceC11772q);
                    } else {
                        throw new UnsupportedOperationException(l.m("Unknown type ", abstractC12965b0));
                    }
                }
                throw new UnsupportedOperationException(l.m("no descriptor for type constructor of ", abstractC12965b0));
            }
            ?? r10 = (Object) C12468z.m8822a(interfaceC12439k, m8821b, c12466y.m8826d());
            interfaceC11772q.invoke(abstractC12965b0, r10, c12466y);
            return r10;
        }
        return (T) m8946d(mo8833e, interfaceC12439k, c12466y, interfaceC12463w, c12432h, interfaceC11772q);
    }

    /* renamed from: e */
    public static /* synthetic */ Object m8945e(AbstractC12965b0 abstractC12965b0, InterfaceC12439k interfaceC12439k, C12466y c12466y, InterfaceC12463w interfaceC12463w, C12432h c12432h, InterfaceC11772q interfaceC11772q, int i, Object obj) {
        if ((i & 32) != 0) {
            interfaceC11772q = C13643d.m4265b();
        }
        return m8946d(abstractC12965b0, interfaceC12439k, c12466y, interfaceC12463w, c12432h, interfaceC11772q);
    }
}
