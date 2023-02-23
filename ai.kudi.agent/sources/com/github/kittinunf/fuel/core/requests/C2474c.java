package com.github.kittinunf.fuel.core.requests;

import com.github.kittinunf.fuel.core.C2425b;
import com.github.kittinunf.fuel.core.FuelError;
import com.github.kittinunf.fuel.core.InterfaceC2423a;
import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URLConnection;
import java.nio.charset.Charset;
import kotlin.C11861j;
import kotlin.InterfaceC11824h;
import kotlin.e0.d.l;
import kotlin.p483e0.p484c.InterfaceC11756a;
import kotlin.p483e0.p485d.AbstractC11802m;
import kotlin.p483e0.p485d.C11808s;
import kotlin.p483e0.p485d.C11813x;
import kotlin.p492io.C11842a;
import kotlin.p492io.C11843b;
import kotlin.p493j0.InterfaceC11872i;
import kotlin.p549l0.C13254d;
/* compiled from: DefaultBody.kt */
/* renamed from: com.github.kittinunf.fuel.core.requests.c */
/* loaded from: classes2.dex */
public final class C2474c implements InterfaceC2423a {

    /* renamed from: a */
    private final InterfaceC11824h f7081a;

    /* renamed from: b */
    private InterfaceC11756a<? extends InputStream> f7082b;

    /* renamed from: c */
    private InterfaceC11756a<Long> f7083c;

    /* renamed from: d */
    private final Charset f7084d;

    /* renamed from: e */
    static final /* synthetic */ InterfaceC11872i[] f7077e = {C11813x.m10312f(new C11808s(C11813x.m10316b(C2474c.class), "length", "getLength()Ljava/lang/Long;"))};

    /* renamed from: h */
    public static final C2477c f7080h = new C2477c(null);

    /* renamed from: f */
    private static final InterfaceC11756a<ByteArrayInputStream> f7078f = C2476b.f7086c;

    /* renamed from: g */
    private static final InterfaceC11756a f7079g = C2475a.f7085c;

    /* compiled from: DefaultBody.kt */
    /* renamed from: com.github.kittinunf.fuel.core.requests.c$a */
    /* loaded from: classes2.dex */
    static final class C2475a extends AbstractC11802m implements InterfaceC11756a {

        /* renamed from: c */
        public static final C2475a f7085c = new C2475a();

        C2475a() {
            super(0);
        }

        /* renamed from: a */
        public final Void m32782a() {
            throw FuelError.C2422a.m32898b(FuelError.f6968d, new IllegalStateException("The input has already been written to an output stream and can not be consumed again."), null, 2, null);
        }

        @Override // kotlin.p483e0.p484c.InterfaceC11756a
        public /* bridge */ /* synthetic */ Object invoke() {
            m32782a();
            throw null;
        }
    }

    /* compiled from: DefaultBody.kt */
    /* renamed from: com.github.kittinunf.fuel.core.requests.c$b */
    /* loaded from: classes2.dex */
    static final class C2476b extends AbstractC11802m implements InterfaceC11756a<ByteArrayInputStream> {

        /* renamed from: c */
        public static final C2476b f7086c = new C2476b();

        C2476b() {
            super(0);
        }

        @Override // kotlin.p483e0.p484c.InterfaceC11756a
        /* renamed from: a */
        public final ByteArrayInputStream invoke() {
            return new ByteArrayInputStream(new byte[0]);
        }
    }

    /* compiled from: DefaultBody.kt */
    /* renamed from: com.github.kittinunf.fuel.core.requests.c$c */
    /* loaded from: classes2.dex */
    public static final class C2477c {
        private C2477c() {
        }

        /* renamed from: b */
        public static /* synthetic */ C2474c m32779b(C2477c c2477c, InterfaceC11756a interfaceC11756a, InterfaceC11756a interfaceC11756a2, Charset charset, int i, Object obj) {
            if ((i & 4) != 0) {
                charset = C13254d.f29413a;
            }
            return c2477c.m32780a(interfaceC11756a, interfaceC11756a2, charset);
        }

        /* renamed from: a */
        public final C2474c m32780a(InterfaceC11756a<? extends InputStream> interfaceC11756a, InterfaceC11756a<Long> interfaceC11756a2, Charset charset) {
            l.g(interfaceC11756a, "openStream");
            l.g(charset, "charset");
            return new C2474c(interfaceC11756a, interfaceC11756a2, charset);
        }

        public /* synthetic */ C2477c(kotlin.e0.d.g gVar) {
            this();
        }
    }

    /* compiled from: DefaultBody.kt */
    /* renamed from: com.github.kittinunf.fuel.core.requests.c$d */
    /* loaded from: classes2.dex */
    static final class C2478d extends AbstractC11802m implements InterfaceC11756a<Long> {
        C2478d() {
            super(0);
        }

        @Override // kotlin.p483e0.p484c.InterfaceC11756a
        /* renamed from: a */
        public final Long invoke() {
            Long l;
            InterfaceC11756a interfaceC11756a = C2474c.this.f7083c;
            if (interfaceC11756a == null || (l = (Long) interfaceC11756a.invoke()) == null) {
                return null;
            }
            long longValue = l.longValue();
            if (longValue == -1) {
                return null;
            }
            return Long.valueOf(longValue);
        }
    }

    /* compiled from: DefaultBody.kt */
    /* renamed from: com.github.kittinunf.fuel.core.requests.c$e */
    /* loaded from: classes2.dex */
    static final class C2479e extends AbstractC11802m implements InterfaceC11756a<ByteArrayInputStream> {

