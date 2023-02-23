package p565l;

import java.net.InetSocketAddress;
import java.net.Proxy;
/* compiled from: Route.java */
/* renamed from: l.e0 */
/* loaded from: classes3.dex */
public final class C14140e0 {

    /* renamed from: a */
    final C14115a f30885a;

    /* renamed from: b */
    final Proxy f30886b;

    /* renamed from: c */
    final InetSocketAddress f30887c;

    public C14140e0(C14115a c14115a, Proxy proxy, InetSocketAddress inetSocketAddress) {
        if (c14115a == null) {
            throw new NullPointerException("address == null");
        }
        if (proxy == null) {
            throw new NullPointerException("proxy == null");
        }
        if (inetSocketAddress != null) {
            this.f30885a = c14115a;
            this.f30886b = proxy;
            this.f30887c = inetSocketAddress;
            return;
        }
        throw new NullPointerException("inetSocketAddress == null");
    }

    /* renamed from: a */
    public C14115a m2832a() {
        return this.f30885a;
    }

    /* renamed from: b */
    public Proxy m2831b() {
        return this.f30886b;
    }

    /* renamed from: c */
    public boolean m2830c() {
        return this.f30885a.f30775i != null && this.f30886b.type() == Proxy.Type.HTTP;
    }

    /* renamed from: d */
    public InetSocketAddress m2829d() {
        return this.f30887c;
    }

    public boolean equals(Object obj) {
        if (obj instanceof C14140e0) {
            C14140e0 c14140e0 = (C14140e0) obj;
            if (c14140e0.f30885a.equals(this.f30885a) && c14140e0.f30886b.equals(this.f30886b) && c14140e0.f30887c.equals(this.f30887c)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((((527 + this.f30885a.hashCode()) * 31) + this.f30886b.hashCode()) * 31) + this.f30887c.hashCode();
    }

    public String toString() {
        return "Route{" + this.f30887c + "}";
    }
}
