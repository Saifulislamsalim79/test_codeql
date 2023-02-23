package p272h.p286c.p287a.p300b.p307d.p317j;

import android.content.Context;
import android.os.SystemClock;
import com.google.android.gms.common.internal.C2903p;
import com.google.android.gms.common.internal.C2929w;
import com.google.android.gms.common.internal.C2932x;
import com.google.android.gms.common.internal.C2938z;
import com.google.android.gms.common.internal.InterfaceC2935y;
import com.google.android.gms.tasks.InterfaceC4456f;
import java.util.Arrays;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;
/* compiled from: com.google.android.gms:play-services-mlkit-face-detection@@17.0.0 */
/* renamed from: h.c.a.b.d.j.nc */
/* loaded from: classes2.dex */
public final class C9029nc {

    /* renamed from: a */
    private final InterfaceC2935y f21327a;

    /* renamed from: b */
    private final AtomicLong f21328b = new AtomicLong(-1);

    C9029nc(Context context, String str) {
        C2938z.C2939a m31594c = C2938z.m31594c();
        m31594c.m31591b("mlkit:vision");
        this.f21327a = C2932x.m31602b(context, m31594c.m31592a());
    }

    /* renamed from: a */
    public static C9029nc m15619a(Context context) {
        return new C9029nc(context, "mlkit:vision");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public final /* synthetic */ void m15618b(long j, Exception exc) {
        this.f21328b.set(j);
    }

    /* renamed from: c */
    public final synchronized void m15617c(int i, int i2, long j, long j2) {
        final long elapsedRealtime = SystemClock.elapsedRealtime();
        if (this.f21328b.get() != -1 && elapsedRealtime - this.f21328b.get() <= TimeUnit.MINUTES.toMillis(30L)) {
            return;
        }
        this.f21327a.mo31598a(new C2929w(0, Arrays.asList(new C2903p(i, i2, 0, j, j2, null, null, 0)))).d(new InterfaceC4456f() { // from class: h.c.a.b.d.j.lc
            @Override // com.google.android.gms.tasks.InterfaceC4456f
            /* renamed from: b */
            public final void mo15657b(Exception exc) {
                C9029nc.this.m15618b(elapsedRealtime, exc);
            }
        });
    }
}