        /* renamed from: c */
        final /* synthetic */ byte[] f7088c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C2479e(byte[] bArr) {
            super(0);
            this.f7088c = bArr;
        }

        @Override // kotlin.p483e0.p484c.InterfaceC11756a
        /* renamed from: a */
        public final ByteArrayInputStream invoke() {
            return new ByteArrayInputStream(this.f7088c);
        }
    }

    /* compiled from: DefaultBody.kt */
    /* renamed from: com.github.kittinunf.fuel.core.requests.c$f */
    /* loaded from: classes2.dex */
    static final class C2480f extends AbstractC11802m implements InterfaceC11756a<Long> {

        /* renamed from: c */
        final /* synthetic */ byte[] f7089c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C2480f(byte[] bArr) {
            super(0);
            this.f7089c = bArr;
        }

        /* renamed from: a */
        public final long m32776a() {
            return this.f7089c.length;
        }

        @Override // kotlin.p483e0.p484c.InterfaceC11756a
        public /* bridge */ /* synthetic */ Long invoke() {
            return Long.valueOf(m32776a());
        }
    }

    public C2474c() {
        this(null, null, null, 7, null);
    }

    public C2474c(InterfaceC11756a<? extends InputStream> interfaceC11756a, InterfaceC11756a<Long> interfaceC11756a2, Charset charset) {
        l.g(interfaceC11756a, "openStream");
        l.g(charset, "charset");
        this.f7082b = interfaceC11756a;
        this.f7083c = interfaceC11756a2;
        this.f7084d = charset;
        this.f7081a = C11861j.m10226b(new C2478d());
    }

    /* renamed from: b */
    public C2485e m32783b() {
        return InterfaceC2423a.C2424a.m32897a(this);
    }

    @Override // com.github.kittinunf.fuel.core.InterfaceC2423a
    /* renamed from: c */
    public long mo32747c(OutputStream outputStream) {
        l.g(outputStream, "outputStream");
        InputStream invoke = this.f7082b.invoke();
        BufferedInputStream bufferedInputStream = invoke instanceof BufferedInputStream ? (BufferedInputStream) invoke : new BufferedInputStream(invoke, 8192);
        try {
            long m10260b = C11842a.m10260b(bufferedInputStream, outputStream, 0, 2, null);
            C11843b.m10259a(bufferedInputStream, null);
            outputStream.flush();
            this.f7082b = f7079g;
            return m10260b;
        } finally {
        }
    }

    @Override // com.github.kittinunf.fuel.core.InterfaceC2423a
    /* renamed from: e */
    public byte[] mo32746e() {
        if (isEmpty()) {
            return new byte[0];
        }
        Long mo32743h = mo32743h();
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(mo32743h != null ? (int) mo32743h.longValue() : 32);
        try {
            mo32747c(byteArrayOutputStream);
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            C11843b.m10259a(byteArrayOutputStream, null);
            this.f7082b = new C2479e(byteArray);
            this.f7083c = new C2480f(byteArray);
            l.c(byteArray, "ByteArrayOutputStream(le….toLong() }\n            }");
            return byteArray;
        } finally {
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C2474c) {
                C2474c c2474c = (C2474c) obj;
                return l.b(this.f7082b, c2474c.f7082b) && l.b(this.f7083c, c2474c.f7083c) && l.b(this.f7084d, c2474c.f7084d);
            }
            return false;
        }
        return true;
    }

    @Override // com.github.kittinunf.fuel.core.InterfaceC2423a
    /* renamed from: f */
    public String mo32745f(String str) {
        if (isEmpty()) {
            return "(empty)";
        }
        if (mo32744g()) {
            return "(consumed)";
        }
        if (str == null) {
            str = URLConnection.guessContentTypeFromStream(this.f7082b.invoke());
        }
        return C2425b.m32896a(this, str);
    }

    @Override // com.github.kittinunf.fuel.core.InterfaceC2423a
    /* renamed from: g */
    public boolean mo32744g() {
        return this.f7082b == f7079g;
    }

    @Override // com.github.kittinunf.fuel.core.InterfaceC2423a
    /* renamed from: h */
    public Long mo32743h() {
        InterfaceC11824h interfaceC11824h = this.f7081a;
        InterfaceC11872i interfaceC11872i = f7077e[0];
        return (Long) interfaceC11824h.getValue();
    }

    public int hashCode() {
        InterfaceC11756a<? extends InputStream> interfaceC11756a = this.f7082b;
        int hashCode = (interfaceC11756a != null ? interfaceC11756a.hashCode() : 0) * 31;
        InterfaceC11756a<Long> interfaceC11756a2 = this.f7083c;
        int hashCode2 = (hashCode + (interfaceC11756a2 != null ? interfaceC11756a2.hashCode() : 0)) * 31;
        Charset charset = this.f7084d;
        return hashCode2 + (charset != null ? charset.hashCode() : 0);
    }

    @Override // com.github.kittinunf.fuel.core.InterfaceC2423a
    public boolean isEmpty() {
        Long mo32743h;
        return this.f7082b == f7078f || ((mo32743h = mo32743h()) != null && mo32743h.longValue() == 0);
    }

    public String toString() {
        return "DefaultBody(openStream=" + this.f7082b + ", calculateLength=" + this.f7083c + ", charset=" + this.f7084d + ")";
    }

    public /* synthetic */ C2474c(InterfaceC11756a interfaceC11756a, InterfaceC11756a interfaceC11756a2, Charset charset, int i, kotlin.e0.d.g gVar) {
        this((i & 1) != 0 ? f7078f : interfaceC11756a, (i & 2) != 0 ? null : interfaceC11756a2, (i & 4) != 0 ? C13254d.f29413a : charset);
    }
}
