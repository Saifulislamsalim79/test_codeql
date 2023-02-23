package com.google.android.gms.internal.measurement;

import android.net.Uri;
import java.util.Map;
/* compiled from: com.google.android.gms:play-services-measurement-impl@@20.0.0 */
/* renamed from: com.google.android.gms.internal.measurement.a6 */
/* loaded from: classes2.dex */
public final class C3703a6 {

    /* renamed from: a */
    private final Map<String, Map<String, String>> f9184a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C3703a6(Map<String, Map<String, String>> map) {
        this.f9184a = map;
    }

    /* renamed from: a */
    public final String m29847a(Uri uri, String str, String str2, String str3) {
        if (uri != null) {
            Map<String, String> map = this.f9184a.get(uri.toString());
            if (map == null) {
                return null;
            }
            String valueOf = String.valueOf(str3);
            return map.get(valueOf.length() != 0 ? "".concat(valueOf) : new String(""));
        }
        return null;
    }
}
