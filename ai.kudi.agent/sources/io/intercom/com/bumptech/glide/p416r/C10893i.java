package io.intercom.com.bumptech.glide.p416r;

import android.graphics.Bitmap;
import android.os.Build;
import android.os.Looper;
import io.intercom.com.bumptech.glide.load.p400n.InterfaceC10693l;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Queue;
/* compiled from: Util.java */
/* renamed from: io.intercom.com.bumptech.glide.r.i */
/* loaded from: classes3.dex */
public final class C10893i {

    /* renamed from: a */
    private static final char[] f24862a = "0123456789abcdef".toCharArray();

    /* renamed from: b */
    private static final char[] f24863b = new char[64];

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Util.java */
    /* renamed from: io.intercom.com.bumptech.glide.r.i$a */
    /* loaded from: classes3.dex */
    public static /* synthetic */ class C10894a {

        /* renamed from: a */
        static final /* synthetic */ int[] f24864a;

        static {
            int[] iArr = new int[Bitmap.Config.values().length];
            f24864a = iArr;
            try {
                iArr[Bitmap.Config.ALPHA_8.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f24864a[Bitmap.Config.RGB_565.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f24864a[Bitmap.Config.ARGB_4444.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f24864a[Bitmap.Config.ARGB_8888.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* renamed from: a */
    public static void m12012a() {
        if (!m11997p()) {
            throw new IllegalArgumentException("You must call this method on a background thread");
        }
    }

    /* renamed from: b */
    public static void m12011b() {
        if (!m11996q()) {
            throw new IllegalArgumentException("You must call this method on the main thread");
        }
    }

    /* renamed from: c */
    public static boolean m12010c(Object obj, Object obj2) {
        if (obj == null) {
            return obj2 == null;
        } else if (obj instanceof InterfaceC10693l) {
            return ((InterfaceC10693l) obj).m12512a(obj2);
        } else {
            return obj.equals(obj2);
        }
    }

    /* renamed from: d */
    public static boolean m12009d(Object obj, Object obj2) {
        if (obj == null) {
            return obj2 == null;
        }
        return obj.equals(obj2);
    }

    /* renamed from: e */
    private static String m12008e(byte[] bArr, char[] cArr) {
        for (int i = 0; i < bArr.length; i++) {
            int i2 = bArr[i] & 255;
            int i3 = i * 2;
            char[] cArr2 = f24862a;
            cArr[i3] = cArr2[i2 >>> 4];
            cArr[i3 + 1] = cArr2[i2 & 15];
        }
        return new String(cArr);
    }

    /* renamed from: f */
    public static <T> Queue<T> m12007f(int i) {
        return new ArrayDeque(i);
    }

    /* renamed from: g */
    public static int m12006g(int i, int i2, Bitmap.Config config) {
        return i * i2 * m12004i(config);
    }

    /* renamed from: h */
    public static int m12005h(Bitmap bitmap) {
        if (!bitmap.isRecycled()) {
            if (Build.VERSION.SDK_INT >= 19) {
                try {
                    return bitmap.getAllocationByteCount();
                } catch (NullPointerException unused) {
                }
            }
            return bitmap.getHeight() * bitmap.getRowBytes();
        }
        throw new IllegalStateException("Cannot obtain size for recycled Bitmap: " + bitmap + "[" + bitmap.getWidth() + "x" + bitmap.getHeight() + "] " + bitmap.getConfig());
    }

    /* renamed from: i */
    private static int m12004i(Bitmap.Config config) {
        if (config == null) {
            config = Bitmap.Config.ARGB_8888;
        }
        int i = C10894a.f24864a[config.ordinal()];
        if (i != 1) {
            return (i == 2 || i == 3) ? 2 : 4;
        }
        return 1;
    }

    /* renamed from: j */
    public static <T> List<T> m12003j(Collection<T> collection) {
        ArrayList arrayList = new ArrayList(collection.size());
        for (T t : collection) {
            if (t != null) {
                arrayList.add(t);
            }
        }
        return arrayList;
    }

    /* renamed from: k */
    public static int m12002k(float f) {
        return m12001l(f, 17);
    }

    /* renamed from: l */
    public static int m12001l(float f, int i) {
        return m12000m(Float.floatToIntBits(f), i);
    }

    /* renamed from: m */
    public static int m12000m(int i, int i2) {
        return (i2 * 31) + i;
    }

    /* renamed from: n */
    public static int m11999n(Object obj, int i) {
        return m12000m(obj == null ? 0 : obj.hashCode(), i);
    }

    /* renamed from: o */
    public static int m11998o(boolean z, int i) {
        return m12000m(z ? 1 : 0, i);
    }

    /* renamed from: p */
    public static boolean m11997p() {
        return !m11996q();
    }

    /* renamed from: q */
    public static boolean m11996q() {
        return Looper.myLooper() == Looper.getMainLooper();
    }

    /* renamed from: r */
    private static boolean m11995r(int i) {
        return i > 0 || i == Integer.MIN_VALUE;
    }

    /* renamed from: s */
    public static boolean m11994s(int i, int i2) {
        return m11995r(i) && m11995r(i2);
    }

    /* renamed from: t */
    public static String m11993t(byte[] bArr) {
        String m12008e;
        synchronized (f24863b) {
            m12008e = m12008e(bArr, f24863b);
        }
        return m12008e;
    }
}
