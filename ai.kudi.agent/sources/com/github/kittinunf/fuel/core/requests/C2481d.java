package com.github.kittinunf.fuel.core.requests;

import com.github.kittinunf.fuel.core.C2433h;
import com.github.kittinunf.fuel.core.C2460n;
import com.github.kittinunf.fuel.core.C2466r;
import com.github.kittinunf.fuel.core.C2500u;
import com.github.kittinunf.fuel.core.EnumC2462o;
import com.github.kittinunf.fuel.core.FuelError;
import com.github.kittinunf.fuel.core.InterfaceC2423a;
import com.github.kittinunf.fuel.core.InterfaceC2464q;
import com.github.kittinunf.fuel.core.p089w.C2504a;
import com.github.kittinunf.result.AbstractC2512a;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.C13287o;
import kotlin.C13663t;
import kotlin.C13666w;
import kotlin.e0.d.l;
import kotlin.p483e0.p484c.InterfaceC11756a;
import kotlin.p483e0.p484c.InterfaceC11771p;
import kotlin.p483e0.p484c.InterfaceC11772q;
import kotlin.p483e0.p485d.AbstractC11802m;
import kotlin.p493j0.InterfaceC11863b;
import kotlin.p549l0.C13272o;
import kotlin.p557z.C13722p;
import kotlin.p557z.C13728s;
import tv.danmaku.ijk.media.player.IjkMediaPlayer;
/* compiled from: DefaultRequest.kt */
/* renamed from: com.github.kittinunf.fuel.core.requests.d */
/* loaded from: classes2.dex */
public final class C2481d implements InterfaceC2464q {

    /* renamed from: c */
    public C2466r f7090c;

    /* renamed from: d */
    private final EnumC2462o f7091d;

    /* renamed from: e */
    private URL f7092e;

    /* renamed from: f */
    private final C2460n f7093f;

    /* renamed from: w */
    private List<? extends C13287o<String, ? extends Object>> f7094w;

    /* renamed from: x */
    private InterfaceC2423a f7095x;

    /* renamed from: y */
    private final Map<String, InterfaceC2464q> f7096y;

    /* renamed from: z */
    private final Map<InterfaceC11863b<?>, Object> f7097z;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: DefaultRequest.kt */
    /* renamed from: com.github.kittinunf.fuel.core.requests.d$a */
    /* loaded from: classes2.dex */
    public static final class C2482a extends AbstractC11802m implements InterfaceC11756a<InputStream> {

        /* renamed from: c */
        final /* synthetic */ InputStream f7098c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C2482a(InputStream inputStream) {
            super(0);
            this.f7098c = inputStream;
        }

