package io.intercom.com.bumptech.glide.load.engine.p397z;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Build;
import android.text.format.Formatter;
import android.util.DisplayMetrics;
import android.util.Log;
/* compiled from: MemorySizeCalculator.java */
/* renamed from: io.intercom.com.bumptech.glide.load.engine.z.i */
/* loaded from: classes3.dex */
public final class C10614i {

    /* renamed from: a */
    private final int f24400a;

    /* renamed from: b */
    private final int f24401b;

    /* renamed from: c */
    private final Context f24402c;

    /* renamed from: d */
    private final int f24403d;

    /* compiled from: MemorySizeCalculator.java */
    /* renamed from: io.intercom.com.bumptech.glide.load.engine.z.i$a */
    /* loaded from: classes3.dex */
    public static final class C10615a {

        /* renamed from: i */
        static final int f24404i;

        /* renamed from: a */
        private final Context f24405a;

        /* renamed from: b */
        private ActivityManager f24406b;

        /* renamed from: c */
        private InterfaceC10617c f24407c;

        /* renamed from: e */
        private float f24409e;

        /* renamed from: d */
        private float f24408d = 2.0f;

        /* renamed from: f */
        private float f24410f = 0.4f;

        /* renamed from: g */
        private float f24411g = 0.33f;

        /* renamed from: h */
        private int f24412h = 4194304;

        static {
            f24404i = Build.VERSION.SDK_INT < 26 ? 4 : 1;
        }

        public C10615a(Context context) {
            this.f24409e = f24404i;
            this.f24405a = context;
            this.f24406b = (ActivityManager) context.getSystemService("activity");
            this.f24407c = new C10616b(context.getResources().getDisplayMetrics());
            if (Build.VERSION.SDK_INT < 26 || !C10614i.m12619f(this.f24406b)) {
                return;
            }
            this.f24409e = 0.0f;
        }

        /* renamed from: i */
        public C10614i m12609i() {
            return new C10614i(this);
        }
    }

    /* compiled from: MemorySizeCalculator.java */
    /* renamed from: io.intercom.com.bumptech.glide.load.engine.z.i$b */
    /* loaded from: classes3.dex */
    private static final class C10616b implements InterfaceC10617c {

        /* renamed from: a */
        private final DisplayMetrics f24413a;

        C10616b(DisplayMetrics displayMetrics) {
            this.f24413a = displayMetrics;
        }

        @Override // io.intercom.com.bumptech.glide.load.engine.p397z.C10614i.InterfaceC10617c
        /* renamed from: a */
        public int mo12608a() {
            return this.f24413a.heightPixels;
        }

        @Override // io.intercom.com.bumptech.glide.load.engine.p397z.C10614i.InterfaceC10617c
        /* renamed from: b */
        public int mo12607b() {
            return this.f24413a.widthPixels;
        }
    }

    /* compiled from: MemorySizeCalculator.java */
    /* renamed from: io.intercom.com.bumptech.glide.load.engine.z.i$c */
    /* loaded from: classes3.dex */
    interface InterfaceC10617c {
        /* renamed from: a */
        int mo12608a();

        /* renamed from: b */
        int mo12607b();
    }

    C10614i(C10615a c10615a) {
        this.f24402c = c10615a.f24405a;
        this.f24403d = m12619f(c10615a.f24406b) ? c10615a.f24412h / 2 : c10615a.f24412h;
        int m12621d = m12621d(c10615a.f24406b, c10615a.f24410f, c10615a.f24411g);
        float mo12607b = c10615a.f24407c.mo12607b() * c10615a.f24407c.mo12608a() * 4;
        int round = Math.round(c10615a.f24409e * mo12607b);
        int round2 = Math.round(mo12607b * c10615a.f24408d);
        int i = m12621d - this.f24403d;
        int i2 = round2 + round;
        if (i2 > i) {
            float f = i / (c10615a.f24409e + c10615a.f24408d);
            this.f24401b = Math.round(c10615a.f24408d * f);
            this.f24400a = Math.round(f * c10615a.f24409e);
        } else {
            this.f24401b = round2;
            this.f24400a = round;
        }
        if (Log.isLoggable("MemorySizeCalculator", 3)) {
            StringBuilder sb = new StringBuilder();
            sb.append("Calculation complete, Calculated memory cache size: ");
            sb.append(m12618g(this.f24401b));
            sb.append(", pool size: ");
            sb.append(m12618g(this.f24400a));
            sb.append(", byte array size: ");
            sb.append(m12618g(this.f24403d));
            sb.append(", memory class limited? ");
            sb.append(i2 > m12621d);
            sb.append(", max size: ");
            sb.append(m12618g(m12621d));
            sb.append(", memoryClass: ");
            sb.append(c10615a.f24406b.getMemoryClass());
            sb.append(", isLowMemoryDevice: ");
            sb.append(m12619f(c10615a.f24406b));
            Log.d("MemorySizeCalculator", sb.toString());
        }
    }

    /* renamed from: d */
    private static int m12621d(ActivityManager activityManager, float f, float f2) {
        boolean m12619f = m12619f(activityManager);
        float memoryClass = activityManager.getMemoryClass() * 1024 * 1024;
        if (m12619f) {
            f = f2;
        }
        return Math.round(memoryClass * f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: f */
    public static boolean m12619f(ActivityManager activityManager) {
        if (Build.VERSION.SDK_INT >= 19) {
            return activityManager.isLowRamDevice();
        }
        return false;
    }

    /* renamed from: g */
    private String m12618g(int i) {
        return Formatter.formatFileSize(this.f24402c, i);
    }

    /* renamed from: b */
    public int m12623b() {
        return this.f24403d;
    }

    /* renamed from: c */
    public int m12622c() {
        return this.f24400a;
    }

    /* renamed from: e */
    public int m12620e() {
        return this.f24401b;
    }
}
