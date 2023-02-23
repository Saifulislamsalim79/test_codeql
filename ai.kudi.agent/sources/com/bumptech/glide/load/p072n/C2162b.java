package com.bumptech.glide.load.p072n;

import com.bumptech.glide.EnumC1949f;
import com.bumptech.glide.load.C2122h;
import com.bumptech.glide.load.EnumC1993a;
import com.bumptech.glide.load.p070m.InterfaceC2130d;
import com.bumptech.glide.load.p072n.InterfaceC2199n;
import com.bumptech.glide.p085p.C2366b;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.nio.ByteBuffer;
/* compiled from: ByteArrayLoader.java */
/* renamed from: com.bumptech.glide.load.n.b */
/* loaded from: classes2.dex */
public class C2162b<Data> implements InterfaceC2199n<byte[], Data> {

    /* renamed from: a */
    private final InterfaceC2165b<Data> f6471a;

    /* compiled from: ByteArrayLoader.java */
    /* renamed from: com.bumptech.glide.load.n.b$a */
    /* loaded from: classes2.dex */
    public static class C2163a implements InterfaceC2201o<byte[], ByteBuffer> {

        /* compiled from: ByteArrayLoader.java */
        /* renamed from: com.bumptech.glide.load.n.b$a$a */
        /* loaded from: classes2.dex */
        class C2164a implements InterfaceC2165b<ByteBuffer> {
            C2164a(C2163a c2163a) {
            }

            @Override // com.bumptech.glide.load.p072n.C2162b.InterfaceC2165b
            /* renamed from: a */
            public Class<ByteBuffer> mo33601a() {
                return ByteBuffer.class;
            }

            @Override // com.bumptech.glide.load.p072n.C2162b.InterfaceC2165b
            /* renamed from: c */
            public ByteBuffer mo33600b(byte[] bArr) {
                return ByteBuffer.wrap(bArr);
            }
        }

        @Override // com.bumptech.glide.load.p072n.InterfaceC2201o
        /* renamed from: b */
        public InterfaceC2199n<byte[], ByteBuffer> mo33496b(C2207r c2207r) {
            return new C2162b(new C2164a(this));
        }
    }

    /* compiled from: ByteArrayLoader.java */
    /* renamed from: com.bumptech.glide.load.n.b$b */
    /* loaded from: classes2.dex */
    public interface InterfaceC2165b<Data> {
        /* renamed from: a */
        Class<Data> mo33601a();

        /* renamed from: b */
        Data mo33600b(byte[] bArr);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: ByteArrayLoader.java */
    /* renamed from: com.bumptech.glide.load.n.b$c */
    /* loaded from: classes2.dex */
    public static class C2166c<Data> implements InterfaceC2130d<Data> {

        /* renamed from: c */
        private final byte[] f6472c;

        /* renamed from: d */
        private final InterfaceC2165b<Data> f6473d;

        C2166c(byte[] bArr, InterfaceC2165b<Data> interfaceC2165b) {
            this.f6472c = bArr;
            this.f6473d = interfaceC2165b;
        }

        @Override // com.bumptech.glide.load.p070m.InterfaceC2130d
        /* renamed from: a */
        public Class<Data> mo33507a() {
            return this.f6473d.mo33601a();
        }

        @Override // com.bumptech.glide.load.p070m.InterfaceC2130d
        /* renamed from: b */
        public void mo33506b() {
        }

        @Override // com.bumptech.glide.load.p070m.InterfaceC2130d
        public void cancel() {
        }

        @Override // com.bumptech.glide.load.p070m.InterfaceC2130d
        /* renamed from: e */
        public void mo33503e(EnumC1949f enumC1949f, InterfaceC2130d.InterfaceC2131a<? super Data> interfaceC2131a) {
            interfaceC2131a.mo33545d((Data) this.f6473d.mo33600b(this.f6472c));
        }

        @Override // com.bumptech.glide.load.p070m.InterfaceC2130d
        public EnumC1993a getDataSource() {
            return EnumC1993a.LOCAL;
        }
    }

    /* compiled from: ByteArrayLoader.java */
    /* renamed from: com.bumptech.glide.load.n.b$d */
    /* loaded from: classes2.dex */
    public static class C2167d implements InterfaceC2201o<byte[], InputStream> {

        /* compiled from: ByteArrayLoader.java */
        /* renamed from: com.bumptech.glide.load.n.b$d$a */
        /* loaded from: classes2.dex */
        class C2168a implements InterfaceC2165b<InputStream> {
            C2168a(C2167d c2167d) {
            }

            @Override // com.bumptech.glide.load.p072n.C2162b.InterfaceC2165b
            /* renamed from: a */
            public Class<InputStream> mo33601a() {
                return InputStream.class;
            }

            @Override // com.bumptech.glide.load.p072n.C2162b.InterfaceC2165b
            /* renamed from: c */
            public InputStream mo33600b(byte[] bArr) {
                return new ByteArrayInputStream(bArr);
            }
        }

        @Override // com.bumptech.glide.load.p072n.InterfaceC2201o
        /* renamed from: b */
        public InterfaceC2199n<byte[], InputStream> mo33496b(C2207r c2207r) {
            return new C2162b(new C2168a(this));
        }
    }

    public C2162b(InterfaceC2165b<Data> interfaceC2165b) {
        this.f6471a = interfaceC2165b;
    }

    @Override // com.bumptech.glide.load.p072n.InterfaceC2199n
    /* renamed from: c */
    public InterfaceC2199n.C2200a<Data> mo33499b(byte[] bArr, int i, int i2, C2122h c2122h) {
        return new InterfaceC2199n.C2200a<>(new C2366b(bArr), new C2166c(bArr, this.f6471a));
    }

    @Override // com.bumptech.glide.load.p072n.InterfaceC2199n
    /* renamed from: d */
    public boolean mo33500a(byte[] bArr) {
        return true;
    }
}
