package com.google.firebase.messaging;

import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.internal.C2906q;
import java.util.regex.Pattern;
/* compiled from: com.google.firebase:firebase-messaging@@23.0.0 */
/* renamed from: com.google.firebase.messaging.v0 */
/* loaded from: classes2.dex */
final class C6540v0 {

    /* renamed from: d */
    private static final Pattern f15783d = Pattern.compile("[a-zA-Z0-9-_.~%]{1,900}");

    /* renamed from: a */
    private final String f15784a;

    /* renamed from: b */
    private final String f15785b;

    /* renamed from: c */
    private final String f15786c;

    private C6540v0(String str, String str2) {
        this.f15784a = m21683d(str2, str);
        this.f15785b = str;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 1 + String.valueOf(str2).length());
        sb.append(str);
        sb.append("!");
        sb.append(str2);
        this.f15786c = sb.toString();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static C6540v0 m21686a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        String[] split = str.split("!", -1);
        if (split.length != 2) {
            return null;
        }
        return new C6540v0(split[0], split[1]);
    }

    /* renamed from: d */
    private static String m21683d(String str, String str2) {
        if (str != null && str.startsWith("/topics/")) {
            Log.w("FirebaseMessaging", String.format("Format /topics/topic-name is deprecated. Only 'topic-name' should be used in %s.", str2));
            str = str.substring(8);
        }
        if (str == null || !f15783d.matcher(str).matches()) {
            throw new IllegalArgumentException(String.format("Invalid topic name: %s does not match the allowed format %s.", str, "[a-zA-Z0-9-_.~%]{1,900}"));
        }
        return str;
    }

    /* renamed from: b */
    public String m21685b() {
        return this.f15785b;
    }

    /* renamed from: c */
    public String m21684c() {
        return this.f15784a;
    }

    /* renamed from: e */
    public String m21682e() {
        return this.f15786c;
    }

    public boolean equals(Object obj) {
        if (obj instanceof C6540v0) {
            C6540v0 c6540v0 = (C6540v0) obj;
            return this.f15784a.equals(c6540v0.f15784a) && this.f15785b.equals(c6540v0.f15785b);
        }
        return false;
    }

    public int hashCode() {
        return C2906q.m31700b(this.f15785b, this.f15784a);
    }
}
