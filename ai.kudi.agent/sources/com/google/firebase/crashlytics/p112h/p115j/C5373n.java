package com.google.firebase.crashlytics.p112h.p115j;

import android.app.ActivityManager;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.hardware.SensorManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.Debug;
import android.os.StatFs;
import android.provider.Settings;
import android.text.TextUtils;
import com.google.firebase.crashlytics.p112h.C5335f;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Scanner;
/* compiled from: CommonUtils.java */
/* renamed from: com.google.firebase.crashlytics.h.j.n */
/* loaded from: classes2.dex */
public class C5373n {

    /* renamed from: a */
    private static final char[] f13246a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    /* renamed from: b */
    private static long f13247b = -1;

    /* compiled from: CommonUtils.java */
    /* renamed from: com.google.firebase.crashlytics.h.j.n$a */
    /* loaded from: classes2.dex */
    enum EnumC5374a {
        X86_32,
        X86_64,
        ARM_UNKNOWN,
        PPC,
        PPC64,
        ARMV6,
        ARMV7,
        UNKNOWN,
        ARMV7S,
        ARM64;
        

        /* renamed from: C */
        private static final Map<String, EnumC5374a> f13250C;

        static {
            HashMap hashMap = new HashMap(4);
            f13250C = hashMap;
            hashMap.put("armeabi-v7a", ARMV7);
            f13250C.put("armeabi", ARMV6);
            f13250C.put("arm64-v8a", ARM64);
            f13250C.put("x86", X86_32);
        }

        /* renamed from: a */
        static EnumC5374a m24975a() {
            EnumC5374a enumC5374a = UNKNOWN;
            String str = Build.CPU_ABI;
            if (TextUtils.isEmpty(str)) {
                C5335f.m25102f().m25099i("Architecture#getValue()::Build.CPU_ABI returned null or empty");
                return enumC5374a;
            }
            EnumC5374a enumC5374a2 = f13250C.get(str.toLowerCase(Locale.US));
            return enumC5374a2 == null ? enumC5374a : enumC5374a2;
        }
    }

    /* renamed from: A */
    public static String m25003A(String str) {
        return m24982t(str, "SHA-1");
    }

    /* renamed from: B */
    public static String m25002B(InputStream inputStream) {
        Scanner useDelimiter = new Scanner(inputStream).useDelimiter("\\A");
        return useDelimiter.hasNext() ? useDelimiter.next() : "";
    }

    /* renamed from: a */
    public static long m25001a(Context context) {
        ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
        ((ActivityManager) context.getSystemService("activity")).getMemoryInfo(memoryInfo);
        return memoryInfo.availMem;
    }

    /* renamed from: b */
    public static long m25000b(String str) {
        StatFs statFs;
        long blockSize = new StatFs(str).getBlockSize();
        return (statFs.getBlockCount() * blockSize) - (blockSize * statFs.getAvailableBlocks());
    }

    /* renamed from: c */
    public static boolean m24999c(Context context) {
        if (m24998d(context, "android.permission.ACCESS_NETWORK_STATE")) {
            NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
            return activeNetworkInfo != null && activeNetworkInfo.isConnectedOrConnecting();
        }
        return true;
    }

    /* renamed from: d */
    public static boolean m24998d(Context context, String str) {
        return context.checkCallingOrSelfPermission(str) == 0;
    }

