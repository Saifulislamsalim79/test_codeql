package kotlin.p489h0;

import java.util.Random;
import kotlin.e0.d.l;
/* compiled from: PlatformRandom.kt */
/* renamed from: kotlin.h0.b */
/* loaded from: classes3.dex */
public final class C11826b extends AbstractC11825a {

    /* renamed from: e */
    private final C11827a f26509e = new C11827a();

    /* compiled from: PlatformRandom.kt */
    /* renamed from: kotlin.h0.b$a */
    /* loaded from: classes3.dex */
    public static final class C11827a extends ThreadLocal<Random> {
        C11827a() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // java.lang.ThreadLocal
        /* renamed from: a */
        public Random initialValue() {
            return new Random();
        }
    }

    @Override // kotlin.p489h0.AbstractC11825a
    /* renamed from: c */
    public Random mo10294c() {
        Random random = this.f26509e.get();
        l.e(random, "implStorage.get()");
        return random;
    }
}
