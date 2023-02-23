package kotlin.p493j0.p494o.p495c.p497p0.p533j.p534b.p535c0;

import java.io.InputStream;
import kotlin.e0.d.l;
/* compiled from: BuiltInsResourceLoader.kt */
/* renamed from: kotlin.j0.o.c.p0.j.b.c0.d */
/* loaded from: classes3.dex */
public final class C12819d {
    /* renamed from: a */
    public final InputStream m6697a(String str) {
        l.f(str, "path");
        ClassLoader classLoader = C12819d.class.getClassLoader();
        InputStream resourceAsStream = classLoader == null ? null : classLoader.getResourceAsStream(str);
        return resourceAsStream == null ? ClassLoader.getSystemResourceAsStream(str) : resourceAsStream;
    }
}
