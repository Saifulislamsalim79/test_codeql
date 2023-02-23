package com.google.android.play.core.assetpacks;

import com.google.android.play.core.internal.C4957a;
import java.io.File;
import java.io.IOException;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.play.core.assetpacks.z1 */
/* loaded from: classes2.dex */
public final class C4948z1 {

    /* renamed from: b */
    private static final C4957a f12605b = new C4957a("MergeSliceTaskHandler");

    /* renamed from: a */
    private final C4840b0 f12606a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C4948z1(C4840b0 c4840b0) {
        this.f12606a = c4840b0;
    }

    /* renamed from: b */
    private static void m25974b(File file, File file2) {
        File[] listFiles;
        if (!file.isDirectory()) {
            if (file2.exists()) {
                String valueOf = String.valueOf(file2);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 51);
                sb.append("File clashing with existing file from other slice: ");
                sb.append(valueOf);
                throw new C4923t0(sb.toString());
            } else if (file.renameTo(file2)) {
                return;
            } else {
                String valueOf2 = String.valueOf(file);
                StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 21);
                sb2.append("Unable to move file: ");
                sb2.append(valueOf2);
                throw new C4923t0(sb2.toString());
            }
        }
        file2.mkdirs();
        for (File file3 : file.listFiles()) {
            m25974b(file3, new File(file2, file3.getName()));
        }
        if (file.delete()) {
            return;
        }
        String valueOf3 = String.valueOf(file);
        StringBuilder sb3 = new StringBuilder(String.valueOf(valueOf3).length() + 28);
        sb3.append("Unable to delete directory: ");
        sb3.append(valueOf3);
        throw new C4923t0(sb3.toString());
    }

    /* renamed from: a */
    public final void m25975a(C4944y1 c4944y1) {
        File m26150k = this.f12606a.m26150k(c4944y1.f12414b, c4944y1.f12597c, c4944y1.f12598d, c4944y1.f12599e);
        if (!m26150k.exists()) {
            throw new C4923t0(String.format("Cannot find verified files for slice %s.", c4944y1.f12599e), c4944y1.f12413a);
        }
        File m26148m = this.f12606a.m26148m(c4944y1.f12414b, c4944y1.f12597c, c4944y1.f12598d);
        if (!m26148m.exists()) {
            m26148m.mkdirs();
        }
        m25974b(m26150k, m26148m);
        try {
            this.f12606a.m26155f(c4944y1.f12414b, c4944y1.f12597c, c4944y1.f12598d, this.f12606a.m26143r(c4944y1.f12414b, c4944y1.f12597c, c4944y1.f12598d) + 1);
        } catch (IOException e) {
            f12605b.m25955e("Writing merge checkpoint failed with %s.", e.getMessage());
            throw new C4923t0("Writing merge checkpoint failed.", e, c4944y1.f12413a);
        }
    }
}
