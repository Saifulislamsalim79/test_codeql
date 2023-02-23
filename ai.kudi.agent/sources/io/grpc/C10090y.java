package io.grpc;

import com.google.common.base.C5051n;
import io.grpc.C9477a;
import java.net.SocketAddress;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/* compiled from: EquivalentAddressGroup.java */
/* renamed from: io.grpc.y */
/* loaded from: classes2.dex */
public final class C10090y {

    /* renamed from: d */
    public static final C9477a.C9480c<String> f23866d = C9477a.C9480c.m14623a("io.grpc.EquivalentAddressGroup.authorityOverride");

    /* renamed from: a */
    private final List<SocketAddress> f23867a;

    /* renamed from: b */
    private final C9477a f23868b;

    /* renamed from: c */
    private final int f23869c;

    public C10090y(List<SocketAddress> list) {
        this(list, C9477a.f22159b);
    }

    /* renamed from: a */
    public List<SocketAddress> m13078a() {
        return this.f23867a;
    }

    /* renamed from: b */
    public C9477a m13077b() {
        return this.f23868b;
    }

    public boolean equals(Object obj) {
        if (obj instanceof C10090y) {
            C10090y c10090y = (C10090y) obj;
            if (this.f23867a.size() != c10090y.f23867a.size()) {
                return false;
            }
            for (int i = 0; i < this.f23867a.size(); i++) {
                if (!this.f23867a.get(i).equals(c10090y.f23867a.get(i))) {
                    return false;
                }
            }
            return this.f23868b.equals(c10090y.f23868b);
        }
        return false;
    }

    public int hashCode() {
        return this.f23869c;
    }

    public String toString() {
        return "[" + this.f23867a + "/" + this.f23868b + "]";
    }

    public C10090y(List<SocketAddress> list, C9477a c9477a) {
        C5051n.m25789e(!list.isEmpty(), "addrs is empty");
        this.f23867a = Collections.unmodifiableList(new ArrayList(list));
        C5051n.m25779o(c9477a, "attrs");
        this.f23868b = c9477a;
        this.f23869c = this.f23867a.hashCode();
    }

    public C10090y(SocketAddress socketAddress) {
        this(socketAddress, C9477a.f22159b);
    }

    public C10090y(SocketAddress socketAddress, C9477a c9477a) {
        this(Collections.singletonList(socketAddress), c9477a);
    }
}
