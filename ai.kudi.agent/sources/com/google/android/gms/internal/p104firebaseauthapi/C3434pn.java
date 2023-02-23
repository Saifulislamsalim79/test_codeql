package com.google.android.gms.internal.p104firebaseauthapi;
/* compiled from: com.google.firebase:firebase-auth@@21.0.1 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.pn */
/* loaded from: classes2.dex */
final class C3434pn extends AbstractC3671z0 {
    /* JADX INFO: Access modifiers changed from: package-private */
    public C3434pn(C3383no c3383no, C3490s1 c3490s1, CharSequence charSequence) {
        super(c3490s1, charSequence);
    }

    @Override // com.google.android.gms.internal.p104firebaseauthapi.AbstractC3671z0
    /* renamed from: c */
    final int mo29914c(int i) {
        return i + 1;
    }

    @Override // com.google.android.gms.internal.p104firebaseauthapi.AbstractC3671z0
    /* renamed from: d */
    final int mo29913d(int i) {
        String m30221b;
        CharSequence charSequence = this.f9136e;
        int length = charSequence.length();
        if (i >= 0 && i <= length) {
            while (i < length) {
                if (charSequence.charAt(i) == '.') {
                    return i;
                }
                i++;
            }
            return -1;
        }
        if (i < 0) {
            m30221b = C3516t1.m30221b("%s (%s) must not be negative", "index", Integer.valueOf(i));
        } else if (length < 0) {
            StringBuilder sb = new StringBuilder(26);
            sb.append("negative size: ");
            sb.append(length);
            throw new IllegalArgumentException(sb.toString());
        } else {
            m30221b = C3516t1.m30221b("%s (%s) must not be greater than size (%s)", "index", Integer.valueOf(i), Integer.valueOf(length));
        }
        throw new IndexOutOfBoundsException(m30221b);
    }
}
