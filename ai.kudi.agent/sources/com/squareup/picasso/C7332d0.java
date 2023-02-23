package com.squareup.picasso;

import android.app.ActivityManager;
import android.content.ContentResolver;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Process;
import android.os.StatFs;
import android.provider.Settings;
import android.support.p050v4.media.session.PlaybackStateCompat;
import android.util.Log;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.ThreadFactory;
import p576m.C14347f;
import p576m.InterfaceC14346e;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Utils.java */
/* renamed from: com.squareup.picasso.d0 */
/* loaded from: classes2.dex */
public final class C7332d0 {

    /* renamed from: a */
    static final StringBuilder f17368a = new StringBuilder();

    /* renamed from: b */
    private static final C14347f f17369b = C14347f.m2035m("RIFF");

    /* renamed from: c */
    private static final C14347f f17370c = C14347f.m2035m("WEBP");

    /* compiled from: Utils.java */
    /* renamed from: com.squareup.picasso.d0$a */
    /* loaded from: classes2.dex */
    static class HandlerC7333a extends Handler {
        HandlerC7333a(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            sendMessageDelayed(obtainMessage(), 1000L);
        }
    }

    /* compiled from: Utils.java */
    /* renamed from: com.squareup.picasso.d0$b */
    /* loaded from: classes2.dex */
    private static class C7334b extends Thread {
        C7334b(Runnable runnable) {
            super(runnable);
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            Process.setThreadPriority(10);
            super.run();
        }
    }

