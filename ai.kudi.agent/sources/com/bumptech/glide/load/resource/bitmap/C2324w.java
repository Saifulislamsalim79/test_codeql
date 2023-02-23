package com.bumptech.glide.load.resource.bitmap;

import android.content.res.AssetFileDescriptor;
import android.graphics.Bitmap;
import android.media.MediaDataSource;
import android.media.MediaMetadataRetriever;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import com.bumptech.glide.load.C2119g;
import com.bumptech.glide.load.C2122h;
import com.bumptech.glide.load.InterfaceC2124j;
import com.bumptech.glide.load.engine.InterfaceC2087u;
import com.bumptech.glide.load.engine.p069z.InterfaceC2100e;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.security.MessageDigest;
/* compiled from: VideoDecoder.java */
/* renamed from: com.bumptech.glide.load.resource.bitmap.w */
/* loaded from: classes2.dex */
public class C2324w<T> implements InterfaceC2124j<T, Bitmap> {

    /* renamed from: d */
    public static final C2119g<Long> f6735d = C2119g.m33668a("com.bumptech.glide.load.resource.bitmap.VideoBitmapDecode.TargetFrame", -1L, new C2325a());

    /* renamed from: e */
    public static final C2119g<Integer> f6736e = C2119g.m33668a("com.bumptech.glide.load.resource.bitmap.VideoBitmapDecode.FrameOption", 2, new C2326b());

    /* renamed from: f */
    private static final C2330e f6737f = new C2330e();

    /* renamed from: a */
    private final InterfaceC2331f<T> f6738a;

    /* renamed from: b */
    private final InterfaceC2100e f6739b;

    /* renamed from: c */
    private final C2330e f6740c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: VideoDecoder.java */
    /* renamed from: com.bumptech.glide.load.resource.bitmap.w$a */
    /* loaded from: classes2.dex */
    public class C2325a implements C2119g.InterfaceC2121b<Long> {

        /* renamed from: a */
        private final ByteBuffer f6741a = ByteBuffer.allocate(8);

        C2325a() {
        }

        @Override // com.bumptech.glide.load.C2119g.InterfaceC2121b
        /* renamed from: b */
        public void mo33292a(byte[] bArr, Long l, MessageDigest messageDigest) {
            messageDigest.update(bArr);
            synchronized (this.f6741a) {
                this.f6741a.position(0);
                messageDigest.update(this.f6741a.putLong(l.longValue()).array());
            }
        }
    }

    /* compiled from: VideoDecoder.java */
    /* renamed from: com.bumptech.glide.load.resource.bitmap.w$b */
    /* loaded from: classes2.dex */
    class C2326b implements C2119g.InterfaceC2121b<Integer> {

        /* renamed from: a */
        private final ByteBuffer f6742a = ByteBuffer.allocate(4);

        C2326b() {
        }

