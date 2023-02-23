package kotlin.p492io;

import java.io.File;
import kotlin.e0.d.l;
/* compiled from: Exceptions.kt */
/* renamed from: kotlin.io.c */
/* loaded from: classes3.dex */
public final class C11844c {
    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b */
    public static final String m10257b(File file, File file2, String str) {
        StringBuilder sb = new StringBuilder(file.toString());
        if (file2 != null) {
            sb.append(" -> " + file2);
        }
        if (str != null) {
            sb.append(": " + str);
        }
        String sb2 = sb.toString();
        l.e(sb2, "sb.toString()");
        return sb2;
    }
}
