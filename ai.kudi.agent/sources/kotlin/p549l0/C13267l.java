package kotlin.p549l0;

import java.util.ArrayList;
import java.util.List;
import kotlin.e0.d.l;
import kotlin.p483e0.p484c.InterfaceC11767l;
import kotlin.p483e0.p485d.AbstractC11802m;
import kotlin.p557z.C13722p;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Indent.kt */
/* renamed from: kotlin.l0.l */
/* loaded from: classes3.dex */
public class C13267l extends C13266k {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Indent.kt */
    /* renamed from: kotlin.l0.l$a */
    /* loaded from: classes3.dex */
    public static final class C13268a extends AbstractC11802m implements InterfaceC11767l<String, String> {

        /* renamed from: c */
        public static final C13268a f29430c = new C13268a();

        C13268a() {
            super(1);
        }

        @Override // kotlin.p483e0.p484c.InterfaceC11767l
        public /* bridge */ /* synthetic */ String invoke(String str) {
            String str2 = str;
            invoke2(str2);
            return str2;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final String invoke2(String str) {
            l.f(str, "line");
            return str;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Indent.kt */
    /* renamed from: kotlin.l0.l$b */
    /* loaded from: classes3.dex */
    public static final class C13269b extends AbstractC11802m implements InterfaceC11767l<String, String> {

        /* renamed from: c */
        final /* synthetic */ String f29431c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C13269b(String str) {
            super(1);
            this.f29431c = str;
        }

        @Override // kotlin.p483e0.p484c.InterfaceC11767l
        public final String invoke(String str) {
            l.f(str, "line");
            return this.f29431c + str;
        }
    }

    /* renamed from: b */
    private static final InterfaceC11767l<String, String> m5464b(String str) {
        return str.length() == 0 ? C13268a.f29430c : new C13269b(str);
    }

    /* renamed from: c */
    private static final int m5463c(String str) {
        int length = str.length();
        int i = 0;
        while (true) {
            if (i >= length) {
                i = -1;
                break;
            } else if (!C13251a.m5552c(str.charAt(i))) {
                break;
            } else {
                i++;
            }
        }
        return i == -1 ? str.length() : i;
    }

    /* renamed from: d */
    public static final String m5462d(String str, String str2) {
        String invoke;
        l.f(str, "$this$replaceIndent");
        l.f(str2, "newIndent");
        List<String> m5396e0 = C13277t.m5396e0(str);
        ArrayList<String> arrayList = new ArrayList();
        for (Object obj : m5396e0) {
            if (!C13265j.m5470u((String) obj)) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(C13722p.m3921o(arrayList, 10));
        for (String str3 : arrayList) {
            arrayList2.add(Integer.valueOf(m5463c(str3)));
        }
        Integer num = (Integer) C13722p.m3930j0(arrayList2);
        int i = 0;
        int intValue = num != null ? num.intValue() : 0;
        int length = str.length() + (str2.length() * m5396e0.size());
        InterfaceC11767l<String, String> m5464b = m5464b(str2);
        int m3937g = C13722p.m3937g(m5396e0);
        ArrayList arrayList3 = new ArrayList();
        for (Object obj2 : m5396e0) {
            int i2 = i + 1;
            String str4 = null;
            if (i >= 0) {
                String str5 = (String) obj2;
                if ((i != 0 && i != m3937g) || !C13265j.m5470u(str5)) {
                    String m5495N0 = C13265j.m5495N0(str5, intValue);
                    str4 = (m5495N0 == null || (invoke = m5464b.invoke(m5495N0)) == null) ? str5 : invoke;
                }
                if (str4 != null) {
                    arrayList3.add(str4);
                }
                i = i2;
            } else {
                C13722p.m3923n();
                throw null;
            }
        }
        StringBuilder sb = new StringBuilder(length);
        C13722p.m3949Y(arrayList3, sb, "\n", null, null, 0, null, null, 124, null);
        String sb2 = sb.toString();
        l.e(sb2, "mapIndexedNotNull { inde…\"\\n\")\n        .toString()");
        return sb2;
    }

    /* renamed from: e */
    public static final String m5461e(String str, String str2, String str3) {
        int i;
        String invoke;
        l.f(str, "$this$replaceIndentByMargin");
        l.f(str2, "newIndent");
        l.f(str3, "marginPrefix");
        if (!C13265j.m5470u(str3)) {
            List<String> m5396e0 = C13277t.m5396e0(str);
            int length = str.length() + (str2.length() * m5396e0.size());
            InterfaceC11767l<String, String> m5464b = m5464b(str2);
            int m3937g = C13722p.m3937g(m5396e0);
            ArrayList arrayList = new ArrayList();
            int i2 = 0;
            for (Object obj : m5396e0) {
                int i3 = i2 + 1;
                String str4 = null;
                if (i2 >= 0) {
                    String str5 = (String) obj;
                    if ((i2 != 0 && i2 != m3937g) || !C13265j.m5470u(str5)) {
                        int length2 = str5.length();
                        int i4 = 0;
                        while (true) {
                            if (i4 >= length2) {
                                i = -1;
                                break;
                            } else if (!C13251a.m5552c(str5.charAt(i4))) {
                                i = i4;
                                break;
                            } else {
                                i4++;
                            }
                        }
                        if (i != -1) {
                            int i5 = i;
                            if (C13276s.m5448D(str5, str3, i, false, 4, null)) {
                                int length3 = i5 + str3.length();
                                if (str5 == null) {
                                    throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
                                }
                                str4 = str5.substring(length3);
                                l.e(str4, "(this as java.lang.String).substring(startIndex)");
                            }
                        }
                        str4 = (str4 == null || (invoke = m5464b.invoke(str4)) == null) ? str5 : invoke;
                    }
                    if (str4 != null) {
                        arrayList.add(str4);
                    }
                    i2 = i3;
                } else {
                    C13722p.m3923n();
                    throw null;
                }
            }
            StringBuilder sb = new StringBuilder(length);
            C13722p.m3949Y(arrayList, sb, "\n", null, null, 0, null, null, 124, null);
            String sb2 = sb.toString();
            l.e(sb2, "mapIndexedNotNull { inde…\"\\n\")\n        .toString()");
            return sb2;
        }
        throw new IllegalArgumentException("marginPrefix must be non-blank string.".toString());
    }

    /* renamed from: f */
    public static String m5460f(String str) {
        l.f(str, "$this$trimIndent");
        return m5462d(str, "");
    }

    /* renamed from: g */
    public static final String m5459g(String str, String str2) {
        l.f(str, "$this$trimMargin");
        l.f(str2, "marginPrefix");
        return m5461e(str, "", str2);
    }

    /* renamed from: h */
    public static /* synthetic */ String m5458h(String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str2 = "|";
        }
        return m5459g(str, str2);
    }
}
