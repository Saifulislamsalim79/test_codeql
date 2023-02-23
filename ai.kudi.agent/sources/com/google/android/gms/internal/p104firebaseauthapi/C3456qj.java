package com.google.android.gms.internal.p104firebaseauthapi;

import java.io.Serializable;
import java.util.regex.Pattern;
/* compiled from: com.google.firebase:firebase-auth@@21.0.1 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.qj */
/* loaded from: classes2.dex */
final class C3456qj extends AbstractC3351mi implements Serializable {

    /* renamed from: c */
    private final Pattern f8891c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C3456qj(Pattern pattern) {
        if (pattern == null) {
            throw null;
        }
        this.f8891c = pattern;
    }

    @Override // com.google.android.gms.internal.p104firebaseauthapi.AbstractC3351mi
    /* renamed from: a */
    public final C3109di mo30424a(CharSequence charSequence) {
        return new C3637xi(this.f8891c.matcher(charSequence));
    }

    public final String toString() {
        return this.f8891c.toString();
    }
}
