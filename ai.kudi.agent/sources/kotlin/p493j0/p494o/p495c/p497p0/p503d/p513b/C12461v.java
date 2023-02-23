package kotlin.p493j0.p494o.p495c.p497p0.p503d.p513b;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.e0.d.l;
import kotlin.p483e0.p484c.InterfaceC11767l;
import kotlin.p483e0.p485d.AbstractC11802m;
import kotlin.p557z.C13742z;
/* compiled from: SignatureBuildingComponents.kt */
/* renamed from: kotlin.j0.o.c.p0.d.b.v */
/* loaded from: classes3.dex */
public final class C12461v {

    /* renamed from: a */
    public static final C12461v f27635a = new C12461v();

    /* compiled from: SignatureBuildingComponents.kt */
    /* renamed from: kotlin.j0.o.c.p0.d.b.v$a */
    /* loaded from: classes3.dex */
    static final class C12462a extends AbstractC11802m implements InterfaceC11767l<String, CharSequence> {

        /* renamed from: c */
        public static final C12462a f27636c = new C12462a();

        C12462a() {
            super(1);
        }

        @Override // kotlin.p483e0.p484c.InterfaceC11767l
        public final CharSequence invoke(String str) {
            l.f(str, "it");
            return C12461v.f27635a.m8849c(str);
        }
    }

    private C12461v() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: c */
    public final String m8849c(String str) {
        if (str.length() > 1) {
            return 'L' + str + ';';
        }
        return str;
    }

    /* renamed from: b */
    public final String[] m8850b(String... strArr) {
        l.f(strArr, "signatures");
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            arrayList.add("<init>(" + str + ")V");
        }
        Object[] array = arrayList.toArray(new String[0]);
        if (array != null) {
            return (String[]) array;
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
    }

    /* renamed from: d */
    public final Set<String> m8848d(String str, String... strArr) {
        l.f(str, "internalName");
        l.f(strArr, "signatures");
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (String str2 : strArr) {
            linkedHashSet.add(str + '.' + str2);
        }
        return linkedHashSet;
    }

    /* renamed from: e */
    public final Set<String> m8847e(String str, String... strArr) {
        l.f(str, "name");
        l.f(strArr, "signatures");
        String m8844h = m8844h(str);
        String[] strArr2 = new String[strArr.length];
        System.arraycopy(strArr, 0, strArr2, 0, strArr.length);
        return m8848d(m8844h, strArr2);
    }

    /* renamed from: f */
    public final Set<String> m8846f(String str, String... strArr) {
        l.f(str, "name");
        l.f(strArr, "signatures");
        String m8843i = m8843i(str);
        String[] strArr2 = new String[strArr.length];
        System.arraycopy(strArr, 0, strArr2, 0, strArr.length);
        return m8848d(m8843i, strArr2);
    }

    /* renamed from: g */
    public final String m8845g(String str) {
        l.f(str, "name");
        return l.m("java/util/function/", str);
    }

    /* renamed from: h */
    public final String m8844h(String str) {
        l.f(str, "name");
        return l.m("java/lang/", str);
    }

    /* renamed from: i */
    public final String m8843i(String str) {
        l.f(str, "name");
        return l.m("java/util/", str);
    }

    /* renamed from: j */
    public final String m8842j(String str, List<String> list, String str2) {
        String m3797a0;
        l.f(str, "name");
        l.f(list, "parameters");
        l.f(str2, "ret");
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append('(');
        m3797a0 = C13742z.m3797a0(list, "", null, null, 0, null, C12462a.f27636c, 30, null);
        sb.append(m3797a0);
        sb.append(')');
        sb.append(m8849c(str2));
        return sb.toString();
    }

    /* renamed from: k */
    public final String m8841k(String str, String str2) {
        l.f(str, "internalName");
        l.f(str2, "jvmDescriptor");
        return str + '.' + str2;
    }
}
