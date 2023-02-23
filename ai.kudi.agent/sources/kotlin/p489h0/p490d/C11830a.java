package kotlin.p489h0.p490d;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;
import kotlin.e0.d.l;
import kotlin.p489h0.AbstractC11825a;
/* compiled from: PlatformThreadLocalRandom.kt */
/* renamed from: kotlin.h0.d.a */
/* loaded from: classes3.dex */
public final class C11830a extends AbstractC11825a {
    @Override // kotlin.p489h0.AbstractC11825a
    /* renamed from: c */
    public Random mo10294c() {
        ThreadLocalRandom current = ThreadLocalRandom.current();
        l.e(current, "ThreadLocalRandom.current()");
        return current;
    }
}
