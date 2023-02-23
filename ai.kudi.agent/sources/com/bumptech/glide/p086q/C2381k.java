package com.bumptech.glide.p086q;

import android.graphics.Bitmap;
import android.os.Build;
import android.os.Looper;
import com.bumptech.glide.load.p072n.InterfaceC2195l;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Queue;
/* compiled from: Util.java */
/* renamed from: com.bumptech.glide.q.k */
/* loaded from: classes2.dex */
public final class C2381k {

    /* renamed from: a */
    private static final char[] f6875a = "0123456789abcdef".toCharArray();

    /* renamed from: b */
    private static final char[] f6876b = new char[64];

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Util.java */
    /* renamed from: com.bumptech.glide.q.k$a */
    /* loaded from: classes2.dex */
    public static /* synthetic */ class C2382a {

        /* renamed from: a */
        static final /* synthetic */ int[] f6877a;

        static {
            int[] iArr = new int[Bitmap.Config.values().length];
            f6877a = iArr;
            try {
                iArr[Bitmap.Config.ALPHA_8.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f6877a[Bitmap.Config.RGB_565.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f6877a[Bitmap.Config.ARGB_4444.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f6877a[Bitmap.Config.RGBA_F16.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f6877a[Bitmap.Config.ARGB_8888.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    /* renamed from: a */
    public static void m33127a() {
        if (!m33112p()) {
            throw new IllegalArgumentException("You must call this method on the main thread");
        }
    }

    /* renamed from: b */
    public static boolean m33126b(Object obj, Object obj2) {
        if (obj == null) {
            return obj2 == null;
        } else if (obj instanceof InterfaceC2195l) {
            return ((InterfaceC2195l) obj).m33561a(obj2);
        } else {
            return obj.equals(obj2);
        }
    }

    /* renamed from: c */
    public static boolean m33125c(Object obj, Object obj2) {
        if (obj == null) {
            return obj2 == null;
        }
        return obj.equals(obj2);
    }

    /* renamed from: d */
    private static String m33124d(byte[] bArr, char[] cArr) {
        for (int i = 0; i < bArr.length; i++) {
            int i2 = bArr[i] & 255;
            int i3 = i * 2;
            char[] cArr2 = f6875a;
            cArr[i3] = cArr2[i2 >>> 4];
            cArr[i3 + 1] = cArr2[i2 & 15];
        }
        return new String(cArr);
    }

    /* renamed from: e */
    public static <T> Queue<T> m33123e(int i) {
        return new ArrayDeque(i);
    }

    /* renamed from: f */
    public static int m33122f(int i, int i2, Bitmap.Config config) {
        return i * i2 * m33120h(config);
    }

    /* renamed from: g */
    public static int m33121g(Bitmap bitmap) {
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

    /* renamed from: h */
    private static int m33120h(Bitmap.Config config) {
        if (config == null) {
            config = Bitmap.Config.ARGB_8888;
        }
        int i = C2382a.f6877a[config.ordinal()];
        if (i != 1) {
            if (i == 2 || i == 3) {
                return 2;
            }
            return i != 4 ? 4 : 8;
        }
        return 1;
    }

    /* renamed from: i */
    public static <T> List<T> m33119i(Collection<T> collection) {
        ArrayList arrayList = new ArrayList(collection.size());
        for (T t : collection) {
            if (t != null) {
                arrayList.add(t);
            }
        }
        return arrayList;
    }

    /* renamed from: j */
    public static int m33118j(float f) {
        return m33117k(f, 17);
    }

    /* renamed from: k */
    public static int m33117k(float f, int i) {
        return m33116l(Float.floatToIntBits(f), i);
    }

    /* renamed from: l */
    public static int m33116l(int i, int i2) {
        return (i2 * 31) + i;
    }

    /* renamed from: m */
    public static int m33115m(Object obj, int i) {
        return m33116l(obj == null ? 0 : obj.hashCode(), i);
    }

    /* renamed from: n */
    public static int m33114n(boolean z, int i) {
        return m33116l(z ? 1 : 0, i);
    }

    /* renamed from: o */
    public static boolean m33113o() {
        return !m33112p();
    }

    /* renamed from: p */
    public static boolean m33112p() {
        return Looper.myLooper() == Looper.getMainLooper();
    }

    /* renamed from: q */
    private static boolean m33111q(int i) {
        return i > 0 || i == Integer.MIN_VALUE;
    }

    /* renamed from: r */
    public static boolean m33110r(int i, int i2) {
        return m33111q(i) && m33111q(i2);
    }

    /* renamed from: s */
    public static String m33109s(byte[] bArr) {
        String m33124d;
        synchronized (f6876b) {
            m33124d = m33124d(bArr, f6876b);
        }
        return m33124d;
    }
}
