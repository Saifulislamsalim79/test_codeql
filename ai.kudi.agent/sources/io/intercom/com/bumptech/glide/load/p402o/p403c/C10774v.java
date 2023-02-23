package io.intercom.com.bumptech.glide.load.p402o.p403c;

import android.graphics.Bitmap;
import android.media.MediaMetadataRetriever;
import android.os.ParcelFileDescriptor;
import io.intercom.com.bumptech.glide.load.C10623h;
import io.intercom.com.bumptech.glide.load.C10626i;
import io.intercom.com.bumptech.glide.load.InterfaceC10627j;
import io.intercom.com.bumptech.glide.load.engine.InterfaceC10569t;
import io.intercom.com.bumptech.glide.load.engine.p396y.InterfaceC10581e;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.security.MessageDigest;
/* compiled from: VideoBitmapDecoder.java */
/* renamed from: io.intercom.com.bumptech.glide.load.o.c.v */
/* loaded from: classes3.dex */
public class C10774v implements InterfaceC10627j<ParcelFileDescriptor, Bitmap> {

    /* renamed from: c */
    public static final C10623h<Long> f24620c = C10623h.m12600a("io.intercom.com.bumptech.glide.load.resource.bitmap.VideoBitmapDecode.TargetFrame", -1L, new C10775a());

    /* renamed from: d */
    public static final C10623h<Integer> f24621d = C10623h.m12600a("io.intercom.com.bumptech.glide.load.resource.bitmap.VideoBitmapDecode.FrameOption", null, new C10776b());

    /* renamed from: e */
    private static final C10777c f24622e = new C10777c();

    /* renamed from: a */
    private final InterfaceC10581e f24623a;

    /* renamed from: b */
    private final C10777c f24624b;

    /* compiled from: VideoBitmapDecoder.java */
    /* renamed from: io.intercom.com.bumptech.glide.load.o.c.v$a */
    /* loaded from: classes3.dex */
    static class C10775a implements C10623h.InterfaceC10625b<Long> {

        /* renamed from: a */
        private final ByteBuffer f24625a = ByteBuffer.allocate(8);

        C10775a() {
        }

        @Override // io.intercom.com.bumptech.glide.load.C10623h.InterfaceC10625b
        /* renamed from: b */
        public void mo12361a(byte[] bArr, Long l, MessageDigest messageDigest) {
            messageDigest.update(bArr);
            synchronized (this.f24625a) {
                this.f24625a.position(0);
                messageDigest.update(this.f24625a.putLong(l.longValue()).array());
            }
        }
    }

    /* compiled from: VideoBitmapDecoder.java */
    /* renamed from: io.intercom.com.bumptech.glide.load.o.c.v$b */
    /* loaded from: classes3.dex */
    static class C10776b implements C10623h.InterfaceC10625b<Integer> {

        /* renamed from: a */
        private final ByteBuffer f24626a = ByteBuffer.allocate(4);

        C10776b() {
        }

        @Override // io.intercom.com.bumptech.glide.load.C10623h.InterfaceC10625b
        /* renamed from: b */
        public void mo12361a(byte[] bArr, Integer num, MessageDigest messageDigest) {
            if (num == null) {
                return;
            }
            messageDigest.update(bArr);
            synchronized (this.f24626a) {
                this.f24626a.position(0);
                messageDigest.update(this.f24626a.putInt(num.intValue()).array());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: VideoBitmapDecoder.java */
    /* renamed from: io.intercom.com.bumptech.glide.load.o.c.v$c */
    /* loaded from: classes3.dex */
    public static class C10777c {
        C10777c() {
        }

        /* renamed from: a */
        public MediaMetadataRetriever m12359a() {
            return new MediaMetadataRetriever();
        }
    }

    public C10774v(InterfaceC10581e interfaceC10581e) {
        this(interfaceC10581e, f24622e);
    }

    @Override // io.intercom.com.bumptech.glide.load.InterfaceC10627j
    /* renamed from: c */
    public InterfaceC10569t<Bitmap> mo12276a(ParcelFileDescriptor parcelFileDescriptor, int i, int i2, C10626i c10626i) throws IOException {
        Bitmap frameAtTime;
        long longValue = ((Long) c10626i.m12593a(f24620c)).longValue();
        if (longValue < 0 && longValue != -1) {
            throw new IllegalArgumentException("Requested frame must be non-negative, or DEFAULT_FRAME, given: " + longValue);
        }
        Integer num = (Integer) c10626i.m12593a(f24621d);
        MediaMetadataRetriever m12359a = this.f24624b.m12359a();
        try {
            try {
                m12359a.setDataSource(parcelFileDescriptor.getFileDescriptor());
                if (longValue == -1) {
                    frameAtTime = m12359a.getFrameAtTime();
                } else if (num == null) {
                    frameAtTime = m12359a.getFrameAtTime(longValue);
                } else {
                    frameAtTime = m12359a.getFrameAtTime(longValue, num.intValue());
                }
                m12359a.release();
                parcelFileDescriptor.close();
                return C10741d.m12447e(frameAtTime, this.f24623a);
            } catch (RuntimeException e) {
                throw new IOException(e);
            }
        } catch (Throwable th) {
            m12359a.release();
            throw th;
        }
    }

    @Override // io.intercom.com.bumptech.glide.load.InterfaceC10627j
    /* renamed from: d */
    public boolean mo12275b(ParcelFileDescriptor parcelFileDescriptor, C10626i c10626i) {
        return true;
    }

    C10774v(InterfaceC10581e interfaceC10581e, C10777c c10777c) {
        this.f24623a = interfaceC10581e;
        this.f24624b = c10777c;
    }
}
