package com.google.android.gms.common.api;

import android.app.Activity;
import android.content.IntentSender;
/* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
/* loaded from: classes2.dex */
public class ResolvableApiException extends ApiException {
    public ResolvableApiException(Status status) {
        super(status);
    }

    /* renamed from: c */
    public void m32100c(Activity activity, int i) throws IntentSender.SendIntentException {
        m32106a().m32093u(activity, i);
    }
}
