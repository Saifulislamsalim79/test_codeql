package kotlinx.coroutines;

import kotlinx.coroutines.internal.C13914y;
/* compiled from: JobSupport.kt */
/* renamed from: kotlinx.coroutines.w1 */
/* loaded from: classes3.dex */
public final class C14105w1 {

    /* renamed from: a */
    private static final C13914y f30755a = new C13914y("COMPLETING_ALREADY");

    /* renamed from: b */
    public static final C13914y f30756b = new C13914y("COMPLETING_WAITING_CHILDREN");

    /* renamed from: c */
    private static final C13914y f30757c = new C13914y("COMPLETING_RETRY");

    /* renamed from: d */
    private static final C13914y f30758d = new C13914y("TOO_LATE_TO_CANCEL");

    /* renamed from: e */
    private static final C13914y f30759e = new C13914y("SEALED");

    /* renamed from: f */
    private static final C13749a1 f30760f = new C13749a1(false);

    /* renamed from: g */
    private static final C13749a1 f30761g = new C13749a1(true);

    /* renamed from: g */
    public static final Object m2951g(Object obj) {
        return obj instanceof InterfaceC13923k1 ? new C13928l1((InterfaceC13923k1) obj) : obj;
    }

    /* renamed from: h */
    public static final Object m2950h(Object obj) {
        C13928l1 c13928l1 = obj instanceof C13928l1 ? (C13928l1) obj : null;
        return c13928l1 == null ? obj : c13928l1.f30412a;
    }
}
