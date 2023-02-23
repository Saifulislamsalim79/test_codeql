package com.github.kittinunf.fuel.core;

import com.github.kittinunf.fuel.core.requests.C2474c;
import java.net.URL;
import java.util.Collection;
import kotlin.p483e0.p484c.InterfaceC11771p;
import kotlin.p483e0.p485d.AbstractC11802m;
import kotlin.p549l0.C13272o;
import kotlin.p557z.C13722p;
import tv.danmaku.ijk.media.player.IjkMediaPlayer;
/* compiled from: Response.kt */
/* renamed from: com.github.kittinunf.fuel.core.u */
/* loaded from: classes2.dex */
public final class C2500u {

    /* renamed from: g */
    public static final C2501a f7122g = new C2501a(null);

    /* renamed from: a */
    private final URL f7123a;

    /* renamed from: b */
    private final int f7124b;

    /* renamed from: c */
    private final String f7125c;

    /* renamed from: d */
    private final C2460n f7126d;

    /* renamed from: e */
    private final long f7127e;

    /* renamed from: f */
    private InterfaceC2423a f7128f;

    /* compiled from: Response.kt */
    /* renamed from: com.github.kittinunf.fuel.core.u$a */
    /* loaded from: classes2.dex */
    public static final class C2501a {
        private C2501a() {
        }

        /* renamed from: b */
        public static /* synthetic */ C2500u m32720b(C2501a c2501a, URL url, int i, Object obj) {
            if ((i & 1) != 0) {
                url = new URL("http://.");
            }
            return c2501a.m32721a(url);
        }

        /* renamed from: a */
        public final C2500u m32721a(URL url) {
            kotlin.e0.d.l.g(url, IjkMediaPlayer.OnNativeInvokeListener.ARG_URL);
            return new C2500u(url, 0, null, null, 0L, null, 62, null);
        }

        public /* synthetic */ C2501a(kotlin.e0.d.g gVar) {
            this();
        }
    }

    /* compiled from: Response.kt */
    /* renamed from: com.github.kittinunf.fuel.core.u$b */
    /* loaded from: classes2.dex */
    static final class C2502b extends AbstractC11802m implements InterfaceC11771p<String, String, StringBuilder> {

        /* renamed from: c */
        final /* synthetic */ StringBuilder f7129c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C2502b(StringBuilder sb) {
            super(2);
            this.f7129c = sb;
        }

        @Override // kotlin.p483e0.p484c.InterfaceC11771p
        /* renamed from: a */
        public final StringBuilder invoke(String str, String str2) {
            kotlin.e0.d.l.g(str, "key");
            kotlin.e0.d.l.g(str2, "value");
            StringBuilder sb = this.f7129c;
            sb.append(str + " : " + str2);
            kotlin.e0.d.l.c(sb, "append(value)");
            C13272o.m5457i(sb);
            return sb;
        }
    }

    public C2500u(URL url, int i, String str, C2460n c2460n, long j, InterfaceC2423a interfaceC2423a) {
        kotlin.e0.d.l.g(url, IjkMediaPlayer.OnNativeInvokeListener.ARG_URL);
        kotlin.e0.d.l.g(str, "responseMessage");
        kotlin.e0.d.l.g(c2460n, "headers");
        kotlin.e0.d.l.g(interfaceC2423a, "body");
        this.f7123a = url;
        this.f7124b = i;
        this.f7125c = str;
        this.f7126d = c2460n;
        this.f7127e = j;
        this.f7128f = interfaceC2423a;
    }

    /* renamed from: a */
    public final Collection<String> m32725a(String str) {
        kotlin.e0.d.l.g(str, "header");
        return this.f7126d.get(str);
    }

    /* renamed from: b */
    public final byte[] m32724b() {
        return this.f7128f.mo32746e();
    }

    /* renamed from: c */
    public final String m32723c() {
        return this.f7125c;
    }

    /* renamed from: d */
    public final int m32722d() {
        return this.f7124b;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C2500u) {
                C2500u c2500u = (C2500u) obj;
                if (kotlin.e0.d.l.b(this.f7123a, c2500u.f7123a)) {
                    if ((this.f7124b == c2500u.f7124b) && kotlin.e0.d.l.b(this.f7125c, c2500u.f7125c) && kotlin.e0.d.l.b(this.f7126d, c2500u.f7126d)) {
                        if (!(this.f7127e == c2500u.f7127e) || !kotlin.e0.d.l.b(this.f7128f, c2500u.f7128f)) {
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        URL url = this.f7123a;
        int hashCode = (((url != null ? url.hashCode() : 0) * 31) + this.f7124b) * 31;
        String str = this.f7125c;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        C2460n c2460n = this.f7126d;
        int hashCode3 = c2460n != null ? c2460n.hashCode() : 0;
        long j = this.f7127e;
        int i = (((hashCode2 + hashCode3) * 31) + ((int) (j ^ (j >>> 32)))) * 31;
        InterfaceC2423a interfaceC2423a = this.f7128f;
        return i + (interfaceC2423a != null ? interfaceC2423a.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("<-- " + this.f7124b + ' ' + this.f7123a);
        kotlin.e0.d.l.c(sb, "append(value)");
        C13272o.m5457i(sb);
        sb.append("Response : " + this.f7125c);
        kotlin.e0.d.l.c(sb, "append(value)");
        C13272o.m5457i(sb);
        sb.append("Length : " + this.f7127e);
        kotlin.e0.d.l.c(sb, "append(value)");
        C13272o.m5457i(sb);
        sb.append("Body : " + this.f7128f.mo32745f((String) C13722p.m3942d0(this.f7126d.get("Content-Type"))));
        kotlin.e0.d.l.c(sb, "append(value)");
        C13272o.m5457i(sb);
        sb.append("Headers : (" + this.f7126d.size() + ')');
        kotlin.e0.d.l.c(sb, "append(value)");
        C13272o.m5457i(sb);
        C2460n.m32830u(this.f7126d, new C2502b(sb), null, 2, null);
        String sb2 = sb.toString();
        kotlin.e0.d.l.c(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }

    public /* synthetic */ C2500u(URL url, int i, String str, C2460n c2460n, long j, InterfaceC2423a interfaceC2423a, int i2, kotlin.e0.d.g gVar) {
        this(url, (i2 & 2) != 0 ? -1 : i, (i2 & 4) != 0 ? "" : str, (i2 & 8) != 0 ? new C2460n() : c2460n, (i2 & 16) != 0 ? 0L : j, (i2 & 32) != 0 ? new C2474c(null, null, null, 7, null) : interfaceC2423a);
    }
}
