package p272h.p286c.p287a.p300b.p307d.p317j;

import java.util.Map;
import java.util.Set;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-mlkit-face-detection@@17.0.0 */
/* renamed from: h.c.a.b.d.j.s */
/* loaded from: classes2.dex */
public abstract class AbstractC9090s implements InterfaceC8853c1 {

    /* renamed from: c */
    private transient Set f21469c;

    /* renamed from: d */
    private transient Map f21470d;

    /* renamed from: c */
    abstract Map mo15554c();

    /* renamed from: d */
    abstract Set mo15553d();

    @Override // p272h.p286c.p287a.p300b.p307d.p317j.InterfaceC8853c1
    /* renamed from: e */
    public final Set mo15552e() {
        Set set = this.f21469c;
        if (set == null) {
            Set mo15553d = mo15553d();
            this.f21469c = mo15553d;
            return mo15553d;
        }
        return set;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof InterfaceC8853c1) {
            return mo15551g().equals(((InterfaceC8853c1) obj).mo15551g());
        }
        return false;
    }

    @Override // p272h.p286c.p287a.p300b.p307d.p317j.InterfaceC8853c1
    /* renamed from: g */
    public final Map mo15551g() {
        Map map = this.f21470d;
        if (map == null) {
            Map mo15554c = mo15554c();
            this.f21470d = mo15554c;
            return mo15554c;
        }
        return map;
    }

    public final int hashCode() {
        return mo15551g().hashCode();
    }

    public final String toString() {
        return ((C8941i) mo15551g()).f20991e.toString();
    }
}
