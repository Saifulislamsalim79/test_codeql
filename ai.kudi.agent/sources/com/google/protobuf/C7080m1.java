package com.google.protobuf;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: TextFormatEscaper.java */
/* renamed from: com.google.protobuf.m1 */
/* loaded from: classes2.dex */
public final class C7080m1 {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: TextFormatEscaper.java */
    /* renamed from: com.google.protobuf.m1$a */
    /* loaded from: classes2.dex */
    public static class C7081a implements InterfaceC7082b {

        /* renamed from: a */
        final /* synthetic */ AbstractC7039i f16908a;

        C7081a(AbstractC7039i abstractC7039i) {
            this.f16908a = abstractC7039i;
        }

        @Override // com.google.protobuf.C7080m1.InterfaceC7082b
        /* renamed from: a */
        public byte mo19806a(int i) {
            return this.f16908a.mo19318e(i);
        }

        @Override // com.google.protobuf.C7080m1.InterfaceC7082b
        public int size() {
            return this.f16908a.size();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: TextFormatEscaper.java */
    /* renamed from: com.google.protobuf.m1$b */
    /* loaded from: classes2.dex */
    public interface InterfaceC7082b {
        /* renamed from: a */
        byte mo19806a(int i);

        int size();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static String m19809a(AbstractC7039i abstractC7039i) {
        return m19808b(new C7081a(abstractC7039i));
    }

    /* renamed from: b */
    static String m19808b(InterfaceC7082b interfaceC7082b) {
        StringBuilder sb = new StringBuilder(interfaceC7082b.size());
        for (int i = 0; i < interfaceC7082b.size(); i++) {
            byte mo19806a = interfaceC7082b.mo19806a(i);
            if (mo19806a == 34) {
                sb.append("\\\"");
            } else if (mo19806a == 39) {
                sb.append("\\'");
            } else if (mo19806a != 92) {
                switch (mo19806a) {
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
                        if (mo19806a >= 32 && mo19806a <= 126) {
                            sb.append((char) mo19806a);
                            continue;
                        } else {
                            sb.append('\\');
                            sb.append((char) (((mo19806a >>> 6) & 3) + 48));
                            sb.append((char) (((mo19806a >>> 3) & 7) + 48));
                            sb.append((char) ((mo19806a & 7) + 48));
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

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public static String m19807c(String str) {
        return m19809a(AbstractC7039i.m20089m(str));
    }
}
