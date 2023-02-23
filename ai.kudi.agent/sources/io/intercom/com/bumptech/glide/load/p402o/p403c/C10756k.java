package io.intercom.com.bumptech.glide.load.p402o.p403c;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Build;
import android.util.DisplayMetrics;
import android.util.Log;
import io.intercom.com.bumptech.glide.load.C10621f;
import io.intercom.com.bumptech.glide.load.C10623h;
import io.intercom.com.bumptech.glide.load.C10626i;
import io.intercom.com.bumptech.glide.load.EnumC10508b;
import io.intercom.com.bumptech.glide.load.InterfaceC10511e;
import io.intercom.com.bumptech.glide.load.engine.InterfaceC10569t;
import io.intercom.com.bumptech.glide.load.engine.p396y.InterfaceC10576b;
import io.intercom.com.bumptech.glide.load.engine.p396y.InterfaceC10581e;
import io.intercom.com.bumptech.glide.load.p402o.p403c.AbstractC10751j;
import io.intercom.com.bumptech.glide.p416r.C10888d;
import io.intercom.com.bumptech.glide.p416r.C10892h;
import io.intercom.com.bumptech.glide.p416r.C10893i;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.Collections;
import java.util.EnumSet;
import java.util.HashSet;
import java.util.List;
import java.util.Queue;
import java.util.Set;
/* compiled from: Downsampler.java */
/* renamed from: io.intercom.com.bumptech.glide.load.o.c.k */
/* loaded from: classes3.dex */
public final class C10756k {

    /* renamed from: f */
    public static final C10623h<EnumC10508b> f24580f = C10623h.m12595f("io.intercom.com.bumptech.glide.load.resource.bitmap.Downsampler.DecodeFormat", EnumC10508b.f24101f);

    /* renamed from: g */
    public static final C10623h<AbstractC10751j> f24581g = C10623h.m12595f("io.intercom.com.bumptech.glide.load.resource.bitmap.Downsampler.DownsampleStrategy", AbstractC10751j.f24576d);

    /* renamed from: h */
    public static final C10623h<Boolean> f24582h = C10623h.m12595f("io.intercom.com.bumptech.glide.load.resource.bitmap.Downsampler.FixBitmapSize", Boolean.FALSE);

    /* renamed from: i */
    public static final C10623h<Boolean> f24583i = C10623h.m12595f("com.bumtpech.glide.load.resource.bitmap.Downsampler.AllowHardwareDecode", null);

    /* renamed from: j */
    private static final Set<String> f24584j = Collections.unmodifiableSet(new HashSet(Arrays.asList("image/vnd.wap.wbmp", "image/x-ico")));

    /* renamed from: k */
    private static final InterfaceC10758b f24585k = new C10757a();

    /* renamed from: l */
    private static final Set<InterfaceC10511e.EnumC10512a> f24586l = Collections.unmodifiableSet(EnumSet.of(InterfaceC10511e.EnumC10512a.JPEG, InterfaceC10511e.EnumC10512a.PNG_A, InterfaceC10511e.EnumC10512a.PNG));

    /* renamed from: m */
    private static final Queue<BitmapFactory.Options> f24587m = C10893i.m12007f(0);

    /* renamed from: a */
    private final InterfaceC10581e f24588a;

    /* renamed from: b */
    private final DisplayMetrics f24589b;

    /* renamed from: c */
    private final InterfaceC10576b f24590c;

    /* renamed from: d */
    private final List<InterfaceC10511e> f24591d;

    /* renamed from: e */
    private final C10763o f24592e = C10763o.m12395a();

    /* compiled from: Downsampler.java */
    /* renamed from: io.intercom.com.bumptech.glide.load.o.c.k$a */
    /* loaded from: classes3.dex */
    static class C10757a implements InterfaceC10758b {
        C10757a() {
        }

        @Override // io.intercom.com.bumptech.glide.load.p402o.p403c.C10756k.InterfaceC10758b
        /* renamed from: a */
        public void mo12382a() {
        }

        @Override // io.intercom.com.bumptech.glide.load.p402o.p403c.C10756k.InterfaceC10758b
        /* renamed from: b */
        public void mo12381b(InterfaceC10581e interfaceC10581e, Bitmap bitmap) throws IOException {
        }
    }

    /* compiled from: Downsampler.java */
    /* renamed from: io.intercom.com.bumptech.glide.load.o.c.k$b */
    /* loaded from: classes3.dex */
    public interface InterfaceC10758b {
        /* renamed from: a */
        void mo12382a();

