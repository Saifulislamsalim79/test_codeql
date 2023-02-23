package retrofit2.p605p.p606a;

import com.google.gson.AbstractC6909s;
import com.google.gson.C6784f;
import com.google.gson.JsonIOException;
import com.google.gson.stream.C6911a;
import com.google.gson.stream.EnumC6913b;
import java.io.IOException;
import p565l.AbstractC14135d0;
import retrofit2.InterfaceC14805e;
/* compiled from: GsonResponseBodyConverter.java */
/* renamed from: retrofit2.p.a.c */
/* loaded from: classes3.dex */
final class C14852c<T> implements InterfaceC14805e<AbstractC14135d0, T> {

    /* renamed from: a */
    private final C6784f f33214a;

    /* renamed from: b */
    private final AbstractC6909s<T> f33215b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C14852c(C6784f c6784f, AbstractC6909s<T> abstractC6909s) {
        this.f33214a = c6784f;
        this.f33215b = abstractC6909s;
    }

    @Override // retrofit2.InterfaceC14805e
    /* renamed from: a */
    public T convert(AbstractC14135d0 abstractC14135d0) throws IOException {
        C6911a m20754r = this.f33214a.m20754r(abstractC14135d0.m2834c());
        try {
            T mo20528b = this.f33215b.mo20528b(m20754r);
            if (m20754r.mo20525C0() == EnumC6913b.END_DOCUMENT) {
                return mo20528b;
            }
            throw new JsonIOException("JSON document was not fully consumed.");
        } finally {
            abstractC14135d0.close();
        }
    }
}
