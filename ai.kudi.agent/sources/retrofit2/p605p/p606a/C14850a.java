package retrofit2.p605p.p606a;

import com.google.gson.C6784f;
import com.google.gson.p184v.C6916a;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import p565l.AbstractC14120b0;
import p565l.AbstractC14135d0;
import retrofit2.C14841m;
import retrofit2.InterfaceC14805e;
/* compiled from: GsonConverterFactory.java */
/* renamed from: retrofit2.p.a.a */
/* loaded from: classes3.dex */
public final class C14850a extends InterfaceC14805e.AbstractC14806a {

    /* renamed from: a */
    private final C6784f f33209a;

    private C14850a(C6784f c6784f) {
        this.f33209a = c6784f;
    }

    /* renamed from: d */
    public static C14850a m220d(C6784f c6784f) {
        if (c6784f != null) {
            return new C14850a(c6784f);
        }
        throw new NullPointerException("gson == null");
    }

    @Override // retrofit2.InterfaceC14805e.AbstractC14806a
    /* renamed from: a */
    public InterfaceC14805e<?, AbstractC14120b0> mo222a(Type type, Annotation[] annotationArr, Annotation[] annotationArr2, C14841m c14841m) {
        return new C14851b(this.f33209a, this.f33209a.m20758n(C6916a.get(type)));
    }

    @Override // retrofit2.InterfaceC14805e.AbstractC14806a
    /* renamed from: b */
    public InterfaceC14805e<AbstractC14135d0, ?> mo221b(Type type, Annotation[] annotationArr, C14841m c14841m) {
        return new C14852c(this.f33209a, this.f33209a.m20758n(C6916a.get(type)));
    }
}