        /* renamed from: b */
        void mo12381b(InterfaceC10581e interfaceC10581e, Bitmap bitmap) throws IOException;
    }

    public C10756k(List<InterfaceC10511e> list, DisplayMetrics displayMetrics, InterfaceC10581e interfaceC10581e, InterfaceC10576b interfaceC10576b) {
        this.f24591d = list;
        C10892h.m12014d(displayMetrics);
        this.f24589b = displayMetrics;
        C10892h.m12014d(interfaceC10581e);
        this.f24588a = interfaceC10581e;
        C10892h.m12014d(interfaceC10576b);
        this.f24590c = interfaceC10576b;
    }

    /* renamed from: a */
    private static int m12422a(double d) {
        int m12413j = m12413j(d);
        double d2 = m12413j;
        Double.isNaN(d2);
        int m12403t = m12403t(d2 * d);
        double d3 = m12403t / m12413j;
        Double.isNaN(d3);
        double d4 = m12403t;
        Double.isNaN(d4);
        return m12403t((d / d3) * d4);
    }

    /* renamed from: b */
    private void m12421b(InputStream inputStream, EnumC10508b enumC10508b, boolean z, boolean z2, BitmapFactory.Options options, int i, int i2) {
        if (this.f24592e.m12393c(i, i2, options, enumC10508b, z, z2)) {
            return;
        }
        if (enumC10508b != EnumC10508b.PREFER_ARGB_8888 && enumC10508b != EnumC10508b.PREFER_ARGB_8888_DISALLOW_HARDWARE && Build.VERSION.SDK_INT != 16) {
            boolean z3 = false;
            try {
                z3 = C10621f.m12602b(this.f24591d, inputStream, this.f24590c).m12873a();
            } catch (IOException e) {
                if (Log.isLoggable("Downsampler", 3)) {
                    Log.d("Downsampler", "Cannot determine whether the image has alpha or not from header, format " + enumC10508b, e);
                }
            }
            Bitmap.Config config = z3 ? Bitmap.Config.ARGB_8888 : Bitmap.Config.RGB_565;
            options.inPreferredConfig = config;
            if (config == Bitmap.Config.RGB_565) {
                options.inDither = true;
                return;
            }
            return;
        }
        options.inPreferredConfig = Bitmap.Config.ARGB_8888;
    }

