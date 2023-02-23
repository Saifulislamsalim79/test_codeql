package kotlinx.coroutines.p564v2;

import kotlinx.coroutines.internal.C13914y;
/* compiled from: Mutex.kt */
/* renamed from: kotlinx.coroutines.v2.d */
/* loaded from: classes3.dex */
public final class C14102d {

    /* renamed from: a */
    private static final C13914y f30750a = new C13914y("UNLOCK_FAIL");

    /* renamed from: b */
    private static final C13914y f30751b = new C13914y("LOCKED");

    /* renamed from: c */
    private static final C13914y f30752c = new C13914y("UNLOCKED");

    /* renamed from: d */
    private static final C14093a f30753d = new C14093a(f30751b);

    /* renamed from: e */
    private static final C14093a f30754e = new C14093a(f30752c);

    /* renamed from: a */
    public static final InterfaceC14094b m2969a(boolean z) {
        return new C14095c(z);
    }

    /* renamed from: b */
    public static /* synthetic */ InterfaceC14094b m2968b(boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        return m2969a(z);
    }
}
