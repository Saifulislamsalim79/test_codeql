package com.google.firebase.auth.api.fallback.service;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
/* compiled from: com.google.firebase:firebase-auth@@21.0.1 */
/* loaded from: classes2.dex */
public class FirebaseAuthFallbackService extends Service {
    @Override // android.app.Service
    public final synchronized IBinder onBind(Intent intent) {
        if ("com.google.firebase.auth.api.gms.service.START".equals(intent.getAction())) {
            BinderC5194a binderC5194a = new BinderC5194a(this, this);
            binderC5194a.asBinder();
            return binderC5194a;
        }
        return null;
    }
}
