package kotlinx.coroutines;

import kotlinx.coroutines.internal.C13868a;
import tv.danmaku.ijk.media.player.IjkMediaMeta;
/* compiled from: EventLoop.common.kt */
/* renamed from: kotlinx.coroutines.b1 */
/* loaded from: classes3.dex */
public abstract class AbstractC13756b1 extends AbstractC13857h0 {

    /* renamed from: d */
    private long f30199d;

    /* renamed from: e */
    private boolean f30200e;

    /* renamed from: f */
    private C13868a<AbstractC14087v0<?>> f30201f;

    /* renamed from: K0 */
    private final long m3755K0(boolean z) {
        if (z) {
            return IjkMediaMeta.AV_CH_WIDE_RIGHT;
        }
        return 1L;
    }

    /* renamed from: U0 */
    public static /* synthetic */ void m3752U0(AbstractC13756b1 abstractC13756b1, boolean z, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: incrementUseCount");
        }
        if ((i & 1) != 0) {
            z = false;
        }
        abstractC13756b1.m3753Q0(z);
    }

    /* renamed from: J0 */
    public final void m3756J0(boolean z) {
        long m3755K0 = this.f30199d - m3755K0(z);
        this.f30199d = m3755K0;
        if (m3755K0 > 0) {
            return;
        }
        if (C13952q0.m3345a()) {
            if (!(this.f30199d == 0)) {
                throw new AssertionError();
            }
        }
        if (this.f30200e) {
            shutdown();
        }
    }

    /* renamed from: L0 */
    public final void m3754L0(AbstractC14087v0<?> abstractC14087v0) {
        C13868a<AbstractC14087v0<?>> c13868a = this.f30201f;
        if (c13868a == null) {
            c13868a = new C13868a<>();
            this.f30201f = c13868a;
        }
        c13868a.m3562a(abstractC14087v0);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: P0 */
    public long mo3746P0() {
        C13868a<AbstractC14087v0<?>> c13868a = this.f30201f;
        return (c13868a == null || c13868a.m3560c()) ? Long.MAX_VALUE : 0L;
    }

    /* renamed from: Q0 */
    public final void m3753Q0(boolean z) {
        this.f30199d += m3755K0(z);
        if (z) {
            return;
        }
        this.f30200e = true;
    }

    /* renamed from: X0 */
    public final boolean m3751X0() {
        return this.f30199d >= m3755K0(true);
    }

    /* renamed from: Z0 */
    public final boolean m3750Z0() {
        C13868a<AbstractC14087v0<?>> c13868a = this.f30201f;
        if (c13868a == null) {
            return true;
        }
        return c13868a.m3560c();
    }

    /* renamed from: b1 */
    public final boolean m3749b1() {
        AbstractC14087v0<?> m3559d;
        C13868a<AbstractC14087v0<?>> c13868a = this.f30201f;
        if (c13868a == null || (m3559d = c13868a.m3559d()) == null) {
            return false;
        }
        m3559d.run();
        return true;
    }

    protected void shutdown() {
    }
}
