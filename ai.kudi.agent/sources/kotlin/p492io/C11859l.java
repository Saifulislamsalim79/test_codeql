package kotlin.p492io;

import java.io.File;
import kotlin.e0.d.l;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Utils.kt */
/* renamed from: kotlin.io.l */
/* loaded from: classes3.dex */
public class C11859l extends C11858k {
    /* renamed from: j */
    public static boolean m10231j(File file) {
        l.f(file, "$this$deleteRecursively");
        while (true) {
            boolean z = true;
            for (File file2 : C11858k.m10232i(file)) {
                if (file2.delete() || !file2.exists()) {
                    if (z) {
                        break;
                    }
                }
                z = false;
            }
            return z;
        }
    }
}
