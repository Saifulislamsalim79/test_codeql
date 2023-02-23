package io.intercom.com.bumptech.glide.load.p402o.p403c;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Build;
import android.util.Log;
import io.intercom.com.bumptech.glide.load.EnumC10508b;
import java.io.File;
/* compiled from: HardwareConfigState.java */
/* renamed from: io.intercom.com.bumptech.glide.load.o.c.o */
/* loaded from: classes3.dex */
final class C10763o {

    /* renamed from: c */
    private static final File f24597c = new File("/proc/self/fd");

    /* renamed from: d */
    private static volatile C10763o f24598d;

    /* renamed from: a */
    private volatile int f24599a;

    /* renamed from: b */
    private volatile boolean f24600b = true;

    private C10763o() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static C10763o m12395a() {
        if (f24598d == null) {
            synchronized (C10763o.class) {
                if (f24598d == null) {
                    f24598d = new C10763o();
                }
            }
        }
        return f24598d;
    }

    /* renamed from: b */
    private synchronized boolean m12394b() {
        boolean z = true;
        int i = this.f24599a + 1;
        this.f24599a = i;
        if (i >= 50) {
            this.f24599a = 0;
            int length = f24597c.list().length;
            if (length >= 700) {
                z = false;
            }
            this.f24600b = z;
            if (!this.f24600b && Log.isLoggable("Downsampler", 5)) {
                Log.w("Downsampler", "Excluding HARDWARE bitmap config because we're over the file descriptor limit, file descriptors " + length + ", limit 700");
            }
        }
        return this.f24600b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public boolean m12393c(int i, int i2, BitmapFactory.Options options, EnumC10508b enumC10508b, boolean z, boolean z2) {
        if (!z || Build.VERSION.SDK_INT < 26 || enumC10508b == EnumC10508b.PREFER_ARGB_8888_DISALLOW_HARDWARE || z2) {
            return false;
        }
        boolean z3 = i >= 128 && i2 >= 128 && m12394b();
        if (z3) {
            options.inPreferredConfig = Bitmap.Config.HARDWARE;
            options.inMutable = false;
        }
        return z3;
    }
}
