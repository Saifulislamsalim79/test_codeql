package kotlin.p493j0.p494o.p495c.p497p0.p515e.p516a0.p517b;

import ai.kudi.agent.dashboard.domain.model.TransactionBreakDownItemType;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import kotlin.C13287o;
import kotlin.e0.d.l;
import kotlin.p493j0.p494o.p495c.p497p0.p515e.C12509c;
import kotlin.p493j0.p494o.p495c.p497p0.p515e.C12513d;
import kotlin.p493j0.p494o.p495c.p497p0.p515e.C12531i;
import kotlin.p493j0.p494o.p495c.p497p0.p515e.C12536l;
import kotlin.p493j0.p494o.p495c.p497p0.p515e.C12542n;
import kotlin.p493j0.p494o.p495c.p497p0.p515e.C12555q;
import kotlin.p493j0.p494o.p495c.p497p0.p515e.C12572u;
import kotlin.p493j0.p494o.p495c.p497p0.p515e.p516a0.C12470a;
import kotlin.p493j0.p494o.p495c.p497p0.p515e.p516a0.p517b.AbstractC12491d;
import kotlin.p493j0.p494o.p495c.p497p0.p515e.p519z.C12588b;
import kotlin.p493j0.p494o.p495c.p497p0.p515e.p519z.C12596e;
import kotlin.p493j0.p494o.p495c.p497p0.p515e.p519z.C12597f;
import kotlin.p493j0.p494o.p495c.p497p0.p515e.p519z.C12598g;
import kotlin.p493j0.p494o.p495c.p497p0.p515e.p519z.InterfaceC12593c;
import kotlin.p557z.C13726r;
import kotlin.p557z.C13728s;
import kotlin.p557z.C13742z;
import kotlin.reflect.jvm.internal.impl.protobuf.AbstractC13580h;
import kotlin.reflect.jvm.internal.impl.protobuf.C13575f;
/* compiled from: JvmProtoBufUtil.kt */
/* renamed from: kotlin.j0.o.c.p0.e.a0.b.g */
/* loaded from: classes3.dex */
public final class C12497g {

    /* renamed from: a */
    public static final C12497g f27759a = new C12497g();

    /* renamed from: b */
    private static final C13575f f27760b;

    static {
        C13575f m4476d = C13575f.m4476d();
        C12470a.m8820a(m4476d);
        l.e(m4476d, "newInstance().apply(JvmProtoBuf::registerAllExtensions)");
        f27760b = m4476d;
    }

    private C12497g() {
    }

    /* renamed from: d */
    public static /* synthetic */ AbstractC12491d.C12492a m8637d(C12497g c12497g, C12542n c12542n, InterfaceC12593c interfaceC12593c, C12598g c12598g, boolean z, int i, Object obj) {
        if ((i & 8) != 0) {
            z = true;
        }
        return c12497g.m8638c(c12542n, interfaceC12593c, c12598g, z);
    }

    /* renamed from: f */
    public static final boolean m8635f(C12542n c12542n) {
        l.f(c12542n, "proto");
        C12588b.C12590b m8648a = C12490c.f27743a.m8648a();
        Object m4428u = c12542n.m4428u(C12470a.f27656e);
        l.e(m4428u, "proto.getExtension(JvmProtoBuf.flags)");
        Boolean mo7435d = m8648a.mo7435d(((Number) m4428u).intValue());
        l.e(mo7435d, "JvmFlags.IS_MOVED_FROM_INTERFACE_COMPANION.get(proto.getExtension(JvmProtoBuf.flags))");
        return mo7435d.booleanValue();
    }

    /* renamed from: g */
    private final String m8634g(C12555q c12555q, InterfaceC12593c interfaceC12593c) {
        if (c12555q.m7803m0()) {
            C12489b c12489b = C12489b.f27740a;
            return C12489b.m8649b(interfaceC12593c.mo7433a(c12555q.m7818X()));
        }
        return null;
    }

