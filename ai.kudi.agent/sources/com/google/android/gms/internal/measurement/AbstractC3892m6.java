package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.StrictMode;
import android.util.Log;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: com.google.android.gms:play-services-measurement-impl@@20.0.0 */
/* renamed from: com.google.android.gms.internal.measurement.m6 */
/* loaded from: classes2.dex */
public abstract class AbstractC3892m6<T> {

    /* renamed from: g */
    private static final Object f9483g = new Object();

    /* renamed from: h */
    private static volatile AbstractC3861k6 f9484h;

    /* renamed from: i */
    private static final AtomicInteger f9485i;

    /* renamed from: j */
    public static final /* synthetic */ int f9486j = 0;

    /* renamed from: a */
    final C3845j6 f9487a;

    /* renamed from: b */
    final String f9488b;

    /* renamed from: c */
    private final T f9489c;

    /* renamed from: d */
    private volatile int f9490d = -1;

    /* renamed from: e */
    private volatile T f9491e;

    /* renamed from: f */
    private final boolean f9492f;

    static {
        new AtomicReference();
        new C3924o6(C3752d6.f9239a, null);
        f9485i = new AtomicInteger();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ AbstractC3892m6(C3845j6 c3845j6, String str, Object obj, boolean z, C3877l6 c3877l6) {
        if (c3845j6.f9425b == null) {
            throw new IllegalArgumentException("Must pass a valid SharedPreferences file name or ContentProvider URI");
        }
        this.f9487a = c3845j6;
        this.f9488b = str;
        this.f9489c = obj;
        this.f9492f = true;
    }

    @Deprecated
    /* renamed from: d */
    public static void m29398d(final Context context) {
        synchronized (f9483g) {
            AbstractC3861k6 abstractC3861k6 = f9484h;
            Context applicationContext = context.getApplicationContext();
            if (applicationContext != null) {
                context = applicationContext;
            }
            if (abstractC3861k6 == null || abstractC3861k6.mo29252a() != context) {
                C3985s5.m28977d();
                C3908n6.m29347b();
                C4097z5.m28546d();
                f9484h = new C3923o5(context, C4082y6.m28601a(new InterfaceC4018u6() { // from class: com.google.android.gms.internal.measurement.e6
                    @Override // com.google.android.gms.internal.measurement.InterfaceC4018u6
                    public final Object zza() {
                        AbstractC3970r6 m29032c;
                        AbstractC3970r6 m29032c2;
                        Context context2 = context;
                        int i = AbstractC3892m6.f9486j;
                        String str = Build.TYPE;
                        String str2 = Build.TAGS;
                        if ((!str.equals("eng") && !str.equals("userdebug")) || (!str2.contains("dev-keys") && !str2.contains("test-keys"))) {
                            return AbstractC3970r6.m29032c();
                        }
                        if (C3907n5.m29349a() && !context2.isDeviceProtectedStorage()) {
                            context2 = context2.createDeviceProtectedStorageContext();
                        }
                        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
                        try {
                            StrictMode.allowThreadDiskWrites();
                            try {
                                File file = new File(context2.getDir("phenotype_hermetic", 0), "overrides.txt");
                                m29032c = file.exists() ? AbstractC3970r6.m29031d(file) : AbstractC3970r6.m29032c();
                            } catch (RuntimeException e) {
                                Log.e("HermeticFileOverrides", "no data dir", e);
                                m29032c = AbstractC3970r6.m29032c();
                            }
                            if (m29032c.mo28912b()) {
                                File file2 = (File) m29032c.mo28913a();
                                try {
                                    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(file2)));
                                    try {
                                        HashMap hashMap = new HashMap();
                                        HashMap hashMap2 = new HashMap();
                                        while (true) {
                                            String readLine = bufferedReader.readLine();
                                            if (readLine == null) {
                                                break;
                                            }
                                            String[] split = readLine.split(" ", 3);
                                            if (split.length != 3) {
                                                Log.e("HermeticFileOverrides", readLine.length() != 0 ? "Invalid: ".concat(readLine) : new String("Invalid: "));
                                            } else {
                                                String str3 = new String(split[0]);
                                                String decode = Uri.decode(new String(split[1]));
                                                String str4 = (String) hashMap2.get(split[2]);
                                                if (str4 == null) {
                                                    String str5 = new String(split[2]);
                                                    str4 = Uri.decode(str5);
                                                    if (str4.length() < 1024 || str4 == str5) {
                                                        hashMap2.put(str5, str4);
                                                    }
                                                }
                                                if (!hashMap.containsKey(str3)) {
                                                    hashMap.put(str3, new HashMap());
                                                }
                                                ((Map) hashMap.get(str3)).put(decode, str4);
                                            }
                                        }
                                        String obj = file2.toString();
                                        StringBuilder sb = new StringBuilder(obj.length() + 7);
                                        sb.append("Parsed ");
                                        sb.append(obj);
                                        Log.i("HermeticFileOverrides", sb.toString());
                                        C3703a6 c3703a6 = new C3703a6(hashMap);
                                        bufferedReader.close();
                                        m29032c2 = AbstractC3970r6.m29031d(c3703a6);
                                    } catch (Throwable th) {
                                        try {
                                            bufferedReader.close();
                                        } catch (Throwable unused) {
                                        }
                                        throw th;
                                    }
                                } catch (IOException e2) {
                                    throw new RuntimeException(e2);
                                }
                            } else {
                                m29032c2 = AbstractC3970r6.m29032c();
                            }
                            return m29032c2;
                        } finally {
                            StrictMode.setThreadPolicy(allowThreadDiskReads);
                        }
                    }
                }));
                f9485i.incrementAndGet();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public static void m29397e() {
        f9485i.incrementAndGet();
    }

    /* renamed from: a */
    abstract T mo29401a(Object obj);

    /* JADX WARN: Removed duplicated region for block: B:40:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00be A[Catch: all -> 0x0124, TryCatch #0 {, blocks: (B:12:0x001c, B:14:0x0020, B:16:0x0026, B:18:0x003d, B:20:0x0049, B:22:0x0052, B:24:0x0064, B:26:0x006f, B:25:0x0069, B:53:0x00ea, B:55:0x00fa, B:57:0x0110, B:58:0x0113, B:59:0x0117, B:41:0x00be, B:43:0x00c4, B:47:0x00da, B:49:0x00e0, B:52:0x00e8, B:46:0x00d6, B:28:0x0074, B:30:0x007a, B:32:0x0088, B:36:0x00ad, B:38:0x00b7, B:34:0x009f, B:60:0x011c, B:61:0x0121, B:62:0x0122), top: B:69:0x001c }] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00e8 A[Catch: all -> 0x0124, TryCatch #0 {, blocks: (B:12:0x001c, B:14:0x0020, B:16:0x0026, B:18:0x003d, B:20:0x0049, B:22:0x0052, B:24:0x0064, B:26:0x006f, B:25:0x0069, B:53:0x00ea, B:55:0x00fa, B:57:0x0110, B:58:0x0113, B:59:0x0117, B:41:0x00be, B:43:0x00c4, B:47:0x00da, B:49:0x00e0, B:52:0x00e8, B:46:0x00d6, B:28:0x0074, B:30:0x007a, B:32:0x0088, B:36:0x00ad, B:38:0x00b7, B:34:0x009f, B:60:0x011c, B:61:0x0121, B:62:0x0122), top: B:69:0x001c }] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00fa A[Catch: all -> 0x0124, TryCatch #0 {, blocks: (B:12:0x001c, B:14:0x0020, B:16:0x0026, B:18:0x003d, B:20:0x0049, B:22:0x0052, B:24:0x0064, B:26:0x006f, B:25:0x0069, B:53:0x00ea, B:55:0x00fa, B:57:0x0110, B:58:0x0113, B:59:0x0117, B:41:0x00be, B:43:0x00c4, B:47:0x00da, B:49:0x00e0, B:52:0x00e8, B:46:0x00d6, B:28:0x0074, B:30:0x007a, B:32:0x0088, B:36:0x00ad, B:38:0x00b7, B:34:0x009f, B:60:0x011c, B:61:0x0121, B:62:0x0122), top: B:69:0x001c }] */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final T m29400b() {
        /*
            Method dump skipped, instructions count: 298
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.AbstractC3892m6.m29400b():java.lang.Object");
    }

    /* renamed from: c */
    public final String m29399c() {
        String str = this.f9487a.f9427d;
        return this.f9488b;
    }
}
