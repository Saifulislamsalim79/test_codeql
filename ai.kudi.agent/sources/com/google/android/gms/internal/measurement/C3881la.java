package com.google.android.gms.internal.measurement;
/* compiled from: com.google.android.gms:play-services-measurement-base@@20.0.0 */
/* renamed from: com.google.android.gms.internal.measurement.la */
/* loaded from: classes2.dex */
final class C3881la {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static String m29414a(AbstractC3909n7 abstractC3909n7) {
        StringBuilder sb = new StringBuilder(abstractC3909n7.mo29340f());
        for (int i = 0; i < abstractC3909n7.mo29340f(); i++) {
            byte mo29342d = abstractC3909n7.mo29342d(i);
            if (mo29342d == 34) {
                sb.append("\\\"");
            } else if (mo29342d == 39) {
                sb.append("\\'");
            } else if (mo29342d != 92) {
                switch (mo29342d) {
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
                        if (mo29342d >= 32 && mo29342d <= 126) {
                            sb.append((char) mo29342d);
                            continue;
                        } else {
                            sb.append('\\');
                            sb.append((char) (((mo29342d >>> 6) & 3) + 48));
                            sb.append((char) (((mo29342d >>> 3) & 7) + 48));
                            sb.append((char) ((mo29342d & 7) + 48));
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
