package com.google.firebase.perf.p178j;

import android.content.Context;
import android.content.res.Resources;
import com.google.firebase.perf.p176h.C6609a;
import java.net.URI;
/* compiled from: URLAllowlist.java */
/* renamed from: com.google.firebase.perf.j.i */
/* loaded from: classes2.dex */
public class C6639i {

    /* renamed from: a */
    private static String[] f16015a;

    /* renamed from: a */
    public static boolean m21395a(URI uri, Context context) {
        Resources resources = context.getResources();
        int identifier = resources.getIdentifier("firebase_performance_whitelisted_domains", "array", context.getPackageName());
        if (identifier == 0) {
            return true;
        }
        C6609a.m21475e().m21479a("Detected domain allowlist, only allowlisted domains will be measured.");
        if (f16015a == null) {
            f16015a = resources.getStringArray(identifier);
        }
        String host = uri.getHost();
        if (host == null) {
            return true;
        }
        for (String str : f16015a) {
            if (host.contains(str)) {
                return true;
            }
        }
        return false;
    }
}