        @Override // com.bumptech.glide.load.C2119g.InterfaceC2121b
        /* renamed from: b */
        public void mo33292a(byte[] bArr, Integer num, MessageDigest messageDigest) {
            if (num == null) {
                return;
            }
            messageDigest.update(bArr);
            synchronized (this.f6742a) {
                this.f6742a.position(0);
                messageDigest.update(this.f6742a.putInt(num.intValue()).array());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: VideoDecoder.java */
    /* renamed from: com.bumptech.glide.load.resource.bitmap.w$c */
    /* loaded from: classes2.dex */
    public static final class C2327c implements InterfaceC2331f<AssetFileDescriptor> {
        private C2327c() {
        }

        @Override // com.bumptech.glide.load.resource.bitmap.C2324w.InterfaceC2331f
        /* renamed from: b */
        public void mo33287a(MediaMetadataRetriever mediaMetadataRetriever, AssetFileDescriptor assetFileDescriptor) {
            mediaMetadataRetriever.setDataSource(assetFileDescriptor.getFileDescriptor(), assetFileDescriptor.getStartOffset(), assetFileDescriptor.getLength());
        }

        /* synthetic */ C2327c(C2325a c2325a) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: VideoDecoder.java */
    /* renamed from: com.bumptech.glide.load.resource.bitmap.w$d */
    /* loaded from: classes2.dex */
    public static final class C2328d implements InterfaceC2331f<ByteBuffer> {

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: VideoDecoder.java */
        /* renamed from: com.bumptech.glide.load.resource.bitmap.w$d$a */
        /* loaded from: classes2.dex */
        public class C2329a extends MediaDataSource {

            /* renamed from: c */
            final /* synthetic */ ByteBuffer f6743c;

            C2329a(C2328d c2328d, ByteBuffer byteBuffer) {
                this.f6743c = byteBuffer;
            }

            @Override // java.io.Closeable, java.lang.AutoCloseable
            public void close() {
            }

            @Override // android.media.MediaDataSource
            public long getSize() {
                return this.f6743c.limit();
            }

            @Override // android.media.MediaDataSource
            public int readAt(long j, byte[] bArr, int i, int i2) {
                if (j >= this.f6743c.limit()) {
                    return -1;
                }
                this.f6743c.position((int) j);
                int min = Math.min(i2, this.f6743c.remaining());
                this.f6743c.get(bArr, i, min);
                return min;
            }
        }

        C2328d() {
        }

        @Override // com.bumptech.glide.load.resource.bitmap.C2324w.InterfaceC2331f
        /* renamed from: b */
        public void mo33287a(MediaMetadataRetriever mediaMetadataRetriever, ByteBuffer byteBuffer) {
            mediaMetadataRetriever.setDataSource(new C2329a(this, byteBuffer));
        }
    }

    /* compiled from: VideoDecoder.java */
    /* renamed from: com.bumptech.glide.load.resource.bitmap.w$e */
    /* loaded from: classes2.dex */
    static class C2330e {
        C2330e() {
        }

        /* renamed from: a */
        public MediaMetadataRetriever m33288a() {
            return new MediaMetadataRetriever();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: VideoDecoder.java */
    /* renamed from: com.bumptech.glide.load.resource.bitmap.w$f */
    /* loaded from: classes2.dex */
    public interface InterfaceC2331f<T> {
        /* renamed from: a */
        void mo33287a(MediaMetadataRetriever mediaMetadataRetriever, T t);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: VideoDecoder.java */
    /* renamed from: com.bumptech.glide.load.resource.bitmap.w$g */
    /* loaded from: classes2.dex */
    public static final class C2332g implements InterfaceC2331f<ParcelFileDescriptor> {
        C2332g() {
        }

        @Override // com.bumptech.glide.load.resource.bitmap.C2324w.InterfaceC2331f
        /* renamed from: b */
        public void mo33287a(MediaMetadataRetriever mediaMetadataRetriever, ParcelFileDescriptor parcelFileDescriptor) {
            mediaMetadataRetriever.setDataSource(parcelFileDescriptor.getFileDescriptor());
        }
    }

    C2324w(InterfaceC2100e interfaceC2100e, InterfaceC2331f<T> interfaceC2331f) {
        this(interfaceC2100e, interfaceC2331f, f6737f);
    }

    /* renamed from: c */
    public static InterfaceC2124j<AssetFileDescriptor, Bitmap> m33299c(InterfaceC2100e interfaceC2100e) {
        return new C2324w(interfaceC2100e, new C2327c(null));
    }

    /* renamed from: d */
    public static InterfaceC2124j<ByteBuffer, Bitmap> m33298d(InterfaceC2100e interfaceC2100e) {
        return new C2324w(interfaceC2100e, new C2328d());
    }

    /* renamed from: e */
    private static Bitmap m33297e(MediaMetadataRetriever mediaMetadataRetriever, long j, int i, int i2, int i3, AbstractC2296h abstractC2296h) {
        Bitmap m33295g = (Build.VERSION.SDK_INT < 27 || i2 == Integer.MIN_VALUE || i3 == Integer.MIN_VALUE || abstractC2296h == AbstractC2296h.f6678c) ? null : m33295g(mediaMetadataRetriever, j, i, i2, i3, abstractC2296h);
        return m33295g == null ? m33296f(mediaMetadataRetriever, j, i) : m33295g;
    }

    /* renamed from: f */
    private static Bitmap m33296f(MediaMetadataRetriever mediaMetadataRetriever, long j, int i) {
        return mediaMetadataRetriever.getFrameAtTime(j, i);
    }

    /* renamed from: g */
    private static Bitmap m33295g(MediaMetadataRetriever mediaMetadataRetriever, long j, int i, int i2, int i3, AbstractC2296h abstractC2296h) {
        try {
            int parseInt = Integer.parseInt(mediaMetadataRetriever.extractMetadata(18));
            int parseInt2 = Integer.parseInt(mediaMetadataRetriever.extractMetadata(19));
            int parseInt3 = Integer.parseInt(mediaMetadataRetriever.extractMetadata(24));
            if (parseInt3 == 90 || parseInt3 == 270) {
                parseInt2 = parseInt;
                parseInt = parseInt2;
            }
            float mo33376b = abstractC2296h.mo33376b(parseInt, parseInt2, i2, i3);
            return mediaMetadataRetriever.getScaledFrameAtTime(j, i, Math.round(parseInt * mo33376b), Math.round(mo33376b * parseInt2));
        } catch (Throwable th) {
            if (Log.isLoggable("VideoDecoder", 3)) {
                Log.d("VideoDecoder", "Exception trying to decode frame on oreo+", th);
                return null;
            }
            return null;
        }
    }

    /* renamed from: h */
    public static InterfaceC2124j<ParcelFileDescriptor, Bitmap> m33294h(InterfaceC2100e interfaceC2100e) {
        return new C2324w(interfaceC2100e, new C2332g());
    }

    @Override // com.bumptech.glide.load.InterfaceC2124j
    /* renamed from: a */
    public boolean mo33301a(T t, C2122h c2122h) {
        return true;
    }

    @Override // com.bumptech.glide.load.InterfaceC2124j
    /* renamed from: b */
    public InterfaceC2087u<Bitmap> mo33300b(T t, int i, int i2, C2122h c2122h) throws IOException {
        long longValue = ((Long) c2122h.m33661b(f6735d)).longValue();
        if (longValue < 0 && longValue != -1) {
            throw new IllegalArgumentException("Requested frame must be non-negative, or DEFAULT_FRAME, given: " + longValue);
        }
        Integer num = (Integer) c2122h.m33661b(f6736e);
        if (num == null) {
            num = 2;
        }
        AbstractC2296h abstractC2296h = (AbstractC2296h) c2122h.m33661b(AbstractC2296h.f6680e);
        if (abstractC2296h == null) {
            abstractC2296h = AbstractC2296h.f6679d;
        }
        AbstractC2296h abstractC2296h2 = abstractC2296h;
        MediaMetadataRetriever m33288a = this.f6740c.m33288a();
        try {
            try {
                this.f6738a.mo33287a(m33288a, t);
                Bitmap m33297e = m33297e(m33288a, longValue, num.intValue(), i, i2, abstractC2296h2);
                m33288a.release();
                return C2293e.m33382e(m33297e, this.f6739b);
            } catch (RuntimeException e) {
                throw new IOException(e);
            }
        } catch (Throwable th) {
            m33288a.release();
            throw th;
        }
    }

    C2324w(InterfaceC2100e interfaceC2100e, InterfaceC2331f<T> interfaceC2331f, C2330e c2330e) {
        this.f6739b = interfaceC2100e;
        this.f6738a = interfaceC2331f;
        this.f6740c = c2330e;
    }
}