    /* compiled from: Utils.java */
    /* renamed from: com.squareup.picasso.d0$c */
    /* loaded from: classes2.dex */
    static class ThreadFactoryC7335c implements ThreadFactory {
        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            return new C7334b(runnable);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static long m18956a(File file) {
        long j;
        try {
            StatFs statFs = new StatFs(file.getAbsolutePath());
            j = ((Build.VERSION.SDK_INT < 18 ? statFs.getBlockCount() : statFs.getBlockCountLong()) * (Build.VERSION.SDK_INT < 18 ? statFs.getBlockSize() : statFs.getBlockSizeLong())) / 50;
        } catch (IllegalArgumentException unused) {
            j = 5242880;
        }
        return Math.max(Math.min(j, 52428800L), 5242880L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static int m18955b(Context context) {
        ActivityManager activityManager = (ActivityManager) m18943n(context, "activity");
        return (int) ((((context.getApplicationInfo().flags & 1048576) != 0 ? activityManager.getLargeMemoryClass() : activityManager.getMemoryClass()) * PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED) / 7);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public static void m18954c() {
        if (!m18940q()) {
            throw new IllegalStateException("Method call should happen from the main thread.");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public static <T> T m18953d(T t, String str) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public static File m18952e(Context context) {
        File file = new File(context.getApplicationContext().getCacheDir(), "picasso-cache");
        if (!file.exists()) {
            file.mkdirs();
        }
        return file;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public static String m18951f(C7373w c7373w) {
        String m18950g = m18950g(c7373w, f17368a);
        f17368a.setLength(0);
        return m18950g;
    }

    /* renamed from: g */
    static String m18950g(C7373w c7373w, StringBuilder sb) {
        String str = c7373w.f17484f;
        if (str != null) {
            sb.ensureCapacity(str.length() + 50);
            sb.append(c7373w.f17484f);
        } else {
            Uri uri = c7373w.f17482d;
            if (uri != null) {
                String uri2 = uri.toString();
                sb.ensureCapacity(uri2.length() + 50);
                sb.append(uri2);
            } else {
                sb.ensureCapacity(50);
                sb.append(c7373w.f17483e);
            }
        }
        sb.append('\n');
        if (c7373w.f17492n != 0.0f) {
            sb.append("rotation:");
            sb.append(c7373w.f17492n);
            if (c7373w.f17495q) {
                sb.append('@');
                sb.append(c7373w.f17493o);
                sb.append('x');
                sb.append(c7373w.f17494p);
            }
            sb.append('\n');
        }
        if (c7373w.m18861c()) {
            sb.append("resize:");
            sb.append(c7373w.f17486h);
            sb.append('x');
            sb.append(c7373w.f17487i);
            sb.append('\n');
        }
        if (c7373w.f17488j) {
            sb.append("centerCrop:");
            sb.append(c7373w.f17489k);
            sb.append('\n');
        } else if (c7373w.f17490l) {
            sb.append("centerInside");
            sb.append('\n');
        }
        List<InterfaceC7330c0> list = c7373w.f17485g;
        if (list != null) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                sb.append(c7373w.f17485g.get(i).key());
                sb.append('\n');
            }
        }
        return sb.toString();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h */
    public static void m18949h(Looper looper) {
        HandlerC7333a handlerC7333a = new HandlerC7333a(looper);
        handlerC7333a.sendMessageDelayed(handlerC7333a.obtainMessage(), 1000L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i */
    public static int m18948i(Bitmap bitmap) {
        int allocationByteCount = Build.VERSION.SDK_INT >= 19 ? bitmap.getAllocationByteCount() : bitmap.getByteCount();
        if (allocationByteCount >= 0) {
            return allocationByteCount;
        }
        throw new IllegalStateException("Negative size: " + bitmap);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: j */
    public static String m18947j(RunnableC7323c runnableC7323c) {
        return m18946k(runnableC7323c, "");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: k */
    public static String m18946k(RunnableC7323c runnableC7323c, String str) {
        StringBuilder sb = new StringBuilder(str);
        AbstractC7316a m18976h = runnableC7323c.m18976h();
        if (m18976h != null) {
            sb.append(m18976h.f17294b.m18860d());
        }
        List<AbstractC7316a> m18975i = runnableC7323c.m18975i();
        if (m18975i != null) {
            int size = m18975i.size();
            for (int i = 0; i < size; i++) {
                if (i > 0 || m18976h != null) {
                    sb.append(", ");
                }
                sb.append(m18975i.get(i).f17294b.m18860d());
            }
        }
        return sb.toString();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: l */
    public static int m18945l(Resources resources, C7373w c7373w) throws FileNotFoundException {
        Uri uri;
        if (c7373w.f17483e == 0 && (uri = c7373w.f17482d) != null) {
            String authority = uri.getAuthority();
            if (authority != null) {
                List<String> pathSegments = c7373w.f17482d.getPathSegments();
                if (pathSegments != null && !pathSegments.isEmpty()) {
                    if (pathSegments.size() == 1) {
                        try {
                            return Integer.parseInt(pathSegments.get(0));
                        } catch (NumberFormatException unused) {
                            throw new FileNotFoundException("Last path segment is not a resource ID: " + c7373w.f17482d);
                        }
                    } else if (pathSegments.size() == 2) {
                        return resources.getIdentifier(pathSegments.get(1), pathSegments.get(0), authority);
                    } else {
                        throw new FileNotFoundException("More than two path segments: " + c7373w.f17482d);
                    }
                }
                throw new FileNotFoundException("No path segments: " + c7373w.f17482d);
            }
            throw new FileNotFoundException("No package provided: " + c7373w.f17482d);
        }
        return c7373w.f17483e;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: m */
    public static Resources m18944m(Context context, C7373w c7373w) throws FileNotFoundException {
        Uri uri;
        if (c7373w.f17483e == 0 && (uri = c7373w.f17482d) != null) {
            String authority = uri.getAuthority();
            if (authority != null) {
                try {
                    return context.getPackageManager().getResourcesForApplication(authority);
                } catch (PackageManager.NameNotFoundException unused) {
                    throw new FileNotFoundException("Unable to obtain resources for package: " + c7373w.f17482d);
                }
            }
            throw new FileNotFoundException("No package provided: " + c7373w.f17482d);
        }
        return context.getResources();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: n */
    public static <T> T m18943n(Context context, String str) {
        return (T) context.getSystemService(str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: o */
    public static boolean m18942o(Context context, String str) {
        return context.checkCallingOrSelfPermission(str) == 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: p */
    public static boolean m18941p(Context context) {
        ContentResolver contentResolver = context.getContentResolver();
        try {
            return Build.VERSION.SDK_INT < 17 ? Settings.System.getInt(contentResolver, "airplane_mode_on", 0) != 0 : Settings.Global.getInt(contentResolver, "airplane_mode_on", 0) != 0;
        } catch (NullPointerException | SecurityException unused) {
            return false;
        }
    }

    /* renamed from: q */
    static boolean m18940q() {
        return Looper.getMainLooper().getThread() == Thread.currentThread();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: r */
    public static boolean m18939r(InterfaceC14346e interfaceC14346e) throws IOException {
        return interfaceC14346e.mo1986l0(0L, f17369b) && interfaceC14346e.mo1986l0(8L, f17370c);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: s */
    public static void m18938s(String str, String str2, String str3) {
        m18937t(str, str2, str3, "");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: t */
    public static void m18937t(String str, String str2, String str3, String str4) {
        Log.d("Picasso", String.format("%1$-11s %2$-12s %3$s %4$s", str, str2, str3, str4));
    }
}
