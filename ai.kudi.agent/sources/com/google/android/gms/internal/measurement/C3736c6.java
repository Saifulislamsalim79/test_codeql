package com.google.android.gms.internal.measurement;

import android.net.Uri;
import p201g.p218e.C7521a;
/* compiled from: com.google.android.gms:play-services-measurement-impl@@20.0.0 */
/* renamed from: com.google.android.gms.internal.measurement.c6 */
/* loaded from: classes2.dex */
public final class C3736c6 {

    /* renamed from: a */
    private static final C7521a<String, Uri> f9221a = new C7521a<>();

    /* renamed from: a */
    public static synchronized Uri m29716a(String str) {
        Uri uri;
        synchronized (C3736c6.class) {
            uri = f9221a.get("com.google.android.gms.measurement");
            if (uri == null) {
                String valueOf = String.valueOf(Uri.encode("com.google.android.gms.measurement"));
                uri = Uri.parse(valueOf.length() != 0 ? "content://com.google.android.gms.phenotype/".concat(valueOf) : new String("content://com.google.android.gms.phenotype/"));
                f9221a.put("com.google.android.gms.measurement", uri);
            }
        }
        return uri;
    }
}
