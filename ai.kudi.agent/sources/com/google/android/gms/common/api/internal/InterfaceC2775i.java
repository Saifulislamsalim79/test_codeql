package com.google.android.gms.common.api.internal;

import android.app.Activity;
import android.content.Intent;
/* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
/* renamed from: com.google.android.gms.common.api.internal.i */
/* loaded from: classes2.dex */
public interface InterfaceC2775i {
    /* renamed from: a */
    void mo31920a(String str, LifecycleCallback lifecycleCallback);

    /* renamed from: b */
    <T extends LifecycleCallback> T mo31919b(String str, Class<T> cls);

    /* renamed from: d */
    Activity mo31918d();

    void startActivityForResult(Intent intent, int i);
}
