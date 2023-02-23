package com.google.android.gms.dynamite;

import android.os.Looper;
import android.util.Log;
/* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
/* renamed from: com.google.android.gms.dynamite.b */
/* loaded from: classes2.dex */
public final class C2995b {

    /* renamed from: a */
    private static volatile ClassLoader f8177a;

    /* renamed from: b */
    private static volatile Thread f8178b;

    /* renamed from: a */
    public static synchronized ClassLoader m31482a() {
        ClassLoader classLoader;
        synchronized (C2995b.class) {
            if (f8177a == null) {
                f8177a = m31481b();
            }
            classLoader = f8177a;
        }
        return classLoader;
    }

    /* renamed from: b */
    private static synchronized ClassLoader m31481b() {
        synchronized (C2995b.class) {
            ClassLoader classLoader = null;
            if (f8178b == null) {
                f8178b = m31480c();
                if (f8178b == null) {
                    return null;
                }
            }
            synchronized (f8178b) {
                try {
                    classLoader = f8178b.getContextClassLoader();
                } catch (SecurityException e) {
                    String valueOf = String.valueOf(e.getMessage());
                    Log.w("DynamiteLoaderV2CL", valueOf.length() != 0 ? "Failed to get thread context classloader ".concat(valueOf) : new String("Failed to get thread context classloader "));
                }
            }
            return classLoader;
        }
    }

    /* renamed from: c */
    private static synchronized Thread m31480c() {
        SecurityException e;
        C2994a c2994a;
        C2994a c2994a2;
        ThreadGroup threadGroup;
        synchronized (C2995b.class) {
            ThreadGroup threadGroup2 = Looper.getMainLooper().getThread().getThreadGroup();
            if (threadGroup2 == null) {
                return null;
            }
            synchronized (Void.class) {
                try {
                    int activeGroupCount = threadGroup2.activeGroupCount();
                    ThreadGroup[] threadGroupArr = new ThreadGroup[activeGroupCount];
                    threadGroup2.enumerate(threadGroupArr);
                    int i = 0;
                    int i2 = 0;
                    while (true) {
                        if (i2 >= activeGroupCount) {
                            threadGroup = null;
                            break;
                        }
                        threadGroup = threadGroupArr[i2];
                        if ("dynamiteLoader".equals(threadGroup.getName())) {
                            break;
                        }
                        i2++;
                    }
                    if (threadGroup == null) {
                        threadGroup = new ThreadGroup(threadGroup2, "dynamiteLoader");
                    }
                    int activeCount = threadGroup.activeCount();
                    Thread[] threadArr = new Thread[activeCount];
                    threadGroup.enumerate(threadArr);
                    while (true) {
                        if (i >= activeCount) {
                            c2994a2 = null;
                            break;
                        }
                        c2994a2 = threadArr[i];
                        if ("GmsDynamite".equals(c2994a2.getName())) {
                            break;
                        }
                        i++;
                    }
                } catch (SecurityException e2) {
                    e = e2;
                    c2994a = null;
                }
                if (c2994a2 == null) {
                    try {
                        c2994a = new C2994a(threadGroup, "GmsDynamite");
                        try {
                            c2994a.setContextClassLoader(null);
                            c2994a.start();
                        } catch (SecurityException e3) {
                            e = e3;
                            String valueOf = String.valueOf(e.getMessage());
                            Log.w("DynamiteLoaderV2CL", valueOf.length() != 0 ? "Failed to enumerate thread/threadgroup ".concat(valueOf) : new String("Failed to enumerate thread/threadgroup "));
                            c2994a2 = c2994a;
                            return c2994a2;
                        }
                    } catch (SecurityException e4) {
                        e = e4;
                        c2994a = c2994a2;
                    }
                    c2994a2 = c2994a;
                }
            }
            return c2994a2;
        }
    }
}
