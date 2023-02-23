package io.intercom.com.bumptech.glide.load.engine.p394a0;

import android.os.Build;
import android.os.StrictMode;
import android.util.Log;
import java.io.File;
import java.io.FilenameFilter;
import java.util.regex.Pattern;
/* compiled from: RuntimeCompat.java */
/* renamed from: io.intercom.com.bumptech.glide.load.engine.a0.b */
/* loaded from: classes3.dex */
final class C10524b {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: RuntimeCompat.java */
    /* renamed from: io.intercom.com.bumptech.glide.load.engine.a0.b$a */
    /* loaded from: classes3.dex */
    public static class C10525a implements FilenameFilter {

        /* renamed from: a */
        final /* synthetic */ Pattern f24147a;

        C10525a(Pattern pattern) {
            this.f24147a = pattern;
        }

        @Override // java.io.FilenameFilter
        public boolean accept(File file, String str) {
            return this.f24147a.matcher(str).matches();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static int m12839a() {
        int availableProcessors = Runtime.getRuntime().availableProcessors();
        return Build.VERSION.SDK_INT < 17 ? Math.max(m12838b(), availableProcessors) : availableProcessors;
    }

    /* renamed from: b */
    private static int m12838b() {
        File[] fileArr;
        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            fileArr = new File("/sys/devices/system/cpu/").listFiles(new C10525a(Pattern.compile("cpu[0-9]+")));
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
