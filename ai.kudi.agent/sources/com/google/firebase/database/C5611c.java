package com.google.firebase.database;

import ai.kudi.agent.core.analytics.FirebaseAnalyticsImpl;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
/* compiled from: DatabaseError.java */
/* renamed from: com.google.firebase.database.c */
/* loaded from: classes2.dex */
public class C5611c {

    /* renamed from: d */
    private static final Map<Integer, String> f13825d;

    /* renamed from: e */
    private static final Map<String, Integer> f13826e;

    /* renamed from: a */
    private final int f13827a;

    /* renamed from: b */
    private final String f13828b;

    /* renamed from: c */
    private final String f13829c;

    static {
        HashMap hashMap = new HashMap();
        f13825d = hashMap;
        hashMap.put(-1, "The transaction needs to be run again with current data");
        f13825d.put(-2, "The server indicated that this operation failed");
        f13825d.put(-3, "This client does not have permission to perform this operation");
        f13825d.put(-4, "The operation had to be aborted due to a network disconnect");
        f13825d.put(-6, "The supplied auth token has expired");
        f13825d.put(-7, "The supplied auth token was invalid");
        f13825d.put(-8, "The transaction had too many retries");
        f13825d.put(-9, "The transaction was overridden by a subsequent set");
        f13825d.put(-10, "The service is unavailable");
        f13825d.put(-11, "User code called from the Firebase Database runloop threw an exception:\n");
        f13825d.put(-24, "The operation could not be performed due to a network error");
        f13825d.put(-25, "The write was canceled by the user.");
        f13825d.put(-999, "An unknown error occurred");
        HashMap hashMap2 = new HashMap();
        f13826e = hashMap2;
        hashMap2.put("datastale", -1);
        f13826e.put(FirebaseAnalyticsImpl.STATUS_FAILURE, -2);
        f13826e.put("permission_denied", -3);
        f13826e.put("disconnected", -4);
        f13826e.put("expired_token", -6);
        f13826e.put("invalid_token", -7);
        f13826e.put("maxretries", -8);
        f13826e.put("overriddenbyset", -9);
        f13826e.put("unavailable", -10);
        f13826e.put("network_error", -24);
        f13826e.put("write_canceled", -25);
    }

    private C5611c(int i, String str) {
        this(i, str, null);
    }

    /* renamed from: a */
    public static C5611c m24336a(int i) {
        if (f13825d.containsKey(Integer.valueOf(i))) {
            return new C5611c(i, f13825d.get(Integer.valueOf(i)), null);
        }
        throw new IllegalArgumentException("Invalid Firebase Database error code: " + i);
    }

    /* renamed from: b */
    public static C5611c m24335b(Throwable th) {
        StringWriter stringWriter = new StringWriter();
        th.printStackTrace(new PrintWriter(stringWriter));
        return new C5611c(-11, f13825d.get(-11) + stringWriter.toString());
    }

    /* renamed from: c */
    public static C5611c m24334c(String str) {
        return m24333d(str, null);
    }

    /* renamed from: d */
    public static C5611c m24333d(String str, String str2) {
        return m24332e(str, str2, null);
    }

    /* renamed from: e */
    public static C5611c m24332e(String str, String str2, String str3) {
        Integer num = f13826e.get(str.toLowerCase(Locale.US));
        if (num == null) {
            num = -999;
        }
        if (str2 == null) {
            str2 = f13825d.get(num);
        }
        return new C5611c(num.intValue(), str2, str3);
    }

    /* renamed from: f */
    public int m24331f() {
        return this.f13827a;
    }

    /* renamed from: g */
    public String m24330g() {
        return this.f13829c;
    }

    /* renamed from: h */
    public String m24329h() {
        return this.f13828b;
    }

    /* renamed from: i */
    public DatabaseException m24328i() {
        return new DatabaseException("Firebase Database error: " + this.f13828b);
    }

    public String toString() {
        return "DatabaseError: " + this.f13828b;
    }

    private C5611c(int i, String str, String str2) {
        this.f13827a = i;
        this.f13828b = str;
        this.f13829c = str2 == null ? "" : str2;
    }
}
