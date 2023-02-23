package com.google.android.gms.tasks;

import ai.kudi.agent.core.analytics.FirebaseAnalyticsImpl;
/* compiled from: com.google.android.gms:play-services-tasks@@18.0.1 */
/* loaded from: classes2.dex */
public final class DuplicateTaskCompletionException extends IllegalStateException {
    private DuplicateTaskCompletionException(String str, Throwable th) {
        super(str, th);
    }

    /* renamed from: a */
    public static IllegalStateException m27802a(j<?> jVar) {
        String str;
        if (!jVar.o()) {
            return new IllegalStateException("DuplicateTaskCompletionException can only be created from completed Task.");
        }
        Exception k = jVar.k();
        if (k != null) {
            str = FirebaseAnalyticsImpl.STATUS_FAILURE;
        } else if (jVar.p()) {
            String valueOf = String.valueOf(jVar.l());
            String.valueOf(valueOf).length();
            str = "result ".concat(String.valueOf(valueOf));
        } else {
            str = jVar.n() ? "cancellation" : "unknown issue";
        }
        return new DuplicateTaskCompletionException(str.length() != 0 ? "Complete with: ".concat(str) : new String("Complete with: "), k);
    }
}
