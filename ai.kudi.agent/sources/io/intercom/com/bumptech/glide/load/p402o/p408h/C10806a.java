package io.intercom.com.bumptech.glide.load.p402o.p408h;

import android.graphics.Bitmap;
import io.intercom.com.bumptech.glide.load.C10626i;
import io.intercom.com.bumptech.glide.load.engine.InterfaceC10569t;
import io.intercom.com.bumptech.glide.load.p402o.p404d.C10780b;
import java.io.ByteArrayOutputStream;
/* compiled from: BitmapBytesTranscoder.java */
/* renamed from: io.intercom.com.bumptech.glide.load.o.h.a */
/* loaded from: classes3.dex */
public class C10806a implements InterfaceC10809d<Bitmap, byte[]> {

    /* renamed from: a */
    private final Bitmap.CompressFormat f24680a;

    /* renamed from: b */
    private final int f24681b;

    public C10806a() {
        this(Bitmap.CompressFormat.JPEG, 100);
    }

    @Override // io.intercom.com.bumptech.glide.load.p402o.p408h.InterfaceC10809d
    /* renamed from: a */
    public InterfaceC10569t<byte[]> mo12267a(InterfaceC10569t<Bitmap> interfaceC10569t, C10626i c10626i) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        interfaceC10569t.get().compress(this.f24680a, this.f24681b, byteArrayOutputStream);
        interfaceC10569t.mo12303b();
        return new C10780b(byteArrayOutputStream.toByteArray());
    }

    public C10806a(Bitmap.CompressFormat compressFormat, int i) {
        this.f24680a = compressFormat;
        this.f24681b = i;
    }
}
