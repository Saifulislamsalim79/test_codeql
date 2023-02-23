package io.intercom.com.bumptech.glide.load.p400n;

import io.intercom.com.bumptech.glide.EnumC10482g;
import io.intercom.com.bumptech.glide.load.C10626i;
import io.intercom.com.bumptech.glide.load.EnumC10507a;
import io.intercom.com.bumptech.glide.load.p398m.InterfaceC10631b;
import io.intercom.com.bumptech.glide.load.p400n.InterfaceC10697n;
import io.intercom.com.bumptech.glide.p415q.C10882b;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.nio.ByteBuffer;
/* compiled from: ByteArrayLoader.java */
/* renamed from: io.intercom.com.bumptech.glide.load.n.b */
/* loaded from: classes3.dex */
public class C10660b<Data> implements InterfaceC10697n<byte[], Data> {

    /* renamed from: a */
    private final InterfaceC10663b<Data> f24467a;

    /* compiled from: ByteArrayLoader.java */
    /* renamed from: io.intercom.com.bumptech.glide.load.n.b$a */
    /* loaded from: classes3.dex */
    public static class C10661a implements InterfaceC10699o<byte[], ByteBuffer> {

        /* compiled from: ByteArrayLoader.java */
        /* renamed from: io.intercom.com.bumptech.glide.load.n.b$a$a */
        /* loaded from: classes3.dex */
        class C10662a implements InterfaceC10663b<ByteBuffer> {
            C10662a(C10661a c10661a) {
            }

            @Override // io.intercom.com.bumptech.glide.load.p400n.C10660b.InterfaceC10663b
            /* renamed from: a */
            public Class<ByteBuffer> mo12547a() {
                return ByteBuffer.class;
            }

            @Override // io.intercom.com.bumptech.glide.load.p400n.C10660b.InterfaceC10663b
            /* renamed from: c */
            public ByteBuffer mo12546b(byte[] bArr) {
                return ByteBuffer.wrap(bArr);
            }
        }

        @Override // io.intercom.com.bumptech.glide.load.p400n.InterfaceC10699o
        /* renamed from: b */
        public InterfaceC10697n<byte[], ByteBuffer> mo12453b(C10705r c10705r) {
            return new C10660b(new C10662a(this));
        }
    }

    /* compiled from: ByteArrayLoader.java */
    /* renamed from: io.intercom.com.bumptech.glide.load.n.b$b */
    /* loaded from: classes3.dex */
    public interface InterfaceC10663b<Data> {
        /* renamed from: a */
        Class<Data> mo12547a();

        /* renamed from: b */
        Data mo12546b(byte[] bArr);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: ByteArrayLoader.java */
    /* renamed from: io.intercom.com.bumptech.glide.load.n.b$c */
    /* loaded from: classes3.dex */
    public static class C10664c<Data> implements InterfaceC10631b<Data> {

        /* renamed from: c */
        private final byte[] f24468c;

        /* renamed from: d */
        private final InterfaceC10663b<Data> f24469d;

        C10664c(byte[] bArr, InterfaceC10663b<Data> interfaceC10663b) {
            this.f24468c = bArr;
            this.f24469d = interfaceC10663b;
        }

        @Override // io.intercom.com.bumptech.glide.load.p398m.InterfaceC10631b
        /* renamed from: a */
        public Class<Data> mo12474a() {
            return this.f24469d.mo12547a();
        }

        @Override // io.intercom.com.bumptech.glide.load.p398m.InterfaceC10631b
        /* renamed from: b */
        public void mo12473b() {
        }

        @Override // io.intercom.com.bumptech.glide.load.p398m.InterfaceC10631b
        public void cancel() {
        }

        @Override // io.intercom.com.bumptech.glide.load.p398m.InterfaceC10631b
        /* renamed from: e */
        public void mo12472e(EnumC10482g enumC10482g, InterfaceC10631b.InterfaceC10632a<? super Data> interfaceC10632a) {
            interfaceC10632a.mo12496d((Data) this.f24469d.mo12546b(this.f24468c));
        }

        @Override // io.intercom.com.bumptech.glide.load.p398m.InterfaceC10631b
        public EnumC10507a getDataSource() {
            return EnumC10507a.LOCAL;
        }
    }

    /* compiled from: ByteArrayLoader.java */
    /* renamed from: io.intercom.com.bumptech.glide.load.n.b$d */
    /* loaded from: classes3.dex */
    public static class C10665d implements InterfaceC10699o<byte[], InputStream> {

        /* compiled from: ByteArrayLoader.java */
        /* renamed from: io.intercom.com.bumptech.glide.load.n.b$d$a */
        /* loaded from: classes3.dex */
        class C10666a implements InterfaceC10663b<InputStream> {
            C10666a(C10665d c10665d) {
            }

            @Override // io.intercom.com.bumptech.glide.load.p400n.C10660b.InterfaceC10663b
            /* renamed from: a */
            public Class<InputStream> mo12547a() {
                return InputStream.class;
            }

            @Override // io.intercom.com.bumptech.glide.load.p400n.C10660b.InterfaceC10663b
            /* renamed from: c */
            public InputStream mo12546b(byte[] bArr) {
                return new ByteArrayInputStream(bArr);
            }
        }

        @Override // io.intercom.com.bumptech.glide.load.p400n.InterfaceC10699o
        /* renamed from: b */
        public InterfaceC10697n<byte[], InputStream> mo12453b(C10705r c10705r) {
            return new C10660b(new C10666a(this));
        }
    }

    public C10660b(InterfaceC10663b<Data> interfaceC10663b) {
        this.f24467a = interfaceC10663b;
    }

    @Override // io.intercom.com.bumptech.glide.load.p400n.InterfaceC10697n
    /* renamed from: c */
    public InterfaceC10697n.C10698a<Data> mo12456b(byte[] bArr, int i, int i2, C10626i c10626i) {
        return new InterfaceC10697n.C10698a<>(new C10882b(bArr), new C10664c(bArr, this.f24467a));
    }

    @Override // io.intercom.com.bumptech.glide.load.p400n.InterfaceC10697n
    /* renamed from: d */
    public boolean mo12457a(byte[] bArr) {
        return true;
    }
}
