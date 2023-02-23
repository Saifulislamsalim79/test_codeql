package p272h.p286c.p287a.p343d.p344a.p345a;

import android.content.Context;
import java.io.File;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: h.c.a.d.a.a.s */
/* loaded from: classes2.dex */
public final class C9346s {

    /* renamed from: a */
    private final Context f21953a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C9346s(Context context) {
        this.f21953a = context;
    }

    /* renamed from: b */
    private static long m15001b(File file) {
        if (file.isDirectory()) {
            File[] listFiles = file.listFiles();
            long j = 0;
            if (listFiles != null) {
                for (File file2 : listFiles) {
                    j += m15001b(file2);
                }
            }
            return j;
        }
        return file.length();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final long m15002a() {
        return m15001b(new File(this.f21953a.getFilesDir(), "assetpacks"));
    }
}