        @Override // kotlin.p483e0.p484c.InterfaceC11756a
        /* renamed from: a */
        public final InputStream invoke() {
            return this.f7098c;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: DefaultRequest.kt */
    /* renamed from: com.github.kittinunf.fuel.core.requests.d$b */
    /* loaded from: classes2.dex */
    public static final class C2483b extends AbstractC11802m implements InterfaceC11756a<Long> {

        /* renamed from: c */
        final /* synthetic */ byte[] f7099c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C2483b(byte[] bArr) {
            super(0);
            this.f7099c = bArr;
        }

        /* renamed from: a */
        public final long m32749a() {
            return this.f7099c.length;
        }

        @Override // kotlin.p483e0.p484c.InterfaceC11756a
        public /* bridge */ /* synthetic */ Long invoke() {
            return Long.valueOf(m32749a());
        }
    }

    /* compiled from: DefaultRequest.kt */
    /* renamed from: com.github.kittinunf.fuel.core.requests.d$c */
    /* loaded from: classes2.dex */
    static final class C2484c extends AbstractC11802m implements InterfaceC11771p<String, String, StringBuilder> {

        /* renamed from: c */
        final /* synthetic */ StringBuilder f7100c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C2484c(StringBuilder sb) {
            super(2);
            this.f7100c = sb;
        }

        @Override // kotlin.p483e0.p484c.InterfaceC11771p
        /* renamed from: a */
        public final StringBuilder invoke(String str, String str2) {
            l.g(str, "key");
            l.g(str2, "value");
            StringBuilder sb = this.f7100c;
            sb.append(str + " : " + str2);
            l.c(sb, "append(value)");
            C13272o.m5457i(sb);
            return sb;
        }
    }

    public C2481d(EnumC2462o enumC2462o, URL url, C2460n c2460n, List<? extends C13287o<String, ? extends Object>> list, InterfaceC2423a interfaceC2423a, Map<String, InterfaceC2464q> map, Map<InterfaceC11863b<?>, Object> map2) {
        l.g(enumC2462o, "method");
        l.g(url, IjkMediaPlayer.OnNativeInvokeListener.ARG_URL);
        l.g(c2460n, "headers");
        l.g(list, "parameters");
        l.g(interfaceC2423a, "_body");
        l.g(map, "enabledFeatures");
        l.g(map2, "tags");
        this.f7091d = enumC2462o;
        this.f7092e = url;
        this.f7093f = c2460n;
        this.f7094w = list;
        this.f7095x = interfaceC2423a;
        this.f7096y = map;
        this.f7097z = map2;
    }

    @Override // com.github.kittinunf.fuel.core.InterfaceC2464q
    /* renamed from: a */
    public C2460n mo32775a() {
        return this.f7093f;
    }

    @Override // com.github.kittinunf.fuel.core.InterfaceC2464q
    /* renamed from: b */
    public Collection<String> mo32774b(String str) {
        l.g(str, "header");
        return mo32775a().get(str);
    }

    @Override // com.github.kittinunf.fuel.core.InterfaceC2464q
    /* renamed from: c */
    public List<C13287o<String, Object>> mo32773c() {
        return this.f7094w;
    }

    @Override // com.github.kittinunf.fuel.core.InterfaceC2464q
    /* renamed from: d */
    public void mo32772d(URL url) {
        l.g(url, "<set-?>");
        this.f7092e = url;
    }

    @Override // com.github.kittinunf.fuel.core.InterfaceC2464q
    /* renamed from: e */
    public C2466r mo32771e() {
        C2466r c2466r = this.f7090c;
        if (c2466r != null) {
            return c2466r;
        }
        l.u("executionOptions");
        throw null;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C2481d) {
                C2481d c2481d = (C2481d) obj;
                return l.b(mo32765k(), c2481d.mo32765k()) && l.b(mo32766j(), c2481d.mo32766j()) && l.b(mo32775a(), c2481d.mo32775a()) && l.b(mo32773c(), c2481d.mo32773c()) && l.b(this.f7095x, c2481d.f7095x) && l.b(mo32757s(), c2481d.mo32757s()) && l.b(this.f7097z, c2481d.f7097z);
            }
            return false;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0030  */
    @Override // com.github.kittinunf.fuel.core.InterfaceC2464q
    /* renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.github.kittinunf.fuel.core.InterfaceC2464q mo32770f(java.lang.String r3, java.nio.charset.Charset r4) {
        /*
            r2 = this;
            java.lang.String r0 = "body"
            kotlin.e0.d.l.g(r3, r0)
            java.lang.String r0 = "charset"
            kotlin.e0.d.l.g(r4, r0)
            byte[] r3 = r3.getBytes(r4)
            java.lang.String r0 = "(this as java.lang.String).getBytes(charset)"
            kotlin.e0.d.l.c(r3, r0)
            r2.m32754v(r3, r4)
            java.lang.String r3 = "Content-Type"
            java.util.Collection r0 = r2.m32753w(r3)
            java.lang.Object r0 = kotlin.p557z.C13722p.m3942d0(r0)
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            if (r0 == 0) goto L2d
            boolean r0 = kotlin.p549l0.C13265j.m5470u(r0)
            if (r0 == 0) goto L2b
            goto L2d
        L2b:
            r0 = 0
            goto L2e
        L2d:
            r0 = 1
        L2e:
            if (r0 == 0) goto L48
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "text/plain; charset="
            r0.append(r1)
            java.lang.String r4 = r4.name()
            r0.append(r4)
            java.lang.String r4 = r0.toString()
            r2.mo32762n(r3, r4)
        L48:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.kittinunf.fuel.core.requests.C2481d.mo32770f(java.lang.String, java.nio.charset.Charset):com.github.kittinunf.fuel.core.q");
    }

    @Override // com.github.kittinunf.fuel.core.InterfaceC2464q
    /* renamed from: g */
    public FutureC2469a mo32769g(InterfaceC11772q<? super InterfaceC2464q, ? super C2500u, ? super AbstractC2512a<byte[], ? extends FuelError>, C13666w> interfaceC11772q) {
        l.g(interfaceC11772q, "handler");
        return C2433h.m32890a(this, new C2504a(), interfaceC11772q);
    }

    @Override // com.github.kittinunf.fuel.core.InterfaceC2499t
    public InterfaceC2464q getRequest() {
        return this;
    }

    @Override // com.github.kittinunf.fuel.core.InterfaceC2464q
    /* renamed from: h */
    public InterfaceC2464q mo32768h(InterfaceC11771p<? super Long, ? super Long, C13666w> interfaceC11771p) {
        l.g(interfaceC11771p, "handler");
        mo32771e().m32810h().m32819c(interfaceC11771p);
        getRequest();
        return this;
    }

    public int hashCode() {
        EnumC2462o mo32765k = mo32765k();
        int hashCode = (mo32765k != null ? mo32765k.hashCode() : 0) * 31;
        URL mo32766j = mo32766j();
        int hashCode2 = (hashCode + (mo32766j != null ? mo32766j.hashCode() : 0)) * 31;
        C2460n mo32775a = mo32775a();
        int hashCode3 = (hashCode2 + (mo32775a != null ? mo32775a.hashCode() : 0)) * 31;
        List<C13287o<String, Object>> mo32773c = mo32773c();
        int hashCode4 = (hashCode3 + (mo32773c != null ? mo32773c.hashCode() : 0)) * 31;
        InterfaceC2423a interfaceC2423a = this.f7095x;
        int hashCode5 = (hashCode4 + (interfaceC2423a != null ? interfaceC2423a.hashCode() : 0)) * 31;
        Map<String, InterfaceC2464q> mo32757s = mo32757s();
        int hashCode6 = (hashCode5 + (mo32757s != null ? mo32757s.hashCode() : 0)) * 31;
        Map<InterfaceC11863b<?>, Object> map = this.f7097z;
        return hashCode6 + (map != null ? map.hashCode() : 0);
    }

    @Override // com.github.kittinunf.fuel.core.InterfaceC2464q
    /* renamed from: i */
    public InterfaceC2464q mo32767i(Map<String, ? extends Object> map) {
        l.g(map, "map");
        mo32775a().putAll(C2460n.f7036w.m32827c(map));
        getRequest();
        return this;
    }

    @Override // com.github.kittinunf.fuel.core.InterfaceC2464q
    /* renamed from: j */
    public URL mo32766j() {
        return this.f7092e;
    }

    @Override // com.github.kittinunf.fuel.core.InterfaceC2464q
    /* renamed from: k */
    public EnumC2462o mo32765k() {
        return this.f7091d;
    }

    @Override // com.github.kittinunf.fuel.core.InterfaceC2464q
    /* renamed from: l */
    public C13663t<InterfaceC2464q, C2500u, AbstractC2512a<byte[], FuelError>> mo32764l() {
        return C2433h.m32888c(this, new C2504a());
    }

    @Override // com.github.kittinunf.fuel.core.InterfaceC2464q
    /* renamed from: m */
    public void mo32763m(C2466r c2466r) {
        l.g(c2466r, "<set-?>");
        this.f7090c = c2466r;
    }

    @Override // com.github.kittinunf.fuel.core.InterfaceC2464q
    /* renamed from: n */
    public InterfaceC2464q mo32762n(String str, Object obj) {
        l.g(str, "header");
        l.g(obj, "value");
        m32752x(str, obj);
        return this;
    }

    @Override // com.github.kittinunf.fuel.core.InterfaceC2464q
    /* renamed from: o */
    public InterfaceC2423a mo32761o() {
        return this.f7095x;
    }

    @Override // com.github.kittinunf.fuel.core.InterfaceC2464q
    /* renamed from: p */
    public InterfaceC2464q mo32760p(InterfaceC11771p<? super Long, ? super Long, C13666w> interfaceC11771p) {
        l.g(interfaceC11771p, "handler");
        mo32771e().m32808j().m32819c(interfaceC11771p);
        getRequest();
        return this;
    }

    @Override // com.github.kittinunf.fuel.core.InterfaceC2464q
    /* renamed from: q */
    public void mo32759q(List<? extends C13287o<String, ? extends Object>> list) {
        l.g(list, "<set-?>");
        this.f7094w = list;
    }

    @Override // com.github.kittinunf.fuel.core.InterfaceC2464q
    /* renamed from: r */
    public InterfaceC2464q mo32758r(InterfaceC2423a interfaceC2423a) {
        l.g(interfaceC2423a, "body");
        this.f7095x = interfaceC2423a;
        getRequest();
        return this;
    }

    @Override // com.github.kittinunf.fuel.core.InterfaceC2464q
    /* renamed from: s */
    public Map<String, InterfaceC2464q> mo32757s() {
        return this.f7096y;
    }

    /* renamed from: t */
    public InterfaceC2464q m32756t(InputStream inputStream, InterfaceC11756a<Long> interfaceC11756a, Charset charset, boolean z) {
        l.g(inputStream, "stream");
        l.g(charset, "charset");
        m32755u(new C2482a(inputStream), interfaceC11756a, charset, z);
        return this;
    }

    @Override // com.github.kittinunf.fuel.core.InterfaceC2464q
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("--> " + mo32765k() + ' ' + mo32766j());
        l.c(sb, "append(value)");
        C13272o.m5457i(sb);
        sb.append("Body : " + mo32761o().mo32745f((String) C13722p.m3942d0(m32753w("Content-Type"))));
        l.c(sb, "append(value)");
        C13272o.m5457i(sb);
        sb.append("Headers : (" + mo32775a().size() + ')');
        l.c(sb, "append(value)");
        C13272o.m5457i(sb);
        C2460n.m32830u(mo32775a(), new C2484c(sb), null, 2, null);
        String sb2 = sb.toString();
        l.c(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }

    /* renamed from: u */
    public InterfaceC2464q m32755u(InterfaceC11756a<? extends InputStream> interfaceC11756a, InterfaceC11756a<Long> interfaceC11756a2, Charset charset, boolean z) {
        l.g(interfaceC11756a, "openStream");
        l.g(charset, "charset");
        C2474c m32780a = C2474c.f7080h.m32780a(interfaceC11756a, interfaceC11756a2, charset);
        C2485e c2485e = m32780a;
        if (z) {
            c2485e = m32780a.m32783b();
        }
        this.f7095x = c2485e;
        getRequest();
        return this;
    }

    /* renamed from: v */
    public InterfaceC2464q m32754v(byte[] bArr, Charset charset) {
        l.g(bArr, "bytes");
        l.g(charset, "charset");
        m32756t(new ByteArrayInputStream(bArr), new C2483b(bArr), charset, true);
        return this;
    }

    /* renamed from: w */
    public Collection<String> m32753w(String str) {
        l.g(str, "header");
        return mo32774b(str);
    }

    /* renamed from: x */
    public InterfaceC2464q m32752x(String str, Object obj) {
        l.g(str, "header");
        l.g(obj, "value");
        if (obj instanceof Collection) {
            m32751y(str, (Collection) obj);
        } else {
            mo32775a().m32833q(str, obj.toString());
        }
        getRequest();
        return this;
    }

    /* renamed from: y */
    public InterfaceC2464q m32751y(String str, Collection<?> collection) {
        int m3867o;
        l.g(str, "header");
        l.g(collection, "values");
        C2460n mo32775a = mo32775a();
        m3867o = C13728s.m3867o(collection, 10);
        ArrayList arrayList = new ArrayList(m3867o);
        Iterator<T> it = collection.iterator();
        while (it.hasNext()) {
            arrayList.add(String.valueOf(it.next()));
        }
        mo32775a.m32832s(str, arrayList);
        getRequest();
        return this;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ C2481d(com.github.kittinunf.fuel.core.EnumC2462o r13, java.net.URL r14, com.github.kittinunf.fuel.core.C2460n r15, java.util.List r16, com.github.kittinunf.fuel.core.InterfaceC2423a r17, java.util.Map r18, java.util.Map r19, int r20, kotlin.e0.d.g r21) {
        /*
            r12 = this;
            r0 = r20 & 4
            if (r0 == 0) goto Lb
            com.github.kittinunf.fuel.core.n r0 = new com.github.kittinunf.fuel.core.n
            r0.<init>()
            r4 = r0
            goto Lc
        Lb:
            r4 = r15
        Lc:
            r0 = r20 & 8
            if (r0 == 0) goto L16
            java.util.List r0 = kotlin.p557z.C13722p.m3941e()
            r5 = r0
            goto L18
        L16:
            r5 = r16
        L18:
            r0 = r20 & 16
            if (r0 == 0) goto L28
            com.github.kittinunf.fuel.core.requests.c r0 = new com.github.kittinunf.fuel.core.requests.c
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 7
            r11 = 0
            r6 = r0
            r6.<init>(r7, r8, r9, r10, r11)
            goto L2a
        L28:
            r6 = r17
        L2a:
            r0 = r20 & 32
            if (r0 == 0) goto L35
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r0.<init>()
            r7 = r0
            goto L37
        L35:
            r7 = r18
        L37:
            r0 = r20 & 64
            if (r0 == 0) goto L42
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r0.<init>()
            r8 = r0
            goto L44
        L42:
            r8 = r19
        L44:
            r1 = r12
            r2 = r13
            r3 = r14
            r1.<init>(r2, r3, r4, r5, r6, r7, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.kittinunf.fuel.core.requests.C2481d.<init>(com.github.kittinunf.fuel.core.o, java.net.URL, com.github.kittinunf.fuel.core.n, java.util.List, com.github.kittinunf.fuel.core.a, java.util.Map, java.util.Map, int, kotlin.e0.d.g):void");
    }
}
