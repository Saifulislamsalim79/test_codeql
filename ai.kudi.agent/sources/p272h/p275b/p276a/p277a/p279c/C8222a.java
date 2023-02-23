package p272h.p275b.p276a.p277a.p279c;

import java.io.InputStream;
import java.util.zip.GZIPInputStream;
import java.util.zip.InflaterInputStream;
import kotlin.e0.d.l;
import kotlin.p483e0.p484c.InterfaceC11771p;
import kotlin.p483e0.p485d.AbstractC11802m;
import kotlin.p549l0.C13277t;
/* compiled from: DecodeStream.kt */
/* renamed from: h.b.a.a.c.a */
/* loaded from: classes2.dex */
public final class C8222a {

    /* renamed from: a */
    private static final InterfaceC11771p<InputStream, String, InputStream> f19789a = C8223a.f19790c;

    /* compiled from: DecodeStream.kt */
    /* renamed from: h.b.a.a.c.a$a */
    /* loaded from: classes2.dex */
    static final class C8223a extends AbstractC11802m implements InterfaceC11771p {

        /* renamed from: c */
        public static final C8223a f19790c = new C8223a();

        C8223a() {
            super(2);
        }

        /* renamed from: a */
        public final Void m16461a(InputStream inputStream, String str) {
            l.g(inputStream, "<anonymous parameter 0>");
            l.g(str, "encoding");
            throw new UnsupportedOperationException("Decoding " + str + " is not supported. Expected one of gzip, deflate, identity.");
        }

        @Override // kotlin.p483e0.p484c.InterfaceC11771p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            m16461a((InputStream) obj, (String) obj2);
            throw null;
        }
    }

    /* renamed from: a */
    public static final InputStream m16465a(InputStream inputStream, Iterable<String> iterable, InterfaceC11771p<? super InputStream, ? super String, ? extends InputStream> interfaceC11771p) {
        l.g(inputStream, "$this$decode");
        l.g(iterable, "encodings");
        l.g(interfaceC11771p, "unsupported");
        for (String str : iterable) {
            inputStream = m16464b(inputStream, str, interfaceC11771p);
        }
        return inputStream;
    }

    /* renamed from: b */
    public static final InputStream m16464b(InputStream inputStream, String str, InterfaceC11771p<? super InputStream, ? super String, ? extends InputStream> interfaceC11771p) {
        CharSequence m5414M0;
        InputStream gZIPInputStream;
        l.g(inputStream, "$this$decode");
        l.g(str, "encoding");
        l.g(interfaceC11771p, "unsupported");
        m5414M0 = C13277t.m5414M0(str);
        String obj = m5414M0.toString();
        int hashCode = obj.hashCode();
        if (hashCode != -135761730) {
            if (hashCode != 0) {
                if (hashCode != 3189082) {
                    if (hashCode != 757417932) {
                        if (hashCode == 1545112619 && obj.equals("deflate")) {
                            gZIPInputStream = new InflaterInputStream(inputStream);
                            return gZIPInputStream;
                        }
                    } else if (obj.equals("chunked")) {
                        return inputStream;
                    }
                } else if (obj.equals("gzip")) {
                    gZIPInputStream = new GZIPInputStream(inputStream);
                    return gZIPInputStream;
                }
            } else if (obj.equals("")) {
                return inputStream;
            }
        } else if (obj.equals("identity")) {
            return inputStream;
        }
        return interfaceC11771p.invoke(inputStream, str);
    }

    /* renamed from: c */
    public static /* synthetic */ InputStream m16463c(InputStream inputStream, Iterable iterable, InterfaceC11771p interfaceC11771p, int i, Object obj) {
        if ((i & 2) != 0) {
            interfaceC11771p = f19789a;
        }
        return m16465a(inputStream, iterable, interfaceC11771p);
    }

    /* renamed from: d */
    public static /* synthetic */ InputStream m16462d(InputStream inputStream, String str, InterfaceC11771p interfaceC11771p, int i, Object obj) {
        if ((i & 2) != 0) {
            interfaceC11771p = f19789a;
        }
        return m16464b(inputStream, str, interfaceC11771p);
    }
}