    /* renamed from: c */
    private static void m12420c(InterfaceC10511e.EnumC10512a enumC10512a, InputStream inputStream, InterfaceC10758b interfaceC10758b, InterfaceC10581e interfaceC10581e, AbstractC10751j abstractC10751j, int i, int i2, int i3, int i4, int i5, BitmapFactory.Options options) throws IOException {
        float mo12423b;
        int min;
        int max;
        int floor;
        double floor2;
        int i6;
        if (i2 <= 0 || i3 <= 0) {
            if (Log.isLoggable("Downsampler", 3)) {
                Log.d("Downsampler", "Unable to determine dimensions for: " + enumC10512a + " with target [" + i4 + "x" + i5 + "]");
                return;
            }
            return;
        }
        if (i != 90 && i != 270) {
            mo12423b = abstractC10751j.mo12423b(i2, i3, i4, i5);
        } else {
            mo12423b = abstractC10751j.mo12423b(i3, i2, i4, i5);
        }
        if (mo12423b > 0.0f) {
            AbstractC10751j.EnumC10755d mo12424a = abstractC10751j.mo12424a(i2, i3, i4, i5);
            if (mo12424a != null) {
                float f = i2;
                float f2 = i3;
                int m12403t = i2 / m12403t(mo12423b * f);
                int m12403t2 = i3 / m12403t(mo12423b * f2);
                if (mo12424a == AbstractC10751j.EnumC10755d.MEMORY) {
                    min = Math.max(m12403t, m12403t2);
                } else {
                    min = Math.min(m12403t, m12403t2);
                }
                if (Build.VERSION.SDK_INT > 23 || !f24584j.contains(options.outMimeType)) {
                    max = Math.max(1, Integer.highestOneBit(min));
                    if (mo12424a == AbstractC10751j.EnumC10755d.MEMORY && max < 1.0f / mo12423b) {
                        max <<= 1;
                    }
                } else {
                    max = 1;
                }
                options.inSampleSize = max;
                if (enumC10512a == InterfaceC10511e.EnumC10512a.JPEG) {
                    float min2 = Math.min(max, 8);
                    floor = (int) Math.ceil(f / min2);
                    i6 = (int) Math.ceil(f2 / min2);
                    int i7 = max / 8;
                    if (i7 > 0) {
                        floor /= i7;
                        i6 /= i7;
                    }
                } else {
                    if (enumC10512a != InterfaceC10511e.EnumC10512a.PNG && enumC10512a != InterfaceC10511e.EnumC10512a.PNG_A) {
                        if (enumC10512a != InterfaceC10511e.EnumC10512a.WEBP && enumC10512a != InterfaceC10511e.EnumC10512a.WEBP_A) {
                            if (i2 % max == 0 && i3 % max == 0) {
                                floor = i2 / max;
                                i6 = i3 / max;
                            } else {
                                int[] m12412k = m12412k(inputStream, options, interfaceC10758b, interfaceC10581e);
                                int i8 = m12412k[0];
                                i6 = m12412k[1];
                                floor = i8;
                            }
                        } else if (Build.VERSION.SDK_INT >= 24) {
                            float f3 = max;
                            floor = Math.round(f / f3);
                            i6 = Math.round(f2 / f3);
                        } else {
                            float f4 = max;
                            floor = (int) Math.floor(f / f4);
                            floor2 = Math.floor(f2 / f4);
                        }
                    } else {
                        float f5 = max;
                        floor = (int) Math.floor(f / f5);
                        floor2 = Math.floor(f2 / f5);
                    }
                    i6 = (int) floor2;
                }
                double mo12423b2 = abstractC10751j.mo12423b(floor, i6, i4, i5);
                if (Build.VERSION.SDK_INT >= 19) {
                    options.inTargetDensity = m12422a(mo12423b2);
                    options.inDensity = m12413j(mo12423b2);
                }
                if (m12408o(options)) {
                    options.inScaled = true;
                } else {
                    options.inTargetDensity = 0;
                    options.inDensity = 0;
                }
                if (Log.isLoggable("Downsampler", 2)) {
                    Log.v("Downsampler", "Calculate scaling, source: [" + i2 + "x" + i3 + "], target: [" + i4 + "x" + i5 + "], power of two scaled: [" + floor + "x" + i6 + "], exact scale factor: " + mo12423b + ", power of 2 sample size: " + max + ", adjusted scale factor: " + mo12423b2 + ", target density: " + options.inTargetDensity + ", density: " + options.inDensity);
                    return;
                }
                return;
            }
            throw new IllegalArgumentException("Cannot round with null rounding");
        }
        throw new IllegalArgumentException("Cannot scale with factor: " + mo12423b + " from: " + abstractC10751j + ", source: [" + i2 + "x" + i3 + "], target: [" + i4 + "x" + i5 + "]");
    }

    /* renamed from: f */
    private Bitmap m12417f(InputStream inputStream, BitmapFactory.Options options, AbstractC10751j abstractC10751j, EnumC10508b enumC10508b, boolean z, int i, int i2, boolean z2, InterfaceC10758b interfaceC10758b) throws IOException {
        C10756k c10756k;
        int round;
        int round2;
        int i3;
        long m12031b = C10888d.m12031b();
        int[] m12412k = m12412k(inputStream, options, interfaceC10758b, this.f24588a);
        int i4 = m12412k[0];
        int i5 = m12412k[1];
        String str = options.outMimeType;
        boolean z3 = (i4 == -1 || i5 == -1) ? false : z;
        int m12603a = C10621f.m12603a(this.f24591d, inputStream, this.f24590c);
        int m12374g = C10770t.m12374g(m12603a);
        boolean m12371j = C10770t.m12371j(m12603a);
        int i6 = i == Integer.MIN_VALUE ? i4 : i;
        int i7 = i2 == Integer.MIN_VALUE ? i5 : i2;
        InterfaceC10511e.EnumC10512a m12602b = C10621f.m12602b(this.f24591d, inputStream, this.f24590c);
        m12420c(m12602b, inputStream, interfaceC10758b, this.f24588a, abstractC10751j, m12374g, i4, i5, i6, i7, options);
        m12421b(inputStream, enumC10508b, z3, m12371j, options, i6, i7);
        boolean z4 = Build.VERSION.SDK_INT >= 19;
        if (options.inSampleSize == 1 || z4) {
            c10756k = this;
            if (c10756k.m12401v(m12602b)) {
                if (i4 < 0 || i5 < 0 || !z2 || !z4) {
                    float f = m12408o(options) ? options.inTargetDensity / options.inDensity : 1.0f;
                    int i8 = options.inSampleSize;
                    float f2 = i8;
                    round = Math.round(((int) Math.ceil(i4 / f2)) * f);
                    round2 = Math.round(((int) Math.ceil(i5 / f2)) * f);
                    if (Log.isLoggable("Downsampler", 2)) {
                        Log.v("Downsampler", "Calculated target [" + round + "x" + round2 + "] for source [" + i4 + "x" + i5 + "], sampleSize: " + i8 + ", targetDensity: " + options.inTargetDensity + ", density: " + options.inDensity + ", density multiplier: " + f);
                    }
                } else {
                    round = i6;
                    round2 = i7;
                }
                if (round > 0 && round2 > 0) {
                    m12402u(options, c10756k.f24588a, round, round2);
                }
            }
        } else {
            c10756k = this;
        }
        Bitmap m12416g = m12416g(inputStream, options, interfaceC10758b, c10756k.f24588a);
        interfaceC10758b.mo12381b(c10756k.f24588a, m12416g);
        if (Log.isLoggable("Downsampler", 2)) {
            i3 = m12603a;
            m12407p(i4, i5, str, options, m12416g, i, i2, m12031b);
        } else {
            i3 = m12603a;
        }
        Bitmap bitmap = null;
        if (m12416g != null) {
            m12416g.setDensity(c10756k.f24589b.densityDpi);
            bitmap = C10770t.m12369l(c10756k.f24588a, m12416g, i3);
            if (!m12416g.equals(bitmap)) {
                c10756k.f24588a.mo12398c(m12416g);
            }
        }
        return bitmap;
    }