    /* renamed from: h */
    public static final C13287o<C12495f, C12509c> m8633h(byte[] bArr, String[] strArr) {
        l.f(bArr, "bytes");
        l.f(strArr, "strings");
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
        return new C13287o<>(f27759a.m8630k(byteArrayInputStream, strArr), C12509c.m8438c1(byteArrayInputStream, f27760b));
    }

    /* renamed from: i */
    public static final C13287o<C12495f, C12509c> m8632i(String[] strArr, String[] strArr2) {
        l.f(strArr, TransactionBreakDownItemType.DATA);
        l.f(strArr2, "strings");
        byte[] m8652e = C12488a.m8652e(strArr);
        l.e(m8652e, "decodeBytes(data)");
        return m8633h(m8652e, strArr2);
    }

    /* renamed from: j */
    public static final C13287o<C12495f, C12531i> m8631j(String[] strArr, String[] strArr2) {
        l.f(strArr, TransactionBreakDownItemType.DATA);
        l.f(strArr2, "strings");
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(C12488a.m8652e(strArr));
        return new C13287o<>(f27759a.m8630k(byteArrayInputStream, strArr2), C12531i.m8136x0(byteArrayInputStream, f27760b));
    }

    /* renamed from: k */
    private final C12495f m8630k(InputStream inputStream, String[] strArr) {
        C12470a.C12481e m8726E = C12470a.C12481e.m8726E(inputStream, f27760b);
        l.e(m8726E, "parseDelimitedFrom(this, EXTENSION_REGISTRY)");
        return new C12495f(m8726E, strArr);
    }

    /* renamed from: l */
    public static final C13287o<C12495f, C12536l> m8629l(byte[] bArr, String[] strArr) {
        l.f(bArr, "bytes");
        l.f(strArr, "strings");
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
        return new C13287o<>(f27759a.m8630k(byteArrayInputStream, strArr), C12536l.m8070e0(byteArrayInputStream, f27760b));
    }

    /* renamed from: m */
    public static final C13287o<C12495f, C12536l> m8628m(String[] strArr, String[] strArr2) {
        l.f(strArr, TransactionBreakDownItemType.DATA);
        l.f(strArr2, "strings");
        byte[] m8652e = C12488a.m8652e(strArr);
        l.e(m8652e, "decodeBytes(data)");
        return m8629l(m8652e, strArr2);
    }

    /* renamed from: a */
    public final C13575f m8640a() {
        return f27760b;
    }

    /* renamed from: b */
    public final AbstractC12491d.C12493b m8639b(C12513d c12513d, InterfaceC12593c interfaceC12593c, C12598g c12598g) {
        int m3867o;
        String m3797a0;
        l.f(c12513d, "proto");
        l.f(interfaceC12593c, "nameResolver");
        l.f(c12598g, "typeTable");
        AbstractC13580h.C13587f<C12513d, C12470a.C12475c> c13587f = C12470a.f27652a;
        l.e(c13587f, "constructorSignature");
        C12470a.C12475c c12475c = (C12470a.C12475c) C12596e.m7430a(c12513d, c13587f);
        String string = (c12475c == null || !c12475c.m8792A()) ? "<init>" : interfaceC12593c.getString(c12475c.m8779y());
        if (c12475c != null && c12475c.m8778z()) {
            m3797a0 = interfaceC12593c.getString(c12475c.m8780x());
        } else {
            List<C12572u> m8353M = c12513d.m8353M();
            l.e(m8353M, "proto.valueParameterList");
            m3867o = C13728s.m3867o(m8353M, 10);
            ArrayList arrayList = new ArrayList(m3867o);
            for (C12572u c12572u : m8353M) {
                C12497g c12497g = f27759a;
                l.e(c12572u, "it");
                String m8634g = c12497g.m8634g(C12597f.m7416m(c12572u, c12598g), interfaceC12593c);
                if (m8634g == null) {
                    return null;
                }
                arrayList.add(m8634g);
            }
            m3797a0 = C13742z.m3797a0(arrayList, "", "(", ")V", 0, null, null, 56, null);
        }
        return new AbstractC12491d.C12493b(string, m3797a0);
    }

