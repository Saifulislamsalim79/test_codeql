package com.google.firebase.perf.session.gauges;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Build;
import android.os.Process;
import com.google.firebase.perf.p176h.C6609a;
import com.google.firebase.perf.p178j.C6641k;
import com.google.firebase.perf.p178j.EnumC6631g;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/* compiled from: GaugeMetadataManager.java */
/* renamed from: com.google.firebase.perf.session.gauges.h */
/* loaded from: classes2.dex */
class C6721h {

    /* renamed from: f */
    private static final C6609a f16167f = C6609a.m21475e();

    /* renamed from: a */
    private final Runtime f16168a;

    /* renamed from: b */
    private final ActivityManager f16169b;

    /* renamed from: c */
    private final ActivityManager.MemoryInfo f16170c;

    /* renamed from: d */
    private final String f16171d;

    /* renamed from: e */
    private final Context f16172e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C6721h(Context context) {
        this(Runtime.getRuntime(), context);
    }

    /* renamed from: a */
    private String m20962a() {
        int myPid = Process.myPid();
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = this.f16169b.getRunningAppProcesses();
        if (runningAppProcesses != null) {
            for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
                if (runningAppProcessInfo.pid == myPid) {
                    return runningAppProcessInfo.processName;
                }
            }
        }
        return this.f16172e.getPackageName();
    }

    /* renamed from: b */
    public int m20961b() {
        if (Build.VERSION.SDK_INT >= 16) {
            return C6641k.m21391c(EnumC6631g.f16010x.m21403a(this.f16170c.totalMem));
        }
        return m20957f("/proc/meminfo");
    }

    /* renamed from: c */
    public int m20960c() {
        return C6641k.m21391c(EnumC6631g.f16010x.m21403a(this.f16168a.maxMemory()));
    }

    /* renamed from: d */
    public int m20959d() {
        return C6641k.m21391c(EnumC6631g.f16008f.m21403a(this.f16169b.getMemoryClass()));
    }

    /* renamed from: e */
    public String m20958e() {
        return this.f16171d;
    }

    /* renamed from: f */
    int m20957f(String str) {
        BufferedReader bufferedReader;
        String readLine;
        try {
            bufferedReader = new BufferedReader(new FileReader(str));
        } catch (IOException e) {
            C6609a c6609a = f16167f;
            c6609a.m21471i("Unable to read '" + str + "' file: " + e.getMessage());
        } catch (NumberFormatException e2) {
            C6609a c6609a2 = f16167f;
            c6609a2.m21471i("Unable to parse '" + str + "' file: " + e2.getMessage());
        }
        do {
            try {
                readLine = bufferedReader.readLine();
                if (readLine == null) {
                    bufferedReader.close();
                    return 0;
                }
            } catch (Throwable th) {
                try {
                    bufferedReader.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } while (!readLine.startsWith("MemTotal"));
        Matcher matcher = Pattern.compile("\\d+").matcher(readLine);
        int parseInt = matcher.find() ? Integer.parseInt(matcher.group()) : 0;
        bufferedReader.close();
        return parseInt;
    }

    C6721h(Runtime runtime, Context context) {
        this.f16168a = runtime;
        this.f16172e = context;
        this.f16169b = (ActivityManager) context.getSystemService("activity");
        ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
        this.f16170c = memoryInfo;
        this.f16169b.getMemoryInfo(memoryInfo);
        this.f16171d = m20962a();
    }
}
