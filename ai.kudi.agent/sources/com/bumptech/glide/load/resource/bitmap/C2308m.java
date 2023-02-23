package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Build;
import android.util.Log;
import java.io.File;
/* compiled from: HardwareConfigState.java */
/* renamed from: com.bumptech.glide.load.resource.bitmap.m */
/* loaded from: classes2.dex */
public final class C2308m {

    /* renamed from: f */
    private static final File f6701f = new File("/proc/self/fd");

    /* renamed from: g */
    private static volatile C2308m f6702g;

    /* renamed from: b */
    private final int f6704b;

    /* renamed from: c */
    private final int f6705c;

    /* renamed from: d */
    private int f6706d;

    /* renamed from: e */
    private boolean f6707e = true;

    /* renamed from: a */
    private final boolean f6703a = m33337d();

    C2308m() {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f6704b = 20000;
            this.f6705c = 0;
            return;
        }
        this.f6704b = 700;
        this.f6705c = 128;
    }

    /* renamed from: a */
    public static C2308m m33340a() {
        if (f6702g == null) {
            synchronized (C2308m.class) {
                if (f6702g == null) {
                    f6702g = new C2308m();
                }
            }
        }
        return f6702g;
    }

    /* renamed from: b */
    private synchronized boolean m33339b() {
        boolean z = true;
        int i = this.f6706d + 1;
        this.f6706d = i;
        if (i >= 50) {
            this.f6706d = 0;
            int length = f6701f.list().length;
            if (length >= this.f6704b) {
                z = false;
            }
            this.f6707e = z;
            if (!z && Log.isLoggable("Downsampler", 5)) {
                Log.w("Downsampler", "Excluding HARDWARE bitmap config because we're over the file descriptor limit, file descriptors " + length + ", limit " + this.f6704b);
            }
        }
        return this.f6707e;
    }

    /* renamed from: d */
    private static boolean m33337d() {
        String str = Build.MODEL;
        if (str == null || str.length() < 7) {
            return true;
        }
        String substring = Build.MODEL.substring(0, 7);
        char c = 65535;
        switch (substring.hashCode()) {
            case -1398613787:
                if (substring.equals("SM-A520")) {
                    c = 6;
                    break;
                }
                break;
            case -1398431166:
                if (substring.equals("SM-G930")) {
                    c = 5;
                    break;
                }
                break;
            case -1398431161:
                if (substring.equals("SM-G935")) {
                    c = 4;
                    break;
                }
                break;
            case -1398431073:
                if (substring.equals("SM-G960")) {
                    c = 2;
                    break;
                }
                break;
            case -1398431068:
                if (substring.equals("SM-G965")) {
                    c = 3;
                    break;
                }
                break;
            case -1398343746:
                if (substring.equals("SM-J720")) {
                    c = 1;
                    break;
                }
                break;
            case -1398222624:
                if (substring.equals("SM-N935")) {
                    c = 0;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                return Build.VERSION.SDK_INT != 26;
            default:
                return true;
        }
    }

    /* renamed from: c */
    public boolean m33338c(int i, int i2, boolean z, boolean z2) {
        int i3;
        return z && this.f6703a && Build.VERSION.SDK_INT >= 26 && !z2 && i >= (i3 = this.f6705c) && i2 >= i3 && m33339b();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public boolean m33336e(int i, int i2, BitmapFactory.Options options, boolean z, boolean z2) {
        boolean m33338c = m33338c(i, i2, z, z2);
        if (m33338c) {
            options.inPreferredConfig = Bitmap.Config.HARDWARE;
            options.inMutable = false;
        }
        return m33338c;
    }
}
