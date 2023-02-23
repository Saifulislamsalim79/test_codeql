package com.google.firebase.messaging;

import android.os.Bundle;
import java.util.concurrent.TimeUnit;
import p201g.p218e.C7521a;
/* compiled from: com.google.firebase:firebase-messaging@@23.0.0 */
/* renamed from: com.google.firebase.messaging.b */
/* loaded from: classes2.dex */
public final class C6479b {

    /* renamed from: a */
    public static final long f15639a = TimeUnit.MINUTES.toMillis(3);

    /* compiled from: com.google.firebase:firebase-messaging@@23.0.0 */
    /* renamed from: com.google.firebase.messaging.b$a */
    /* loaded from: classes2.dex */
    public static final class C6480a {
        /* renamed from: a */
        public static C7521a<String, String> m21880a(Bundle bundle) {
            C7521a<String, String> c7521a = new C7521a<>();
            for (String str : bundle.keySet()) {
                Object obj = bundle.get(str);
                if (obj instanceof String) {
                    String str2 = (String) obj;
                    if (!str.startsWith("google.") && !str.startsWith("gcm.") && !str.equals("from") && !str.equals("message_type") && !str.equals("collapse_key")) {
                        c7521a.put(str, str2);
                    }
                }
            }
            return c7521a;
        }
    }
}