    /* renamed from: g */
    private static Bitmap m12416g(InputStream inputStream, BitmapFactory.Options options, InterfaceC10758b interfaceC10758b, InterfaceC10581e interfaceC10581e) throws IOException {
        if (options.inJustDecodeBounds) {
            inputStream.mark(10485760);
        } else {
            interfaceC10758b.mo12382a();
        }
        int i = options.outWidth;
        int i2 = options.outHeight;
        String str = options.outMimeType;
        C10770t.m12375f().lock();
        try {
            try {
                Bitmap decodeStream = BitmapFactory.decodeStream(inputStream, null, options);
                C10770t.m12375f().unlock();
                if (options.inJustDecodeBounds) {
                    inputStream.reset();
                }
                return decodeStream;
            } catch (IllegalArgumentException e) {
                IOException m12406q = m12406q(e, i, i2, str, options);
                if (Log.isLoggable("Downsampler", 3)) {
                    Log.d("Downsampler", "Failed to decode with inBitmap, trying again without Bitmap re-use", m12406q);
                }
                if (options.inBitmap != null) {
                    try {
                        inputStream.reset();
                        interfaceC10581e.mo12398c(options.inBitmap);
                        options.inBitmap = null;
                        Bitmap m12416g = m12416g(inputStream, options, interfaceC10758b, interfaceC10581e);
                        C10770t.m12375f().unlock();
                        return m12416g;
                    } catch (IOException unused) {
                        throw m12406q;
                    }
                }
                throw m12406q;
            }
        } catch (Throwable th) {
            C10770t.m12375f().unlock();
            throw th;
        }
    }

    /* renamed from: h */
    private static String m12415h(Bitmap bitmap) {
        String str;
        if (bitmap == null) {
            return null;
        }
        if (Build.VERSION.SDK_INT >= 19) {
            str = " (" + bitmap.getAllocationByteCount() + ")";
        } else {
            str = "";
        }
        return "[" + bitmap.getWidth() + "x" + bitmap.getHeight() + "] " + bitmap.getConfig() + str;
    }

    /* renamed from: i */
    private static synchronized BitmapFactory.Options m12414i() {
        BitmapFactory.Options poll;
        synchronized (C10756k.class) {
            synchronized (f24587m) {
                poll = f24587m.poll();
            }
            if (poll == null) {
                poll = new BitmapFactory.Options();
                m12404s(poll);
            }
        }
        return poll;
    }

    /* renamed from: j */
    private static int m12413j(double d) {
        if (d > 1.0d) {
            d = 1.0d / d;
        }
        return (int) Math.round(d * 2.147483647E9d);
    }

    /* renamed from: k */
    private static int[] m12412k(InputStream inputStream, BitmapFactory.Options options, InterfaceC10758b interfaceC10758b, InterfaceC10581e interfaceC10581e) throws IOException {
        options.inJustDecodeBounds = true;
        m12416g(inputStream, options, interfaceC10758b, interfaceC10581e);
        options.inJustDecodeBounds = false;
        return new int[]{options.outWidth, options.outHeight};
    }