    /* renamed from: c */
    public final AbstractC12491d.C12492a m8638c(C12542n c12542n, InterfaceC12593c interfaceC12593c, C12598g c12598g, boolean z) {
        String m8634g;
        l.f(c12542n, "proto");
        l.f(interfaceC12593c, "nameResolver");
        l.f(c12598g, "typeTable");
        AbstractC13580h.C13587f<C12542n, C12470a.C12478d> c13587f = C12470a.f27655d;
        l.e(c13587f, "propertySignature");
        C12470a.C12478d c12478d = (C12470a.C12478d) C12596e.m7430a(c12542n, c13587f);
        if (c12478d == null) {
            return null;
        }
        C12470a.C12472b m8745z = c12478d.m8762D() ? c12478d.m8745z() : null;
        if (m8745z == null && z) {
            return null;
        }
        int m7981U = (m8745z == null || !m8745z.m8819A()) ? c12542n.m7981U() : m8745z.m8806y();
        if (m8745z == null || !m8745z.m8805z()) {
            m8634g = m8634g(C12597f.m7419j(c12542n, c12598g), interfaceC12593c);
            if (m8634g == null) {
                return null;
            }
        } else {
            m8634g = interfaceC12593c.getString(m8745z.m8807x());
        }
        return new AbstractC12491d.C12492a(interfaceC12593c.getString(m7981U), m8634g);
    }

    /* renamed from: e */
    public final AbstractC12491d.C12493b m8636e(C12531i c12531i, InterfaceC12593c interfaceC12593c, C12598g c12598g) {
        List m3887i;
        int m3867o;
        List<C12555q> m3784n0;
        int m3867o2;
        String m3797a0;
        String m;
        l.f(c12531i, "proto");
        l.f(interfaceC12593c, "nameResolver");
        l.f(c12598g, "typeTable");
        AbstractC13580h.C13587f<C12531i, C12470a.C12475c> c13587f = C12470a.f27653b;
        l.e(c13587f, "methodSignature");
        C12470a.C12475c c12475c = (C12470a.C12475c) C12596e.m7430a(c12531i, c13587f);
        int m8163W = (c12475c == null || !c12475c.m8792A()) ? c12531i.m8163W() : c12475c.m8779y();
        if (c12475c != null && c12475c.m8778z()) {
            m = interfaceC12593c.getString(c12475c.m8780x());
        } else {
            m3887i = C13726r.m3887i(C12597f.m7422g(c12531i, c12598g));
            List<C12572u> m8151i0 = c12531i.m8151i0();
            l.e(m8151i0, "proto.valueParameterList");
            m3867o = C13728s.m3867o(m8151i0, 10);
            ArrayList arrayList = new ArrayList(m3867o);
            for (C12572u c12572u : m8151i0) {
                l.e(c12572u, "it");
                arrayList.add(C12597f.m7416m(c12572u, c12598g));
            }
            m3784n0 = C13742z.m3784n0(m3887i, arrayList);
            m3867o2 = C13728s.m3867o(m3784n0, 10);
            ArrayList arrayList2 = new ArrayList(m3867o2);
            for (C12555q c12555q : m3784n0) {
                String m8634g = f27759a.m8634g(c12555q, interfaceC12593c);
                if (m8634g == null) {
                    return null;
                }
                arrayList2.add(m8634g);
            }
            String m8634g2 = m8634g(C12597f.m7420i(c12531i, c12598g), interfaceC12593c);
            if (m8634g2 == null) {
                return null;
            }
            m3797a0 = C13742z.m3797a0(arrayList2, "", "(", ")", 0, null, null, 56, null);
            m = l.m(m3797a0, m8634g2);
        }
        return new AbstractC12491d.C12493b(interfaceC12593c.getString(m8163W), m);
    }
}
