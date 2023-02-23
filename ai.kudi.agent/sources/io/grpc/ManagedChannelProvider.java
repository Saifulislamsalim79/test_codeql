package io.grpc;
/* loaded from: classes2.dex */
public abstract class ManagedChannelProvider {

    /* loaded from: classes2.dex */
    public static final class ProviderNotFoundException extends RuntimeException {
        public ProviderNotFoundException(String str) {
            super(str);
        }
    }

    /* renamed from: d */
    public static ManagedChannelProvider m14645d() {
        ManagedChannelProvider m14641d = ManagedChannelRegistry.m14643b().m14641d();
        if (m14641d != null) {
            return m14641d;
        }
        throw new ProviderNotFoundException("No functional channel service provider found. Try adding a dependency on the grpc-okhttp, grpc-netty, or grpc-netty-shaded artifact");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: a */
    public abstract AbstractC10042r0<?> mo13715a(String str);

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: b */
    public abstract boolean mo13714b();

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: c */
    public abstract int mo13713c();
}
