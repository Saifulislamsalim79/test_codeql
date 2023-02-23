package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.ColorSpace;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import android.util.DisplayMetrics;
import android.util.Log;
import com.bumptech.glide.load.C2119g;
import com.bumptech.glide.load.C2122h;
import com.bumptech.glide.load.EnumC1994b;
import com.bumptech.glide.load.EnumC2123i;
import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.engine.InterfaceC2087u;
import com.bumptech.glide.load.engine.p069z.InterfaceC2095b;
import com.bumptech.glide.load.engine.p069z.InterfaceC2100e;
import com.bumptech.glide.load.p070m.C2146m;
import com.bumptech.glide.load.resource.bitmap.AbstractC2296h;
import com.bumptech.glide.load.resource.bitmap.InterfaceC2309n;
import com.bumptech.glide.p086q.C2376f;
import com.bumptech.glide.p086q.C2380j;
import com.bumptech.glide.p086q.C2381k;
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
/* renamed from: com.bumptech.glide.load.resource.bitmap.i */
/* loaded from: classes2.dex */
public final class C2301i {

    /* renamed from: f */
    public static final C2119g<EnumC1994b> f6685f = C2119g.m33663f("com.bumptech.glide.load.resource.bitmap.Downsampler.DecodeFormat", EnumC1994b.f6079e);

    /* renamed from: g */
    public static final C2119g<EnumC2123i> f6686g = C2119g.m33663f("com.bumptech.glide.load.resource.bitmap.Downsampler.PreferredColorSpace", EnumC2123i.SRGB);

    /* renamed from: h */
    public static final C2119g<Boolean> f6687h;

    /* renamed from: i */
    public static final C2119g<Boolean> f6688i;

    /* renamed from: j */
    private static final Set<String> f6689j;

    /* renamed from: k */
    private static final InterfaceC2303b f6690k;

    /* renamed from: l */
    private static final Set<ImageHeaderParser.ImageType> f6691l;

    /* renamed from: m */
    private static final Queue<BitmapFactory.Options> f6692m;

    /* renamed from: a */
    private final InterfaceC2100e f6693a;

    /* renamed from: b */
    private final DisplayMetrics f6694b;

    /* renamed from: c */
    private final InterfaceC2095b f6695c;

    /* renamed from: d */
    private final List<ImageHeaderParser> f6696d;

    /* renamed from: e */
    private final C2308m f6697e = C2308m.m33340a();

    /* compiled from: Downsampler.java */
    /* renamed from: com.bumptech.glide.load.resource.bitmap.i$a */
    /* loaded from: classes2.dex */
    class C2302a implements InterfaceC2303b {
        C2302a() {
        }

        @Override // com.bumptech.glide.load.resource.bitmap.C2301i.InterfaceC2303b
        /* renamed from: a */
        public void mo33316a() {
        }

        @Override // com.bumptech.glide.load.resource.bitmap.C2301i.InterfaceC2303b
        /* renamed from: b */
        public void mo33315b(InterfaceC2100e interfaceC2100e, Bitmap bitmap) {
        }
    }

    /* compiled from: Downsampler.java */
    /* renamed from: com.bumptech.glide.load.resource.bitmap.i$b */
    /* loaded from: classes2.dex */
    public interface InterfaceC2303b {
        /* renamed from: a */
        void mo33316a();

        /* renamed from: b */
        void mo33315b(InterfaceC2100e interfaceC2100e, Bitmap bitmap) throws IOException;
    }

    static {
        C2119g<AbstractC2296h> c2119g = AbstractC2296h.f6680e;
        f6687h = C2119g.m33663f("com.bumptech.glide.load.resource.bitmap.Downsampler.FixBitmapSize", Boolean.FALSE);
        f6688i = C2119g.m33663f("com.bumptech.glide.load.resource.bitmap.Downsampler.AllowHardwareDecode", Boolean.FALSE);
        f6689j = Collections.unmodifiableSet(new HashSet(Arrays.asList("image/vnd.wap.wbmp", "image/x-ico")));
        f6690k = new C2302a();
        f6691l = Collections.unmodifiableSet(EnumSet.of(ImageHeaderParser.ImageType.JPEG, ImageHeaderParser.ImageType.PNG_A, ImageHeaderParser.ImageType.PNG));
        f6692m = C2381k.m33123e(0);
    }

    public C2301i(List<ImageHeaderParser> list, DisplayMetrics displayMetrics, InterfaceC2100e interfaceC2100e, InterfaceC2095b interfaceC2095b) {
        this.f6696d = list;
        C2380j.m33129d(displayMetrics);
        this.f6694b = displayMetrics;
        C2380j.m33129d(interfaceC2100e);
        this.f6693a = interfaceC2100e;
        C2380j.m33129d(interfaceC2095b);
        this.f6695c = interfaceC2095b;
    }

