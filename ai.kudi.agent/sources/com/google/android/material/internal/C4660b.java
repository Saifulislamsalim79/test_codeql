package com.google.android.material.internal;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
/* compiled from: ContextUtils.java */
/* renamed from: com.google.android.material.internal.b */
/* loaded from: classes2.dex */
public class C4660b {
    /* renamed from: a */
    public static Activity m26787a(Context context) {
        while (context instanceof ContextWrapper) {
            if (context instanceof Activity) {
                return (Activity) context;
            }
            context = ((ContextWrapper) context).getBaseContext();
        }
        return null;
    }
}
