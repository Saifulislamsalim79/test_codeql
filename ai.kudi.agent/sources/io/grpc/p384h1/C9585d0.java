package io.grpc.p384h1;

import com.google.common.base.C5051n;
import com.google.common.base.C5055p;
import io.grpc.AbstractC10069u0;
import io.grpc.AbstractC10081v0;
import io.grpc.C9981j0;
import java.net.URI;
/* compiled from: DnsNameResolverProvider.java */
/* renamed from: io.grpc.h1.d0 */
/* loaded from: classes2.dex */
public final class C9585d0 extends AbstractC10081v0 {
    @Override // io.grpc.AbstractC10069u0.AbstractC10074d
    /* renamed from: a */
    public String mo13088a() {
        return "dns";
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // io.grpc.AbstractC10081v0
    /* renamed from: d */
    public boolean mo13103d() {
        return true;
    }

    @Override // io.grpc.AbstractC10081v0
    /* renamed from: e */
    public int mo13102e() {
        return 5;
    }

    @Override // io.grpc.AbstractC10069u0.AbstractC10074d
    /* renamed from: f */
    public C9565c0 mo13087b(URI uri, AbstractC10069u0.C10071b c10071b) {
        if ("dns".equals(uri.getScheme())) {
            String path = uri.getPath();
            C5051n.m25779o(path, "targetPath");
            String str = path;
            C5051n.m25783k(str.startsWith("/"), "the path component (%s) of the target (%s) must start with '/'", str, uri);
            return new C9565c0(uri.getAuthority(), str.substring(1), c10071b, C9755r0.f22914n, C5055p.m25764c(), C9981j0.m13378a(C9585d0.class.getClassLoader()));
        }
        return null;
    }
}
