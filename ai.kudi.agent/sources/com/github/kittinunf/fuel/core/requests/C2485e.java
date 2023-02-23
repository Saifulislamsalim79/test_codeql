package com.github.kittinunf.fuel.core.requests;

import com.github.kittinunf.fuel.core.InterfaceC2423a;
import com.github.kittinunf.fuel.core.requests.C2474c;
import java.io.ByteArrayInputStream;
import java.io.OutputStream;
import kotlin.e0.d.l;
import kotlin.p483e0.p484c.InterfaceC11756a;
import kotlin.p483e0.p485d.AbstractC11802m;
/* compiled from: RepeatableBody.kt */
/* renamed from: com.github.kittinunf.fuel.core.requests.e */
/* loaded from: classes2.dex */
public final class C2485e implements InterfaceC2423a {

    /* renamed from: a */
    private final Long f7101a;

    /* renamed from: b */
    private InterfaceC2423a f7102b;

    /* compiled from: RepeatableBody.kt */
    /* renamed from: com.github.kittinunf.fuel.core.requests.e$a */
    /* loaded from: classes2.dex */
    static final class C2486a extends AbstractC11802m implements InterfaceC11756a<ByteArrayInputStream> {

        /* renamed from: c */
        final /* synthetic */ ByteArrayInputStream f7103c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C2486a(C2485e c2485e, ByteArrayInputStream byteArrayInputStream) {
            super(0);
            this.f7103c = byteArrayInputStream;
        }

        @Override // kotlin.p483e0.p484c.InterfaceC11756a
        /* renamed from: a */
        public final ByteArrayInputStream invoke() {
            return this.f7103c;
        }
    }

    /* compiled from: RepeatableBody.kt */
    /* renamed from: com.github.kittinunf.fuel.core.requests.e$b */
    /* loaded from: classes2.dex */
    static final class C2487b extends AbstractC11802m implements InterfaceC11756a<Long> {

        /* renamed from: c */
        final /* synthetic */ long f7104c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C2487b(long j) {
            super(0);
            this.f7104c = j;
        }

        /* renamed from: a */
        public final long m32741a() {
            return this.f7104c;
        }

        @Override // kotlin.p483e0.p484c.InterfaceC11756a
        public /* bridge */ /* synthetic */ Long invoke() {
            return Long.valueOf(m32741a());
        }
    }

    public C2485e(InterfaceC2423a interfaceC2423a) {
        l.g(interfaceC2423a, "body");
        this.f7102b = interfaceC2423a;
        this.f7101a = interfaceC2423a.mo32743h();
    }

    @Override // com.github.kittinunf.fuel.core.InterfaceC2423a
    /* renamed from: c */
    public long mo32747c(OutputStream outputStream) {
        l.g(outputStream, "outputStream");
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(mo32746e());
        long mo32747c = this.f7102b.mo32747c(outputStream);
        this.f7102b = C2474c.C2477c.m32779b(C2474c.f7080h, new C2486a(this, byteArrayInputStream), new C2487b(mo32747c), null, 4, null);
        return mo32747c;
    }

    @Override // com.github.kittinunf.fuel.core.InterfaceC2423a
    /* renamed from: e */
    public byte[] mo32746e() {
        return this.f7102b.mo32746e();
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof C2485e) && l.b(this.f7102b, ((C2485e) obj).f7102b);
        }
        return true;
    }

    @Override // com.github.kittinunf.fuel.core.InterfaceC2423a
    /* renamed from: f */
    public String mo32745f(String str) {
        return this.f7102b.mo32745f(str);
    }

    @Override // com.github.kittinunf.fuel.core.InterfaceC2423a
    /* renamed from: g */
    public boolean mo32744g() {
        return this.f7102b.mo32744g();
    }

    @Override // com.github.kittinunf.fuel.core.InterfaceC2423a
    /* renamed from: h */
    public Long mo32743h() {
        return this.f7101a;
    }

    public int hashCode() {
        InterfaceC2423a interfaceC2423a = this.f7102b;
        if (interfaceC2423a != null) {
            return interfaceC2423a.hashCode();
        }
        return 0;
    }

    @Override // com.github.kittinunf.fuel.core.InterfaceC2423a
    public boolean isEmpty() {
        return this.f7102b.isEmpty();
    }

    public String toString() {
        return "RepeatableBody(body=" + this.f7102b + ")";
    }
}
