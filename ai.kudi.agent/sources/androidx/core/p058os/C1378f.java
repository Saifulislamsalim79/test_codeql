package androidx.core.p058os;

import android.os.Build;
import android.os.LocaleList;
import java.util.Locale;
/* compiled from: LocaleListCompat.java */
/* renamed from: androidx.core.os.f */
/* loaded from: classes2.dex */
public final class C1378f {

    /* renamed from: a */
    private InterfaceC1380h f4249a;

    static {
        m36167a(new Locale[0]);
    }

    private C1378f(InterfaceC1380h interfaceC1380h) {
        this.f4249a = interfaceC1380h;
    }

    /* renamed from: a */
    public static C1378f m36167a(Locale... localeArr) {
        if (Build.VERSION.SDK_INT >= 24) {
            return m36163e(new LocaleList(localeArr));
        }
        return new C1378f(new C1379g(localeArr));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static Locale m36166b(String str) {
        if (str.contains("-")) {
            String[] split = str.split("-", -1);
            if (split.length > 2) {
                return new Locale(split[0], split[1], split[2]);
            }
            if (split.length > 1) {
                return new Locale(split[0], split[1]);
            }
            if (split.length == 1) {
                return new Locale(split[0]);
            }
        } else if (str.contains("_")) {
            String[] split2 = str.split("_", -1);
            if (split2.length > 2) {
                return new Locale(split2[0], split2[1], split2[2]);
            }
            if (split2.length > 1) {
                return new Locale(split2[0], split2[1]);
            }
            if (split2.length == 1) {
                return new Locale(split2[0]);
            }
        } else {
            return new Locale(str);
        }
        throw new IllegalArgumentException("Can not parse language tag: [" + str + "]");
    }

    /* renamed from: e */
    public static C1378f m36163e(LocaleList localeList) {
        return new C1378f(new C1381i(localeList));
    }

    /* renamed from: c */
    public Locale m36165c(int i) {
        return this.f4249a.get(i);
    }

    /* renamed from: d */
    public int m36164d() {
        return this.f4249a.size();
    }

    public boolean equals(Object obj) {
        return (obj instanceof C1378f) && this.f4249a.equals(((C1378f) obj).f4249a);
    }

    public int hashCode() {
        return this.f4249a.hashCode();
    }

    public String toString() {
        return this.f4249a.toString();
    }
}