    /* renamed from: e */
    public static void m24997e(Closeable closeable, String str) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException e) {
                C5335f.m25102f().m25103e(str, e);
            }
        }
    }

    /* renamed from: f */
    public static void m24996f(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (RuntimeException e) {
                throw e;
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: g */
    static long m24995g(String str, String str2, int i) {
        return Long.parseLong(str.split(str2)[0].trim()) * i;
    }

    /* renamed from: h */
    public static String m24994h(String... strArr) {
        if (strArr == null || strArr.length == 0) {
            return null;
        }
        ArrayList<String> arrayList = new ArrayList();
        for (String str : strArr) {
            if (str != null) {
                arrayList.add(str.replace("-", "").toLowerCase(Locale.US));
            }
        }
        Collections.sort(arrayList);
        StringBuilder sb = new StringBuilder();
        for (String str2 : arrayList) {
            sb.append(str2);
        }
        String sb2 = sb.toString();
        if (sb2.length() > 0) {
            return m25003A(sb2);
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0035, code lost:
        r2 = r3[1];
     */
    /* renamed from: i */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String m24993i(java.io.File r6, java.lang.String r7) {
        /*
            java.lang.String r0 = "Failed to close system file reader."
            boolean r1 = r6.exists()
            r2 = 0
            if (r1 == 0) goto L5f
            java.io.BufferedReader r1 = new java.io.BufferedReader     // Catch: java.lang.Throwable -> L3c java.lang.Exception -> L3e
            java.io.FileReader r3 = new java.io.FileReader     // Catch: java.lang.Throwable -> L3c java.lang.Exception -> L3e
            r3.<init>(r6)     // Catch: java.lang.Throwable -> L3c java.lang.Exception -> L3e
            r4 = 1024(0x400, float:1.435E-42)
            r1.<init>(r3, r4)     // Catch: java.lang.Throwable -> L3c java.lang.Exception -> L3e
        L15:
            java.lang.String r3 = r1.readLine()     // Catch: java.lang.Exception -> L3a java.lang.Throwable -> L59
            if (r3 == 0) goto L36
            java.lang.String r4 = "\\s*:\\s*"
            java.util.regex.Pattern r4 = java.util.regex.Pattern.compile(r4)     // Catch: java.lang.Exception -> L3a java.lang.Throwable -> L59
            r5 = 2
            java.lang.String[] r3 = r4.split(r3, r5)     // Catch: java.lang.Exception -> L3a java.lang.Throwable -> L59
            int r4 = r3.length     // Catch: java.lang.Exception -> L3a java.lang.Throwable -> L59
            r5 = 1
            if (r4 <= r5) goto L15
            r4 = 0
            r4 = r3[r4]     // Catch: java.lang.Exception -> L3a java.lang.Throwable -> L59
            boolean r4 = r4.equals(r7)     // Catch: java.lang.Exception -> L3a java.lang.Throwable -> L59
            if (r4 == 0) goto L15
            r6 = r3[r5]     // Catch: java.lang.Exception -> L3a java.lang.Throwable -> L59
            r2 = r6
        L36:
            m24997e(r1, r0)
            goto L5f
        L3a:
            r7 = move-exception
            goto L40
        L3c:
            r6 = move-exception
            goto L5b
        L3e:
            r7 = move-exception
            r1 = r2
        L40:
            com.google.firebase.crashlytics.h.f r3 = com.google.firebase.crashlytics.p112h.C5335f.m25102f()     // Catch: java.lang.Throwable -> L59
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L59
            r4.<init>()     // Catch: java.lang.Throwable -> L59
            java.lang.String r5 = "Error parsing "
            r4.append(r5)     // Catch: java.lang.Throwable -> L59
            r4.append(r6)     // Catch: java.lang.Throwable -> L59
            java.lang.String r6 = r4.toString()     // Catch: java.lang.Throwable -> L59
            r3.m25103e(r6, r7)     // Catch: java.lang.Throwable -> L59
            goto L36
        L59:
            r6 = move-exception
            r2 = r1
        L5b:
            m24997e(r2, r0)
            throw r6
        L5f:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.crashlytics.p112h.p115j.C5373n.m24993i(java.io.File, java.lang.String):java.lang.String");
    }

    /* renamed from: j */
    public static ActivityManager.RunningAppProcessInfo m24992j(String str, Context context) {
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((ActivityManager) context.getSystemService("activity")).getRunningAppProcesses();
        if (runningAppProcesses != null) {
            for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
                if (runningAppProcessInfo.processName.equals(str)) {
                    return runningAppProcessInfo;
                }
            }
        }
        return null;
    }

    /* renamed from: k */
    public static boolean m24991k(Context context, String str, boolean z) {
        Resources resources;
        if (context != null && (resources = context.getResources()) != null) {
            int m24985q = m24985q(context, str, "bool");
            if (m24985q > 0) {
                return resources.getBoolean(m24985q);
            }
            int m24985q2 = m24985q(context, str, "string");
            if (m24985q2 > 0) {
                return Boolean.parseBoolean(context.getString(m24985q2));
            }
        }
        return z;
    }

    /* renamed from: l */
    public static int m24990l() {
        return EnumC5374a.m24975a().ordinal();
    }

    /* renamed from: m */
    public static int m24989m(Context context) {
        int i = m24977y(context) ? 1 : 0;
        if (m24976z(context)) {
            i |= 2;
        }
        return m24978x() ? i | 4 : i;
    }

    /* renamed from: n */
    public static String m24988n(Context context) {
        int m24985q = m24985q(context, "com.google.firebase.crashlytics.mapping_file_id", "string");
        if (m24985q == 0) {
            m24985q = m24985q(context, "com.crashlytics.android.build_id", "string");
        }
        if (m24985q != 0) {
            return context.getResources().getString(m24985q);
        }
        return null;
    }

    /* renamed from: o */
    public static boolean m24987o(Context context) {
        return (m24977y(context) || ((SensorManager) context.getSystemService("sensor")).getDefaultSensor(8) == null) ? false : true;
    }

    /* renamed from: p */
    public static String m24986p(Context context) {
        int i = context.getApplicationContext().getApplicationInfo().icon;
        if (i > 0) {
            try {
                String resourcePackageName = context.getResources().getResourcePackageName(i);
                return "android".equals(resourcePackageName) ? context.getPackageName() : resourcePackageName;
            } catch (Resources.NotFoundException unused) {
                return context.getPackageName();
            }
        }
        return context.getPackageName();
    }

    /* renamed from: q */
    public static int m24985q(Context context, String str, String str2) {
        return context.getResources().getIdentifier(str, str2, m24986p(context));
    }

    /* renamed from: r */
    public static SharedPreferences m24984r(Context context) {
        return context.getSharedPreferences("com.google.firebase.crashlytics", 0);
    }

    /* renamed from: s */
    public static synchronized long m24983s() {
        long j;
        synchronized (C5373n.class) {
            if (f13247b == -1) {
                long j2 = 0;
                String m24993i = m24993i(new File("/proc/meminfo"), "MemTotal");
                if (!TextUtils.isEmpty(m24993i)) {
                    String upperCase = m24993i.toUpperCase(Locale.US);
                    try {
                        if (upperCase.endsWith("KB")) {
                            j2 = m24995g(upperCase, "KB", 1024);
                        } else if (upperCase.endsWith("MB")) {
                            j2 = m24995g(upperCase, "MB", 1048576);
                        } else if (upperCase.endsWith("GB")) {
                            j2 = m24995g(upperCase, "GB", 1073741824);
                        } else {
                            C5335f m25102f = C5335f.m25102f();
                            m25102f.m25097k("Unexpected meminfo format while computing RAM: " + upperCase);
                        }
                    } catch (NumberFormatException e) {
                        C5335f m25102f2 = C5335f.m25102f();
                        m25102f2.m25103e("Unexpected meminfo format while computing RAM: " + upperCase, e);
                    }
                }
                f13247b = j2;
            }
            j = f13247b;
        }
        return j;
    }

    /* renamed from: t */
    private static String m24982t(String str, String str2) {
        return m24981u(str.getBytes(), str2);
    }

    /* renamed from: u */
    private static String m24981u(byte[] bArr, String str) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance(str);
            messageDigest.update(bArr);
            return m24980v(messageDigest.digest());
        } catch (NoSuchAlgorithmException e) {
            C5335f m25102f = C5335f.m25102f();
            m25102f.m25103e("Could not create hashing algorithm: " + str + ", returning empty string.", e);
            return "";
        }
    }

    /* renamed from: v */
    public static String m24980v(byte[] bArr) {
        char[] cArr = new char[bArr.length * 2];
        for (int i = 0; i < bArr.length; i++) {
            int i2 = bArr[i] & 255;
            int i3 = i * 2;
            char[] cArr2 = f13246a;
            cArr[i3] = cArr2[i2 >>> 4];
            cArr[i3 + 1] = cArr2[i2 & 15];
        }
        return new String(cArr);
    }

    /* renamed from: w */
    public static boolean m24979w(Context context) {
        return (context.getApplicationInfo().flags & 2) != 0;
    }

    /* renamed from: x */
    public static boolean m24978x() {
        return Debug.isDebuggerConnected() || Debug.waitingForDebugger();
    }

    /* renamed from: y */
    public static boolean m24977y(Context context) {
        return Build.PRODUCT.contains("sdk") || Build.HARDWARE.contains("goldfish") || Build.HARDWARE.contains("ranchu") || Settings.Secure.getString(context.getContentResolver(), "android_id") == null;
    }

    /* renamed from: z */
    public static boolean m24976z(Context context) {
        boolean m24977y = m24977y(context);
        String str = Build.TAGS;
        if ((m24977y || str == null || !str.contains("test-keys")) && !new File("/system/app/Superuser.apk").exists()) {
            return !m24977y && new File("/system/xbin/su").exists();
        }
        return true;
    }
}
