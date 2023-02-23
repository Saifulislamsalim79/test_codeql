package com.bumptech.glide.load.p072n;

import android.util.Log;
import com.bumptech.glide.EnumC1949f;
import com.bumptech.glide.load.C2122h;
import com.bumptech.glide.load.EnumC1993a;
import com.bumptech.glide.load.p070m.InterfaceC2130d;
import com.bumptech.glide.load.p072n.InterfaceC2199n;
import com.bumptech.glide.p085p.C2366b;
import com.bumptech.glide.p086q.C2367a;
import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;
/* compiled from: ByteBufferFileLoader.java */
/* renamed from: com.bumptech.glide.load.n.d */
/* loaded from: classes2.dex */
public class C2170d implements InterfaceC2199n<File, ByteBuffer> {

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: ByteBufferFileLoader.java */
    /* renamed from: com.bumptech.glide.load.n.d$a */
    /* loaded from: classes2.dex */
    public static final class C2171a implements InterfaceC2130d<ByteBuffer> {

        /* renamed from: c */
        private final File f6474c;

        C2171a(File file) {
            this.f6474c = file;
        }

        @Override // com.bumptech.glide.load.p070m.InterfaceC2130d
        /* renamed from: a */
        public Class<ByteBuffer> mo33507a() {
            return ByteBuffer.class;
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
        public void mo33503e(EnumC1949f enumC1949f, InterfaceC2130d.InterfaceC2131a<? super ByteBuffer> interfaceC2131a) {
            try {
                interfaceC2131a.mo33545d(C2367a.m33160a(this.f6474c));
            } catch (IOException e) {
                if (Log.isLoggable("ByteBufferFileLoader", 3)) {
                    Log.d("ByteBufferFileLoader", "Failed to obtain ByteBuffer for file", e);
                }
                interfaceC2131a.mo33546c(e);
            }
        }

        @Override // com.bumptech.glide.load.p070m.InterfaceC2130d
        public EnumC1993a getDataSource() {
            return EnumC1993a.LOCAL;
        }
    }

    /* compiled from: ByteBufferFileLoader.java */
    /* renamed from: com.bumptech.glide.load.n.d$b */
    /* loaded from: classes2.dex */
    public static class C2172b implements InterfaceC2201o<File, ByteBuffer> {
        @Override // com.bumptech.glide.load.p072n.InterfaceC2201o
        /* renamed from: b */
        public InterfaceC2199n<File, ByteBuffer> mo33496b(C2207r c2207r) {
            return new C2170d();
        }
    }

    @Override // com.bumptech.glide.load.p072n.InterfaceC2199n
    /* renamed from: c */
    public InterfaceC2199n.C2200a<ByteBuffer> mo33499b(File file, int i, int i2, C2122h c2122h) {
        return new InterfaceC2199n.C2200a<>(new C2366b(file), new C2171a(file));
    }

    @Override // com.bumptech.glide.load.p072n.InterfaceC2199n
    /* renamed from: d */
    public boolean mo33500a(File file) {
        return true;
    }
}
