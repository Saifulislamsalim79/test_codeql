package com.bumptech.glide.load.engine.p068b0;

import android.os.Build;
import android.os.StrictMode;
import android.util.Log;
import java.io.File;
import java.io.FilenameFilter;
import java.util.regex.Pattern;
/* compiled from: RuntimeCompat.java */
/* renamed from: com.bumptech.glide.load.engine.b0.b */
/* loaded from: classes2.dex */
final class C2041b {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: RuntimeCompat.java */
    /* renamed from: com.bumptech.glide.load.engine.b0.b$a */
    /* loaded from: classes2.dex */
    public class C2042a implements FilenameFilter {

        /* renamed from: a */
        final /* synthetic */ Pattern f6161a;

        C2042a(Pattern pattern) {
            this.f6161a = pattern;
        }

        @Override // java.io.FilenameFilter
        public boolean accept(File file, String str) {
            return this.f6161a.matcher(str).matches();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static int m33882a() {
        int availableProcessors = Runtime.getRuntime().availableProcessors();
        return Build.VERSION.SDK_INT < 17 ? Math.max(m33881b(), availableProcessors) : availableProcessors;
    }

    /* renamed from: b */
    private static int m33881b() {
        File[] fileArr;
        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            fileArr = new File("/sys/devices/system/cpu/").listFiles(new C2042a(Pattern.compile("cpu[0-9]+")));
        } catch (Throwable th) {
            try {
                if (Log.isLoggable("GlideRuntimeCompat", 6)) {
                    Log.e("GlideRuntimeCompat", "Failed to calculate accurate cpu count", th);
                }
                StrictMode.setThreadPolicy(allowThreadDiskReads);
                fileArr = null;
            } finally {
                StrictMode.setThreadPolicy(allowThreadDiskReads);
            }
        }
        return Math.max(1, fileArr != null ? fileArr.length : 0);
    }
}
