package com.google.firebase.p169n;

import android.content.Context;
import android.content.SharedPreferences;
import java.text.SimpleDateFormat;
import java.util.Date;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: HeartBeatInfoStorage.java */
/* renamed from: com.google.firebase.n.g */
/* loaded from: classes2.dex */
public class C6557g {

    /* renamed from: b */
    private static C6557g f15830b;

    /* renamed from: c */
    private static final SimpleDateFormat f15831c = new SimpleDateFormat("dd/MM/yyyy z");

    /* renamed from: a */
    private final SharedPreferences f15832a;

    private C6557g(Context context) {
        this.f15832a = context.getSharedPreferences("FirebaseAppHeartBeat", 0);
        context.getSharedPreferences("FirebaseAppHeartBeatStorage", 0);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static synchronized C6557g m21643a(Context context) {
        C6557g c6557g;
        synchronized (C6557g.class) {
            if (f15830b == null) {
                f15830b = new C6557g(context);
            }
            c6557g = f15830b;
        }
        return c6557g;
    }

    /* renamed from: b */
    static boolean m21642b(long j, long j2) {
        return !f15831c.format(new Date(j)).equals(f15831c.format(new Date(j2)));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public synchronized boolean m21641c(long j) {
        return m21640d("fire-global", j);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public synchronized boolean m21640d(String str, long j) {
        if (this.f15832a.contains(str)) {
            if (m21642b(this.f15832a.getLong(str, -1L), j)) {
                this.f15832a.edit().putLong(str, j).apply();
                return true;
            }
            return false;
        }
        this.f15832a.edit().putLong(str, j).apply();
        return true;
    }
}
