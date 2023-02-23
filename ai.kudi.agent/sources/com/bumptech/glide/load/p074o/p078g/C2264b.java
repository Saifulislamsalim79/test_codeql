package com.bumptech.glide.load.p074o.p078g;

import android.graphics.Bitmap;
import com.bumptech.glide.load.engine.p069z.InterfaceC2095b;
import com.bumptech.glide.load.engine.p069z.InterfaceC2100e;
import com.bumptech.glide.p065k.InterfaceC1965a;
/* compiled from: GifBitmapProvider.java */
/* renamed from: com.bumptech.glide.load.o.g.b */
/* loaded from: classes2.dex */
public final class C2264b implements InterfaceC1965a.InterfaceC1966a {

    /* renamed from: a */
    private final InterfaceC2100e f6604a;

    /* renamed from: b */
    private final InterfaceC2095b f6605b;

    public C2264b(InterfaceC2100e interfaceC2100e, InterfaceC2095b interfaceC2095b) {
        this.f6604a = interfaceC2100e;
        this.f6605b = interfaceC2095b;
    }

    @Override // com.bumptech.glide.p065k.InterfaceC1965a.InterfaceC1966a
    /* renamed from: a */
    public Bitmap mo33461a(int i, int i2, Bitmap.Config config) {
        return this.f6604a.mo33697d(i, i2, config);
    }

    @Override // com.bumptech.glide.p065k.InterfaceC1965a.InterfaceC1966a
    /* renamed from: b */
    public int[] mo33460b(int i) {
        InterfaceC2095b interfaceC2095b = this.f6605b;
        if (interfaceC2095b == null) {
            return new int[i];
        }
        return (int[]) interfaceC2095b.mo33714e(i, int[].class);
    }

    @Override // com.bumptech.glide.p065k.InterfaceC1965a.InterfaceC1966a
    /* renamed from: c */
    public void mo33459c(Bitmap bitmap) {
        this.f6604a.mo33347c(bitmap);
    }

    @Override // com.bumptech.glide.p065k.InterfaceC1965a.InterfaceC1966a
    /* renamed from: d */
    public void mo33458d(byte[] bArr) {
        InterfaceC2095b interfaceC2095b = this.f6605b;
        if (interfaceC2095b == null) {
            return;
        }
        interfaceC2095b.mo33715d(bArr);
    }

    @Override // com.bumptech.glide.p065k.InterfaceC1965a.InterfaceC1966a
    /* renamed from: e */
    public byte[] mo33457e(int i) {
        InterfaceC2095b interfaceC2095b = this.f6605b;
        if (interfaceC2095b == null) {
            return new byte[i];
        }
        return (byte[]) interfaceC2095b.mo33714e(i, byte[].class);
    }

    @Override // com.bumptech.glide.p065k.InterfaceC1965a.InterfaceC1966a
    /* renamed from: f */
    public void mo33456f(int[] iArr) {
        InterfaceC2095b interfaceC2095b = this.f6605b;
        if (interfaceC2095b == null) {
            return;
        }
        interfaceC2095b.mo33715d(iArr);
    }
}
