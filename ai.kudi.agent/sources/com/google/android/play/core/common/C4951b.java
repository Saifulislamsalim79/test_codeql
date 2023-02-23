package com.google.android.play.core.common;

import android.os.Bundle;
import java.util.HashMap;
import java.util.Map;
/* renamed from: com.google.android.play.core.common.b */
/* loaded from: classes2.dex */
public final class C4951b {

    /* renamed from: a */
    private final Map<String, Object> f12610a = new HashMap();

    /* renamed from: a */
    public final synchronized void m25971a(Bundle bundle) {
        for (String str : bundle.keySet()) {
            Object obj = bundle.get(str);
            if (obj != null && this.f12610a.get(str) == null) {
                this.f12610a.put(str, obj);
            }
        }
    }

    /* renamed from: b */
    public final synchronized boolean m25970b() {
        Object obj = this.f12610a.get("usingExtractorStream");
        if (obj instanceof Boolean) {
            return ((Boolean) obj).booleanValue();
        }
        return false;
    }
}
