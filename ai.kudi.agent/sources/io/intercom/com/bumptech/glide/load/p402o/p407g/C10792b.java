package io.intercom.com.bumptech.glide.load.p402o.p407g;

import android.graphics.Bitmap;
import io.intercom.com.bumptech.glide.load.engine.p396y.InterfaceC10576b;
import io.intercom.com.bumptech.glide.load.engine.p396y.InterfaceC10581e;
import io.intercom.com.bumptech.glide.p393l.InterfaceC10501a;
/* compiled from: GifBitmapProvider.java */
/* renamed from: io.intercom.com.bumptech.glide.load.o.g.b */
/* loaded from: classes3.dex */
public final class C10792b implements InterfaceC10501a.InterfaceC10502a {

    /* renamed from: a */
    private final InterfaceC10581e f24640a;

    /* renamed from: b */
    private final InterfaceC10576b f24641b;

    public C10792b(InterfaceC10581e interfaceC10581e, InterfaceC10576b interfaceC10576b) {
        this.f24640a = interfaceC10581e;
        this.f24641b = interfaceC10576b;
    }

    @Override // io.intercom.com.bumptech.glide.p393l.InterfaceC10501a.InterfaceC10502a
    /* renamed from: a */
    public Bitmap mo12326a(int i, int i2, Bitmap.Config config) {
        return this.f24640a.mo12669d(i, i2, config);
    }

    @Override // io.intercom.com.bumptech.glide.p393l.InterfaceC10501a.InterfaceC10502a
    /* renamed from: b */
    public int[] mo12325b(int i) {
        InterfaceC10576b interfaceC10576b = this.f24641b;
        if (interfaceC10576b == null) {
            return new int[i];
        }
        return (int[]) interfaceC10576b.mo12686e(i, int[].class);
    }

    @Override // io.intercom.com.bumptech.glide.p393l.InterfaceC10501a.InterfaceC10502a
    /* renamed from: c */
    public void mo12324c(Bitmap bitmap) {
        this.f24640a.mo12398c(bitmap);
    }

    @Override // io.intercom.com.bumptech.glide.p393l.InterfaceC10501a.InterfaceC10502a
    /* renamed from: d */
    public void mo12323d(byte[] bArr) {
        InterfaceC10576b interfaceC10576b = this.f24641b;
        if (interfaceC10576b == null) {
            return;
        }
        interfaceC10576b.mo12687d(bArr);
    }

    @Override // io.intercom.com.bumptech.glide.p393l.InterfaceC10501a.InterfaceC10502a
    /* renamed from: e */
    public byte[] mo12322e(int i) {
        InterfaceC10576b interfaceC10576b = this.f24641b;
        if (interfaceC10576b == null) {
            return new byte[i];
        }
        return (byte[]) interfaceC10576b.mo12686e(i, byte[].class);
    }

    @Override // io.intercom.com.bumptech.glide.p393l.InterfaceC10501a.InterfaceC10502a
    /* renamed from: f */
    public void mo12321f(int[] iArr) {
        InterfaceC10576b interfaceC10576b = this.f24641b;
        if (interfaceC10576b == null) {
            return;
        }
        interfaceC10576b.mo12687d(iArr);
    }
}
