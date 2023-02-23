package kotlinx.coroutines;
/* compiled from: MainCoroutineDispatcher.kt */
/* renamed from: kotlinx.coroutines.y1 */
/* loaded from: classes3.dex */
public abstract class AbstractC14111y1 extends AbstractC13857h0 {
    /* renamed from: J0 */
    public abstract AbstractC14111y1 mo2938J0();

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: K0 */
    public final String m2937K0() {
        AbstractC14111y1 abstractC14111y1;
        AbstractC14111y1 m2944c = C14107x0.m2944c();
        if (this == m2944c) {
            return "Dispatchers.Main";
        }
        try {
            abstractC14111y1 = m2944c.mo2938J0();
        } catch (UnsupportedOperationException unused) {
            abstractC14111y1 = null;
        }
        if (this == abstractC14111y1) {
            return "Dispatchers.Main.immediate";
        }
        return null;
    }

    @Override // kotlinx.coroutines.AbstractC13857h0
    public String toString() {
        String m2937K0 = m2937K0();
        if (m2937K0 == null) {
            return C14034r0.m3204a(this) + '@' + C14034r0.m3203b(this);
        }
        return m2937K0;
    }
}
