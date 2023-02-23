package com.google.android.play.core.internal;

import android.os.Process;
import android.text.TextUtils;
import android.util.Log;
import java.util.IllegalFormatException;
import java.util.Locale;
/* renamed from: com.google.android.play.core.internal.a */
/* loaded from: classes2.dex */
public final class C4957a {

    /* renamed from: a */
    private final String f12619a;

    public C4957a(String str) {
        int myUid = Process.myUid();
        int myPid = Process.myPid();
        StringBuilder sb = new StringBuilder(39);
        sb.append("UID: [");
        sb.append(myUid);
        sb.append("]  PID: [");
        sb.append(myPid);
        sb.append("] ");
        String valueOf = String.valueOf(sb.toString());
        String valueOf2 = String.valueOf(str);
        this.f12619a = valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf);
    }

    /* renamed from: a */
    private final int m25959a(int i, String str, Object[] objArr) {
        if (Log.isLoggable("PlayCore", i)) {
            return Log.i("PlayCore", m25958b(this.f12619a, str, objArr));
        }
        return 0;
    }

    /* renamed from: b */
    private static String m25958b(String str, String str2, Object... objArr) {
        if (objArr.length > 0) {
            try {
                str2 = String.format(Locale.US, str2, objArr);
            } catch (IllegalFormatException e) {
                String valueOf = String.valueOf(str2);
                Log.e("PlayCore", valueOf.length() != 0 ? "Unable to format ".concat(valueOf) : new String("Unable to format "), e);
                String join = TextUtils.join(", ", objArr);
                StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 3 + String.valueOf(join).length());
                sb.append(str2);
                sb.append(" [");
                sb.append(join);
                sb.append("]");
                str2 = sb.toString();
            }
        }
        StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 3 + String.valueOf(str2).length());
        sb2.append(str);
        sb2.append(" : ");
        sb2.append(str2);
        return sb2.toString();
    }

    /* renamed from: c */
    public final void m25957c(String str, Object... objArr) {
        m25959a(3, str, objArr);
    }

    /* renamed from: d */
    public final void m25956d(Throwable th, String str, Object... objArr) {
        if (Log.isLoggable("PlayCore", 6)) {
            Log.e("PlayCore", m25958b(this.f12619a, str, objArr), th);
        }
    }

    /* renamed from: e */
    public final void m25955e(String str, Object... objArr) {
        m25959a(6, str, objArr);
    }

    /* renamed from: f */
    public final void m25954f(String str, Object... objArr) {
        m25959a(4, str, objArr);
    }

    /* renamed from: g */
    public final void m25953g(String str, Object... objArr) {
        m25959a(5, str, objArr);
    }
}
