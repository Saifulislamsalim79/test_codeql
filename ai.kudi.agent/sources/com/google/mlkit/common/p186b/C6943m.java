package com.google.mlkit.common.p186b;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import java.util.List;
import p272h.p286c.p287a.p300b.p307d.p315h.AbstractC8503j;
/* compiled from: com.google.mlkit:common@@18.0.0 */
/* renamed from: com.google.mlkit.common.b.m */
/* loaded from: classes2.dex */
public class C6943m {
    /* renamed from: a */
    public static void m20435a(Context context, String str) {
        m20434b(context, AbstractC8503j.m16022s(str));
    }

    /* renamed from: b */
    public static void m20434b(Context context, List<String> list) {
        Intent intent = new Intent();
        intent.setClassName("com.google.android.gms", "com.google.android.gms.vision.DependencyBroadcastReceiverProxy");
        intent.setAction("com.google.android.gms.vision.DEPENDENCY");
        intent.putExtra("com.google.android.gms.vision.DEPENDENCIES", TextUtils.join(",", list));
        intent.putExtra("requester_app_package", context.getApplicationInfo().packageName);
        context.sendBroadcast(intent);
    }
}