    /* renamed from: l */
    private static String m12411l(BitmapFactory.Options options) {
        return m12415h(options.inBitmap);
    }

    /* renamed from: o */
    private static boolean m12408o(BitmapFactory.Options options) {
        int i;
        int i2 = options.inTargetDensity;
        return i2 > 0 && (i = options.inDensity) > 0 && i2 != i;
    }

    /* renamed from: p */
    private static void m12407p(int i, int i2, String str, BitmapFactory.Options options, Bitmap bitmap, int i3, int i4, long j) {
        Log.v("Downsampler", "Decoded " + m12415h(bitmap) + " from [" + i + "x" + i2 + "] " + str + " with inBitmap " + m12411l(options) + " for [" + i3 + "x" + i4 + "], sample size: " + options.inSampleSize + ", density: " + options.inDensity + ", target density: " + options.inTargetDensity + ", thread: " + Thread.currentThread().getName() + ", duration: " + C10888d.m12032a(j));
    }

    /* renamed from: q */
    private static IOException m12406q(IllegalArgumentException illegalArgumentException, int i, int i2, String str, BitmapFactory.Options options) {
        return new IOException("Exception decoding bitmap, outWidth: " + i + ", outHeight: " + i2 + ", outMimeType: " + str + ", inBitmap: " + m12411l(options), illegalArgumentException);
    }

    /* renamed from: r */
    private static void m12405r(BitmapFactory.Options options) {
        m12404s(options);
        synchronized (f24587m) {
            f24587m.offer(options);
        }
    }

    /* renamed from: s */
    private static void m12404s(BitmapFactory.Options options) {
        options.inTempStorage = null;
        options.inDither = false;
        options.inScaled = false;
        options.inSampleSize = 1;
        options.inPreferredConfig = null;
        options.inJustDecodeBounds = false;
        options.inDensity = 0;
        options.inTargetDensity = 0;
        options.outWidth = 0;
        options.outHeight = 0;
        options.outMimeType = null;
        options.inBitmap = null;
        options.inMutable = true;
    }

    /* renamed from: t */
    private static int m12403t(double d) {
        return (int) (d + 0.5d);
    }

    /* renamed from: u */
    private static void m12402u(BitmapFactory.Options options, InterfaceC10581e interfaceC10581e, int i, int i2) {
        if (Build.VERSION.SDK_INT < 26 || options.inPreferredConfig != Bitmap.Config.HARDWARE) {
            options.inBitmap = interfaceC10581e.mo12669d(i, i2, options.inPreferredConfig);
        }
    }

    /* renamed from: v */
    private boolean m12401v(InterfaceC10511e.EnumC10512a enumC10512a) {
        if (Build.VERSION.SDK_INT >= 19) {
            return true;
        }
        return f24586l.contains(enumC10512a);
    }

    /* renamed from: d */
    public InterfaceC10569t<Bitmap> m12419d(InputStream inputStream, int i, int i2, C10626i c10626i) throws IOException {
        return m12418e(inputStream, i, i2, c10626i, f24585k);
    }

    /* renamed from: e */
    public InterfaceC10569t<Bitmap> m12418e(InputStream inputStream, int i, int i2, C10626i c10626i, InterfaceC10758b interfaceC10758b) throws IOException {
        C10892h.m12017a(inputStream.markSupported(), "You must provide an InputStream that supports mark()");
        byte[] bArr = (byte[]) this.f24590c.mo12686e(65536, byte[].class);
        BitmapFactory.Options m12414i = m12414i();
        m12414i.inTempStorage = bArr;
        EnumC10508b enumC10508b = (EnumC10508b) c10626i.m12593a(f24580f);
        try {
            return C10741d.m12447e(m12417f(inputStream, m12414i, (AbstractC10751j) c10626i.m12593a(f24581g), enumC10508b, enumC10508b == EnumC10508b.PREFER_ARGB_8888_DISALLOW_HARDWARE ? false : c10626i.m12593a(f24583i) != null && ((Boolean) c10626i.m12593a(f24583i)).booleanValue(), i, i2, ((Boolean) c10626i.m12593a(f24582h)).booleanValue(), interfaceC10758b), this.f24588a);
        } finally {
            m12405r(m12414i);
            this.f24590c.mo12687d(bArr);
        }
    }

    /* renamed from: m */
    public boolean m12410m(InputStream inputStream) {
        return true;
    }

    /* renamed from: n */
    public boolean m12409n(ByteBuffer byteBuffer) {
        return true;
    }
}
