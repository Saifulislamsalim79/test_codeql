package com.github.kittinunf.fuel.core;

import com.github.kittinunf.fuel.core.requests.FutureC2469a;
import com.github.kittinunf.result.AbstractC2512a;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import kotlin.C13287o;
import kotlin.C13663t;
import kotlin.C13666w;
import kotlin.p483e0.p484c.InterfaceC11771p;
import kotlin.p483e0.p484c.InterfaceC11772q;
import kotlin.p549l0.C13254d;
/* compiled from: Request.kt */
/* renamed from: com.github.kittinunf.fuel.core.q */
/* loaded from: classes2.dex */
public interface InterfaceC2464q extends InterfaceC2499t {

    /* compiled from: Request.kt */
    /* renamed from: com.github.kittinunf.fuel.core.q$a */
    /* loaded from: classes2.dex */
    public static final class C2465a {
        /* renamed from: a */
        public static /* synthetic */ InterfaceC2464q m32818a(InterfaceC2464q interfaceC2464q, String str, Charset charset, int i, Object obj) {
            if (obj == null) {
                if ((i & 2) != 0) {
                    charset = C13254d.f29413a;
                }
                return interfaceC2464q.mo32770f(str, charset);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: body");
        }
    }

    /* renamed from: a */
    C2460n mo32775a();

    /* renamed from: b */
    Collection<String> mo32774b(String str);

    /* renamed from: c */
    List<C13287o<String, Object>> mo32773c();

    /* renamed from: d */
    void mo32772d(URL url);

    /* renamed from: e */
    C2466r mo32771e();

    /* renamed from: f */
    InterfaceC2464q mo32770f(String str, Charset charset);

    /* renamed from: g */
    FutureC2469a mo32769g(InterfaceC11772q<? super InterfaceC2464q, ? super C2500u, ? super AbstractC2512a<byte[], ? extends FuelError>, C13666w> interfaceC11772q);

    /* renamed from: h */
    InterfaceC2464q mo32768h(InterfaceC11771p<? super Long, ? super Long, C13666w> interfaceC11771p);

    /* renamed from: i */
    InterfaceC2464q mo32767i(Map<String, ? extends Object> map);

    /* renamed from: j */
    URL mo32766j();

    /* renamed from: k */
    EnumC2462o mo32765k();

    /* renamed from: l */
    C13663t<InterfaceC2464q, C2500u, AbstractC2512a<byte[], FuelError>> mo32764l();

    /* renamed from: m */
    void mo32763m(C2466r c2466r);

    /* renamed from: n */
    InterfaceC2464q mo32762n(String str, Object obj);

    /* renamed from: o */
    InterfaceC2423a mo32761o();

    /* renamed from: p */
    InterfaceC2464q mo32760p(InterfaceC11771p<? super Long, ? super Long, C13666w> interfaceC11771p);

    /* renamed from: q */
    void mo32759q(List<? extends C13287o<String, ? extends Object>> list);

    /* renamed from: r */
    InterfaceC2464q mo32758r(InterfaceC2423a interfaceC2423a);

    /* renamed from: s */
    Map<String, InterfaceC2464q> mo32757s();

    String toString();
}
