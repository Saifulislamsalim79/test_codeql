package com.google.android.play.core.assetpacks;

import com.google.android.play.core.common.C4951b;
import com.google.android.play.core.internal.C4957a;
import com.google.android.play.core.internal.C4987n;
import com.google.android.play.core.internal.InterfaceC5005y;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.zip.GZIPInputStream;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.play.core.assetpacks.i2 */
/* loaded from: classes2.dex */
public final class C4877i2 {

    /* renamed from: d */
    private static final C4957a f12355d = new C4957a("PatchSliceTaskHandler");

    /* renamed from: a */
    private final C4840b0 f12356a;

    /* renamed from: b */
    private final InterfaceC5005y<InterfaceC4883j3> f12357b;

    /* renamed from: c */
    private final C4951b f12358c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C4877i2(C4840b0 c4840b0, InterfaceC5005y<InterfaceC4883j3> interfaceC5005y, C4951b c4951b) {
        this.f12356a = c4840b0;
        this.f12357b = interfaceC5005y;
        this.f12358c = c4951b;
    }

    /* renamed from: a */
    public final void m26109a(C4872h2 c4872h2) {
        File m26159b = this.f12356a.m26159b(c4872h2.f12414b, c4872h2.f12339c, c4872h2.f12340d);
        File file = new File(this.f12356a.m26151j(c4872h2.f12414b, c4872h2.f12339c, c4872h2.f12340d), c4872h2.f12344h);
        try {
            InputStream inputStream = c4872h2.f12346j;
            if (c4872h2.f12343g == 2) {
                inputStream = new GZIPInputStream(inputStream, 8192);
            }
            C4855e0 c4855e0 = new C4855e0(m26159b, file);
            if (this.f12358c.m25970b()) {
                File m26158c = this.f12356a.m26158c(c4872h2.f12414b, c4872h2.f12341e, c4872h2.f12342f, c4872h2.f12344h);
                if (!m26158c.exists()) {
                    m26158c.mkdirs();
                }
                C4892l2 c4892l2 = new C4892l2(this.f12356a, c4872h2.f12414b, c4872h2.f12341e, c4872h2.f12342f, c4872h2.f12344h);
                C4987n.m25916b(c4855e0, inputStream, new C4935w0(m26158c, c4892l2), c4872h2.f12345i);
                c4892l2.m26066j(0);
            } else {
                File file2 = new File(this.f12356a.m26136y(c4872h2.f12414b, c4872h2.f12341e, c4872h2.f12342f, c4872h2.f12344h), "slice.zip.tmp");
                if (file2.getParentFile() != null && !file2.getParentFile().exists()) {
                    file2.getParentFile().mkdirs();
                }
                C4987n.m25916b(c4855e0, inputStream, new FileOutputStream(file2), c4872h2.f12345i);
                if (!file2.renameTo(this.f12356a.m26138w(c4872h2.f12414b, c4872h2.f12341e, c4872h2.f12342f, c4872h2.f12344h))) {
                    throw new C4923t0(String.format("Error moving patch for slice %s of pack %s.", c4872h2.f12344h, c4872h2.f12414b), c4872h2.f12413a);
                }
            }
            inputStream.close();
            if (this.f12358c.m25970b()) {
                f12355d.m25954f("Patching and extraction finished for slice %s of pack %s.", c4872h2.f12344h, c4872h2.f12414b);
            } else {
                f12355d.m25954f("Patching finished for slice %s of pack %s.", c4872h2.f12344h, c4872h2.f12414b);
            }
            this.f12357b.m25876a().mo26013d(c4872h2.f12413a, c4872h2.f12414b, c4872h2.f12344h, 0);
            try {
                c4872h2.f12346j.close();
            } catch (IOException unused) {
                f12355d.m25953g("Could not close file for slice %s of pack %s.", c4872h2.f12344h, c4872h2.f12414b);
            }
        } catch (IOException e) {
            f12355d.m25955e("IOException during patching %s.", e.getMessage());
            throw new C4923t0(String.format("Error patching slice %s of pack %s.", c4872h2.f12344h, c4872h2.f12414b), e, c4872h2.f12413a);
        }
    }
}
