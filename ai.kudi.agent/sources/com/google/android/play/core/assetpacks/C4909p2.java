package com.google.android.play.core.assetpacks;

import com.google.android.play.core.internal.C4957a;
import java.io.File;
import java.io.IOException;
import java.security.NoSuchAlgorithmException;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.play.core.assetpacks.p2 */
/* loaded from: classes2.dex */
public final class C4909p2 {

    /* renamed from: b */
    private static final C4957a f12458b = new C4957a("VerifySliceTaskHandler");

    /* renamed from: a */
    private final C4840b0 f12459a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C4909p2(C4840b0 c4840b0) {
        this.f12459a = c4840b0;
    }

    /* renamed from: b */
    private final void m26049b(C4905o2 c4905o2, File file) {
        try {
            File m26136y = this.f12459a.m26136y(c4905o2.f12414b, c4905o2.f12422c, c4905o2.f12423d, c4905o2.f12424e);
            if (!m26136y.exists()) {
                throw new C4923t0(String.format("Cannot find metadata files for slice %s.", c4905o2.f12424e), c4905o2.f12413a);
            }
            try {
                if (!C4932v1.m25998b(C4901n2.m26058a(file, m26136y)).equals(c4905o2.f12425f)) {
                    throw new C4923t0(String.format("Verification failed for slice %s.", c4905o2.f12424e), c4905o2.f12413a);
                }
                f12458b.m25954f("Verification of slice %s of pack %s successful.", c4905o2.f12424e, c4905o2.f12414b);
            } catch (IOException e) {
                throw new C4923t0(String.format("Could not digest file during verification for slice %s.", c4905o2.f12424e), e, c4905o2.f12413a);
            } catch (NoSuchAlgorithmException e2) {
                throw new C4923t0("SHA256 algorithm not supported.", e2, c4905o2.f12413a);
            }
        } catch (IOException e3) {
            throw new C4923t0(String.format("Could not reconstruct slice archive during verification for slice %s.", c4905o2.f12424e), e3, c4905o2.f12413a);
        }
    }

    /* renamed from: a */
    public final void m26050a(C4905o2 c4905o2) {
        File m26158c = this.f12459a.m26158c(c4905o2.f12414b, c4905o2.f12422c, c4905o2.f12423d, c4905o2.f12424e);
        if (!m26158c.exists()) {
            throw new C4923t0(String.format("Cannot find unverified files for slice %s.", c4905o2.f12424e), c4905o2.f12413a);
        }
        m26049b(c4905o2, m26158c);
        File m26150k = this.f12459a.m26150k(c4905o2.f12414b, c4905o2.f12422c, c4905o2.f12423d, c4905o2.f12424e);
        if (!m26150k.exists()) {
            m26150k.mkdirs();
        }
        if (!m26158c.renameTo(m26150k)) {
            throw new C4923t0(String.format("Failed to move slice %s after verification.", c4905o2.f12424e), c4905o2.f12413a);
        }
    }
}
