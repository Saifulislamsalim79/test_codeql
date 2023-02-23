package com.google.android.gms.internal.p104firebaseauthapi;
/* compiled from: com.google.firebase:firebase-auth@@21.0.1 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.x0 */
/* loaded from: classes2.dex */
final class C3619x0 {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static String m30068a(AbstractC3223ho abstractC3223ho) {
        StringBuilder sb = new StringBuilder(abstractC3223ho.mo31014f());
        for (int i = 0; i < abstractC3223ho.mo31014f(); i++) {
            byte mo31016d = abstractC3223ho.mo31016d(i);
            if (mo31016d == 34) {
                sb.append("\\\"");
            } else if (mo31016d == 39) {
                sb.append("\\'");
            } else if (mo31016d != 92) {
                switch (mo31016d) {
                    case 7:
                        sb.append("\\a");
                        continue;
                    case 8:
                        sb.append("\\b");
                        continue;
                    case 9:
                        sb.append("\\t");
                        continue;
                    case 10:
                        sb.append("\\n");
                        continue;
                    case 11:
                        sb.append("\\v");
                        continue;
                    case 12:
                        sb.append("\\f");
                        continue;
                    case 13:
                        sb.append("\\r");
                        continue;
                    default:
                        if (mo31016d >= 32 && mo31016d <= 126) {
                            sb.append((char) mo31016d);
                            continue;
                        } else {
                            sb.append('\\');
                            sb.append((char) (((mo31016d >>> 6) & 3) + 48));
                            sb.append((char) (((mo31016d >>> 3) & 7) + 48));
                            sb.append((char) ((mo31016d & 7) + 48));
                            break;
                        }
                        break;
                }
            } else {
                sb.append("\\\\");
            }
        }
        return sb.toString();
    }
}