    /* renamed from: a */
    private static int m33375a(double d) {
        int m33364l = m33364l(d);
        double d2 = m33364l;
        Double.isNaN(d2);
        int m33352x = m33352x(d2 * d);
        double d3 = m33352x / m33364l;
        Double.isNaN(d3);
        double d4 = m33352x;
        Double.isNaN(d4);
        return m33352x((d / d3) * d4);
    }

    /* renamed from: b */
    private void m33374b(InterfaceC2309n interfaceC2309n, EnumC1994b enumC1994b, boolean z, boolean z2, BitmapFactory.Options options, int i, int i2) {
        if (this.f6697e.m33336e(i, i2, options, z, z2)) {
            return;
        }
        if (enumC1994b != EnumC1994b.PREFER_ARGB_8888 && Build.VERSION.SDK_INT != 16) {
            boolean z3 = false;
            try {
                z3 = interfaceC2309n.mo33332d().hasAlpha();
            } catch (IOException e) {
                if (Log.isLoggable("Downsampler", 3)) {
                    Log.d("Downsampler", "Cannot determine whether the image has alpha or not from header, format " + enumC1994b, e);
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
    private static void m33373c(ImageHeaderParser.ImageType imageType, InterfaceC2309n interfaceC2309n, InterfaceC2303b interfaceC2303b, InterfaceC2100e interfaceC2100e, AbstractC2296h abstractC2296h, int i, int i2, int i3, int i4, int i5, BitmapFactory.Options options) throws IOException {
        int i6;
        int i7;
        int min;
        int max;
        int floor;
        double floor2;
        int i8;
        if (i2 > 0 && i3 > 0) {
            if (m33358r(i)) {
                i7 = i2;
                i6 = i3;
            } else {
                i6 = i2;
                i7 = i3;
            }
            float mo33376b = abstractC2296h.mo33376b(i6, i7, i4, i5);
            if (mo33376b > 0.0f) {
                AbstractC2296h.EnumC2300d mo33377a = abstractC2296h.mo33377a(i6, i7, i4, i5);
                if (mo33377a != null) {
                    float f = i6;
                    float f2 = i7;
                    int m33352x = i6 / m33352x(mo33376b * f);
                    int m33352x2 = i7 / m33352x(mo33376b * f2);
                    if (mo33377a == AbstractC2296h.EnumC2300d.MEMORY) {
                        min = Math.max(m33352x, m33352x2);
                    } else {
                        min = Math.min(m33352x, m33352x2);
                    }
                    if (Build.VERSION.SDK_INT > 23 || !f6689j.contains(options.outMimeType)) {
                        max = Math.max(1, Integer.highestOneBit(min));
                        if (mo33377a == AbstractC2296h.EnumC2300d.MEMORY && max < 1.0f / mo33376b) {
                            max <<= 1;
                        }
                    } else {
                        max = 1;
                    }
                    options.inSampleSize = max;
                    if (imageType == ImageHeaderParser.ImageType.JPEG) {
                        float min2 = Math.min(max, 8);
                        floor = (int) Math.ceil(f / min2);
                        i8 = (int) Math.ceil(f2 / min2);
                        int i9 = max / 8;
                        if (i9 > 0) {
                            floor /= i9;
                            i8 /= i9;
                        }
                    } else {
                        if (imageType != ImageHeaderParser.ImageType.PNG && imageType != ImageHeaderParser.ImageType.PNG_A) {
                            if (imageType != ImageHeaderParser.ImageType.WEBP && imageType != ImageHeaderParser.ImageType.WEBP_A) {
                                if (i6 % max == 0 && i7 % max == 0) {
                                    floor = i6 / max;
                                    i8 = i7 / max;
                                } else {
                                    int[] m33363m = m33363m(interfaceC2309n, options, interfaceC2303b, interfaceC2100e);
                                    floor = m33363m[0];
                                    i8 = m33363m[1];
                                }
                            } else if (Build.VERSION.SDK_INT >= 24) {
                                float f3 = max;
                                floor = Math.round(f / f3);
                                i8 = Math.round(f2 / f3);
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
                        i8 = (int) floor2;
                    }
                    double mo33376b2 = abstractC2296h.mo33376b(floor, i8, i4, i5);
                    if (Build.VERSION.SDK_INT >= 19) {
                        options.inTargetDensity = m33375a(mo33376b2);
                        options.inDensity = m33364l(mo33376b2);
                    }
                    if (m33357s(options)) {
                        options.inScaled = true;
                    } else {
                        options.inTargetDensity = 0;
                        options.inDensity = 0;
                    }
                    if (Log.isLoggable("Downsampler", 2)) {
                        Log.v("Downsampler", "Calculate scaling, source: [" + i2 + "x" + i3 + "], degreesToRotate: " + i + ", target: [" + i4 + "x" + i5 + "], power of two scaled: [" + floor + "x" + i8 + "], exact scale factor: " + mo33376b + ", power of 2 sample size: " + max + ", adjusted scale factor: " + mo33376b2 + ", target density: " + options.inTargetDensity + ", density: " + options.inDensity);
                        return;
                    }
                    return;
                }
                throw new IllegalArgumentException("Cannot round with null rounding");
            }
            throw new IllegalArgumentException("Cannot scale with factor: " + mo33376b + " from: " + abstractC2296h + ", source: [" + i2 + "x" + i3 + "], target: [" + i4 + "x" + i5 + "]");
        } else if (Log.isLoggable("Downsampler", 3)) {
            Log.d("Downsampler", "Unable to determine dimensions for: " + imageType + " with target [" + i4 + "x" + i5 + "]");
        }
    }

    /* renamed from: e */
    private InterfaceC2087u<Bitmap> m33371e(InterfaceC2309n interfaceC2309n, int i, int i2, C2122h c2122h, InterfaceC2303b interfaceC2303b) throws IOException {
        byte[] bArr = (byte[]) this.f6695c.mo33714e(65536, byte[].class);
        BitmapFactory.Options m33365k = m33365k();
        m33365k.inTempStorage = bArr;
        EnumC1994b enumC1994b = (EnumC1994b) c2122h.m33661b(f6685f);
        EnumC2123i enumC2123i = (EnumC2123i) c2122h.m33661b(f6686g);
        try {
            return C2293e.m33382e(m33368h(interfaceC2309n, m33365k, (AbstractC2296h) c2122h.m33661b(AbstractC2296h.f6680e), enumC1994b, enumC2123i, c2122h.m33661b(f6688i) != null && ((Boolean) c2122h.m33661b(f6688i)).booleanValue(), i, i2, ((Boolean) c2122h.m33661b(f6687h)).booleanValue(), interfaceC2303b), this.f6693a);
        } finally {
            m33354v(m33365k);
            this.f6695c.mo33715d(bArr);
        }
    }

    /* renamed from: h */
    private Bitmap m33368h(InterfaceC2309n interfaceC2309n, BitmapFactory.Options options, AbstractC2296h abstractC2296h, EnumC1994b enumC1994b, EnumC2123i enumC2123i, boolean z, int i, int i2, boolean z2, InterfaceC2303b interfaceC2303b) throws IOException {
        int i3;
        int i4;
        int i5;
        C2301i c2301i;
        int round;
        int round2;
        int i6;
        ColorSpace colorSpace;
        long m33145b = C2376f.m33145b();
        int[] m33363m = m33363m(interfaceC2309n, options, interfaceC2303b, this.f6693a);
        boolean z3 = false;
        int i7 = m33363m[0];
        int i8 = m33363m[1];
        String str = options.outMimeType;
        boolean z4 = (i7 == -1 || i8 == -1) ? false : z;
        int mo33335a = interfaceC2309n.mo33335a();
        int m33311d = C2320u.m33311d(mo33335a);
        boolean m33308g = C2320u.m33308g(mo33335a);
        if (i == Integer.MIN_VALUE) {
            i3 = i2;
            i4 = m33358r(m33311d) ? i8 : i7;
        } else {
            i3 = i2;
            i4 = i;
        }
        if (i3 == Integer.MIN_VALUE) {
            i5 = m33358r(m33311d) ? i7 : i8;
        } else {
            i5 = i3;
        }
        ImageHeaderParser.ImageType mo33332d = interfaceC2309n.mo33332d();
        m33373c(mo33332d, interfaceC2309n, interfaceC2303b, this.f6693a, abstractC2296h, m33311d, i7, i8, i4, i5, options);
        m33374b(interfaceC2309n, enumC1994b, z4, m33308g, options, i4, i5);
        boolean z5 = Build.VERSION.SDK_INT >= 19;
        if (options.inSampleSize == 1 || z5) {
            c2301i = this;
            if (c2301i.m33350z(mo33332d)) {
                if (i7 < 0 || i8 < 0 || !z2 || !z5) {
                    float f = m33357s(options) ? options.inTargetDensity / options.inDensity : 1.0f;
                    int i9 = options.inSampleSize;
                    float f2 = i9;
                    round = Math.round(((int) Math.ceil(i7 / f2)) * f);
                    round2 = Math.round(((int) Math.ceil(i8 / f2)) * f);
                    if (Log.isLoggable("Downsampler", 2)) {
                        Log.v("Downsampler", "Calculated target [" + round + "x" + round2 + "] for source [" + i7 + "x" + i8 + "], sampleSize: " + i9 + ", targetDensity: " + options.inTargetDensity + ", density: " + options.inDensity + ", density multiplier: " + f);
                    }
                } else {
                    round = i4;
                    round2 = i5;
                }
                if (round > 0 && round2 > 0) {
                    m33351y(options, c2301i.f6693a, round, round2);
                }
            }
        } else {
            c2301i = this;
        }
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 28) {
            if (enumC2123i == EnumC2123i.DISPLAY_P3 && (colorSpace = options.outColorSpace) != null && colorSpace.isWideGamut()) {
                z3 = true;
            }
            options.inPreferredColorSpace = ColorSpace.get(z3 ? ColorSpace.Named.DISPLAY_P3 : ColorSpace.Named.SRGB);
        } else if (i10 >= 26) {
            options.inPreferredColorSpace = ColorSpace.get(ColorSpace.Named.SRGB);
        }
        Bitmap m33367i = m33367i(interfaceC2309n, options, interfaceC2303b, c2301i.f6693a);
        interfaceC2303b.mo33315b(c2301i.f6693a, m33367i);
        if (Log.isLoggable("Downsampler", 2)) {
            i6 = mo33335a;
            m33356t(i7, i8, str, options, m33367i, i, i2, m33145b);
        } else {
            i6 = mo33335a;
        }
        Bitmap bitmap = null;
        if (m33367i != null) {
            m33367i.setDensity(c2301i.f6694b.densityDpi);
            bitmap = C2320u.m33307h(c2301i.f6693a, m33367i, i6);
            if (!m33367i.equals(bitmap)) {
                c2301i.f6693a.mo33347c(m33367i);
            }
        }
        return bitmap;
    }

    /* renamed from: i */
    private static Bitmap m33367i(InterfaceC2309n interfaceC2309n, BitmapFactory.Options options, InterfaceC2303b interfaceC2303b, InterfaceC2100e interfaceC2100e) throws IOException {
        if (!options.inJustDecodeBounds) {
            interfaceC2303b.mo33316a();
            interfaceC2309n.mo33333c();
        }
        int i = options.outWidth;
        int i2 = options.outHeight;
        String str = options.outMimeType;
        C2320u.m33312c().lock();
        try {
            try {
                Bitmap mo33334b = interfaceC2309n.mo33334b(options);
                C2320u.m33312c().unlock();
                return mo33334b;
            } catch (IllegalArgumentException e) {
                IOException m33355u = m33355u(e, i, i2, str, options);
                if (Log.isLoggable("Downsampler", 3)) {
                    Log.d("Downsampler", "Failed to decode with inBitmap, trying again without Bitmap re-use", m33355u);
                }
                if (options.inBitmap != null) {
                    try {
                        interfaceC2100e.mo33347c(options.inBitmap);
                        options.inBitmap = null;
                        Bitmap m33367i = m33367i(interfaceC2309n, options, interfaceC2303b, interfaceC2100e);
                        C2320u.m33312c().unlock();
                        return m33367i;
                    } catch (IOException unused) {
                        throw m33355u;
                    }
                }
                throw m33355u;
            }
        } catch (Throwable th) {
            C2320u.m33312c().unlock();
            throw th;
        }
    }

    /* renamed from: j */
    private static String m33366j(Bitmap bitmap) {
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

    /* renamed from: k */
    private static synchronized BitmapFactory.Options m33365k() {
        BitmapFactory.Options poll;
        synchronized (C2301i.class) {
            synchronized (f6692m) {
                poll = f6692m.poll();
            }
            if (poll == null) {
                poll = new BitmapFactory.Options();
                m33353w(poll);
            }
        }
        return poll;
    }

    /* renamed from: l */
    private static int m33364l(double d) {
        if (d > 1.0d) {
            d = 1.0d / d;
        }
        return (int) Math.round(d * 2.147483647E9d);
    }

    /* renamed from: m */
    private static int[] m33363m(InterfaceC2309n interfaceC2309n, BitmapFactory.Options options, InterfaceC2303b interfaceC2303b, InterfaceC2100e interfaceC2100e) throws IOException {
        options.inJustDecodeBounds = true;
        m33367i(interfaceC2309n, options, interfaceC2303b, interfaceC2100e);
        options.inJustDecodeBounds = false;
        return new int[]{options.outWidth, options.outHeight};
    }

    /* renamed from: n */
    private static String m33362n(BitmapFactory.Options options) {
        return m33366j(options.inBitmap);
    }

    /* renamed from: r */
    private static boolean m33358r(int i) {
        return i == 90 || i == 270;
    }

    /* renamed from: s */
    private static boolean m33357s(BitmapFactory.Options options) {
        int i;
        int i2 = options.inTargetDensity;
        return i2 > 0 && (i = options.inDensity) > 0 && i2 != i;
    }

    /* renamed from: t */
    private static void m33356t(int i, int i2, String str, BitmapFactory.Options options, Bitmap bitmap, int i3, int i4, long j) {
        Log.v("Downsampler", "Decoded " + m33366j(bitmap) + " from [" + i + "x" + i2 + "] " + str + " with inBitmap " + m33362n(options) + " for [" + i3 + "x" + i4 + "], sample size: " + options.inSampleSize + ", density: " + options.inDensity + ", target density: " + options.inTargetDensity + ", thread: " + Thread.currentThread().getName() + ", duration: " + C2376f.m33146a(j));
    }

    /* renamed from: u */
    private static IOException m33355u(IllegalArgumentException illegalArgumentException, int i, int i2, String str, BitmapFactory.Options options) {
        return new IOException("Exception decoding bitmap, outWidth: " + i + ", outHeight: " + i2 + ", outMimeType: " + str + ", inBitmap: " + m33362n(options), illegalArgumentException);
    }

    /* renamed from: v */
    private static void m33354v(BitmapFactory.Options options) {
        m33353w(options);
        synchronized (f6692m) {
            f6692m.offer(options);
        }
    }

    /* renamed from: w */
    private static void m33353w(BitmapFactory.Options options) {
        options.inTempStorage = null;
        options.inDither = false;
        options.inScaled = false;
        options.inSampleSize = 1;
        options.inPreferredConfig = null;
        options.inJustDecodeBounds = false;
        options.inDensity = 0;
        options.inTargetDensity = 0;
        if (Build.VERSION.SDK_INT >= 26) {
            options.inPreferredColorSpace = null;
            options.outColorSpace = null;
            options.outConfig = null;
        }
        options.outWidth = 0;
        options.outHeight = 0;
        options.outMimeType = null;
        options.inBitmap = null;
        options.inMutable = true;
    }

    /* renamed from: x */
    private static int m33352x(double d) {
        return (int) (d + 0.5d);
    }

    /* renamed from: y */
    private static void m33351y(BitmapFactory.Options options, InterfaceC2100e interfaceC2100e, int i, int i2) {
        Bitmap.Config config;
        if (Build.VERSION.SDK_INT < 26) {
            config = null;
        } else if (options.inPreferredConfig == Bitmap.Config.HARDWARE) {
            return;
        } else {
            config = options.outConfig;
        }
        if (config == null) {
            config = options.inPreferredConfig;
        }
        options.inBitmap = interfaceC2100e.mo33697d(i, i2, config);
    }

    /* renamed from: z */
    private boolean m33350z(ImageHeaderParser.ImageType imageType) {
        if (Build.VERSION.SDK_INT >= 19) {
            return true;
        }
        return f6691l.contains(imageType);
    }

    /* renamed from: d */
    public InterfaceC2087u<Bitmap> m33372d(ParcelFileDescriptor parcelFileDescriptor, int i, int i2, C2122h c2122h) throws IOException {
        return m33371e(new InterfaceC2309n.C2311b(parcelFileDescriptor, this.f6696d, this.f6695c), i, i2, c2122h, f6690k);
    }

    /* renamed from: f */
    public InterfaceC2087u<Bitmap> m33370f(InputStream inputStream, int i, int i2, C2122h c2122h) throws IOException {
        return m33369g(inputStream, i, i2, c2122h, f6690k);
    }

    /* renamed from: g */
    public InterfaceC2087u<Bitmap> m33369g(InputStream inputStream, int i, int i2, C2122h c2122h, InterfaceC2303b interfaceC2303b) throws IOException {
        return m33371e(new InterfaceC2309n.C2310a(inputStream, this.f6696d, this.f6695c), i, i2, c2122h, interfaceC2303b);
    }

    /* renamed from: o */
    public boolean m33361o(ParcelFileDescriptor parcelFileDescriptor) {
        return C2146m.m33638c();
    }

    /* renamed from: p */
    public boolean m33360p(InputStream inputStream) {
        return true;
    }

    /* renamed from: q */
    public boolean m33359q(ByteBuffer byteBuffer) {
        return true;
    }
}
