package com.bumptech.glide.load.engine.p067a0;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Build;
import android.text.format.Formatter;
import android.util.DisplayMetrics;
import android.util.Log;
/* compiled from: MemorySizeCalculator.java */
/* renamed from: com.bumptech.glide.load.engine.a0.i */
/* loaded from: classes2.dex */
public final class C2027i {

    /* renamed from: a */
    private final int f6127a;

    /* renamed from: b */
    private final int f6128b;

    /* renamed from: c */
    private final Context f6129c;

    /* renamed from: d */
    private final int f6130d;

    /* compiled from: MemorySizeCalculator.java */
    /* renamed from: com.bumptech.glide.load.engine.a0.i$a */
    /* loaded from: classes2.dex */
    public static final class C2028a {

        /* renamed from: i */
        static final int f6131i;

        /* renamed from: a */
        final Context f6132a;

        /* renamed from: b */
        ActivityManager f6133b;

        /* renamed from: c */
        InterfaceC2030c f6134c;

        /* renamed from: e */
        float f6136e;

        /* renamed from: d */
        float f6135d = 2.0f;

        /* renamed from: f */
        float f6137f = 0.4f;

        /* renamed from: g */
        float f6138g = 0.33f;

        /* renamed from: h */
        int f6139h = 4194304;

        static {
            f6131i = Build.VERSION.SDK_INT < 26 ? 4 : 1;
        }

        public C2028a(Context context) {
            this.f6136e = f6131i;
            this.f6132a = context;
            this.f6133b = (ActivityManager) context.getSystemService("activity");
            this.f6134c = new C2029b(context.getResources().getDisplayMetrics());
            if (Build.VERSION.SDK_INT < 26 || !C2027i.m33902e(this.f6133b)) {
                return;
            }
            this.f6136e = 0.0f;
        }

        /* renamed from: a */
        public C2027i m33900a() {
            return new C2027i(this);
        }
    }

    /* compiled from: MemorySizeCalculator.java */
    /* renamed from: com.bumptech.glide.load.engine.a0.i$b */
    /* loaded from: classes2.dex */
    private static final class C2029b implements InterfaceC2030c {

        /* renamed from: a */
        private final DisplayMetrics f6140a;

        C2029b(DisplayMetrics displayMetrics) {
            this.f6140a = displayMetrics;
        }

        @Override // com.bumptech.glide.load.engine.p067a0.C2027i.InterfaceC2030c
        /* renamed from: a */
        public int mo33899a() {
            return this.f6140a.heightPixels;
        }

        @Override // com.bumptech.glide.load.engine.p067a0.C2027i.InterfaceC2030c
        /* renamed from: b */
        public int mo33898b() {
            return this.f6140a.widthPixels;
        }
    }

    /* compiled from: MemorySizeCalculator.java */
    /* renamed from: com.bumptech.glide.load.engine.a0.i$c */
    /* loaded from: classes2.dex */
    interface InterfaceC2030c {
        /* renamed from: a */
        int mo33899a();

        /* renamed from: b */
        int mo33898b();
    }

    C2027i(C2028a c2028a) {
        int i;
        this.f6129c = c2028a.f6132a;
        if (m33902e(c2028a.f6133b)) {
            i = c2028a.f6139h / 2;
        } else {
            i = c2028a.f6139h;
        }
        this.f6130d = i;
        int m33904c = m33904c(c2028a.f6133b, c2028a.f6137f, c2028a.f6138g);
        float mo33898b = c2028a.f6134c.mo33898b() * c2028a.f6134c.mo33899a() * 4;
        int round = Math.round(c2028a.f6136e * mo33898b);
        int round2 = Math.round(mo33898b * c2028a.f6135d);
        int i2 = m33904c - this.f6130d;
        int i3 = round2 + round;
        if (i3 <= i2) {
            this.f6128b = round2;
            this.f6127a = round;
        } else {
            float f = i2;
            float f2 = c2028a.f6136e;
            float f3 = c2028a.f6135d;
            float f4 = f / (f2 + f3);
            this.f6128b = Math.round(f3 * f4);
            this.f6127a = Math.round(f4 * c2028a.f6136e);
        }
        if (Log.isLoggable("MemorySizeCalculator", 3)) {
            StringBuilder sb = new StringBuilder();
            sb.append("Calculation complete, Calculated memory cache size: ");
            sb.append(m33901f(this.f6128b));
            sb.append(", pool size: ");
            sb.append(m33901f(this.f6127a));
            sb.append(", byte array size: ");
            sb.append(m33901f(this.f6130d));
            sb.append(", memory class limited? ");
            sb.append(i3 > m33904c);
            sb.append(", max size: ");
            sb.append(m33901f(m33904c));
            sb.append(", memoryClass: ");
            sb.append(c2028a.f6133b.getMemoryClass());
            sb.append(", isLowMemoryDevice: ");
            sb.append(m33902e(c2028a.f6133b));
            Log.d("MemorySizeCalculator", sb.toString());
        }
    }

    /* renamed from: c */
    private static int m33904c(ActivityManager activityManager, float f, float f2) {
        boolean m33902e = m33902e(activityManager);
        float memoryClass = activityManager.getMemoryClass() * 1024 * 1024;
        if (m33902e) {
            f = f2;
        }
        return Math.round(memoryClass * f);
    }

    /* renamed from: e */
    static boolean m33902e(ActivityManager activityManager) {
        if (Build.VERSION.SDK_INT >= 19) {
            return activityManager.isLowRamDevice();
        }
        return true;
    }

    /* renamed from: f */
    private String m33901f(int i) {
        return Formatter.formatFileSize(this.f6129c, i);
    }

    /* renamed from: a */
    public int m33906a() {
        return this.f6130d;
    }

    /* renamed from: b */
    public int m33905b() {
        return this.f6127a;
    }

    /* renamed from: d */
    public int m33903d() {
        return this.f6128b;
    }
}
